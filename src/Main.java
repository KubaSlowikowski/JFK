import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

    public static void main(String[] args) {
        String input = "styrt\n" +
                "a = 13;\n" +
                "qniec";

        QbsonLexer lexer = new QbsonLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QbsonParser parser = new QbsonParser(tokens);
        ParseTree parseTree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new QbsonActions(), parseTree);
    }
}