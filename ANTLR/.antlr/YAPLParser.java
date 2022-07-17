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
		INT=1, ID=2, TYPE=3, CLASS=4, ELSE=5, FI=6, IF=7, IN=8, INHERITS=9, IS_VOID=10, 
		LOOP=11, POOL=12, THEN=13, WHILE=14, NEW=15, NOT=16, LET=17, FALSE=18, 
		TRUE=19, STRING=20, COMMENT=21, COMMENT_BLOCK=22, WHITE_SPACE=23, SEMICOLON=24, 
		OPEN_CURLY_BRACKETS=25, CLOSE_CURLY_BRACKETS=26, OPEN_PARENTHESES=27, 
		CLOSE_PARENTHESES=28, COMMA=29, COLON=30, ASSING=31, AT=32, DOT=33, ADD=34, 
		SUB=35, MUL=36, DIV=37, EQUAL=38, N_MARK=39, LOWER_THAN=40, LOWER_THAN_EQUAL=41;
	public static final int
		RULE_program = 0, RULE_newclass = 1, RULE_feature = 2, RULE_formal = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "newclass", "feature", "formal", "expr"
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
			null, "INT", "ID", "TYPE", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", 
			"IS_VOID", "LOOP", "POOL", "THEN", "WHILE", "NEW", "NOT", "LET", "FALSE", 
			"TRUE", "STRING", "COMMENT", "COMMENT_BLOCK", "WHITE_SPACE", "SEMICOLON", 
			"OPEN_CURLY_BRACKETS", "CLOSE_CURLY_BRACKETS", "OPEN_PARENTHESES", "CLOSE_PARENTHESES", 
			"COMMA", "COLON", "ASSING", "AT", "DOT", "ADD", "SUB", "MUL", "DIV", 
			"EQUAL", "N_MARK", "LOWER_THAN", "LOWER_THAN_EQUAL"
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
		public List<NewclassContext> newclass() {
			return getRuleContexts(NewclassContext.class);
		}
		public NewclassContext newclass(int i) {
			return getRuleContext(NewclassContext.class,i);
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
				newclass();
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

	public static class NewclassContext extends ParserRuleContext {
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
		public NewclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newclass; }
	}

	public final NewclassContext newclass() throws RecognitionException {
		NewclassContext _localctx = new NewclassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_newclass);
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(26);
				feature();
				setState(27);
				match(SEMICOLON);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(36);
				match(ID);
				setState(37);
				match(OPEN_PARENTHESES);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(38);
					formal();
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(39);
						match(COMMA);
						}
						}
						setState(44);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(50);
				match(CLOSE_PARENTHESES);
				setState(51);
				match(COLON);
				setState(52);
				match(TYPE);
				setState(53);
				match(OPEN_CURLY_BRACKETS);
				setState(54);
				expr(0);
				setState(55);
				match(CLOSE_CURLY_BRACKETS);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(ID);
				setState(58);
				match(COLON);
				setState(59);
				match(TYPE);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSING) {
					{
					setState(60);
					match(ASSING);
					setState(61);
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
			setState(66);
			match(ID);
			setState(67);
			match(COLON);
			setState(68);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(71);
				match(IF);
				setState(72);
				expr(0);
				setState(73);
				match(THEN);
				setState(74);
				expr(0);
				setState(75);
				match(ELSE);
				setState(76);
				expr(0);
				setState(77);
				match(FI);
				}
				break;
			case 2:
				{
				setState(79);
				match(WHILE);
				setState(80);
				expr(0);
				setState(81);
				match(LOOP);
				setState(82);
				expr(0);
				setState(83);
				match(POOL);
				}
				break;
			case 3:
				{
				setState(85);
				match(OPEN_CURLY_BRACKETS);
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(86);
					expr(0);
					setState(87);
					match(SEMICOLON);
					}
					}
					setState(91); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ID) | (1L << IF) | (1L << IS_VOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << LET) | (1L << FALSE) | (1L << TRUE) | (1L << STRING) | (1L << OPEN_CURLY_BRACKETS) | (1L << OPEN_PARENTHESES) | (1L << N_MARK))) != 0) );
				setState(93);
				match(CLOSE_CURLY_BRACKETS);
				}
				break;
			case 4:
				{
				setState(95);
				match(LET);
				setState(96);
				match(ID);
				setState(97);
				match(COLON);
				setState(98);
				match(TYPE);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSING) {
					{
					setState(99);
					match(ASSING);
					setState(100);
					expr(0);
					}
				}

				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(103);
					match(COMMA);
					setState(104);
					match(ID);
					setState(105);
					match(COLON);
					setState(106);
					match(TYPE);
					setState(107);
					match(ASSING);
					setState(108);
					expr(0);
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				match(IN);
				setState(115);
				expr(19);
				}
				break;
			case 5:
				{
				setState(116);
				match(NEW);
				setState(117);
				match(TYPE);
				}
				break;
			case 6:
				{
				setState(118);
				match(IS_VOID);
				setState(119);
				expr(17);
				}
				break;
			case 7:
				{
				setState(120);
				match(N_MARK);
				setState(121);
				expr(16);
				}
				break;
			case 8:
				{
				setState(122);
				match(NOT);
				setState(123);
				expr(8);
				}
				break;
			case 9:
				{
				setState(124);
				match(OPEN_PARENTHESES);
				setState(125);
				expr(0);
				setState(126);
				match(CLOSE_PARENTHESES);
				}
				break;
			case 10:
				{
				setState(128);
				match(ID);
				setState(129);
				match(ASSING);
				setState(130);
				expr(6);
				}
				break;
			case 11:
				{
				setState(131);
				match(ID);
				}
				break;
			case 12:
				{
				setState(132);
				match(INT);
				}
				break;
			case 13:
				{
				setState(133);
				match(STRING);
				}
				break;
			case 14:
				{
				setState(134);
				match(TRUE);
				}
				break;
			case 15:
				{
				setState(135);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(139);
						match(MUL);
						setState(140);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(142);
						match(DIV);
						setState(143);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(145);
						match(ADD);
						setState(146);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(148);
						match(SUB);
						setState(149);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(151);
						match(LOWER_THAN_EQUAL);
						setState(152);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(154);
						match(LOWER_THAN);
						setState(155);
						expr(11);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(157);
						match(EQUAL);
						setState(158);
						expr(10);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(160);
						match(OPEN_PARENTHESES);
						setState(165); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(161);
							expr(0);
							setState(163);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==COMMA) {
								{
								setState(162);
								match(COMMA);
								}
							}

							}
							}
							setState(167); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ID) | (1L << IF) | (1L << IS_VOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << LET) | (1L << FALSE) | (1L << TRUE) | (1L << STRING) | (1L << OPEN_CURLY_BRACKETS) | (1L << OPEN_PARENTHESES) | (1L << N_MARK))) != 0) );
						setState(169);
						match(CLOSE_PARENTHESES);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(174);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(172);
							match(AT);
							setState(173);
							match(TYPE);
							}
						}

						setState(176);
						match(DOT);
						setState(177);
						match(ID);
						setState(178);
						match(OPEN_PARENTHESES);
						setState(189);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ID) | (1L << IF) | (1L << IS_VOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << LET) | (1L << FALSE) | (1L << TRUE) | (1L << STRING) | (1L << OPEN_CURLY_BRACKETS) | (1L << OPEN_PARENTHESES) | (1L << N_MARK))) != 0)) {
							{
							{
							setState(179);
							expr(0);
							setState(184);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(180);
								match(COMMA);
								setState(181);
								expr(0);
								}
								}
								setState(186);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							}
							setState(191);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(192);
						match(CLOSE_PARENTHESES);
						}
						break;
					}
					} 
				}
				setState(197);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\6\2\20\n\2\r\2\16\2\21\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\5\3\32\n\3\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\7\4\60\n\4\f\4\16\4"+
		"\63\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\5\4"+
		"C\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\\\n\6\r\6\16\6]\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6h\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6p\n\6\f\6\16\6s\13\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u008b\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a6"+
		"\n\6\6\6\u00a8\n\6\r\6\16\6\u00a9\3\6\3\6\3\6\3\6\3\6\5\6\u00b1\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b9\n\6\f\6\16\6\u00bc\13\6\7\6\u00be\n\6"+
		"\f\6\16\6\u00c1\13\6\3\6\7\6\u00c4\n\6\f\6\16\6\u00c7\13\6\3\6\2\3\n\7"+
		"\2\4\6\b\n\2\2\2\u00e9\2\17\3\2\2\2\4\25\3\2\2\2\6B\3\2\2\2\bD\3\2\2\2"+
		"\n\u008a\3\2\2\2\f\r\5\4\3\2\r\16\7\32\2\2\16\20\3\2\2\2\17\f\3\2\2\2"+
		"\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23\24\7\2\2\3"+
		"\24\3\3\2\2\2\25\26\7\6\2\2\26\31\7\5\2\2\27\30\7\13\2\2\30\32\7\5\2\2"+
		"\31\27\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33!\7\33\2\2\34\35\5\6\4\2"+
		"\35\36\7\32\2\2\36 \3\2\2\2\37\34\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2"+
		"\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\34\2\2%\5\3\2\2\2&\'\7\4\2\2\'\61\7\35\2"+
		"\2(,\5\b\5\2)+\7\37\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\60\3"+
		"\2\2\2.,\3\2\2\2/(\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"\64\3\2\2\2\63\61\3\2\2\2\64\65\7\36\2\2\65\66\7 \2\2\66\67\7\5\2\2\67"+
		"8\7\33\2\289\5\n\6\29:\7\34\2\2:C\3\2\2\2;<\7\4\2\2<=\7 \2\2=@\7\5\2\2"+
		">?\7!\2\2?A\5\n\6\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B&\3\2\2\2B;\3\2\2\2"+
		"C\7\3\2\2\2DE\7\4\2\2EF\7 \2\2FG\7\5\2\2G\t\3\2\2\2HI\b\6\1\2IJ\7\t\2"+
		"\2JK\5\n\6\2KL\7\17\2\2LM\5\n\6\2MN\7\7\2\2NO\5\n\6\2OP\7\b\2\2P\u008b"+
		"\3\2\2\2QR\7\20\2\2RS\5\n\6\2ST\7\r\2\2TU\5\n\6\2UV\7\16\2\2V\u008b\3"+
		"\2\2\2W[\7\33\2\2XY\5\n\6\2YZ\7\32\2\2Z\\\3\2\2\2[X\3\2\2\2\\]\3\2\2\2"+
		"][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\34\2\2`\u008b\3\2\2\2ab\7\23\2\2bc"+
		"\7\4\2\2cd\7 \2\2dg\7\5\2\2ef\7!\2\2fh\5\n\6\2ge\3\2\2\2gh\3\2\2\2hq\3"+
		"\2\2\2ij\7\37\2\2jk\7\4\2\2kl\7 \2\2lm\7\5\2\2mn\7!\2\2np\5\n\6\2oi\3"+
		"\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\n\2\2u\u008b"+
		"\5\n\6\25vw\7\21\2\2w\u008b\7\5\2\2xy\7\f\2\2y\u008b\5\n\6\23z{\7)\2\2"+
		"{\u008b\5\n\6\22|}\7\22\2\2}\u008b\5\n\6\n~\177\7\35\2\2\177\u0080\5\n"+
		"\6\2\u0080\u0081\7\36\2\2\u0081\u008b\3\2\2\2\u0082\u0083\7\4\2\2\u0083"+
		"\u0084\7!\2\2\u0084\u008b\5\n\6\b\u0085\u008b\7\4\2\2\u0086\u008b\7\3"+
		"\2\2\u0087\u008b\7\26\2\2\u0088\u008b\7\25\2\2\u0089\u008b\7\24\2\2\u008a"+
		"H\3\2\2\2\u008aQ\3\2\2\2\u008aW\3\2\2\2\u008aa\3\2\2\2\u008av\3\2\2\2"+
		"\u008ax\3\2\2\2\u008az\3\2\2\2\u008a|\3\2\2\2\u008a~\3\2\2\2\u008a\u0082"+
		"\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0087\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u00c5\3\2\2\2\u008c\u008d\f\21"+
		"\2\2\u008d\u008e\7&\2\2\u008e\u00c4\5\n\6\22\u008f\u0090\f\20\2\2\u0090"+
		"\u0091\7\'\2\2\u0091\u00c4\5\n\6\21\u0092\u0093\f\17\2\2\u0093\u0094\7"+
		"$\2\2\u0094\u00c4\5\n\6\20\u0095\u0096\f\16\2\2\u0096\u0097\7%\2\2\u0097"+
		"\u00c4\5\n\6\17\u0098\u0099\f\r\2\2\u0099\u009a\7+\2\2\u009a\u00c4\5\n"+
		"\6\16\u009b\u009c\f\f\2\2\u009c\u009d\7*\2\2\u009d\u00c4\5\n\6\r\u009e"+
		"\u009f\f\13\2\2\u009f\u00a0\7(\2\2\u00a0\u00c4\5\n\6\f\u00a1\u00a2\f\32"+
		"\2\2\u00a2\u00a7\7\35\2\2\u00a3\u00a5\5\n\6\2\u00a4\u00a6\7\37\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a3\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\7\36\2\2\u00ac\u00c4\3\2\2\2\u00ad\u00b0\f"+
		"\31\2\2\u00ae\u00af\7\"\2\2\u00af\u00b1\7\5\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3\u00b4\7\4"+
		"\2\2\u00b4\u00bf\7\35\2\2\u00b5\u00ba\5\n\6\2\u00b6\u00b7\7\37\2\2\u00b7"+
		"\u00b9\5\n\6\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00b5\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\7\36\2\2\u00c3"+
		"\u008c\3\2\2\2\u00c3\u008f\3\2\2\2\u00c3\u0092\3\2\2\2\u00c3\u0095\3\2"+
		"\2\2\u00c3\u0098\3\2\2\2\u00c3\u009b\3\2\2\2\u00c3\u009e\3\2\2\2\u00c3"+
		"\u00a1\3\2\2\2\u00c3\u00ad\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\13\3\2\2\2\u00c7\u00c5\3\2\2\2\24\21\31"+
		"!,\61@B]gq\u008a\u00a5\u00a9\u00b0\u00ba\u00bf\u00c3\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}