import java.util.HashSet;
import java.util.Set;
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

    private final Set<Variable> variables = new HashSet<>();
    private final Stack<Variable> stack = new Stack<>();

    //wypisanie kodu wynikowego LLVM
    @Override
    public void exitProg(QbsonParser.ProgContext ctx) {
        System.out.println(LLVMGenerator.generate());
    }

    @Override
    public void exitAssign(final QbsonParser.AssignContext ctx) {

    }

    @Override
    public void exitInt(final QbsonParser.IntContext ctx) {
        stack.push(new Variable(ctx.INT().getText(), Type.INTEGER));
    }
}