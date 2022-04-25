import java.util.HashMap;
import java.util.Stack;

enum Type {
    INTEGER,
    REAL
    // STRING // TODO
}

class Variable {
    private String name;
    private Type type;

    Variable(final String name, final Type type) {
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
    private final Stack<Variable> stack = new Stack<>();

    //wypisanie kodu wynikowego LLVM
    @Override
    public void exitProg(QbsonParser.ProgContext ctx) {
        System.out.println(LLVMGenerator.generate());
    }

    @Override
    public void exitAssign(final QbsonParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        Variable variable = stack.pop();

        boolean alreadyDefined = false;
        if (variables.containsKey(id)) {
            alreadyDefined = true;
            if (!variables.get(id).equals(variable.getType())) {
                printError(
                        "Przypisanie zmiennej typu '" + variable.getType() + "' do zmiennej '" + id + "' typu " + variables.get(id),
                        ctx.getStart().getLine()
                );
            }
        } else {
            variables.put(id, variable.getType());
        }

        if (variable.getType() == Type.INTEGER) {
            if (!alreadyDefined) {
                LLVMGenerator.declare_i32(id);
            }
            LLVMGenerator.assign_i32(id, variable.getName());
        }

        if (variable.getType() == Type.REAL) {
            if (!alreadyDefined) {
                LLVMGenerator.declare_double(id);
            }
            LLVMGenerator.assign_double(id, variable.getName());
        }
    }

    @Override
    public void exitInt(final QbsonParser.IntContext ctx) {
        stack.push(new Variable(ctx.INT().getText(), Type.INTEGER));
    }

    private void printError(String message, int line) {
        System.err.println("Błąd w linii (" + line + "). Treść błędu: " + message);
        System.exit(1);
    }
}