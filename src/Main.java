import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

    /**
     styrt
         a=1;
         b=2;
         jesli a == 1 to
            pokazMiSwojeTowary(a);
            jesli b == 2 to
                pokazMiSwojeTowary(b);
            wystarczy;
         wystarczy;
     qniec
     */

    /**
     styrt
         a=1;
         b=2;
         powtarzaj a
             pokazMiSwojeTowary(a);
             powtarzaj b
                 pokazMiSwojeTowary(a);
             juz nie powtarzaj;
         juz nie powtarzaj;
     qniec
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