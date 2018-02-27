// Generated from D:/gitRepos/antlrDemo/src/cgame\CGame.g4 by ANTLR 4.7
package cgame;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CGameLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, INT=9, 
		BOOL=10, FLOAT=11, ID=12, NEWLINE=13, WS=14, DOT=15, MUL=16, DIV=17, ADD=18, 
		SUB=19, GT=20, LT=21, GE=22, LE=23, EQUAL_EQUAL=24, NOT_EQUAL=25, QUESTION=26, 
		COLON=27, SEMI=28, EQUAL=29, LPAREN=30, RPAREN=31, COMMA=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "INT", 
		"BOOL", "FLOAT", "EXP", "ID", "NEWLINE", "WS", "DOT", "MUL", "DIV", "ADD", 
		"SUB", "GT", "LT", "GE", "LE", "EQUAL_EQUAL", "NOT_EQUAL", "QUESTION", 
		"COLON", "SEMI", "EQUAL", "LPAREN", "RPAREN", "COMMA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "'&&'", "'||'", "'if('", "'elseif('", "'for('", "'{'", "'}'", 
		null, null, null, null, null, null, "'.'", "'*'", "'/'", "'+'", "'-'", 
		"'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'?'", "':'", "';'", "'='", 
		"'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "INT", "BOOL", "FLOAT", 
		"ID", "NEWLINE", "WS", "DOT", "MUL", "DIV", "ADD", "SUB", "GT", "LT", 
		"GE", "LE", "EQUAL_EQUAL", "NOT_EQUAL", "QUESTION", "COLON", "SEMI", "EQUAL", 
		"LPAREN", "RPAREN", "COMMA"
	};
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


	public CGameLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CGame.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00c4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\nd\n"+
		"\n\r\n\16\ne\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13q\n\13\3"+
		"\f\3\f\3\f\3\f\5\fw\n\f\3\f\3\f\3\f\3\f\5\f}\n\f\3\r\3\r\5\r\u0081\n\r"+
		"\3\r\3\r\3\16\6\16\u0086\n\16\r\16\16\16\u0087\3\16\7\16\u008b\n\16\f"+
		"\16\16\16\u008e\13\16\3\17\5\17\u0091\n\17\3\17\5\17\u0094\n\17\3\20\6"+
		"\20\u0097\n\20\r\20\16\20\u0098\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\2\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31"+
		"\63\32\65\33\67\349\35;\36=\37? A!C\"\3\2\7\3\2\62;\4\2GGgg\4\2--//\4"+
		"\2C\\c|\4\2\13\13\"\"\2\u00cd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E"+
		"\3\2\2\2\5G\3\2\2\2\7J\3\2\2\2\tM\3\2\2\2\13Q\3\2\2\2\rY\3\2\2\2\17^\3"+
		"\2\2\2\21`\3\2\2\2\23c\3\2\2\2\25p\3\2\2\2\27|\3\2\2\2\31~\3\2\2\2\33"+
		"\u0085\3\2\2\2\35\u0090\3\2\2\2\37\u0096\3\2\2\2!\u009c\3\2\2\2#\u009e"+
		"\3\2\2\2%\u00a0\3\2\2\2\'\u00a2\3\2\2\2)\u00a4\3\2\2\2+\u00a6\3\2\2\2"+
		"-\u00a8\3\2\2\2/\u00aa\3\2\2\2\61\u00ad\3\2\2\2\63\u00b0\3\2\2\2\65\u00b3"+
		"\3\2\2\2\67\u00b6\3\2\2\29\u00b8\3\2\2\2;\u00ba\3\2\2\2=\u00bc\3\2\2\2"+
		"?\u00be\3\2\2\2A\u00c0\3\2\2\2C\u00c2\3\2\2\2EF\7#\2\2F\4\3\2\2\2GH\7"+
		"(\2\2HI\7(\2\2I\6\3\2\2\2JK\7~\2\2KL\7~\2\2L\b\3\2\2\2MN\7k\2\2NO\7h\2"+
		"\2OP\7*\2\2P\n\3\2\2\2QR\7g\2\2RS\7n\2\2ST\7u\2\2TU\7g\2\2UV\7k\2\2VW"+
		"\7h\2\2WX\7*\2\2X\f\3\2\2\2YZ\7h\2\2Z[\7q\2\2[\\\7t\2\2\\]\7*\2\2]\16"+
		"\3\2\2\2^_\7}\2\2_\20\3\2\2\2`a\7\177\2\2a\22\3\2\2\2bd\t\2\2\2cb\3\2"+
		"\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\24\3\2\2\2gh\7V\2\2hi\7T\2\2ij\7W"+
		"\2\2jq\7G\2\2kl\7H\2\2lm\7C\2\2mn\7N\2\2no\7U\2\2oq\7G\2\2pg\3\2\2\2p"+
		"k\3\2\2\2q\26\3\2\2\2rs\5\23\n\2st\7\60\2\2tv\5\23\n\2uw\5\31\r\2vu\3"+
		"\2\2\2vw\3\2\2\2w}\3\2\2\2xy\5\23\n\2yz\5\31\r\2z}\3\2\2\2{}\5\23\n\2"+
		"|r\3\2\2\2|x\3\2\2\2|{\3\2\2\2}\30\3\2\2\2~\u0080\t\3\2\2\177\u0081\t"+
		"\4\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\5\23\n\2\u0083\32\3\2\2\2\u0084\u0086\t\5\2\2\u0085\u0084\3\2\2"+
		"\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008c"+
		"\3\2\2\2\u0089\u008b\t\2\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\34\3\2\2\2\u008e\u008c\3\2\2"+
		"\2\u008f\u0091\7\17\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0094\7\f\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\36\3\2\2\2\u0095\u0097\t\6\2\2\u0096\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\b\20\2\2\u009b \3\2\2\2\u009c\u009d\7\60\2\2\u009d\"\3\2\2\2\u009e"+
		"\u009f\7,\2\2\u009f$\3\2\2\2\u00a0\u00a1\7\61\2\2\u00a1&\3\2\2\2\u00a2"+
		"\u00a3\7-\2\2\u00a3(\3\2\2\2\u00a4\u00a5\7/\2\2\u00a5*\3\2\2\2\u00a6\u00a7"+
		"\7@\2\2\u00a7,\3\2\2\2\u00a8\u00a9\7>\2\2\u00a9.\3\2\2\2\u00aa\u00ab\7"+
		"@\2\2\u00ab\u00ac\7?\2\2\u00ac\60\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae\u00af"+
		"\7?\2\2\u00af\62\3\2\2\2\u00b0\u00b1\7?\2\2\u00b1\u00b2\7?\2\2\u00b2\64"+
		"\3\2\2\2\u00b3\u00b4\7#\2\2\u00b4\u00b5\7?\2\2\u00b5\66\3\2\2\2\u00b6"+
		"\u00b7\7A\2\2\u00b78\3\2\2\2\u00b8\u00b9\7<\2\2\u00b9:\3\2\2\2\u00ba\u00bb"+
		"\7=\2\2\u00bb<\3\2\2\2\u00bc\u00bd\7?\2\2\u00bd>\3\2\2\2\u00be\u00bf\7"+
		"*\2\2\u00bf@\3\2\2\2\u00c0\u00c1\7+\2\2\u00c1B\3\2\2\2\u00c2\u00c3\7."+
		"\2\2\u00c3D\3\2\2\2\r\2epv|\u0080\u0087\u008c\u0090\u0093\u0098\3\2\3"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}