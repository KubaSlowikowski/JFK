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
		T__0=1, T__1=2, ADD=3, SUB=4, MULT=5, DIV=6, EQ=7, SEMI=8, COMMENT=9, 
		INT=10, REAL=11, ID=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "ADD", "SUB", "MULT", "DIV", "EQ", "SEMI", "COMMENT", 
			"INT", "REAL", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'styrt'", "'qniec'", "'+'", "'-'", "'*'", "'/'", "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "ADD", "SUB", "MULT", "DIV", "EQ", "SEMI", "COMMENT", 
			"INT", "REAL", "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\7\n:\n\n\f\n\16\n=\13\n\3\n\3\n\3\13\3\13\5\13C\n\13\3\13\3\13\7\13"+
		"G\n\13\f\13\16\13J\13\13\5\13L\n\13\3\f\5\fO\n\f\3\f\7\fR\n\f\f\f\16\f"+
		"U\13\f\3\f\3\f\7\fY\n\f\f\f\16\f\\\13\f\3\f\5\f_\n\f\3\f\7\fb\n\f\f\f"+
		"\16\fe\13\f\3\f\3\f\7\fi\n\f\f\f\16\fl\13\f\5\fn\n\f\3\r\3\r\7\rr\n\r"+
		"\f\r\16\ru\13\r\3\16\6\16x\n\16\r\16\16\16y\3\16\3\16\2\2\17\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\t\4\2\f\f\17"+
		"\17\3\2\63;\3\2\62;\3\2\62\62\3\2c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\""+
		"\2\u0089\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5#\3\2\2\2\7)\3\2\2\2"+
		"\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21\63\3\2\2\2\23\65\3"+
		"\2\2\2\25K\3\2\2\2\27m\3\2\2\2\31o\3\2\2\2\33w\3\2\2\2\35\36\7u\2\2\36"+
		"\37\7v\2\2\37 \7{\2\2 !\7t\2\2!\"\7v\2\2\"\4\3\2\2\2#$\7s\2\2$%\7p\2\2"+
		"%&\7k\2\2&\'\7g\2\2\'(\7e\2\2(\6\3\2\2\2)*\7-\2\2*\b\3\2\2\2+,\7/\2\2"+
		",\n\3\2\2\2-.\7,\2\2.\f\3\2\2\2/\60\7\61\2\2\60\16\3\2\2\2\61\62\7?\2"+
		"\2\62\20\3\2\2\2\63\64\7=\2\2\64\22\3\2\2\2\65\66\7\61\2\2\66\67\7\61"+
		"\2\2\67;\3\2\2\28:\n\2\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3"+
		"\2\2\2=;\3\2\2\2>?\b\n\2\2?\24\3\2\2\2@L\7\62\2\2AC\7/\2\2BA\3\2\2\2B"+
		"C\3\2\2\2CD\3\2\2\2DH\t\3\2\2EG\t\4\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2"+
		"HI\3\2\2\2IL\3\2\2\2JH\3\2\2\2K@\3\2\2\2KB\3\2\2\2L\26\3\2\2\2MO\7/\2"+
		"\2NM\3\2\2\2NO\3\2\2\2OS\3\2\2\2PR\t\3\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2"+
		"\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VZ\7\60\2\2WY\t\4\2\2XW\3\2\2\2Y\\\3\2"+
		"\2\2ZX\3\2\2\2Z[\3\2\2\2[n\3\2\2\2\\Z\3\2\2\2]_\7/\2\2^]\3\2\2\2^_\3\2"+
		"\2\2_c\3\2\2\2`b\t\5\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2"+
		"\2\2ec\3\2\2\2fj\7\60\2\2gi\t\4\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3"+
		"\2\2\2kn\3\2\2\2lj\3\2\2\2mN\3\2\2\2m^\3\2\2\2n\30\3\2\2\2os\t\6\2\2p"+
		"r\t\7\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\32\3\2\2\2us\3\2\2"+
		"\2vx\t\b\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b\16"+
		"\2\2|\34\3\2\2\2\20\2;BHKNSZ^cjmsy\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}