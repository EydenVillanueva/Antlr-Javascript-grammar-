// Generated from C:\Users\Eyden Villanueva\Documents\GitHub\Antlr-Javascript-grammar-\src\javascript.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class javascriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUNTOCOMA=1, WS=2, NL=3, PUNTO=4, COMA=5, IGUAL=6, NUMERO=7, STRING=8, 
		VAR=9, MENOS=10, VARIABLE=11;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "WS", "NL", "'.'", "','", "'='", "NUMERO", "STRING", 
		"'var'", "'-'", "VARIABLE"
	};
	public static final int
		RULE_prog = 0, RULE_sentencia = 1, RULE_asignacion = 2, RULE_declaracion = 3;
	public static final String[] ruleNames = {
		"prog", "sentencia", "asignacion", "declaracion"
	};

	@Override
	public String getGrammarFileName() { return "javascript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public javascriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public List<TerminalNode> NL() { return getTokens(javascriptParser.NL); }
		public TerminalNode WS(int i) {
			return getToken(javascriptParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(javascriptParser.WS); }
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode NL(int i) {
			return getToken(javascriptParser.NL, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javascriptVisitor ) return ((javascriptVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(8); sentencia();
					}
					} 
				}
				setState(13);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(14);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class SentenciaContext extends ParserRuleContext {
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	 
		public SentenciaContext() { }
		public void copyFrom(SentenciaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsignaContext extends SentenciaContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public AsignaContext(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).enterAsigna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).exitAsigna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javascriptVisitor ) return ((javascriptVisitor<? extends T>)visitor).visitAsigna(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaraContext extends SentenciaContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public DeclaraContext(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).enterDeclara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).exitDeclara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javascriptVisitor ) return ((javascriptVisitor<? extends T>)visitor).visitDeclara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(22);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new AsignaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20); asignacion();
				}
				break;
			case 2:
				_localctx = new DeclaraContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21); declaracion();
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

	public static class AsignacionContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(javascriptParser.NL); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(javascriptParser.PUNTOCOMA, 0); }
		public TerminalNode WS(int i) {
			return getToken(javascriptParser.WS, i);
		}
		public TerminalNode NUMERO() { return getToken(javascriptParser.NUMERO, 0); }
		public List<TerminalNode> WS() { return getTokens(javascriptParser.WS); }
		public TerminalNode STRING() { return getToken(javascriptParser.STRING, 0); }
		public TerminalNode NL(int i) {
			return getToken(javascriptParser.NL, i);
		}
		public TerminalNode IGUAL() { return getToken(javascriptParser.IGUAL, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javascriptVisitor ) return ((javascriptVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_asignacion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(24); declaracion();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(25); match(WS);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31); match(IGUAL);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(32); match(WS);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			_la = _input.LA(1);
			if ( !(_la==NUMERO || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(40);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(39); match(PUNTOCOMA);
				}
			}

			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
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

	public static class DeclaracionContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(javascriptParser.NL); }
		public TerminalNode PUNTOCOMA() { return getToken(javascriptParser.PUNTOCOMA, 0); }
		public TerminalNode WS(int i) {
			return getToken(javascriptParser.WS, i);
		}
		public TerminalNode VAR() { return getToken(javascriptParser.VAR, 0); }
		public List<TerminalNode> WS() { return getTokens(javascriptParser.WS); }
		public TerminalNode COMA(int i) {
			return getToken(javascriptParser.COMA, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(javascriptParser.VARIABLE); }
		public TerminalNode NL(int i) {
			return getToken(javascriptParser.NL, i);
		}
		public TerminalNode VARIABLE(int i) {
			return getToken(javascriptParser.VARIABLE, i);
		}
		public List<TerminalNode> COMA() { return getTokens(javascriptParser.COMA); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javascriptVisitor ) return ((javascriptVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(48); match(VAR);
				}
			}

			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(51); match(WS);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57); match(VARIABLE);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58); match(WS);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(64); match(COMA);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(65); match(WS);
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71); match(VARIABLE);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(77); match(PUNTOCOMA);
				}
			}

			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\rY\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\7\2\22\n\2\f\2\16"+
		"\2\25\13\2\3\3\3\3\5\3\31\n\3\3\4\3\4\7\4\35\n\4\f\4\16\4 \13\4\3\4\3"+
		"\4\7\4$\n\4\f\4\16\4\'\13\4\3\4\3\4\5\4+\n\4\3\4\7\4.\n\4\f\4\16\4\61"+
		"\13\4\3\5\5\5\64\n\5\3\5\7\5\67\n\5\f\5\16\5:\13\5\3\5\3\5\7\5>\n\5\f"+
		"\5\16\5A\13\5\3\5\3\5\7\5E\n\5\f\5\16\5H\13\5\3\5\7\5K\n\5\f\5\16\5N\13"+
		"\5\3\5\5\5Q\n\5\3\5\7\5T\n\5\f\5\16\5W\13\5\3\5\2\2\6\2\4\6\b\2\4\3\2"+
		"\4\5\3\2\t\nb\2\r\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2\b\63\3\2\2\2\n\f\5"+
		"\4\3\2\13\n\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\23\3\2\2"+
		"\2\17\r\3\2\2\2\20\22\t\2\2\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2"+
		"\2\23\24\3\2\2\2\24\3\3\2\2\2\25\23\3\2\2\2\26\31\5\6\4\2\27\31\5\b\5"+
		"\2\30\26\3\2\2\2\30\27\3\2\2\2\31\5\3\2\2\2\32\36\5\b\5\2\33\35\7\4\2"+
		"\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 "+
		"\36\3\2\2\2!%\7\b\2\2\"$\7\4\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2"+
		"\2\2&(\3\2\2\2\'%\3\2\2\2(*\t\3\2\2)+\7\3\2\2*)\3\2\2\2*+\3\2\2\2+/\3"+
		"\2\2\2,.\t\2\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\7\3\2"+
		"\2\2\61/\3\2\2\2\62\64\7\13\2\2\63\62\3\2\2\2\63\64\3\2\2\2\648\3\2\2"+
		"\2\65\67\7\4\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2"+
		"\2\2:8\3\2\2\2;?\7\r\2\2<>\7\4\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2"+
		"\2\2@L\3\2\2\2A?\3\2\2\2BF\7\7\2\2CE\7\4\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2"+
		"\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IK\7\r\2\2JB\3\2\2\2KN\3\2\2\2LJ\3\2"+
		"\2\2LM\3\2\2\2MP\3\2\2\2NL\3\2\2\2OQ\7\3\2\2PO\3\2\2\2PQ\3\2\2\2QU\3\2"+
		"\2\2RT\t\2\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\t\3\2\2\2WU\3"+
		"\2\2\2\20\r\23\30\36%*/\638?FLPU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}