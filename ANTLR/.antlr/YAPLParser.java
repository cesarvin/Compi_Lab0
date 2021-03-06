// Generated from c:\GitHub\Compi\Compi_Lab0\ANTLR\YAPL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YAPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, ELSE=2, FI=3, IF=4, IN=5, INHERITS=6, IS_VOID=7, LOOP=8, POOL=9, 
		THEN=10, WHILE=11, NEW=12, NOT=13, LET=14, ID=15, TYPE=16, INT=17, FALSE=18, 
		TRUE=19, STRING=20, COMMENT=21, COMMENT_BLOCK=22, WHITE_SPACE=23, SEMICOLON=24, 
		OPEN_CURLY_BRACKETS=25, CLOSE_CURLY_BRACKETS=26, OPEN_PARENTHESES=27, 
		CLOSE_PARENTHESES=28, COMMA=29, COLON=30, ASSING=31, AT=32, DOT=33, ADD=34, 
		SUB=35, MUL=36, DIV=37, EQUAL=38, N_MARK=39, LOWER_THAN=40, LOWER_THAN_EQUAL=41, 
		ERROR=42;
	public static final int
		RULE_program = 0, RULE_define_class = 1, RULE_feature = 2, RULE_formal = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "define_class", "feature", "formal", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'false'", "'true'", null, null, 
			null, null, "';'", "'{'", "'}'", "'('", "')'", "','", "':'", "'<-'", 
			"'@'", "'.'", "'+'", "'-'", "'*'", "'/'", "'='", "'~'", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "IS_VOID", "LOOP", 
			"POOL", "THEN", "WHILE", "NEW", "NOT", "LET", "ID", "TYPE", "INT", "FALSE", 
			"TRUE", "STRING", "COMMENT", "COMMENT_BLOCK", "WHITE_SPACE", "SEMICOLON", 
			"OPEN_CURLY_BRACKETS", "CLOSE_CURLY_BRACKETS", "OPEN_PARENTHESES", "CLOSE_PARENTHESES", 
			"COMMA", "COLON", "ASSING", "AT", "DOT", "ADD", "SUB", "MUL", "DIV", 
			"EQUAL", "N_MARK", "LOWER_THAN", "LOWER_THAN_EQUAL", "ERROR"
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
	public String getGrammarFileName() { return "YAPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YAPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(YAPLParser.EOF, 0); }
		public List<Define_classContext> define_class() {
			return getRuleContexts(Define_classContext.class);
		}
		public Define_classContext define_class(int i) {
			return getRuleContext(Define_classContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(YAPLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(YAPLParser.SEMICOLON, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				define_class();
				setState(11);
				match(SEMICOLON);
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			setState(17);
			match(EOF);
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

	public static class Define_classContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(YAPLParser.CLASS, 0); }
		public List<TerminalNode> TYPE() { return getTokens(YAPLParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(YAPLParser.TYPE, i);
		}
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(YAPLParser.OPEN_CURLY_BRACKETS, 0); }
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(YAPLParser.CLOSE_CURLY_BRACKETS, 0); }
		public TerminalNode INHERITS() { return getToken(YAPLParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(YAPLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(YAPLParser.SEMICOLON, i);
		}
		public Define_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_class; }
	}

	public final Define_classContext define_class() throws RecognitionException {
		Define_classContext _localctx = new Define_classContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_define_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(CLASS);
			setState(20);
			match(TYPE);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(21);
				match(INHERITS);
				setState(22);
				match(TYPE);
				}
			}

			setState(25);
			match(OPEN_CURLY_BRACKETS);
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				feature();
				setState(27);
				match(SEMICOLON);
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(33);
			match(CLOSE_CURLY_BRACKETS);
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

	public static class FeatureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode OPEN_PARENTHESES() { return getToken(YAPLParser.OPEN_PARENTHESES, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(YAPLParser.CLOSE_PARENTHESES, 0); }
		public TerminalNode COLON() { return getToken(YAPLParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(YAPLParser.TYPE, 0); }
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(YAPLParser.OPEN_CURLY_BRACKETS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(YAPLParser.CLOSE_CURLY_BRACKETS, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(YAPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(YAPLParser.COMMA, i);
		}
		public TerminalNode ASSING() { return getToken(YAPLParser.ASSING, 0); }
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(35);
				match(ID);
				setState(36);
				match(OPEN_PARENTHESES);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(37);
					formal();
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(38);
						match(COMMA);
						}
					}

					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				match(CLOSE_PARENTHESES);
				setState(47);
				match(COLON);
				setState(48);
				match(TYPE);
				setState(49);
				match(OPEN_CURLY_BRACKETS);
				setState(50);
				expr(0);
				setState(51);
				match(CLOSE_CURLY_BRACKETS);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(ID);
				setState(54);
				match(COLON);
				setState(55);
				match(TYPE);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSING) {
					{
					setState(56);
					match(ASSING);
					setState(57);
					expr(0);
					}
				}

				}
				break;
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

	public static class FormalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode COLON() { return getToken(YAPLParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(YAPLParser.TYPE, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ID);
			setState(63);
			match(COLON);
			setState(64);
			match(TYPE);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(YAPLParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(YAPLParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(YAPLParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(YAPLParser.FI, 0); }
		public TerminalNode WHILE() { return getToken(YAPLParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(YAPLParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(YAPLParser.POOL, 0); }
		public TerminalNode OPEN_CURLY_BRACKETS() { return getToken(YAPLParser.OPEN_CURLY_BRACKETS, 0); }
		public TerminalNode CLOSE_CURLY_BRACKETS() { return getToken(YAPLParser.CLOSE_CURLY_BRACKETS, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(YAPLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(YAPLParser.SEMICOLON, i);
		}
		public TerminalNode LET() { return getToken(YAPLParser.LET, 0); }
		public List<TerminalNode> ID() { return getTokens(YAPLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(YAPLParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(YAPLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(YAPLParser.COLON, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(YAPLParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(YAPLParser.TYPE, i);
		}
		public TerminalNode IN() { return getToken(YAPLParser.IN, 0); }
		public List<TerminalNode> ASSING() { return getTokens(YAPLParser.ASSING); }
		public TerminalNode ASSING(int i) {
			return getToken(YAPLParser.ASSING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(YAPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(YAPLParser.COMMA, i);
		}
		public TerminalNode NEW() { return getToken(YAPLParser.NEW, 0); }
		public TerminalNode IS_VOID() { return getToken(YAPLParser.IS_VOID, 0); }
		public TerminalNode N_MARK() { return getToken(YAPLParser.N_MARK, 0); }
		public TerminalNode NOT() { return getToken(YAPLParser.NOT, 0); }
		public TerminalNode OPEN_PARENTHESES() { return getToken(YAPLParser.OPEN_PARENTHESES, 0); }
		public TerminalNode CLOSE_PARENTHESES() { return getToken(YAPLParser.CLOSE_PARENTHESES, 0); }
		public TerminalNode INT() { return getToken(YAPLParser.INT, 0); }
		public TerminalNode STRING() { return getToken(YAPLParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(YAPLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(YAPLParser.FALSE, 0); }
		public TerminalNode MUL() { return getToken(YAPLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(YAPLParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(YAPLParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(YAPLParser.SUB, 0); }
		public TerminalNode LOWER_THAN_EQUAL() { return getToken(YAPLParser.LOWER_THAN_EQUAL, 0); }
		public TerminalNode LOWER_THAN() { return getToken(YAPLParser.LOWER_THAN, 0); }
		public TerminalNode EQUAL() { return getToken(YAPLParser.EQUAL, 0); }
		public TerminalNode DOT() { return getToken(YAPLParser.DOT, 0); }
		public TerminalNode AT() { return getToken(YAPLParser.AT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(67);
				match(IF);
				setState(68);
				expr(0);
				setState(69);
				match(THEN);
				setState(70);
				expr(0);
				setState(71);
				match(ELSE);
				setState(72);
				expr(0);
				setState(73);
				match(FI);
				}
				break;
			case 2:
				{
				setState(75);
				match(WHILE);
				setState(76);
				expr(0);
				setState(77);
				match(LOOP);
				setState(78);
				expr(0);
				setState(79);
				match(POOL);
				}
				break;
			case 3:
				{
				setState(81);
				match(OPEN_CURLY_BRACKETS);
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(82);
					expr(0);
					setState(83);
					match(SEMICOLON);
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << IS_VOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << LET) | (1L << ID) | (1L << INT) | (1L << FALSE) | (1L << TRUE) | (1L << STRING) | (1L << OPEN_CURLY_BRACKETS) | (1L << OPEN_PARENTHESES) | (1L << N_MARK))) != 0) );
				setState(89);
				match(CLOSE_CURLY_BRACKETS);
				}
				break;
			case 4:
				{
				setState(91);
				match(LET);
				setState(92);
				match(ID);
				setState(93);
				match(COLON);
				setState(94);
				match(TYPE);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSING) {
					{
					setState(95);
					match(ASSING);
					setState(96);
					expr(0);
					}
				}

				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(99);
					match(COMMA);
					setState(100);
					match(ID);
					setState(101);
					match(COLON);
					setState(102);
					match(TYPE);
					setState(103);
					match(ASSING);
					setState(104);
					expr(0);
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				match(IN);
				setState(111);
				expr(19);
				}
				break;
			case 5:
				{
				setState(112);
				match(NEW);
				setState(113);
				match(TYPE);
				}
				break;
			case 6:
				{
				setState(114);
				match(IS_VOID);
				setState(115);
				expr(17);
				}
				break;
			case 7:
				{
				setState(116);
				match(N_MARK);
				setState(117);
				expr(16);
				}
				break;
			case 8:
				{
				setState(118);
				match(NOT);
				setState(119);
				expr(8);
				}
				break;
			case 9:
				{
				setState(120);
				match(OPEN_PARENTHESES);
				setState(121);
				expr(0);
				setState(122);
				match(CLOSE_PARENTHESES);
				}
				break;
			case 10:
				{
				setState(124);
				match(ID);
				setState(125);
				match(ASSING);
				setState(126);
				expr(6);
				}
				break;
			case 11:
				{
				setState(127);
				match(ID);
				}
				break;
			case 12:
				{
				setState(128);
				match(INT);
				}
				break;
			case 13:
				{
				setState(129);
				match(STRING);
				}
				break;
			case 14:
				{
				setState(130);
				match(TRUE);
				}
				break;
			case 15:
				{
				setState(131);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(135);
						match(MUL);
						setState(136);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(138);
						match(DIV);
						setState(139);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(141);
						match(ADD);
						setState(142);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(144);
						match(SUB);
						setState(145);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(147);
						match(LOWER_THAN_EQUAL);
						setState(148);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(150);
						match(LOWER_THAN);
						setState(151);
						expr(11);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(153);
						match(EQUAL);
						setState(154);
						expr(10);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(156);
						match(OPEN_PARENTHESES);
						setState(161); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(157);
							expr(0);
							setState(159);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==COMMA) {
								{
								setState(158);
								match(COMMA);
								}
							}

							}
							}
							setState(163); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << IS_VOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << LET) | (1L << ID) | (1L << INT) | (1L << FALSE) | (1L << TRUE) | (1L << STRING) | (1L << OPEN_CURLY_BRACKETS) | (1L << OPEN_PARENTHESES) | (1L << N_MARK))) != 0) );
						setState(165);
						match(CLOSE_PARENTHESES);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(170);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(168);
							match(AT);
							setState(169);
							match(TYPE);
							}
						}

						setState(172);
						match(DOT);
						setState(173);
						match(ID);
						setState(174);
						match(OPEN_PARENTHESES);
						setState(185);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << IS_VOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << LET) | (1L << ID) | (1L << INT) | (1L << FALSE) | (1L << TRUE) | (1L << STRING) | (1L << OPEN_CURLY_BRACKETS) | (1L << OPEN_PARENTHESES) | (1L << N_MARK))) != 0)) {
							{
							{
							setState(175);
							expr(0);
							setState(180);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(176);
								match(COMMA);
								setState(177);
								expr(0);
								}
								}
								setState(182);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							}
							setState(187);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(188);
						match(CLOSE_PARENTHESES);
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 24);
		case 8:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\6\2\20\n\2\r\2\16\2\21\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\5\3\32\n\3\3\3\3\3\3\3\3\3\6\3 \n\3\r\3\16\3!\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\5\4*\n\4\7\4,\n\4\f\4\16\4/\13\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\5\4?\n\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\6\6X\n\6\r\6\16\6Y\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6d\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0087\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a2\n\6\6\6\u00a4\n\6\r\6\16\6"+
		"\u00a5\3\6\3\6\3\6\3\6\3\6\5\6\u00ad\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b5"+
		"\n\6\f\6\16\6\u00b8\13\6\7\6\u00ba\n\6\f\6\16\6\u00bd\13\6\3\6\7\6\u00c0"+
		"\n\6\f\6\16\6\u00c3\13\6\3\6\2\3\n\7\2\4\6\b\n\2\2\2\u00e5\2\17\3\2\2"+
		"\2\4\25\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\n\u0086\3\2\2\2\f\r\5\4\3\2\r\16"+
		"\7\32\2\2\16\20\3\2\2\2\17\f\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22"+
		"\3\2\2\2\22\23\3\2\2\2\23\24\7\2\2\3\24\3\3\2\2\2\25\26\7\3\2\2\26\31"+
		"\7\22\2\2\27\30\7\b\2\2\30\32\7\22\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32"+
		"\33\3\2\2\2\33\37\7\33\2\2\34\35\5\6\4\2\35\36\7\32\2\2\36 \3\2\2\2\37"+
		"\34\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\7\34\2\2$\5"+
		"\3\2\2\2%&\7\21\2\2&-\7\35\2\2\')\5\b\5\2(*\7\37\2\2)(\3\2\2\2)*\3\2\2"+
		"\2*,\3\2\2\2+\'\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3"+
		"\2\2\2\60\61\7\36\2\2\61\62\7 \2\2\62\63\7\22\2\2\63\64\7\33\2\2\64\65"+
		"\5\n\6\2\65\66\7\34\2\2\66?\3\2\2\2\678\7\21\2\289\7 \2\29<\7\22\2\2:"+
		";\7!\2\2;=\5\n\6\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2>%\3\2\2\2>\67\3\2\2\2"+
		"?\7\3\2\2\2@A\7\21\2\2AB\7 \2\2BC\7\22\2\2C\t\3\2\2\2DE\b\6\1\2EF\7\6"+
		"\2\2FG\5\n\6\2GH\7\f\2\2HI\5\n\6\2IJ\7\4\2\2JK\5\n\6\2KL\7\5\2\2L\u0087"+
		"\3\2\2\2MN\7\r\2\2NO\5\n\6\2OP\7\n\2\2PQ\5\n\6\2QR\7\13\2\2R\u0087\3\2"+
		"\2\2SW\7\33\2\2TU\5\n\6\2UV\7\32\2\2VX\3\2\2\2WT\3\2\2\2XY\3\2\2\2YW\3"+
		"\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\34\2\2\\\u0087\3\2\2\2]^\7\20\2\2^_\7"+
		"\21\2\2_`\7 \2\2`c\7\22\2\2ab\7!\2\2bd\5\n\6\2ca\3\2\2\2cd\3\2\2\2dm\3"+
		"\2\2\2ef\7\37\2\2fg\7\21\2\2gh\7 \2\2hi\7\22\2\2ij\7!\2\2jl\5\n\6\2ke"+
		"\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\7\2\2q"+
		"\u0087\5\n\6\25rs\7\16\2\2s\u0087\7\22\2\2tu\7\t\2\2u\u0087\5\n\6\23v"+
		"w\7)\2\2w\u0087\5\n\6\22xy\7\17\2\2y\u0087\5\n\6\nz{\7\35\2\2{|\5\n\6"+
		"\2|}\7\36\2\2}\u0087\3\2\2\2~\177\7\21\2\2\177\u0080\7!\2\2\u0080\u0087"+
		"\5\n\6\b\u0081\u0087\7\21\2\2\u0082\u0087\7\23\2\2\u0083\u0087\7\26\2"+
		"\2\u0084\u0087\7\25\2\2\u0085\u0087\7\24\2\2\u0086D\3\2\2\2\u0086M\3\2"+
		"\2\2\u0086S\3\2\2\2\u0086]\3\2\2\2\u0086r\3\2\2\2\u0086t\3\2\2\2\u0086"+
		"v\3\2\2\2\u0086x\3\2\2\2\u0086z\3\2\2\2\u0086~\3\2\2\2\u0086\u0081\3\2"+
		"\2\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u00c1\3\2\2\2\u0088\u0089\f\21\2\2\u0089\u008a\7"+
		"&\2\2\u008a\u00c0\5\n\6\22\u008b\u008c\f\20\2\2\u008c\u008d\7\'\2\2\u008d"+
		"\u00c0\5\n\6\21\u008e\u008f\f\17\2\2\u008f\u0090\7$\2\2\u0090\u00c0\5"+
		"\n\6\20\u0091\u0092\f\16\2\2\u0092\u0093\7%\2\2\u0093\u00c0\5\n\6\17\u0094"+
		"\u0095\f\r\2\2\u0095\u0096\7+\2\2\u0096\u00c0\5\n\6\16\u0097\u0098\f\f"+
		"\2\2\u0098\u0099\7*\2\2\u0099\u00c0\5\n\6\r\u009a\u009b\f\13\2\2\u009b"+
		"\u009c\7(\2\2\u009c\u00c0\5\n\6\f\u009d\u009e\f\32\2\2\u009e\u00a3\7\35"+
		"\2\2\u009f\u00a1\5\n\6\2\u00a0\u00a2\7\37\2\2\u00a1\u00a0\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\7\36\2\2\u00a8\u00c0\3\2\2\2\u00a9\u00ac\f\31\2\2\u00aa\u00ab\7"+
		"\"\2\2\u00ab\u00ad\7\22\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\7#\2\2\u00af\u00b0\7\21\2\2\u00b0\u00bb\7\35"+
		"\2\2\u00b1\u00b6\5\n\6\2\u00b2\u00b3\7\37\2\2\u00b3\u00b5\5\n\6\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00b1\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0\7\36\2\2\u00bf\u0088\3\2\2\2\u00bf"+
		"\u008b\3\2\2\2\u00bf\u008e\3\2\2\2\u00bf\u0091\3\2\2\2\u00bf\u0094\3\2"+
		"\2\2\u00bf\u0097\3\2\2\2\u00bf\u009a\3\2\2\2\u00bf\u009d\3\2\2\2\u00bf"+
		"\u00a9\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\13\3\2\2\2\u00c3\u00c1\3\2\2\2\24\21\31!)-<>Ycm\u0086\u00a1"+
		"\u00a5\u00ac\u00b6\u00bb\u00bf\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}