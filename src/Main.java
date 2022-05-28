import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

    /**
     * styrt
     *     a=1;
     *     jesli a == 1 to
     *         pokazMiSwojeTowary(a);
     *     wystarczy;
     * qniec
     */

    public static void main(String[] args) {
        String input = "styrt\n" +
                "a = 2;\n" +
                "b = 4;\n" +
                "c = a * b;\n" +
                "qniec";

        QbsonLexer lexer = new QbsonLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QbsonParser parser = new QbsonParser(tokens);
        ParseTree parseTree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new QbsonActions(), parseTree);
    }
}