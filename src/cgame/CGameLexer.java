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
		INT=1, BOOL=2, FLOAT=3, ID=4, NEWLINE=5, WS=6, DOT=7, MUL=8, DIV=9, ADD=10, 
		SUB=11, GT=12, LT=13, GE=14, LE=15, EQUAL_EQUAL=16, NOT_EQUAL=17, QUESTION=18, 
		COLON=19, SEMI=20, EQUAL=21, LPAREN=22, RPAREN=23, COMMA=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "BOOL", "FLOAT", "EXP", "ID", "NEWLINE", "WS", "DOT", "MUL", "DIV", 
		"ADD", "SUB", "GT", "LT", "GE", "LE", "EQUAL_EQUAL", "NOT_EQUAL", "QUESTION", 
		"COLON", "SEMI", "EQUAL", "LPAREN", "RPAREN", "COMMA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'.'", "'*'", "'/'", "'+'", 
		"'-'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'?'", "':'", "';'", 
		"'='", "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "BOOL", "FLOAT", "ID", "NEWLINE", "WS", "DOT", "MUL", "DIV", 
		"ADD", "SUB", "GT", "LT", "GE", "LE", "EQUAL_EQUAL", "NOT_EQUAL", "QUESTION", 
		"COLON", "SEMI", "EQUAL", "LPAREN", "RPAREN", "COMMA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\6\2\67\n\2\r\2\16\28\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3D\n\3\3\4\3\4\3\4\3\4\5\4J\n\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5"+
		"\3\5\5\5T\n\5\3\5\3\5\3\6\6\6Y\n\6\r\6\16\6Z\3\6\7\6^\n\6\f\6\16\6a\13"+
		"\6\3\7\5\7d\n\7\3\7\3\7\3\b\6\bi\n\b\r\b\16\bj\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\2\2\33\3\3\5\4\7\5\t\2\13\6\r\7\17"+
		"\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26"+
		"-\27/\30\61\31\63\32\3\2\7\3\2\62;\4\2GGgg\4\2--//\3\2C|\4\2\13\13\"\""+
		"\2\u009e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\3\66\3\2\2\2\5C\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2"+
		"\13X\3\2\2\2\rc\3\2\2\2\17h\3\2\2\2\21n\3\2\2\2\23p\3\2\2\2\25r\3\2\2"+
		"\2\27t\3\2\2\2\31v\3\2\2\2\33x\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!\177\3"+
		"\2\2\2#\u0082\3\2\2\2%\u0085\3\2\2\2\'\u0088\3\2\2\2)\u008a\3\2\2\2+\u008c"+
		"\3\2\2\2-\u008e\3\2\2\2/\u0090\3\2\2\2\61\u0092\3\2\2\2\63\u0094\3\2\2"+
		"\2\65\67\t\2\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29\4\3"+
		"\2\2\2:;\7V\2\2;<\7T\2\2<=\7W\2\2=D\7G\2\2>?\7H\2\2?@\7C\2\2@A\7N\2\2"+
		"AB\7U\2\2BD\7G\2\2C:\3\2\2\2C>\3\2\2\2D\6\3\2\2\2EF\5\3\2\2FG\7\60\2\2"+
		"GI\5\3\2\2HJ\5\t\5\2IH\3\2\2\2IJ\3\2\2\2JP\3\2\2\2KL\5\3\2\2LM\5\t\5\2"+
		"MP\3\2\2\2NP\5\3\2\2OE\3\2\2\2OK\3\2\2\2ON\3\2\2\2P\b\3\2\2\2QS\t\3\2"+
		"\2RT\t\4\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\5\3\2\2V\n\3\2\2\2WY\t\5"+
		"\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[_\3\2\2\2\\^\t\2\2\2]\\\3"+
		"\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\f\3\2\2\2a_\3\2\2\2bd\7\17\2\2c"+
		"b\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\f\2\2f\16\3\2\2\2gi\t\6\2\2hg\3\2\2"+
		"\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\b\b\2\2m\20\3\2\2\2no\7\60"+
		"\2\2o\22\3\2\2\2pq\7,\2\2q\24\3\2\2\2rs\7\61\2\2s\26\3\2\2\2tu\7-\2\2"+
		"u\30\3\2\2\2vw\7/\2\2w\32\3\2\2\2xy\7@\2\2y\34\3\2\2\2z{\7>\2\2{\36\3"+
		"\2\2\2|}\7@\2\2}~\7?\2\2~ \3\2\2\2\177\u0080\7>\2\2\u0080\u0081\7?\2\2"+
		"\u0081\"\3\2\2\2\u0082\u0083\7?\2\2\u0083\u0084\7?\2\2\u0084$\3\2\2\2"+
		"\u0085\u0086\7#\2\2\u0086\u0087\7?\2\2\u0087&\3\2\2\2\u0088\u0089\7A\2"+
		"\2\u0089(\3\2\2\2\u008a\u008b\7<\2\2\u008b*\3\2\2\2\u008c\u008d\7=\2\2"+
		"\u008d,\3\2\2\2\u008e\u008f\7?\2\2\u008f.\3\2\2\2\u0090\u0091\7*\2\2\u0091"+
		"\60\3\2\2\2\u0092\u0093\7+\2\2\u0093\62\3\2\2\2\u0094\u0095\7.\2\2\u0095"+
		"\64\3\2\2\2\f\28CIOSZ_cj\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}