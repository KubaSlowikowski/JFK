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
		T__0=1, T__1=2, T__2=3, REPEAT=4, ENDREPEAT=5, IF=6, THEN=7, ENDIF=8, 
		PRINT=9, SCAN_INT=10, SCAN_REAL=11, ADD=12, SUB=13, MULT=14, DIV=15, EQ=16, 
		OB=17, CB=18, SEMI=19, COMMENT=20, INT=21, REAL=22, ID=23, WS=24;
	public static final int
		RULE_prog = 0, RULE_lines = 1, RULE_line = 2, RULE_command = 3, RULE_cond = 4, 
		RULE_blockif = 5, RULE_blockrepeat = 6, RULE_repetitions = 7, RULE_value = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "lines", "line", "command", "cond", "blockif", "blockrepeat", 
			"repetitions", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'styrt'", "'qniec'", "'=='", "'powtarzaj'", "'juz nie powtarzaj'", 
			"'jesli'", "'to'", "'wystarczy'", "'pokazMiSwojeTowary'", "'czytejIntidzer()'", 
			"'czytejRijal()'", "'+'", "'-'", "'*'", "'/'", "'='", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "REPEAT", "ENDREPEAT", "IF", "THEN", "ENDIF", 
			"PRINT", "SCAN_INT", "SCAN_REAL", "ADD", "SUB", "MULT", "DIV", "EQ", 
			"OB", "CB", "SEMI", "COMMENT", "INT", "REAL", "ID", "WS"
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
			setState(18);
			match(T__0);
			setState(19);
			lines();
			setState(20);
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
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT) | (1L << IF) | (1L << PRINT) | (1L << SEMI) | (1L << ID))) != 0)) {
				{
				{
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT) | (1L << IF) | (1L << PRINT) | (1L << ID))) != 0)) {
					{
					setState(22);
					line();
					}
				}

				setState(25);
				match(SEMI);
				}
				}
				setState(30);
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
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(ID);
				setState(32);
				match(EQ);
				setState(33);
				command(0);
				}
				break;
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(PRINT);
				setState(35);
				match(OB);
				setState(36);
				match(ID);
				setState(37);
				match(CB);
				}
				break;
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(IF);
				setState(39);
				cond();
				setState(40);
				match(THEN);
				setState(41);
				blockif();
				setState(42);
				match(ENDIF);
				}
				break;
			case REPEAT:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(REPEAT);
				setState(45);
				repetitions();
				setState(46);
				blockrepeat();
				setState(47);
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
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(52);
				match(INT);
				}
				break;
			case REAL:
				{
				_localctx = new RealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(REAL);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(ID);
				}
				break;
			case SCAN_INT:
				{
				_localctx = new ScanIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(SCAN_INT);
				}
				break;
			case SCAN_REAL:
				{
				_localctx = new ScanRealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(SCAN_REAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionContext(new CommandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_command);
						setState(59);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(60);
						match(ADD);
						setState(61);
						command(10);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionContext(new CommandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_command);
						setState(62);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(63);
						match(SUB);
						setState(64);
						command(9);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationContext(new CommandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_command);
						setState(65);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(66);
						match(MULT);
						setState(67);
						command(8);
						}
						break;
					case 4:
						{
						_localctx = new DivisionContext(new CommandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_command);
						setState(68);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(69);
						match(DIV);
						setState(70);
						command(7);
						}
						break;
					}
					} 
				}
				setState(75);
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
		enterRule(_localctx, 8, RULE_cond);
		try {
			_localctx = new ConditionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			setState(77);
			match(T__2);
			setState(78);
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
		enterRule(_localctx, 10, RULE_blockif);
		try {
			_localctx = new BlockIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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
		enterRule(_localctx, 12, RULE_blockrepeat);
		try {
			_localctx = new BlockRepeatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
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
		enterRule(_localctx, 14, RULE_repetitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
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
		enterRule(_localctx, 16, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\3\5\3\32\n\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5<\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\2\3\b\13\2\4\6\b\n\f\16\20\22\2\3\4\2\27\27\31\31\2^\2\24"+
		"\3\2\2\2\4\36\3\2\2\2\6\63\3\2\2\2\b;\3\2\2\2\nN\3\2\2\2\fR\3\2\2\2\16"+
		"T\3\2\2\2\20V\3\2\2\2\22X\3\2\2\2\24\25\7\3\2\2\25\26\5\4\3\2\26\27\7"+
		"\4\2\2\27\3\3\2\2\2\30\32\5\6\4\2\31\30\3\2\2\2\31\32\3\2\2\2\32\33\3"+
		"\2\2\2\33\35\7\25\2\2\34\31\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3"+
		"\2\2\2\37\5\3\2\2\2 \36\3\2\2\2!\"\7\31\2\2\"#\7\22\2\2#\64\5\b\5\2$%"+
		"\7\13\2\2%&\7\23\2\2&\'\7\31\2\2\'\64\7\24\2\2()\7\b\2\2)*\5\n\6\2*+\7"+
		"\t\2\2+,\5\f\7\2,-\7\n\2\2-\64\3\2\2\2./\7\6\2\2/\60\5\20\t\2\60\61\5"+
		"\16\b\2\61\62\7\7\2\2\62\64\3\2\2\2\63!\3\2\2\2\63$\3\2\2\2\63(\3\2\2"+
		"\2\63.\3\2\2\2\64\7\3\2\2\2\65\66\b\5\1\2\66<\7\27\2\2\67<\7\30\2\28<"+
		"\7\31\2\29<\7\f\2\2:<\7\r\2\2;\65\3\2\2\2;\67\3\2\2\2;8\3\2\2\2;9\3\2"+
		"\2\2;:\3\2\2\2<K\3\2\2\2=>\f\13\2\2>?\7\16\2\2?J\5\b\5\f@A\f\n\2\2AB\7"+
		"\17\2\2BJ\5\b\5\13CD\f\t\2\2DE\7\20\2\2EJ\5\b\5\nFG\f\b\2\2GH\7\21\2\2"+
		"HJ\5\b\5\tI=\3\2\2\2I@\3\2\2\2IC\3\2\2\2IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2"+
		"KL\3\2\2\2L\t\3\2\2\2MK\3\2\2\2NO\7\31\2\2OP\7\5\2\2PQ\7\27\2\2Q\13\3"+
		"\2\2\2RS\5\4\3\2S\r\3\2\2\2TU\5\4\3\2U\17\3\2\2\2VW\5\22\n\2W\21\3\2\2"+
		"\2XY\t\2\2\2Y\23\3\2\2\2\b\31\36\63;IK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}