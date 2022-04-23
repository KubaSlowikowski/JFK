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
		T__0=1, T__1=2, ADD=3, SUB=4, MULT=5, DIV=6, EQ=7, SEMI=8, COMMENT=9, 
		INT=10, REAL=11, ID=12, WS=13;
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
			while (_la==SEMI || _la==ID) {
				{
				{
				setState(8);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
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
	public static class SubstractionContext extends CommandContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode SUB() { return getToken(QbsonParser.SUB, 0); }
		public SubstractionContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).enterSubstraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QbsonListener ) ((QbsonListener)listener).exitSubstraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QbsonVisitor ) return ((QbsonVisitor<? extends T>)visitor).visitSubstraction(this);
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
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(23);
				match(INT);
				}
				break;
			case REAL:
				{
				_localctx = new RealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				match(REAL);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(40);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionContext(new CommandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_command);
						setState(28);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(29);
						match(ADD);
						setState(30);
						command(8);
						}
						break;
					case 2:
						{
						_localctx = new SubstractionContext(new CommandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_command);
						setState(31);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(32);
						match(SUB);
						setState(33);
						command(7);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationContext(new CommandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_command);
						setState(34);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(35);
						match(MULT);
						setState(36);
						command(6);
						}
						break;
					case 4:
						{
						_localctx = new DivisionContext(new CommandContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_command);
						setState(37);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(38);
						match(DIV);
						setState(39);
						command(5);
						}
						break;
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17\60\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\5\2\13\n\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\35\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\4\2\3\6\5\2\4\6\2\2"+
		"\2\64\2\b\3\2\2\2\4\24\3\2\2\2\6\34\3\2\2\2\b\17\7\3\2\2\t\13\5\4\3\2"+
		"\n\t\3\2\2\2\n\13\3\2\2\2\13\f\3\2\2\2\f\16\7\n\2\2\r\n\3\2\2\2\16\21"+
		"\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2\21\17\3\2\2\2\22\23"+
		"\7\4\2\2\23\3\3\2\2\2\24\25\7\16\2\2\25\26\7\t\2\2\26\27\5\6\4\2\27\5"+
		"\3\2\2\2\30\31\b\4\1\2\31\35\7\f\2\2\32\35\7\r\2\2\33\35\7\16\2\2\34\30"+
		"\3\2\2\2\34\32\3\2\2\2\34\33\3\2\2\2\35,\3\2\2\2\36\37\f\t\2\2\37 \7\5"+
		"\2\2 +\5\6\4\n!\"\f\b\2\2\"#\7\6\2\2#+\5\6\4\t$%\f\7\2\2%&\7\7\2\2&+\5"+
		"\6\4\b\'(\f\6\2\2()\7\b\2\2)+\5\6\4\7*\36\3\2\2\2*!\3\2\2\2*$\3\2\2\2"+
		"*\'\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\7\3\2\2\2.,\3\2\2\2\7\n\17"+
		"\34*,";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}