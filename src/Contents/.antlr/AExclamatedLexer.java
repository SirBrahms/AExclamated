// Generated from c:\Users\marc\OneDrive\Documents\Archiv\Projektordner\AExclamated\src\Contents\AExclamated.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AExclamatedLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, MultOp=12, AddOp=13, CompOp=14, BoolOp=15, WS=16, IDENTIFIER=17, 
		INTEGER=18, FLOAT=19, STRING=20, BOOL=21, NULL=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "MultOp", "AddOp", "CompOp", "BoolOp", "WS", "IDENTIFIER", 
			"INTEGER", "FLOAT", "STRING", "BOOL", "NULL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'if'", "'('", "')'", "'else'", "'{'", "'}'", "'while'", 
			"'='", "','", "'!'", null, null, null, null, null, null, null, null, 
			null, null, "'NIL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"MultOp", "AddOp", "CompOp", "BoolOp", "WS", "IDENTIFIER", "INTEGER", 
			"FLOAT", "STRING", "BOOL", "NULL"
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


	public AExclamatedLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AExclamated.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00a4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17[\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20d\n\20\3\21\6\21g\n\21\r\21\16\21h\3\21\3\21\3\22\3\22\7\22"+
		"o\n\22\f\22\16\22r\13\22\3\23\6\23u\n\23\r\23\16\23v\3\24\6\24z\n\24\r"+
		"\24\16\24{\3\24\3\24\6\24\u0080\n\24\r\24\16\24\u0081\3\25\3\25\7\25\u0086"+
		"\n\25\f\25\16\25\u0089\13\25\3\25\3\25\3\25\7\25\u008e\n\25\f\25\16\25"+
		"\u0091\13\25\3\25\5\25\u0094\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u009f\n\26\3\27\3\27\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30\3\2\13\5\2\'\',,\61\61\4\2--//\4\2>>@@\5\2\13\f\17\17"+
		"\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\3\2$$\3\2))\2\u00b2\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2"+
		"\2\7\64\3\2\2\2\t\66\3\2\2\2\138\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21A\3"+
		"\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27K\3\2\2\2\31M\3\2\2\2\33O\3\2\2\2\35"+
		"Z\3\2\2\2\37c\3\2\2\2!f\3\2\2\2#l\3\2\2\2%t\3\2\2\2\'y\3\2\2\2)\u0093"+
		"\3\2\2\2+\u009e\3\2\2\2-\u00a0\3\2\2\2/\60\7=\2\2\60\4\3\2\2\2\61\62\7"+
		"k\2\2\62\63\7h\2\2\63\6\3\2\2\2\64\65\7*\2\2\65\b\3\2\2\2\66\67\7+\2\2"+
		"\67\n\3\2\2\289\7g\2\29:\7n\2\2:;\7u\2\2;<\7g\2\2<\f\3\2\2\2=>\7}\2\2"+
		">\16\3\2\2\2?@\7\177\2\2@\20\3\2\2\2AB\7y\2\2BC\7j\2\2CD\7k\2\2DE\7n\2"+
		"\2EF\7g\2\2F\22\3\2\2\2GH\7?\2\2H\24\3\2\2\2IJ\7.\2\2J\26\3\2\2\2KL\7"+
		"#\2\2L\30\3\2\2\2MN\t\2\2\2N\32\3\2\2\2OP\t\3\2\2P\34\3\2\2\2QR\7?\2\2"+
		"R[\7?\2\2ST\7#\2\2T[\7?\2\2UV\7@\2\2V[\7?\2\2WX\7>\2\2X[\7?\2\2Y[\t\4"+
		"\2\2ZQ\3\2\2\2ZS\3\2\2\2ZU\3\2\2\2ZW\3\2\2\2ZY\3\2\2\2[\36\3\2\2\2\\]"+
		"\7(\2\2]d\7(\2\2^_\7~\2\2_d\7~\2\2`a\7~\2\2ab\7#\2\2bd\7~\2\2c\\\3\2\2"+
		"\2c^\3\2\2\2c`\3\2\2\2d \3\2\2\2eg\t\5\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2"+
		"\2hi\3\2\2\2ij\3\2\2\2jk\b\21\2\2k\"\3\2\2\2lp\t\6\2\2mo\t\7\2\2nm\3\2"+
		"\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q$\3\2\2\2rp\3\2\2\2su\t\b\2\2ts\3\2"+
		"\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w&\3\2\2\2xz\t\b\2\2yx\3\2\2\2z{\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\177\7\60\2\2~\u0080\t\b\2\2\177~\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"(\3\2\2\2\u0083\u0087\7$\2\2\u0084\u0086\n\t\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u0094\7$\2\2\u008b\u008f\7)\2\2\u008c\u008e"+
		"\n\n\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\7$"+
		"\2\2\u0093\u0083\3\2\2\2\u0093\u008b\3\2\2\2\u0094*\3\2\2\2\u0095\u0096"+
		"\7V\2\2\u0096\u0097\7T\2\2\u0097\u0098\7W\2\2\u0098\u009f\7G\2\2\u0099"+
		"\u009a\7H\2\2\u009a\u009b\7C\2\2\u009b\u009c\7N\2\2\u009c\u009d\7U\2\2"+
		"\u009d\u009f\7G\2\2\u009e\u0095\3\2\2\2\u009e\u0099\3\2\2\2\u009f,\3\2"+
		"\2\2\u00a0\u00a1\7P\2\2\u00a1\u00a2\7K\2\2\u00a2\u00a3\7N\2\2\u00a3.\3"+
		"\2\2\2\16\2Zchpv{\u0081\u0087\u008f\u0093\u009e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}