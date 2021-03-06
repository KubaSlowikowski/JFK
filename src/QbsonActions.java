import java.util.HashMap;
import java.util.Stack;

enum Type {
    INTEGER,
    REAL
    // STRING // TODO
}

class Value {
    private String name;
    private Type type;

    Value(final String name, final Type type) {
        this.name = name;
        this.type = type;
    }

    String getName() {
        return name;
    }

    void setName(final String name) {
        this.name = name;
    }

    Type getType() {
        return type;
    }

    void setType(final Type type) {
        this.type = type;
    }
}

public class QbsonActions extends QbsonBaseListener {

    private final HashMap<String, Type> variables = new HashMap<>();
    private final Stack<Value> stack = new Stack<>();
    private String value;

    //wypisanie kodu wynikowego LLVM
    @Override
    public void exitProg(QbsonParser.ProgContext ctx) {
        System.out.println(LLVMGenerator.generate());
    }

    @Override
    public void exitAssign(final QbsonParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        Value value = stack.pop();

        boolean alreadyDefined = false;
        if (variables.containsKey(id)) {
            alreadyDefined = true;
            if (!variables.get(id).equals(value.getType())) {
                printError(
                        "Przypisanie zmiennej typu '" + value.getType() + "' do zmiennej '" + id + "' typu " + variables.get(id),
                        ctx.getStart().getLine()
                );
            }
        } else {
            variables.put(id, value.getType());
        }

        if (value.getType() == Type.INTEGER) {
            if (!alreadyDefined) {
                LLVMGenerator.declare_i32(id);
            }
            LLVMGenerator.assign_i32(id, value.getName());
        }

        if (value.getType() == Type.REAL) {
            if (!alreadyDefined) {
                LLVMGenerator.declare_double(id);
            }
            LLVMGenerator.assign_double(id, value.getName());
        }
    }

    @Override
    public void exitInt(final QbsonParser.IntContext ctx) {
        stack.push(new Value(ctx.INT().getText(), Type.INTEGER));
    }

    @Override
    public void exitReal(final QbsonParser.RealContext ctx) {
        stack.push(new Value(ctx.REAL().getText(), Type.REAL));
    }

    // pobranie warto??ci zmiennej
    @Override
    public void exitId(final QbsonParser.IdContext ctx) {
        String id = ctx.ID().getText();

        if (!variables.containsKey(id)) {
            printError(
                    "Zmienna nie zostala zadeklarowana.",
                    ctx.getStart().getLine()
            );
        }
        Type type = variables.get(id);

        if (type == Type.INTEGER) {
            id = LLVMGenerator.loadInt(id);
            stack.push(new Value(id, type));
        }

        if (type == Type.REAL) {
            id = LLVMGenerator.loadReal(id);
            stack.push(new Value(id, type));
        }
    }

    // dodawanie
    @Override
    public void exitAddition(final QbsonParser.AdditionContext ctx) {
        Value a = stack.pop();
        Value b = stack.pop();

        if (a.getType() == b.getType()) {
            if (a.getType() == Type.INTEGER) {
                LLVMGenerator.sum_i32(a.getName(), b.getName());
                stack.push(new Value("%" + (LLVMGenerator.getReg() - 1), Type.INTEGER));
            } else if (a.getType() == Type.REAL) {
                LLVMGenerator.sum_double(a.getName(), b.getName());
                stack.push(new Value("%" + (LLVMGenerator.getReg() - 1), Type.REAL));
            }
        } else {
            printError(
                    "Nie mozna wykonac operacji dodawania zmiennych o dwoch roznych typach.",
                    ctx.getStart().getLine()
            );
        }
    }

    // odejmowanie
    @Override
    public void exitSubtraction(final QbsonParser.SubtractionContext ctx) {
        Value a = stack.pop();
        Value b = stack.pop();

        if (a.getType() == b.getType()) {
            if (a.getType() == Type.INTEGER) {
                LLVMGenerator.subtract_i32(a.getName(), b.getName());
                stack.push(new Value("%" + (LLVMGenerator.getReg() - 1), Type.INTEGER));
            } else if (a.getType() == Type.REAL) {
                LLVMGenerator.subtract_double(a.getName(), b.getName());
                stack.push(new Value("%" + (LLVMGenerator.getReg() - 1), Type.REAL));
            }
        } else {
            printError(
                    "Nie mozna wykonac operacji odejmowania zmiennych o dwoch roznych typach.",
                    ctx.getStart().getLine()
            );
        }
    }

    // mnozenie
    @Override
    public void exitMultiplication(final QbsonParser.MultiplicationContext ctx) {
        Value a = stack.pop();
        Value b = stack.pop();

        if (a.getType() == b.getType()) {
            if (a.getType() == Type.INTEGER) {
                LLVMGenerator.multiply_i32(a.getName(), b.getName());
                stack.push(new Value("%" + (LLVMGenerator.getReg() - 1), Type.INTEGER));
            } else if (a.getType() == Type.REAL) {
                LLVMGenerator.multiply_double(a.getName(), b.getName());
                stack.push(new Value("%" + (LLVMGenerator.getReg() - 1), Type.REAL));
            }
        } else {
            printError(
                    "Nie mozna wykonac operacji mnozenia zmiennych o dwoch roznych typach.",
                    ctx.getStart().getLine()
            );
        }
    }

    // dzielenie
    @Override
    public void exitDivision(final QbsonParser.DivisionContext ctx) {
        Value a = stack.pop();
        Value b = stack.pop();

        if (a.getType() == b.getType()) {
            if (a.getType() == Type.INTEGER) {
                LLVMGenerator.divide_i32(a.getName(), b.getName());
                stack.push(new Value("%" + (LLVMGenerator.getReg() - 1), Type.INTEGER));
            } else if (a.getType() == Type.REAL) {
                LLVMGenerator.divide_double(a.getName(), b.getName());
                stack.push(new Value("%" + (LLVMGenerator.getReg() - 1), Type.REAL));
            }
        } else {
            printError(
                    "Nie mozna wykonac operacji dzielenia zmiennych o dwoch roznych typach.",
                    ctx.getStart().getLine()
            );
        }
    }

    @Override
    public void exitPrint(final QbsonParser.PrintContext ctx) {
        String id = ctx.ID().getText();
        Type type = variables.get(id);
        if (type == Type.INTEGER) {
            LLVMGenerator.printInt(id);
        } else if (type == Type.REAL) {
            LLVMGenerator.printDouble(id);
        }
    }

    @Override
    public void exitScanInt(final QbsonParser.ScanIntContext ctx) {
        String id = LLVMGenerator.scanfInt();
        stack.push(new Value(id, Type.INTEGER));
    }

    @Override
    public void exitScanReal(final QbsonParser.ScanRealContext ctx) {
        String id = LLVMGenerator.scanfReal();
        stack.push(new Value(id, Type.REAL));
    }

    @Override
    public void enterBlockIf(final QbsonParser.BlockIfContext ctx) {
        LLVMGenerator.ifStart();
    }

    @Override
    public void exitBlockIf(final QbsonParser.BlockIfContext ctx) {
        LLVMGenerator.ifEnd();
    }

    @Override
    public void exitCondition(final QbsonParser.ConditionContext ctx) {
        String ID = ctx.ID().getText();
        String INT = ctx.INT().getText();
        if (variables.containsKey(ID)) {
            LLVMGenerator.icmp(ID, INT);
        } else {
            ctx.getStart().getLine();
            printError("Nieznana zmienna: " + ID, ctx.getStart().getLine());
        }
    }

    @Override
    public void exitValue(final QbsonParser.ValueContext ctx) {
        if (ctx.ID() != null) {
            String ID = ctx.ID().getText();
            if (variables.containsKey(ID)) {
                if (variables.get(ID).equals(Type.INTEGER)) {
                    LLVMGenerator.loadInt(ID);
                } else {
                    LLVMGenerator.loadReal(ID);
                }
                value = "%" + (LLVMGenerator.getReg() - 1);
            } else {
                printError("Nieznana zmienna: " + ID, ctx.getStart().getLine());
            }
        }
    }

    @Override
    public void exitRepetitions(final QbsonParser.RepetitionsContext ctx) {
        LLVMGenerator.repeatStart(value);
    }

    @Override
    public void exitBlockRepeat(final QbsonParser.BlockRepeatContext ctx) {
        if (ctx.getParent() instanceof QbsonParser.RepeatContext) {
            LLVMGenerator.repeatEnd();
        }
    }

    private void printError(String message, int line) {
        System.err.println("B????d w linii (" + line + "). Tre???? b????du: " + message);
        System.exit(1);
    }
}