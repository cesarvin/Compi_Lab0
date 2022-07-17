// Generated from c:\GitHub\Compi\Compi_Lab0\ANTLR\YAPL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YAPLLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "ID", "TYPE", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "IS_VOID", 
			"LOOP", "POOL", "THEN", "WHILE", "NEW", "NOT", "LET", "FALSE", "TRUE", 
			"STRING", "ESC", "UNICODE", "HEX", "COMMENT", "COMMENT_BLOCK", "WHITE_SPACE", 
			"SEMICOLON", "OPEN_CURLY_BRACKETS", "CLOSE_CURLY_BRACKETS", "OPEN_PARENTHESES", 
			"CLOSE_PARENTHESES", "COMMA", "COLON", "ASSING", "AT", "DOT", "ADD", 
			"SUB", "MUL", "DIV", "EQUAL", "N_MARK", "LOWER_THAN", "LOWER_THAN_EQUAL"
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


	public YAPLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "YAPL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0160\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\6\2]\n\2\r\2\16\2^\3\3\3\3\7\3c\n\3\f\3\16\3f\13\3\3\4"+
		"\3\4\7\4j\n\4\f\4\16\4m\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5y\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0083\n\6\3\7\3\7\3\7\3\7"+
		"\5\7\u0089\n\7\3\b\3\b\3\b\3\b\5\b\u008f\n\b\3\t\3\t\3\t\3\t\5\t\u0095"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00a7\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00b5\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bf\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c9\n\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00d3\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00df\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e7\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ef\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00f7\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\7\25\u0107\n\25\f\25\16\25\u010a\13\25\3\25"+
		"\3\25\3\26\3\26\3\26\5\26\u0111\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\7\31\u011f\n\31\f\31\16\31\u0122\13\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\7\32\u012a\n\32\f\32\16\32\u012d\13\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\6\33\u0135\n\33\r\33\16\33\u0136\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\2\2.\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\2-\2/\2\61\27\63\30\65\31\67\329\33;\34=\35"+
		"?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+\3\2\f\3\2\62;\3\2c|\6\2\62;C\\aac|"+
		"\3\2C\\\4\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\4\2\f\f\17\17\b\2"+
		"\13\f\17\17\62;C\\aac|\5\2\13\f\16\17\"\"\2\u0173\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3\\\3\2\2\2\5`\3\2\2"+
		"\2\7g\3\2\2\2\tx\3\2\2\2\13\u0082\3\2\2\2\r\u0088\3\2\2\2\17\u008e\3\2"+
		"\2\2\21\u0094\3\2\2\2\23\u00a6\3\2\2\2\25\u00b4\3\2\2\2\27\u00be\3\2\2"+
		"\2\31\u00c8\3\2\2\2\33\u00d2\3\2\2\2\35\u00de\3\2\2\2\37\u00e6\3\2\2\2"+
		"!\u00ee\3\2\2\2#\u00f6\3\2\2\2%\u00f8\3\2\2\2\'\u00fe\3\2\2\2)\u0103\3"+
		"\2\2\2+\u010d\3\2\2\2-\u0112\3\2\2\2/\u0118\3\2\2\2\61\u011a\3\2\2\2\63"+
		"\u0125\3\2\2\2\65\u0134\3\2\2\2\67\u013a\3\2\2\29\u013c\3\2\2\2;\u013e"+
		"\3\2\2\2=\u0140\3\2\2\2?\u0142\3\2\2\2A\u0144\3\2\2\2C\u0146\3\2\2\2E"+
		"\u0148\3\2\2\2G\u014b\3\2\2\2I\u014d\3\2\2\2K\u014f\3\2\2\2M\u0151\3\2"+
		"\2\2O\u0153\3\2\2\2Q\u0155\3\2\2\2S\u0157\3\2\2\2U\u0159\3\2\2\2W\u015b"+
		"\3\2\2\2Y\u015d\3\2\2\2[]\t\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3"+
		"\2\2\2_\4\3\2\2\2`d\t\3\2\2ac\t\4\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de"+
		"\3\2\2\2e\6\3\2\2\2fd\3\2\2\2gk\t\5\2\2hj\t\4\2\2ih\3\2\2\2jm\3\2\2\2"+
		"ki\3\2\2\2kl\3\2\2\2l\b\3\2\2\2mk\3\2\2\2no\7e\2\2op\7n\2\2pq\7c\2\2q"+
		"r\7u\2\2ry\7u\2\2st\7E\2\2tu\7N\2\2uv\7C\2\2vw\7U\2\2wy\7U\2\2xn\3\2\2"+
		"\2xs\3\2\2\2y\n\3\2\2\2z{\7g\2\2{|\7n\2\2|}\7u\2\2}\u0083\7g\2\2~\177"+
		"\7G\2\2\177\u0080\7N\2\2\u0080\u0081\7U\2\2\u0081\u0083\7G\2\2\u0082z"+
		"\3\2\2\2\u0082~\3\2\2\2\u0083\f\3\2\2\2\u0084\u0085\7h\2\2\u0085\u0089"+
		"\7k\2\2\u0086\u0087\7H\2\2\u0087\u0089\7K\2\2\u0088\u0084\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\16\3\2\2\2\u008a\u008b\7k\2\2\u008b\u008f\7h\2\2"+
		"\u008c\u008d\7K\2\2\u008d\u008f\7H\2\2\u008e\u008a\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\20\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0095\7p\2\2\u0092"+
		"\u0093\7K\2\2\u0093\u0095\7P\2\2\u0094\u0090\3\2\2\2\u0094\u0092\3\2\2"+
		"\2\u0095\22\3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\u0099"+
		"\7j\2\2\u0099\u009a\7g\2\2\u009a\u009b\7t\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7v\2\2\u009d\u00a7\7u\2\2\u009e\u009f\7K\2\2\u009f\u00a0\7P\2\2"+
		"\u00a0\u00a1\7J\2\2\u00a1\u00a2\7G\2\2\u00a2\u00a3\7T\2\2\u00a3\u00a4"+
		"\7K\2\2\u00a4\u00a5\7V\2\2\u00a5\u00a7\7U\2\2\u00a6\u0096\3\2\2\2\u00a6"+
		"\u009e\3\2\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7u\2\2"+
		"\u00aa\u00ab\7x\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7k\2\2\u00ad\u00b5"+
		"\7f\2\2\u00ae\u00af\7K\2\2\u00af\u00b0\7U\2\2\u00b0\u00b1\7X\2\2\u00b1"+
		"\u00b2\7Q\2\2\u00b2\u00b3\7K\2\2\u00b3\u00b5\7F\2\2\u00b4\u00a8\3\2\2"+
		"\2\u00b4\u00ae\3\2\2\2\u00b5\26\3\2\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8"+
		"\7q\2\2\u00b8\u00b9\7q\2\2\u00b9\u00bf\7r\2\2\u00ba\u00bb\7N\2\2\u00bb"+
		"\u00bc\7Q\2\2\u00bc\u00bd\7Q\2\2\u00bd\u00bf\7R\2\2\u00be\u00b6\3\2\2"+
		"\2\u00be\u00ba\3\2\2\2\u00bf\30\3\2\2\2\u00c0\u00c1\7r\2\2\u00c1\u00c2"+
		"\7q\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c9\7n\2\2\u00c4\u00c5\7R\2\2\u00c5"+
		"\u00c6\7Q\2\2\u00c6\u00c7\7Q\2\2\u00c7\u00c9\7N\2\2\u00c8\u00c0\3\2\2"+
		"\2\u00c8\u00c4\3\2\2\2\u00c9\32\3\2\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc"+
		"\7j\2\2\u00cc\u00cd\7g\2\2\u00cd\u00d3\7p\2\2\u00ce\u00cf\7V\2\2\u00cf"+
		"\u00d0\7J\2\2\u00d0\u00d1\7G\2\2\u00d1\u00d3\7P\2\2\u00d2\u00ca\3\2\2"+
		"\2\u00d2\u00ce\3\2\2\2\u00d3\34\3\2\2\2\u00d4\u00d5\7y\2\2\u00d5\u00d6"+
		"\7j\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7n\2\2\u00d8\u00df\7g\2\2\u00d9"+
		"\u00da\7Y\2\2\u00da\u00db\7J\2\2\u00db\u00dc\7K\2\2\u00dc\u00dd\7N\2\2"+
		"\u00dd\u00df\7G\2\2\u00de\u00d4\3\2\2\2\u00de\u00d9\3\2\2\2\u00df\36\3"+
		"\2\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e7\7y\2\2\u00e3"+
		"\u00e4\7P\2\2\u00e4\u00e5\7G\2\2\u00e5\u00e7\7Y\2\2\u00e6\u00e0\3\2\2"+
		"\2\u00e6\u00e3\3\2\2\2\u00e7 \3\2\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7"+
		"q\2\2\u00ea\u00ef\7v\2\2\u00eb\u00ec\7P\2\2\u00ec\u00ed\7Q\2\2\u00ed\u00ef"+
		"\7V\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\"\3\2\2\2\u00f0"+
		"\u00f1\7n\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f7\7v\2\2\u00f3\u00f4\7N\2\2"+
		"\u00f4\u00f5\7G\2\2\u00f5\u00f7\7V\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f3"+
		"\3\2\2\2\u00f7$\3\2\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb"+
		"\7n\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7g\2\2\u00fd&\3\2\2\2\u00fe\u00ff"+
		"\7v\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7w\2\2\u0101\u0102\7g\2\2\u0102"+
		"(\3\2\2\2\u0103\u0108\7$\2\2\u0104\u0107\5+\26\2\u0105\u0107\n\6\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010c\7$\2\2\u010c*\3\2\2\2\u010d\u0110\7^\2\2\u010e\u0111\t\7\2\2\u010f"+
		"\u0111\5-\27\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111,\3\2\2\2"+
		"\u0112\u0113\7w\2\2\u0113\u0114\5/\30\2\u0114\u0115\5/\30\2\u0115\u0116"+
		"\5/\30\2\u0116\u0117\5/\30\2\u0117.\3\2\2\2\u0118\u0119\t\b\2\2\u0119"+
		"\60\3\2\2\2\u011a\u011b\7/\2\2\u011b\u011c\7/\2\2\u011c\u0120\3\2\2\2"+
		"\u011d\u011f\n\t\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0124\b\31\2\2\u0124\62\3\2\2\2\u0125\u0126\7*\2\2\u0126\u0127\7,\2\2"+
		"\u0127\u012b\3\2\2\2\u0128\u012a\n\n\2\2\u0129\u0128\3\2\2\2\u012a\u012d"+
		"\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u012f\7,\2\2\u012f\u0130\7+\2\2\u0130\u0131\3\2\2"+
		"\2\u0131\u0132\b\32\2\2\u0132\64\3\2\2\2\u0133\u0135\t\13\2\2\u0134\u0133"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\b\33\2\2\u0139\66\3\2\2\2\u013a\u013b\7=\2"+
		"\2\u013b8\3\2\2\2\u013c\u013d\7}\2\2\u013d:\3\2\2\2\u013e\u013f\7\177"+
		"\2\2\u013f<\3\2\2\2\u0140\u0141\7*\2\2\u0141>\3\2\2\2\u0142\u0143\7+\2"+
		"\2\u0143@\3\2\2\2\u0144\u0145\7.\2\2\u0145B\3\2\2\2\u0146\u0147\7<\2\2"+
		"\u0147D\3\2\2\2\u0148\u0149\7>\2\2\u0149\u014a\7/\2\2\u014aF\3\2\2\2\u014b"+
		"\u014c\7B\2\2\u014cH\3\2\2\2\u014d\u014e\7\60\2\2\u014eJ\3\2\2\2\u014f"+
		"\u0150\7-\2\2\u0150L\3\2\2\2\u0151\u0152\7/\2\2\u0152N\3\2\2\2\u0153\u0154"+
		"\7,\2\2\u0154P\3\2\2\2\u0155\u0156\7\61\2\2\u0156R\3\2\2\2\u0157\u0158"+
		"\7?\2\2\u0158T\3\2\2\2\u0159\u015a\7\u0080\2\2\u015aV\3\2\2\2\u015b\u015c"+
		"\7>\2\2\u015cX\3\2\2\2\u015d\u015e\7>\2\2\u015e\u015f\7?\2\2\u015fZ\3"+
		"\2\2\2\32\2^dkx\u0082\u0088\u008e\u0094\u00a6\u00b4\u00be\u00c8\u00d2"+
		"\u00de\u00e6\u00ee\u00f6\u0106\u0108\u0110\u0120\u012b\u0136\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}