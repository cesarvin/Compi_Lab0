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
		INT=1, LETTER=2, ID=3, CLASS=4, ELSE=5, FI=6, IF=7, IN=8, INHERITS=9, 
		ISVOID=10, LOOP=11, POOL=12, THEN=13, WHILE=14, NEW=15, NOT=16, FALSE=17, 
		TRUE=18, EB=19, ET=20, EN=21, EF=22, NULL=23, COMMENT=24, COMMENTBLOCK=25, 
		NEWLINE=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "LETTER", "ID", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", 
			"ISVOID", "LOOP", "POOL", "THEN", "WHILE", "NEW", "NOT", "FALSE", "TRUE", 
			"EB", "ET", "EN", "EF", "NULL", "COMMENT", "COMMENTBLOCK", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'false'", "'true'", "'\\b'", "'\\t'", 
			"'\\n'", "'\\f'", "'\\0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "LETTER", "ID", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", 
			"ISVOID", "LOOP", "POOL", "THEN", "WHILE", "NEW", "NOT", "FALSE", "TRUE", 
			"EB", "ET", "EN", "EF", "NULL", "COMMENT", "COMMENTBLOCK", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u011d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\6\29\n\2\r\2\16\2:\3\3\6\3>\n\3\r\3\16\3"+
		"?\3\3\6\3C\n\3\r\3\16\3D\5\3G\n\3\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6e\n\6\3\7\3\7\3\7\3\7\5\7k\n\7\3\b\3\b\3\b\3\b\5\bq\n"+
		"\b\3\t\3\t\3\t\3\t\5\tw\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u0089\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u0097\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00a1\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ab\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b5\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c1\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00c9\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d1\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00fb"+
		"\n\31\f\31\16\31\u00fe\13\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\7\32\u0109\n\32\f\32\16\32\u010c\13\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\5\33\u0114\n\33\3\33\3\33\6\33\u0118\n\33\r\33\16\33\u0119\3\33\3"+
		"\33\4\u00fc\u010a\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\3\2\5\3\2\62;\3\2c|\3\2C\\\2\u0134\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\38\3\2\2\2\5F\3\2\2\2\7H\3\2\2\2\tZ\3\2\2\2\13d\3\2\2\2"+
		"\rj\3\2\2\2\17p\3\2\2\2\21v\3\2\2\2\23\u0088\3\2\2\2\25\u0096\3\2\2\2"+
		"\27\u00a0\3\2\2\2\31\u00aa\3\2\2\2\33\u00b4\3\2\2\2\35\u00c0\3\2\2\2\37"+
		"\u00c8\3\2\2\2!\u00d0\3\2\2\2#\u00d2\3\2\2\2%\u00d8\3\2\2\2\'\u00dd\3"+
		"\2\2\2)\u00e2\3\2\2\2+\u00e7\3\2\2\2-\u00ec\3\2\2\2/\u00f1\3\2\2\2\61"+
		"\u00f6\3\2\2\2\63\u0104\3\2\2\2\65\u0117\3\2\2\2\679\t\2\2\28\67\3\2\2"+
		"\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\4\3\2\2\2<>\t\3\2\2=<\3\2\2\2>?\3\2"+
		"\2\2?=\3\2\2\2?@\3\2\2\2@G\3\2\2\2AC\t\4\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2"+
		"\2\2DE\3\2\2\2EG\3\2\2\2F=\3\2\2\2FB\3\2\2\2G\6\3\2\2\2HM\5\5\3\2IL\5"+
		"\5\3\2JL\5\3\2\2KI\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\b"+
		"\3\2\2\2OM\3\2\2\2PQ\7e\2\2QR\7n\2\2RS\7c\2\2ST\7u\2\2T[\7u\2\2UV\7E\2"+
		"\2VW\7N\2\2WX\7C\2\2XY\7U\2\2Y[\7U\2\2ZP\3\2\2\2ZU\3\2\2\2[\n\3\2\2\2"+
		"\\]\7g\2\2]^\7n\2\2^_\7u\2\2_e\7g\2\2`a\7G\2\2ab\7N\2\2bc\7U\2\2ce\7G"+
		"\2\2d\\\3\2\2\2d`\3\2\2\2e\f\3\2\2\2fg\7h\2\2gk\7k\2\2hi\7H\2\2ik\7K\2"+
		"\2jf\3\2\2\2jh\3\2\2\2k\16\3\2\2\2lm\7k\2\2mq\7h\2\2no\7K\2\2oq\7H\2\2"+
		"pl\3\2\2\2pn\3\2\2\2q\20\3\2\2\2rs\7k\2\2sw\7p\2\2tu\7K\2\2uw\7P\2\2v"+
		"r\3\2\2\2vt\3\2\2\2w\22\3\2\2\2xy\7k\2\2yz\7p\2\2z{\7j\2\2{|\7g\2\2|}"+
		"\7t\2\2}~\7k\2\2~\177\7v\2\2\177\u0089\7u\2\2\u0080\u0081\7K\2\2\u0081"+
		"\u0082\7P\2\2\u0082\u0083\7J\2\2\u0083\u0084\7G\2\2\u0084\u0085\7T\2\2"+
		"\u0085\u0086\7K\2\2\u0086\u0087\7V\2\2\u0087\u0089\7U\2\2\u0088x\3\2\2"+
		"\2\u0088\u0080\3\2\2\2\u0089\24\3\2\2\2\u008a\u008b\7k\2\2\u008b\u008c"+
		"\7u\2\2\u008c\u008d\7x\2\2\u008d\u008e\7q\2\2\u008e\u008f\7k\2\2\u008f"+
		"\u0097\7f\2\2\u0090\u0091\7K\2\2\u0091\u0092\7U\2\2\u0092\u0093\7X\2\2"+
		"\u0093\u0094\7Q\2\2\u0094\u0095\7K\2\2\u0095\u0097\7F\2\2\u0096\u008a"+
		"\3\2\2\2\u0096\u0090\3\2\2\2\u0097\26\3\2\2\2\u0098\u0099\7n\2\2\u0099"+
		"\u009a\7q\2\2\u009a\u009b\7q\2\2\u009b\u00a1\7r\2\2\u009c\u009d\7N\2\2"+
		"\u009d\u009e\7Q\2\2\u009e\u009f\7Q\2\2\u009f\u00a1\7R\2\2\u00a0\u0098"+
		"\3\2\2\2\u00a0\u009c\3\2\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7r\2\2\u00a3"+
		"\u00a4\7q\2\2\u00a4\u00a5\7q\2\2\u00a5\u00ab\7n\2\2\u00a6\u00a7\7R\2\2"+
		"\u00a7\u00a8\7Q\2\2\u00a8\u00a9\7Q\2\2\u00a9\u00ab\7N\2\2\u00aa\u00a2"+
		"\3\2\2\2\u00aa\u00a6\3\2\2\2\u00ab\32\3\2\2\2\u00ac\u00ad\7v\2\2\u00ad"+
		"\u00ae\7j\2\2\u00ae\u00af\7g\2\2\u00af\u00b5\7p\2\2\u00b0\u00b1\7V\2\2"+
		"\u00b1\u00b2\7J\2\2\u00b2\u00b3\7G\2\2\u00b3\u00b5\7P\2\2\u00b4\u00ac"+
		"\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\7y\2\2\u00b7"+
		"\u00b8\7j\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7n\2\2\u00ba\u00c1\7g\2\2"+
		"\u00bb\u00bc\7Y\2\2\u00bc\u00bd\7J\2\2\u00bd\u00be\7K\2\2\u00be\u00bf"+
		"\7N\2\2\u00bf\u00c1\7G\2\2\u00c0\u00b6\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c1"+
		"\36\3\2\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c9\7y\2\2\u00c5"+
		"\u00c6\7P\2\2\u00c6\u00c7\7G\2\2\u00c7\u00c9\7Y\2\2\u00c8\u00c2\3\2\2"+
		"\2\u00c8\u00c5\3\2\2\2\u00c9 \3\2\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7"+
		"q\2\2\u00cc\u00d1\7v\2\2\u00cd\u00ce\7P\2\2\u00ce\u00cf\7Q\2\2\u00cf\u00d1"+
		"\7V\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\"\3\2\2\2\u00d2"+
		"\u00d3\7h\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7u\2\2"+
		"\u00d6\u00d7\7g\2\2\u00d7$\3\2\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7t\2"+
		"\2\u00da\u00db\7w\2\2\u00db\u00dc\7g\2\2\u00dc&\3\2\2\2\u00dd\u00de\7"+
		"^\2\2\u00de\u00df\7d\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b\24\2\2\u00e1"+
		"(\3\2\2\2\u00e2\u00e3\7^\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\b\25\2\2\u00e6*\3\2\2\2\u00e7\u00e8\7^\2\2\u00e8\u00e9\7p\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\b\26\2\2\u00eb,\3\2\2\2\u00ec\u00ed\7^\2\2"+
		"\u00ed\u00ee\7h\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\b\27\2\2\u00f0.\3"+
		"\2\2\2\u00f1\u00f2\7^\2\2\u00f2\u00f3\7\62\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\b\30\2\2\u00f5\60\3\2\2\2\u00f6\u00f7\7/\2\2\u00f7\u00f8\7/\2\2"+
		"\u00f8\u00fc\3\2\2\2\u00f9\u00fb\13\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff\u0100\7/\2\2\u0100\u0101\7/\2\2\u0101\u0102\3\2\2"+
		"\2\u0102\u0103\b\31\2\2\u0103\62\3\2\2\2\u0104\u0105\7*\2\2\u0105\u0106"+
		"\7,\2\2\u0106\u010a\3\2\2\2\u0107\u0109\13\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010d\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7,\2\2\u010e\u010f\7+\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\b\32\2\2\u0111\64\3\2\2\2\u0112\u0114\7\17\2\2\u0113"+
		"\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\7\f"+
		"\2\2\u0116\u0118\7\17\2\2\u0117\u0113\3\2\2\2\u0117\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011c\b\33\2\2\u011c\66\3\2\2\2\33\2:?DFKMZdjpv\u0088\u0096"+
		"\u00a0\u00aa\u00b4\u00c0\u00c8\u00d0\u00fc\u010a\u0113\u0117\u0119\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}