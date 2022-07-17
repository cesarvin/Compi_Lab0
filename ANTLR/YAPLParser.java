// Generated from YAPL.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitProgram(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterDefine_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitDefine_class(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitFeature(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitFormal(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAPLListener ) ((YAPLListener)listener).exitExpr(this);
		}
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
		"\u0004\u0001*\u00c3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0018\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001\u001e\b\u0001\u000b\u0001\f\u0001\u001f\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002(\b\u0002\u0005\u0002*\b\u0002\n\u0002\f\u0002-\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		";\b\u0002\u0003\u0002=\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004V\b\u0004\u000b\u0004\f\u0004W\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004b\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004j\b\u0004\n\u0004\f\u0004"+
		"m\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0085\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00a0\b\u0004\u0004\u0004\u00a2\b"+
		"\u0004\u000b\u0004\f\u0004\u00a3\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00ab\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00b3\b\u0004\n"+
		"\u0004\f\u0004\u00b6\t\u0004\u0005\u0004\u00b8\b\u0004\n\u0004\f\u0004"+
		"\u00bb\t\u0004\u0001\u0004\u0005\u0004\u00be\b\u0004\n\u0004\f\u0004\u00c1"+
		"\t\u0004\u0001\u0004\u0000\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000"+
		"\u0000\u00e3\u0000\r\u0001\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000"+
		"\u0000\u0004<\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000\b"+
		"\u0084\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\f"+
		"\u0005\u0018\u0000\u0000\f\u000e\u0001\u0000\u0000\u0000\r\n\u0001\u0000"+
		"\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000"+
		"\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000"+
		"\u0000\u0011\u0012\u0005\u0000\u0000\u0001\u0012\u0001\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0005\u0001\u0000\u0000\u0014\u0017\u0005\u0010\u0000"+
		"\u0000\u0015\u0016\u0005\u0006\u0000\u0000\u0016\u0018\u0005\u0010\u0000"+
		"\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001d\u0005\u0019\u0000"+
		"\u0000\u001a\u001b\u0003\u0004\u0002\u0000\u001b\u001c\u0005\u0018\u0000"+
		"\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001a\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000"+
		"\u0000\u001f \u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0005"+
		"\u001a\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#$\u0005\u000f\u0000"+
		"\u0000$+\u0005\u001b\u0000\u0000%\'\u0003\u0006\u0003\u0000&(\u0005\u001d"+
		"\u0000\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0001"+
		"\u0000\u0000\u0000)%\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000"+
		"+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000./\u0005\u001c\u0000\u0000/0\u0005\u001e"+
		"\u0000\u000001\u0005\u0010\u0000\u000012\u0005\u0019\u0000\u000023\u0003"+
		"\b\u0004\u000034\u0005\u001a\u0000\u00004=\u0001\u0000\u0000\u000056\u0005"+
		"\u000f\u0000\u000067\u0005\u001e\u0000\u00007:\u0005\u0010\u0000\u0000"+
		"89\u0005\u001f\u0000\u00009;\u0003\b\u0004\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<#\u0001\u0000\u0000"+
		"\u0000<5\u0001\u0000\u0000\u0000=\u0005\u0001\u0000\u0000\u0000>?\u0005"+
		"\u000f\u0000\u0000?@\u0005\u001e\u0000\u0000@A\u0005\u0010\u0000\u0000"+
		"A\u0007\u0001\u0000\u0000\u0000BC\u0006\u0004\uffff\uffff\u0000CD\u0005"+
		"\u0004\u0000\u0000DE\u0003\b\u0004\u0000EF\u0005\n\u0000\u0000FG\u0003"+
		"\b\u0004\u0000GH\u0005\u0002\u0000\u0000HI\u0003\b\u0004\u0000IJ\u0005"+
		"\u0003\u0000\u0000J\u0085\u0001\u0000\u0000\u0000KL\u0005\u000b\u0000"+
		"\u0000LM\u0003\b\u0004\u0000MN\u0005\b\u0000\u0000NO\u0003\b\u0004\u0000"+
		"OP\u0005\t\u0000\u0000P\u0085\u0001\u0000\u0000\u0000QU\u0005\u0019\u0000"+
		"\u0000RS\u0003\b\u0004\u0000ST\u0005\u0018\u0000\u0000TV\u0001\u0000\u0000"+
		"\u0000UR\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0005"+
		"\u001a\u0000\u0000Z\u0085\u0001\u0000\u0000\u0000[\\\u0005\u000e\u0000"+
		"\u0000\\]\u0005\u000f\u0000\u0000]^\u0005\u001e\u0000\u0000^a\u0005\u0010"+
		"\u0000\u0000_`\u0005\u001f\u0000\u0000`b\u0003\b\u0004\u0000a_\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000bk\u0001\u0000\u0000\u0000cd\u0005"+
		"\u001d\u0000\u0000de\u0005\u000f\u0000\u0000ef\u0005\u001e\u0000\u0000"+
		"fg\u0005\u0010\u0000\u0000gh\u0005\u001f\u0000\u0000hj\u0003\b\u0004\u0000"+
		"ic\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000no\u0005\u0005\u0000\u0000o\u0085\u0003\b\u0004\u0013pq\u0005"+
		"\f\u0000\u0000q\u0085\u0005\u0010\u0000\u0000rs\u0005\u0007\u0000\u0000"+
		"s\u0085\u0003\b\u0004\u0011tu\u0005\'\u0000\u0000u\u0085\u0003\b\u0004"+
		"\u0010vw\u0005\r\u0000\u0000w\u0085\u0003\b\u0004\bxy\u0005\u001b\u0000"+
		"\u0000yz\u0003\b\u0004\u0000z{\u0005\u001c\u0000\u0000{\u0085\u0001\u0000"+
		"\u0000\u0000|}\u0005\u000f\u0000\u0000}~\u0005\u001f\u0000\u0000~\u0085"+
		"\u0003\b\u0004\u0006\u007f\u0085\u0005\u000f\u0000\u0000\u0080\u0085\u0005"+
		"\u0011\u0000\u0000\u0081\u0085\u0005\u0014\u0000\u0000\u0082\u0085\u0005"+
		"\u0013\u0000\u0000\u0083\u0085\u0005\u0012\u0000\u0000\u0084B\u0001\u0000"+
		"\u0000\u0000\u0084K\u0001\u0000\u0000\u0000\u0084Q\u0001\u0000\u0000\u0000"+
		"\u0084[\u0001\u0000\u0000\u0000\u0084p\u0001\u0000\u0000\u0000\u0084r"+
		"\u0001\u0000\u0000\u0000\u0084t\u0001\u0000\u0000\u0000\u0084v\u0001\u0000"+
		"\u0000\u0000\u0084x\u0001\u0000\u0000\u0000\u0084|\u0001\u0000\u0000\u0000"+
		"\u0084\u007f\u0001\u0000\u0000\u0000\u0084\u0080\u0001\u0000\u0000\u0000"+
		"\u0084\u0081\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u00bf\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\n\u000f\u0000\u0000\u0087\u0088\u0005$\u0000\u0000\u0088"+
		"\u00be\u0003\b\u0004\u0010\u0089\u008a\n\u000e\u0000\u0000\u008a\u008b"+
		"\u0005%\u0000\u0000\u008b\u00be\u0003\b\u0004\u000f\u008c\u008d\n\r\u0000"+
		"\u0000\u008d\u008e\u0005\"\u0000\u0000\u008e\u00be\u0003\b\u0004\u000e"+
		"\u008f\u0090\n\f\u0000\u0000\u0090\u0091\u0005#\u0000\u0000\u0091\u00be"+
		"\u0003\b\u0004\r\u0092\u0093\n\u000b\u0000\u0000\u0093\u0094\u0005)\u0000"+
		"\u0000\u0094\u00be\u0003\b\u0004\f\u0095\u0096\n\n\u0000\u0000\u0096\u0097"+
		"\u0005(\u0000\u0000\u0097\u00be\u0003\b\u0004\u000b\u0098\u0099\n\t\u0000"+
		"\u0000\u0099\u009a\u0005&\u0000\u0000\u009a\u00be\u0003\b\u0004\n\u009b"+
		"\u009c\n\u0018\u0000\u0000\u009c\u00a1\u0005\u001b\u0000\u0000\u009d\u009f"+
		"\u0003\b\u0004\u0000\u009e\u00a0\u0005\u001d\u0000\u0000\u009f\u009e\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
		"\u001c\u0000\u0000\u00a6\u00be\u0001\u0000\u0000\u0000\u00a7\u00aa\n\u0017"+
		"\u0000\u0000\u00a8\u00a9\u0005 \u0000\u0000\u00a9\u00ab\u0005\u0010\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005!\u0000\u0000"+
		"\u00ad\u00ae\u0005\u000f\u0000\u0000\u00ae\u00b9\u0005\u001b\u0000\u0000"+
		"\u00af\u00b4\u0003\b\u0004\u0000\u00b0\u00b1\u0005\u001d\u0000\u0000\u00b1"+
		"\u00b3\u0003\b\u0004\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b7\u00af\u0001\u0000\u0000\u0000\u00b8\u00bb"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bc\u00be\u0005\u001c\u0000\u0000\u00bd\u0086"+
		"\u0001\u0000\u0000\u0000\u00bd\u0089\u0001\u0000\u0000\u0000\u00bd\u008c"+
		"\u0001\u0000\u0000\u0000\u00bd\u008f\u0001\u0000\u0000\u0000\u00bd\u0092"+
		"\u0001\u0000\u0000\u0000\u00bd\u0095\u0001\u0000\u0000\u0000\u00bd\u0098"+
		"\u0001\u0000\u0000\u0000\u00bd\u009b\u0001\u0000\u0000\u0000\u00bd\u00a7"+
		"\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\t\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u0012\u000f\u0017"+
		"\u001f\'+:<Wak\u0084\u009f\u00a3\u00aa\u00b4\u00b9\u00bd\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}