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
		PUNTOCOMA=1, WS=2, NL=3, PUNTO=4, COMA=5, IGUAL=6, ABRIRPARENTESIS=7, 
		CERRARPARENTESIS=8, ABRIRLLAVES=9, CERRARLLAVES=10, NUMERO=11, STRING=12, 
		VAR=13, IF=14, OPERADORES=15, OPERADORESLOGICOS=16, VARIABLE=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'"
	};
	public static final String[] ruleNames = {
		"DIF", "PUNTOCOMA", "WS", "NL", "GUIONBAJO", "SIGNODOLAR", "PUNTO", "COMA", 
		"IGUAL", "COMILLAS", "ABRIRPARENTESIS", "CERRARPARENTESIS", "ABRIRLLAVES", 
		"CERRARLLAVES", "LETRA", "DIGITO", "NUMERO", "STRING", "VAR", "IF", "MENOS", 
		"MAS", "POR", "ENTRE", "OPERADORES", "MAYOR", "MENOR", "MAYORIGUAL", "MENORIGUAL", 
		"DIFERENTE", "IGUALOGICO", "OR", "AND", "OPERADORESLOGICOS", "VARIABLE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u00d3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4W\n\4\3\5\6\5Z\n\5\r\5\16\5[\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\6\22w\n\22\r\22\16\22x\3\22\3\22\6\22}\n\22\r\22\16\22~"+
		"\5\22\u0081\n\22\3\23\3\23\3\23\3\23\3\23\7\23\u0088\n\23\f\23\16\23\u008b"+
		"\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u00a2\n\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00c2\n#\3$\3$\3$\6$\u00c7\n$\r"+
		"$\16$\u00c8\3$\3$\3$\3$\7$\u00cf\n$\f$\16$\u00d2\13$\2\2%\3\2\5\3\7\4"+
		"\t\5\13\2\r\2\17\6\21\7\23\b\25\2\27\t\31\n\33\13\35\f\37\2!\2#\r%\16"+
		"\'\17)\20+\2-\2/\2\61\2\63\21\65\2\67\29\2;\2=\2?\2A\2C\2E\22G\23\3\2"+
		"\5\4\2\f\f\17\17\4\2C\\c|\3\2\62;\u00dc\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2\63\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7V\3\2\2"+
		"\2\tY\3\2\2\2\13]\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2\21c\3\2\2\2\23e\3\2\2"+
		"\2\25g\3\2\2\2\27i\3\2\2\2\31k\3\2\2\2\33m\3\2\2\2\35o\3\2\2\2\37q\3\2"+
		"\2\2!s\3\2\2\2#v\3\2\2\2%\u0082\3\2\2\2\'\u008e\3\2\2\2)\u0092\3\2\2\2"+
		"+\u0095\3\2\2\2-\u0097\3\2\2\2/\u0099\3\2\2\2\61\u009b\3\2\2\2\63\u00a1"+
		"\3\2\2\2\65\u00a3\3\2\2\2\67\u00a5\3\2\2\29\u00a7\3\2\2\2;\u00aa\3\2\2"+
		"\2=\u00ad\3\2\2\2?\u00b0\3\2\2\2A\u00b3\3\2\2\2C\u00b6\3\2\2\2E\u00c1"+
		"\3\2\2\2G\u00c6\3\2\2\2IJ\7#\2\2J\4\3\2\2\2KL\7=\2\2L\6\3\2\2\2MW\7\""+
		"\2\2NO\7\"\2\2OP\7\"\2\2PW\7\"\2\2QW\7\16\2\2RS\7\"\2\2ST\7\"\2\2TU\7"+
		"\"\2\2UW\7\"\2\2VM\3\2\2\2VN\3\2\2\2VQ\3\2\2\2VR\3\2\2\2W\b\3\2\2\2XZ"+
		"\t\2\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\n\3\2\2\2]^\7a\2\2"+
		"^\f\3\2\2\2_`\7&\2\2`\16\3\2\2\2ab\7\60\2\2b\20\3\2\2\2cd\7.\2\2d\22\3"+
		"\2\2\2ef\7?\2\2f\24\3\2\2\2gh\7$\2\2h\26\3\2\2\2ij\7*\2\2j\30\3\2\2\2"+
		"kl\7+\2\2l\32\3\2\2\2mn\7}\2\2n\34\3\2\2\2op\7\177\2\2p\36\3\2\2\2qr\t"+
		"\3\2\2r \3\2\2\2st\t\4\2\2t\"\3\2\2\2uw\5!\21\2vu\3\2\2\2wx\3\2\2\2xv"+
		"\3\2\2\2xy\3\2\2\2y\u0080\3\2\2\2z|\5\17\b\2{}\5!\21\2|{\3\2\2\2}~\3\2"+
		"\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080z\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081$\3\2\2\2\u0082\u0089\5\25\13\2\u0083\u0088\5\37\20\2\u0084"+
		"\u0088\5#\22\2\u0085\u0088\5\7\4\2\u0086\u0088\5\t\5\2\u0087\u0083\3\2"+
		"\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008c\u008d\5\25\13\2\u008d&\3\2\2\2\u008e\u008f"+
		"\7x\2\2\u008f\u0090\7c\2\2\u0090\u0091\7t\2\2\u0091(\3\2\2\2\u0092\u0093"+
		"\7k\2\2\u0093\u0094\7h\2\2\u0094*\3\2\2\2\u0095\u0096\7/\2\2\u0096,\3"+
		"\2\2\2\u0097\u0098\7-\2\2\u0098.\3\2\2\2\u0099\u009a\7,\2\2\u009a\60\3"+
		"\2\2\2\u009b\u009c\7\61\2\2\u009c\62\3\2\2\2\u009d\u00a2\5+\26\2\u009e"+
		"\u00a2\5-\27\2\u009f\u00a2\5/\30\2\u00a0\u00a2\5\61\31\2\u00a1\u009d\3"+
		"\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\64\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4\66\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6"+
		"8\3\2\2\2\u00a7\u00a8\5\65\33\2\u00a8\u00a9\5\23\n\2\u00a9:\3\2\2\2\u00aa"+
		"\u00ab\5\67\34\2\u00ab\u00ac\5\23\n\2\u00ac<\3\2\2\2\u00ad\u00ae\5\3\2"+
		"\2\u00ae\u00af\5\23\n\2\u00af>\3\2\2\2\u00b0\u00b1\5\23\n\2\u00b1\u00b2"+
		"\5\23\n\2\u00b2@\3\2\2\2\u00b3\u00b4\7~\2\2\u00b4\u00b5\7~\2\2\u00b5B"+
		"\3\2\2\2\u00b6\u00b7\7(\2\2\u00b7\u00b8\7(\2\2\u00b8D\3\2\2\2\u00b9\u00c2"+
		"\5\65\33\2\u00ba\u00c2\5\67\34\2\u00bb\u00c2\59\35\2\u00bc\u00c2\5;\36"+
		"\2\u00bd\u00c2\5=\37\2\u00be\u00c2\5? \2\u00bf\u00c2\5A!\2\u00c0\u00c2"+
		"\5C\"\2\u00c1\u00b9\3\2\2\2\u00c1\u00ba\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1"+
		"\u00bc\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c0\3\2\2\2\u00c2F\3\2\2\2\u00c3\u00c7\5\13\6\2\u00c4\u00c7"+
		"\5\r\7\2\u00c5\u00c7\5\37\20\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2"+
		"\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00d0\3\2\2\2\u00ca\u00cf\5\13\6\2\u00cb\u00cf\5\r\7\2"+
		"\u00cc\u00cf\5\37\20\2\u00cd\u00cf\5!\21\2\u00ce\u00ca\3\2\2\2\u00ce\u00cb"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1H\3\2\2\2\u00d2\u00d0\3\2\2\2"+
		"\20\2V[x~\u0080\u0087\u0089\u00a1\u00c1\u00c6\u00c8\u00ce\u00d0\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}