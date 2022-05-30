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
		T__0=1, T__1=2, T__2=3, REPEAT=4, ENDREPEAT=5, FUNCTION=6, ENDFUNCTION=7, 
		IF=8, THEN=9, ENDIF=10, PRINT=11, SCAN_INT=12, SCAN_REAL=13, ADD=14, SUB=15, 
		MULT=16, DIV=17, EQ=18, OB=19, CB=20, SEMI=21, COMMENT=22, INT=23, REAL=24, 
		ID=25, WS=26;
	public static final int
		RULE_prog = 0, RULE_lines = 1, RULE_line = 2, RULE_command = 3, RULE_function = 4, 
		RULE_fparam = 5, RULE_fblock = 6, RULE_cond = 7, RULE_blockif = 8, RULE_blockrepeat = 9, 
		RULE_repetitions = 10, RULE_value = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "lines", "line", "command", "function", "fparam", "fblock", "cond", 
			"blockif", "blockrepeat", "repetitions", "value"
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
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			lines();
			setState(26);
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

	public static class LinesContext extends ParserRuleContext {
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public LinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitLines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitLines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinesContext lines() throws RecognitionException {
		LinesContext _localctx = new LinesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT) | (1L << FUNCTION) | (1L << IF) | (1L << PRINT) | (1L << SEMI) | (1L << ID))) != 0)) {
				{
				{
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REPEAT:
				case IF:
				case PRINT:
				case ID:
					{
					setState(28);
					line();
					}
					break;
				case FUNCTION:
					{
					setState(29);
					function();
					}
					break;
				case SEMI:
					break;
				default:
					break;
				}
				setState(32);
				match(SEMI);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class RepeatContext extends LineContext {
		public TerminalNode REPEAT() { return getToken(QbsonParser.REPEAT, 0); }
		public RepetitionsContext repetitions() {
			return getRuleContext(RepetitionsContext.class,0);
		}
		public BlockrepeatContext blockrepeat() {
			return getRuleContext(BlockrepeatContext.class,0);
		}
		public TerminalNode ENDREPEAT() { return getToken(QbsonParser.ENDREPEAT, 0); }
		public RepeatContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends LineContext {
		public TerminalNode IF() { return getToken(QbsonParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode THEN() { return getToken(QbsonParser.THEN, 0); }
		public BlockifContext blockif() {
			return getRuleContext(BlockifContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(QbsonParser.ENDIF, 0); }
		public IfContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitIf(this);
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
		enterRule(_localctx, 4, RULE_line);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(ID);
				setState(39);
				match(EQ);
				setState(40);
				command(0);
				}
				break;
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(PRINT);
				setState(42);
				match(OB);
				setState(43);
				match(ID);
				setState(44);
				match(CB);
				}
				break;
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(IF);
				setState(46);
				cond();
				setState(47);
				match(THEN);
				setState(48);
				blockif();
				setState(49);
				match(ENDIF);
				}
				break;
			case REPEAT:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				match(REPEAT);
				setState(52);
				repetitions();
				setState(53);
				blockrepeat();
				setState(54);
				match(ENDREPEAT);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_command, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(59);
				match(INT);
				}
				break;
			case REAL:
				{
				_localctx = new RealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(REAL);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(ID);
				}
				break;
			case SCAN_INT:
				{
				_localctx = new ScanIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(SCAN_INT);
				}
				break;
			case SCAN_REAL:
				{
				_localctx = new ScanRealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(SCAN_REAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(78);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionContext(new CommandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_command);
						setState(66);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(67);
						match(ADD);
						setState(68);
						command(10);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionContext(new CommandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_command);
						setState(69);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(70);
						match(SUB);
						setState(71);
						command(9);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationContext(new CommandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_command);
						setState(72);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(73);
						match(MULT);
						setState(74);
						command(8);
						}
						break;
					case 4:
						{
						_localctx = new DivisionContext(new CommandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_command);
						setState(75);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(76);
						match(DIV);
						setState(77);
						command(7);
						}
						break;
					}
					} 
				}
				setState(82);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(QbsonParser.FUNCTION, 0); }
		public FparamContext fparam() {
			return getRuleContext(FparamContext.class,0);
		}
		public FblockContext fblock() {
			return getRuleContext(FblockContext.class,0);
		}
		public TerminalNode ENDFUNCTION() { return getToken(QbsonParser.ENDFUNCTION, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(FUNCTION);
			setState(84);
			fparam();
			setState(85);
			fblock();
			setState(86);
			match(ENDFUNCTION);
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

	public static class FparamContext extends ParserRuleContext {
		public FparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparam; }
	 
		public FparamContext() { }
		public void copyFrom(FparamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FParamContext extends FparamContext {
		public TerminalNode ID() { return getToken(QbsonParser.ID, 0); }
		public FParamContext(FparamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterFParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitFParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitFParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FparamContext fparam() throws RecognitionException {
		FparamContext _localctx = new FparamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fparam);
		try {
			_localctx = new FParamContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
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

	public static class FblockContext extends ParserRuleContext {
		public FblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fblock; }
	 
		public FblockContext() { }
		public void copyFrom(FblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FBlockContext extends FblockContext {
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
		public FBlockContext(FblockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterFBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitFBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitFBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FblockContext fblock() throws RecognitionException {
		FblockContext _localctx = new FblockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fblock);
		int _la;
		try {
			_localctx = new FBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT) | (1L << IF) | (1L << PRINT) | (1L << SEMI) | (1L << ID))) != 0)) {
				{
				{
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
					{
					setState(90);
					line();
					}
				}

				setState(93);
				match(SEMI);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionContext extends CondContext {
		public TerminalNode ID() { return getToken(QbsonParser.ID, 0); }
		public TerminalNode INT() { return getToken(QbsonParser.INT, 0); }
		public ConditionContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cond);
		try {
			_localctx = new ConditionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(100);
			match(T__2);
			setState(101);
			match(INT);
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

	public static class BlockifContext extends ParserRuleContext {
		public BlockifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockif; }
	 
		public BlockifContext() { }
		public void copyFrom(BlockifContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockIfContext extends BlockifContext {
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public BlockIfContext(BlockifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterBlockIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitBlockIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitBlockIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockifContext blockif() throws RecognitionException {
		BlockifContext _localctx = new BlockifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockif);
		try {
			_localctx = new BlockIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			lines();
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

	public static class BlockrepeatContext extends ParserRuleContext {
		public BlockrepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockrepeat; }
	 
		public BlockrepeatContext() { }
		public void copyFrom(BlockrepeatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockRepeatContext extends BlockrepeatContext {
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public BlockRepeatContext(BlockrepeatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterBlockRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitBlockRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitBlockRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockrepeatContext blockrepeat() throws RecognitionException {
		BlockrepeatContext _localctx = new BlockrepeatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockrepeat);
		try {
			_localctx = new BlockRepeatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			lines();
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

	public static class RepetitionsContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public RepetitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterRepetitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitRepetitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitRepetitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetitionsContext repetitions() throws RecognitionException {
		RepetitionsContext _localctx = new RepetitionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_repetitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			value();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QbsonParser.ID, 0); }
		public TerminalNode INT() { return getToken(QbsonParser.INT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\5\3!\n\3\3\3\7\3$\n\3\f\3\16\3"+
		"\'\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5Q\n\5\f\5\16\5T\13\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\5\b^\n\b\3\b\7\ba\n\b\f\b\16\bd\13\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\2\3\b\16\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\2\3\4\2\31\31\33\33\2u\2\32\3\2\2\2\4%\3\2\2\2\6:\3\2\2\2\bB\3"+
		"\2\2\2\nU\3\2\2\2\fZ\3\2\2\2\16b\3\2\2\2\20e\3\2\2\2\22i\3\2\2\2\24k\3"+
		"\2\2\2\26m\3\2\2\2\30o\3\2\2\2\32\33\7\3\2\2\33\34\5\4\3\2\34\35\7\4\2"+
		"\2\35\3\3\2\2\2\36!\5\6\4\2\37!\5\n\6\2 \36\3\2\2\2 \37\3\2\2\2 !\3\2"+
		"\2\2!\"\3\2\2\2\"$\7\27\2\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&"+
		"\5\3\2\2\2\'%\3\2\2\2()\7\33\2\2)*\7\24\2\2*;\5\b\5\2+,\7\r\2\2,-\7\25"+
		"\2\2-.\7\33\2\2.;\7\26\2\2/\60\7\n\2\2\60\61\5\20\t\2\61\62\7\13\2\2\62"+
		"\63\5\22\n\2\63\64\7\f\2\2\64;\3\2\2\2\65\66\7\6\2\2\66\67\5\26\f\2\67"+
		"8\5\24\13\289\7\7\2\29;\3\2\2\2:(\3\2\2\2:+\3\2\2\2:/\3\2\2\2:\65\3\2"+
		"\2\2;\7\3\2\2\2<=\b\5\1\2=C\7\31\2\2>C\7\32\2\2?C\7\33\2\2@C\7\16\2\2"+
		"AC\7\17\2\2B<\3\2\2\2B>\3\2\2\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2CR\3\2\2"+
		"\2DE\f\13\2\2EF\7\20\2\2FQ\5\b\5\fGH\f\n\2\2HI\7\21\2\2IQ\5\b\5\13JK\f"+
		"\t\2\2KL\7\22\2\2LQ\5\b\5\nMN\f\b\2\2NO\7\23\2\2OQ\5\b\5\tPD\3\2\2\2P"+
		"G\3\2\2\2PJ\3\2\2\2PM\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\t\3\2\2\2"+
		"TR\3\2\2\2UV\7\b\2\2VW\5\f\7\2WX\5\16\b\2XY\7\t\2\2Y\13\3\2\2\2Z[\7\33"+
		"\2\2[\r\3\2\2\2\\^\5\6\4\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_a\7\27\2\2`"+
		"]\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\17\3\2\2\2db\3\2\2\2ef\7\33\2"+
		"\2fg\7\5\2\2gh\7\31\2\2h\21\3\2\2\2ij\5\4\3\2j\23\3\2\2\2kl\5\4\3\2l\25"+
		"\3\2\2\2mn\5\30\r\2n\27\3\2\2\2op\t\2\2\2p\31\3\2\2\2\n %:BPR]b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}