// Generated from C:\Users\Eyden Villanueva\Documents\GitHub\Antlr-Javascript-grammar-\src\javascript.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class javascriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUNTOCOMA=1, WS=2, NL=3, PUNTO=4, COMA=5, IGUAL=6, NUMERO=7, STRING=8, 
		VAR=9, OPERADORES=10, VARIABLE=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'"
	};
	public static final String[] ruleNames = {
		"PUNTOCOMA", "WS", "NL", "GUIONBAJO", "SIGNODOLAR", "PUNTO", "COMA", "IGUAL", 
		"COMILLAS", "LETRA", "DIGITO", "NUMERO", "STRING", "VAR", "MENOS", "MAS", 
		"POR", "ENTRE", "OPERADORES", "VARIABLE"
	};


	public javascriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "javascript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\r\u0088\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\67\n\3\3\4\6\4:\n\4\r\4\16\4;\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\6\rO\n\r\r\r\16\rP\3\r\3\r\6\r"+
		"U\n\r\r\r\16\rV\5\rY\n\r\3\16\3\16\3\16\3\16\3\16\7\16`\n\16\f\16\16\16"+
		"c\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\5\24w\n\24\3\25\3\25\3\25\6\25|\n\25\r\25"+
		"\16\25}\3\25\3\25\3\25\3\25\7\25\u0084\n\25\f\25\16\25\u0087\13\25\2\2"+
		"\26\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\2\25\2\27\2\31\t\33\n\35\13"+
		"\37\2!\2#\2%\2\'\f)\r\3\2\5\4\2\f\f\17\17\4\2C\\c|\3\2\62;\u0093\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2"+
		"\2\5\66\3\2\2\2\79\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2"+
		"\2\21E\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27K\3\2\2\2\31N\3\2\2\2\33Z\3\2"+
		"\2\2\35f\3\2\2\2\37j\3\2\2\2!l\3\2\2\2#n\3\2\2\2%p\3\2\2\2\'v\3\2\2\2"+
		"){\3\2\2\2+,\7=\2\2,\4\3\2\2\2-\67\7\"\2\2./\7\"\2\2/\60\7\"\2\2\60\67"+
		"\7\"\2\2\61\67\7\16\2\2\62\63\7\"\2\2\63\64\7\"\2\2\64\65\7\"\2\2\65\67"+
		"\7\"\2\2\66-\3\2\2\2\66.\3\2\2\2\66\61\3\2\2\2\66\62\3\2\2\2\67\6\3\2"+
		"\2\28:\t\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\b\3\2\2\2=>\7"+
		"a\2\2>\n\3\2\2\2?@\7&\2\2@\f\3\2\2\2AB\7\60\2\2B\16\3\2\2\2CD\7.\2\2D"+
		"\20\3\2\2\2EF\7?\2\2F\22\3\2\2\2GH\7$\2\2H\24\3\2\2\2IJ\t\3\2\2J\26\3"+
		"\2\2\2KL\t\4\2\2L\30\3\2\2\2MO\5\27\f\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2"+
		"PQ\3\2\2\2QX\3\2\2\2RT\5\r\7\2SU\5\27\f\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2"+
		"\2VW\3\2\2\2WY\3\2\2\2XR\3\2\2\2XY\3\2\2\2Y\32\3\2\2\2Za\5\23\n\2[`\5"+
		"\25\13\2\\`\5\31\r\2]`\5\5\3\2^`\5\7\4\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2"+
		"\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\5\23"+
		"\n\2e\34\3\2\2\2fg\7x\2\2gh\7c\2\2hi\7t\2\2i\36\3\2\2\2jk\7/\2\2k \3\2"+
		"\2\2lm\7-\2\2m\"\3\2\2\2no\7,\2\2o$\3\2\2\2pq\7\61\2\2q&\3\2\2\2rw\5\37"+
		"\20\2sw\5!\21\2tw\5#\22\2uw\5%\23\2vr\3\2\2\2vs\3\2\2\2vt\3\2\2\2vu\3"+
		"\2\2\2w(\3\2\2\2x|\5\t\5\2y|\5\13\6\2z|\5\25\13\2{x\3\2\2\2{y\3\2\2\2"+
		"{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0085\3\2\2\2\177\u0084\5\t"+
		"\5\2\u0080\u0084\5\13\6\2\u0081\u0084\5\25\13\2\u0082\u0084\5\27\f\2\u0083"+
		"\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2"+
		"\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086*"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\17\2\66;PVX_av{}\u0083\u0085\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}