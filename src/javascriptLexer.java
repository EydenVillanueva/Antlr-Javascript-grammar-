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
		VAR=9, MENOS=10, VARIABLE=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'"
	};
	public static final String[] ruleNames = {
		"PUNTOCOMA", "WS", "NL", "GUIONBAJO", "SIGNODOLAR", "PUNTO", "COMA", "IGUAL", 
		"COMILLAS", "LETRA", "DIGITO", "NUMERO", "STRING", "VAR", "MENOS", "VARIABLE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rt\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\6\4\62\n\4\r\4\16\4\63"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\6\rG\n\r\r\r\16\rH\3\r\3\r\6\rM\n\r\r\r\16\rN\5\rQ\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\7\16X\n\16\f\16\16\16[\13\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\21\6\21h\n\21\r\21\16\21i\3\21\3\21\3\21\3\21\7"+
		"\21p\n\21\f\21\16\21s\13\21\2\2\22\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b"+
		"\23\2\25\2\27\2\31\t\33\n\35\13\37\f!\r\3\2\5\4\2\f\f\17\17\4\2C\\c|\3"+
		"\2\62;\u0080\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2"+
		"\2!\3\2\2\2\3#\3\2\2\2\5.\3\2\2\2\7\61\3\2\2\2\t\65\3\2\2\2\13\67\3\2"+
		"\2\2\r9\3\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2\27C\3"+
		"\2\2\2\31F\3\2\2\2\33R\3\2\2\2\35^\3\2\2\2\37b\3\2\2\2!g\3\2\2\2#$\7="+
		"\2\2$\4\3\2\2\2%/\7\"\2\2&\'\7\"\2\2\'(\7\"\2\2(/\7\"\2\2)/\7\16\2\2*"+
		"+\7\"\2\2+,\7\"\2\2,-\7\"\2\2-/\7\"\2\2.%\3\2\2\2.&\3\2\2\2.)\3\2\2\2"+
		".*\3\2\2\2/\6\3\2\2\2\60\62\t\2\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\b\3\2\2\2\65\66\7a\2\2\66\n\3\2\2\2\678\7&\2"+
		"\28\f\3\2\2\29:\7\60\2\2:\16\3\2\2\2;<\7.\2\2<\20\3\2\2\2=>\7?\2\2>\22"+
		"\3\2\2\2?@\7$\2\2@\24\3\2\2\2AB\t\3\2\2B\26\3\2\2\2CD\t\4\2\2D\30\3\2"+
		"\2\2EG\5\27\f\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IP\3\2\2\2JL\5"+
		"\r\7\2KM\5\27\f\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PJ"+
		"\3\2\2\2PQ\3\2\2\2Q\32\3\2\2\2RY\5\23\n\2SX\5\25\13\2TX\5\31\r\2UX\5\5"+
		"\3\2VX\5\7\4\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\5\23\n\2]\34\3\2\2\2^_\7x\2\2_"+
		"`\7c\2\2`a\7t\2\2a\36\3\2\2\2bc\7/\2\2c \3\2\2\2dh\5\t\5\2eh\5\13\6\2"+
		"fh\5\25\13\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2"+
		"\2jq\3\2\2\2kp\5\t\5\2lp\5\13\6\2mp\5\25\13\2np\5\27\f\2ok\3\2\2\2ol\3"+
		"\2\2\2om\3\2\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\"\3\2\2\2sq"+
		"\3\2\2\2\16\2.\63HNPWYgioq\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}