// Generated from C:/Users/Admin/IdeaProjects/JFK\Qbson.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QbsonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, PRINT=3, SCAN_INT=4, SCAN_REAL=5, ADD=6, SUB=7, MULT=8, 
		DIV=9, EQ=10, OB=11, CB=12, SEMI=13, COMMENT=14, INT=15, REAL=16, ID=17, 
		WS=18;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_command = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "command"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'styrt'", "'qniec'", "'pokazMiSwojeTowary'", "'czytejIntidzer()'", 
			"'czytejRijal()'", "'+'", "'-'", "'*'", "'/'", "'='", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "PRINT", "SCAN_INT", "SCAN_REAL", "ADD", "SUB", "MULT", 
			"DIV", "EQ", "OB", "CB", "SEMI", "COMMENT", "INT", "REAL", "ID", "WS"
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

	@Override
	public String getGrammarFileName() { return "Qbson.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QbsonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(QbsonParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(QbsonParser.SEMI, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(T__0);
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << SEMI) | (1L << ID))) != 0)) {
				{
				{
				setState(8);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRINT || _la==ID) {
					{
					setState(7);
					line();
					}
				}

				setState(10);
				match(SEMI);
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends LineContext {
		public TerminalNode PRINT() { return getToken(QbsonParser.PRINT, 0); }
		public TerminalNode OB() { return getToken(QbsonParser.OB, 0); }
		public TerminalNode ID() { return getToken(QbsonParser.ID, 0); }
		public TerminalNode CB() { return getToken(QbsonParser.CB, 0); }
		public PrintContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends LineContext {
		public TerminalNode ID() { return getToken(QbsonParser.ID, 0); }
		public TerminalNode EQ() { return getToken(QbsonParser.EQ, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public AssignContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(ID);
				setState(19);
				match(EQ);
				setState(20);
				command(0);
				}
				break;
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(PRINT);
				setState(22);
				match(OB);
				setState(23);
				match(ID);
				setState(24);
				match(CB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ScanRealContext extends CommandContext {
		public TerminalNode SCAN_REAL() { return getToken(QbsonParser.SCAN_REAL, 0); }
		public ScanRealContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterScanReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitScanReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitScanReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends CommandContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode DIV() { return getToken(QbsonParser.DIV, 0); }
		public DivisionContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScanIntContext extends CommandContext {
		public TerminalNode SCAN_INT() { return getToken(QbsonParser.SCAN_INT, 0); }
		public ScanIntContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterScanInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitScanInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitScanInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends CommandContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode SUB() { return getToken(QbsonParser.SUB, 0); }
		public SubtractionContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealContext extends CommandContext {
		public TerminalNode REAL() { return getToken(QbsonParser.REAL, 0); }
		public RealContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends CommandContext {
		public TerminalNode ID() { return getToken(QbsonParser.ID, 0); }
		public IdContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends CommandContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode MULT() { return getToken(QbsonParser.MULT, 0); }
		public MultiplicationContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends CommandContext {
		public TerminalNode INT() { return getToken(QbsonParser.INT, 0); }
		public IntContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends CommandContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode ADD() { return getToken(QbsonParser.ADD, 0); }
		public AdditionContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		return command(0);
	}

	private CommandContext command(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CommandContext _localctx = new CommandContext(_ctx, _parentState);
		CommandContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_command, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(28);
				match(INT);
				}
				break;
			case REAL:
				{
				_localctx = new RealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(REAL);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				match(ID);
				}
				break;
			case SCAN_INT:
				{
				_localctx = new ScanIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				match(SCAN_INT);
				}
				break;
			case SCAN_REAL:
				{
				_localctx = new ScanRealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				match(SCAN_REAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(47);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionContext(new CommandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_command);
						setState(35);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(36);
						match(ADD);
						setState(37);
						command(10);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionContext(new CommandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_command);
						setState(38);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(39);
						match(SUB);
						setState(40);
						command(9);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationContext(new CommandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_command);
						setState(41);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(42);
						match(MULT);
						setState(43);
						command(8);
						}
						break;
					case 4:
						{
						_localctx = new DivisionContext(new CommandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_command);
						setState(44);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(45);
						match(DIV);
						setState(46);
						command(7);
						}
						break;
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return command_sempred((CommandContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean command_sempred(CommandContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\67\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\5\2\13\n\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"$\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\62\n\4\f\4\16"+
		"\4\65\13\4\3\4\2\3\6\5\2\4\6\2\2\2>\2\b\3\2\2\2\4\33\3\2\2\2\6#\3\2\2"+
		"\2\b\17\7\3\2\2\t\13\5\4\3\2\n\t\3\2\2\2\n\13\3\2\2\2\13\f\3\2\2\2\f\16"+
		"\7\17\2\2\r\n\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3"+
		"\2\2\2\21\17\3\2\2\2\22\23\7\4\2\2\23\3\3\2\2\2\24\25\7\23\2\2\25\26\7"+
		"\f\2\2\26\34\5\6\4\2\27\30\7\5\2\2\30\31\7\r\2\2\31\32\7\23\2\2\32\34"+
		"\7\16\2\2\33\24\3\2\2\2\33\27\3\2\2\2\34\5\3\2\2\2\35\36\b\4\1\2\36$\7"+
		"\21\2\2\37$\7\22\2\2 $\7\23\2\2!$\7\6\2\2\"$\7\7\2\2#\35\3\2\2\2#\37\3"+
		"\2\2\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\63\3\2\2\2%&\f\13\2\2&\'\7\b\2"+
		"\2\'\62\5\6\4\f()\f\n\2\2)*\7\t\2\2*\62\5\6\4\13+,\f\t\2\2,-\7\n\2\2-"+
		"\62\5\6\4\n./\f\b\2\2/\60\7\13\2\2\60\62\5\6\4\t\61%\3\2\2\2\61(\3\2\2"+
		"\2\61+\3\2\2\2\61.\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64"+
		"\7\3\2\2\2\65\63\3\2\2\2\b\n\17\33#\61\63";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}