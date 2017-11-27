// Generated from D:/gitRepos/antlrDemo/src/cgame\CGameLexerRules.g4 by ANTLR 4.7
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
public class CGameLexerRules extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, FLOAT=2, INT=3, EXP=4, BOOL=5, DOT=6, MUL=7, DIV=8, ADD=9, SUB=10, 
		GT=11, LT=12, GE=13, LE=14, EQUAL_EQUAL=15, NOT_EQUAL=16, QUESTION=17, 
		COLON=18, SEMI=19, EQUAL=20, LPAREN=21, RPAREN=22, COMMA=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ID", "FLOAT", "INT", "EXP", "BOOL", "DOT", "MUL", "DIV", "ADD", "SUB", 
		"GT", "LT", "GE", "LE", "EQUAL_EQUAL", "NOT_EQUAL", "QUESTION", "COLON", 
		"SEMI", "EQUAL", "LPAREN", "RPAREN", "COMMA", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'.'", "'*'", "'/'", "'+'", "'-'", 
		"'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'?'", "':'", "';'", "'='", 
		"'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID", "FLOAT", "INT", "EXP", "BOOL", "DOT", "MUL", "DIV", "ADD", 
		"SUB", "GT", "LT", "GE", "LE", "EQUAL_EQUAL", "NOT_EQUAL", "QUESTION", 
		"COLON", "SEMI", "EQUAL", "LPAREN", "RPAREN", "COMMA", "WS"
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


	public CGameLexerRules(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CGameLexerRules.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\6\2\65\n\2\r\2\16\2\66\3\3\5\3:\n\3\3\3\3\3\3\3\3\3\5\3@\n\3"+
		"\3\3\5\3C\n\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\3\5\3L\n\3\3\4\3\4\3\4\7\4Q\n"+
		"\4\f\4\16\4T\13\4\5\4V\n\4\3\5\3\5\5\5Z\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\6\31\u0092\n\31\r\31\16\31\u0093\3\31\3\31\2\2\32\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\b\4\2\62;C|\3\2\63;\3\2\62;\4"+
		"\2GGgg\4\2--//\5\2\13\f\17\17\"\"\2\u00a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\64\3\2\2\2"+
		"\5K\3\2\2\2\7U\3\2\2\2\tW\3\2\2\2\13f\3\2\2\2\rh\3\2\2\2\17j\3\2\2\2\21"+
		"l\3\2\2\2\23n\3\2\2\2\25p\3\2\2\2\27r\3\2\2\2\31t\3\2\2\2\33v\3\2\2\2"+
		"\35y\3\2\2\2\37|\3\2\2\2!\177\3\2\2\2#\u0082\3\2\2\2%\u0084\3\2\2\2\'"+
		"\u0086\3\2\2\2)\u0088\3\2\2\2+\u008a\3\2\2\2-\u008c\3\2\2\2/\u008e\3\2"+
		"\2\2\61\u0091\3\2\2\2\63\65\t\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\67\4\3\2\2\28:\7/\2\298\3\2\2\29:\3\2\2\2:;\3\2"+
		"\2\2;<\5\7\4\2<=\7\60\2\2=?\5\7\4\2>@\5\t\5\2?>\3\2\2\2?@\3\2\2\2@L\3"+
		"\2\2\2AC\7/\2\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\5\7\4\2EF\5\t\5\2FL\3"+
		"\2\2\2GI\7/\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JL\5\7\4\2K9\3\2\2\2KB\3"+
		"\2\2\2KH\3\2\2\2L\6\3\2\2\2MV\7\62\2\2NR\t\3\2\2OQ\t\4\2\2PO\3\2\2\2Q"+
		"T\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UM\3\2\2\2UN\3\2\2\2"+
		"V\b\3\2\2\2WY\t\5\2\2XZ\t\6\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\5\7\4"+
		"\2\\\n\3\2\2\2]^\7V\2\2^_\7T\2\2_`\7W\2\2`g\7G\2\2ab\7H\2\2bc\7C\2\2c"+
		"d\7N\2\2de\7U\2\2eg\7G\2\2f]\3\2\2\2fa\3\2\2\2g\f\3\2\2\2hi\7\60\2\2i"+
		"\16\3\2\2\2jk\7,\2\2k\20\3\2\2\2lm\7\61\2\2m\22\3\2\2\2no\7-\2\2o\24\3"+
		"\2\2\2pq\7/\2\2q\26\3\2\2\2rs\7@\2\2s\30\3\2\2\2tu\7>\2\2u\32\3\2\2\2"+
		"vw\7@\2\2wx\7?\2\2x\34\3\2\2\2yz\7>\2\2z{\7?\2\2{\36\3\2\2\2|}\7?\2\2"+
		"}~\7?\2\2~ \3\2\2\2\177\u0080\7#\2\2\u0080\u0081\7?\2\2\u0081\"\3\2\2"+
		"\2\u0082\u0083\7A\2\2\u0083$\3\2\2\2\u0084\u0085\7<\2\2\u0085&\3\2\2\2"+
		"\u0086\u0087\7=\2\2\u0087(\3\2\2\2\u0088\u0089\7?\2\2\u0089*\3\2\2\2\u008a"+
		"\u008b\7*\2\2\u008b,\3\2\2\2\u008c\u008d\7+\2\2\u008d.\3\2\2\2\u008e\u008f"+
		"\7.\2\2\u008f\60\3\2\2\2\u0090\u0092\t\7\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0096\b\31\2\2\u0096\62\3\2\2\2\16\2\669?BHKRUYf\u0093\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}