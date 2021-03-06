// Generated from C:/Users/Admin/IdeaProjects/JFK\Qbson.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QbsonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, REPEAT=4, ENDREPEAT=5, FUNCTION=6, ENDFUNCTION=7, 
		IF=8, THEN=9, ENDIF=10, PRINT=11, SCAN_INT=12, SCAN_REAL=13, ADD=14, SUB=15, 
		MULT=16, DIV=17, EQ=18, OB=19, CB=20, SEMI=21, COMMENT=22, INT=23, REAL=24, 
		ID=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "REPEAT", "ENDREPEAT", "FUNCTION", "ENDFUNCTION", 
			"IF", "THEN", "ENDIF", "PRINT", "SCAN_INT", "SCAN_REAL", "ADD", "SUB", 
			"MULT", "DIV", "EQ", "OB", "CB", "SEMI", "COMMENT", "INT", "REAL", "ID", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'styrt'", "'qniec'", "'=='", "'powtarzaj'", "'juz nie powtarzaj'", 
			"'fun'", "'endfun'", "'jesli'", "'to'", "'wystarczy'", "'pokazMiSwojeTowary'", 
			"'czytejIntidzer()'", "'czytejRijal()'", "'+'", "'-'", "'*'", "'/'", 
			"'='", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "REPEAT", "ENDREPEAT", "FUNCTION", "ENDFUNCTION", 
			"IF", "THEN", "ENDIF", "PRINT", "SCAN_INT", "SCAN_REAL", "ADD", "SUB", 
			"MULT", "DIV", "EQ", "OB", "CB", "SEMI", "COMMENT", "INT", "REAL", "ID", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public QbsonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Qbson.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u010a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\7\27\u00c7\n\27\f\27\16\27\u00ca\13\27\3\27\3\27\3\30\3"+
		"\30\5\30\u00d0\n\30\3\30\3\30\7\30\u00d4\n\30\f\30\16\30\u00d7\13\30\5"+
		"\30\u00d9\n\30\3\31\5\31\u00dc\n\31\3\31\7\31\u00df\n\31\f\31\16\31\u00e2"+
		"\13\31\3\31\3\31\7\31\u00e6\n\31\f\31\16\31\u00e9\13\31\3\31\5\31\u00ec"+
		"\n\31\3\31\7\31\u00ef\n\31\f\31\16\31\u00f2\13\31\3\31\3\31\7\31\u00f6"+
		"\n\31\f\31\16\31\u00f9\13\31\5\31\u00fb\n\31\3\32\3\32\7\32\u00ff\n\32"+
		"\f\32\16\32\u0102\13\32\3\33\6\33\u0105\n\33\r\33\16\33\u0106\3\33\3\33"+
		"\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\t"+
		"\4\2\f\f\17\17\3\2\63;\3\2\62;\3\2\62\62\3\2c|\6\2\62;C\\aac|\5\2\13\f"+
		"\17\17\"\"\2\u0116\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2"+
		"\5=\3\2\2\2\7C\3\2\2\2\tF\3\2\2\2\13P\3\2\2\2\rb\3\2\2\2\17f\3\2\2\2\21"+
		"m\3\2\2\2\23s\3\2\2\2\25v\3\2\2\2\27\u0080\3\2\2\2\31\u0093\3\2\2\2\33"+
		"\u00a4\3\2\2\2\35\u00b2\3\2\2\2\37\u00b4\3\2\2\2!\u00b6\3\2\2\2#\u00b8"+
		"\3\2\2\2%\u00ba\3\2\2\2\'\u00bc\3\2\2\2)\u00be\3\2\2\2+\u00c0\3\2\2\2"+
		"-\u00c2\3\2\2\2/\u00d8\3\2\2\2\61\u00fa\3\2\2\2\63\u00fc\3\2\2\2\65\u0104"+
		"\3\2\2\2\678\7u\2\289\7v\2\29:\7{\2\2:;\7t\2\2;<\7v\2\2<\4\3\2\2\2=>\7"+
		"s\2\2>?\7p\2\2?@\7k\2\2@A\7g\2\2AB\7e\2\2B\6\3\2\2\2CD\7?\2\2DE\7?\2\2"+
		"E\b\3\2\2\2FG\7r\2\2GH\7q\2\2HI\7y\2\2IJ\7v\2\2JK\7c\2\2KL\7t\2\2LM\7"+
		"|\2\2MN\7c\2\2NO\7l\2\2O\n\3\2\2\2PQ\7l\2\2QR\7w\2\2RS\7|\2\2ST\7\"\2"+
		"\2TU\7p\2\2UV\7k\2\2VW\7g\2\2WX\7\"\2\2XY\7r\2\2YZ\7q\2\2Z[\7y\2\2[\\"+
		"\7v\2\2\\]\7c\2\2]^\7t\2\2^_\7|\2\2_`\7c\2\2`a\7l\2\2a\f\3\2\2\2bc\7h"+
		"\2\2cd\7w\2\2de\7p\2\2e\16\3\2\2\2fg\7g\2\2gh\7p\2\2hi\7f\2\2ij\7h\2\2"+
		"jk\7w\2\2kl\7p\2\2l\20\3\2\2\2mn\7l\2\2no\7g\2\2op\7u\2\2pq\7n\2\2qr\7"+
		"k\2\2r\22\3\2\2\2st\7v\2\2tu\7q\2\2u\24\3\2\2\2vw\7y\2\2wx\7{\2\2xy\7"+
		"u\2\2yz\7v\2\2z{\7c\2\2{|\7t\2\2|}\7e\2\2}~\7|\2\2~\177\7{\2\2\177\26"+
		"\3\2\2\2\u0080\u0081\7r\2\2\u0081\u0082\7q\2\2\u0082\u0083\7m\2\2\u0083"+
		"\u0084\7c\2\2\u0084\u0085\7|\2\2\u0085\u0086\7O\2\2\u0086\u0087\7k\2\2"+
		"\u0087\u0088\7U\2\2\u0088\u0089\7y\2\2\u0089\u008a\7q\2\2\u008a\u008b"+
		"\7l\2\2\u008b\u008c\7g\2\2\u008c\u008d\7V\2\2\u008d\u008e\7q\2\2\u008e"+
		"\u008f\7y\2\2\u008f\u0090\7c\2\2\u0090\u0091\7t\2\2\u0091\u0092\7{\2\2"+
		"\u0092\30\3\2\2\2\u0093\u0094\7e\2\2\u0094\u0095\7|\2\2\u0095\u0096\7"+
		"{\2\2\u0096\u0097\7v\2\2\u0097\u0098\7g\2\2\u0098\u0099\7l\2\2\u0099\u009a"+
		"\7K\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7f\2\2\u009e\u009f\7|\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7t\2\2"+
		"\u00a1\u00a2\7*\2\2\u00a2\u00a3\7+\2\2\u00a3\32\3\2\2\2\u00a4\u00a5\7"+
		"e\2\2\u00a5\u00a6\7|\2\2\u00a6\u00a7\7{\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9"+
		"\7g\2\2\u00a9\u00aa\7l\2\2\u00aa\u00ab\7T\2\2\u00ab\u00ac\7k\2\2\u00ac"+
		"\u00ad\7l\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7*\2\2"+
		"\u00b0\u00b1\7+\2\2\u00b1\34\3\2\2\2\u00b2\u00b3\7-\2\2\u00b3\36\3\2\2"+
		"\2\u00b4\u00b5\7/\2\2\u00b5 \3\2\2\2\u00b6\u00b7\7,\2\2\u00b7\"\3\2\2"+
		"\2\u00b8\u00b9\7\61\2\2\u00b9$\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb&\3\2\2"+
		"\2\u00bc\u00bd\7*\2\2\u00bd(\3\2\2\2\u00be\u00bf\7+\2\2\u00bf*\3\2\2\2"+
		"\u00c0\u00c1\7=\2\2\u00c1,\3\2\2\2\u00c2\u00c3\7\61\2\2\u00c3\u00c4\7"+
		"\61\2\2\u00c4\u00c8\3\2\2\2\u00c5\u00c7\n\2\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\b\27\2\2\u00cc.\3\2\2\2\u00cd\u00d9"+
		"\7\62\2\2\u00ce\u00d0\7/\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d5\t\3\2\2\u00d2\u00d4\t\4\2\2\u00d3\u00d2\3\2"+
		"\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00cd\3\2\2\2\u00d8\u00cf\3\2"+
		"\2\2\u00d9\60\3\2\2\2\u00da\u00dc\7/\2\2\u00db\u00da\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00df\t\3\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e7\7\60\2\2\u00e4\u00e6\t\4\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00fb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ec\7/\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f0\3\2\2\2\u00ed\u00ef\t\5"+
		"\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f7\7\60"+
		"\2\2\u00f4\u00f6\t\4\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00fa\u00db\3\2\2\2\u00fa\u00eb\3\2\2\2\u00fb\62\3\2\2\2\u00fc\u0100"+
		"\t\6\2\2\u00fd\u00ff\t\7\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\64\3\2\2\2\u0102\u0100\3\2\2"+
		"\2\u0103\u0105\t\b\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\b\33\2\2"+
		"\u0109\66\3\2\2\2\20\2\u00c8\u00cf\u00d5\u00d8\u00db\u00e0\u00e7\u00eb"+
		"\u00f0\u00f7\u00fa\u0100\u0106\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}