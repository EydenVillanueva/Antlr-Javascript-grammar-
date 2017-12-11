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
		VAR=9, OPERADORES=10, VARIABLE=11;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "WS", "NL", "'.'", "','", "'='", "NUMERO", "STRING", 
		"'var'", "OPERADORES", "VARIABLE"
	};
	public static final int
		RULE_prog = 0, RULE_sentencia = 1, RULE_operacion = 2, RULE_asignacion = 3, 
		RULE_declaracion = 4, RULE_argumento = 5;
	public static final String[] ruleNames = {
		"prog", "sentencia", "operacion", "asignacion", "declaracion", "argumento"
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
			setState(15);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(12); sentencia();
					}
					} 
				}
				setState(17);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(18);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(23);
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
	public static class OperaContext extends SentenciaContext {
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public OperaContext(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).enterOpera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).exitOpera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javascriptVisitor ) return ((javascriptVisitor<? extends T>)visitor).visitOpera(this);
			else return visitor.visitChildren(this);
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
			setState(27);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new AsignaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(24); asignacion();
				}
				break;
			case 2:
				_localctx = new OperaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(25); operacion();
				}
				break;
			case 3:
				_localctx = new DeclaraContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(26); declaracion();
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

	public static class OperacionContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(javascriptParser.NL); }
		public TerminalNode PUNTOCOMA() { return getToken(javascriptParser.PUNTOCOMA, 0); }
		public TerminalNode WS(int i) {
			return getToken(javascriptParser.WS, i);
		}
		public List<ArgumentoContext> argumento() {
			return getRuleContexts(ArgumentoContext.class);
		}
		public List<TerminalNode> WS() { return getTokens(javascriptParser.WS); }
		public ArgumentoContext argumento(int i) {
			return getRuleContext(ArgumentoContext.class,i);
		}
		public List<TerminalNode> OPERADORES() { return getTokens(javascriptParser.OPERADORES); }
		public TerminalNode NL(int i) {
			return getToken(javascriptParser.NL, i);
		}
		public TerminalNode OPERADORES(int i) {
			return getToken(javascriptParser.OPERADORES, i);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javascriptVisitor ) return ((javascriptVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operacion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(29);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35); argumento();
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(36); match(WS);
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(42); match(WS);
						}
						}
						setState(47);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(48); match(OPERADORES);
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(49); match(WS);
						}
						}
						setState(54);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(55); argumento();
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61); match(WS);
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(68);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(67); match(PUNTOCOMA);
				}
			}

			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 6, RULE_asignacion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76); declaracion();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(77); match(WS);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83); match(IGUAL);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(84); match(WS);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==NUMERO || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(92);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(91); match(PUNTOCOMA);
				}
			}

			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 8, RULE_declaracion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(107);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(106); match(VAR);
				}
			}

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(109); match(WS);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115); match(VARIABLE);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116); match(WS);
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(122); match(COMA);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(123); match(WS);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129); match(VARIABLE);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135); match(WS);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(142);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(141); match(PUNTOCOMA);
				}
			}

			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class ArgumentoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(javascriptParser.NUMERO, 0); }
		public TerminalNode STRING() { return getToken(javascriptParser.STRING, 0); }
		public TerminalNode VARIABLE() { return getToken(javascriptParser.VARIABLE, 0); }
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).enterArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).exitArgumento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javascriptVisitor ) return ((javascriptVisitor<? extends T>)visitor).visitArgumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argumento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << STRING) | (1L << VARIABLE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r\u009b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2"+
		"\3\2\7\2\26\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\5\3\36\n\3\3\4\7\4!\n\4\f"+
		"\4\16\4$\13\4\3\4\3\4\7\4(\n\4\f\4\16\4+\13\4\3\4\7\4.\n\4\f\4\16\4\61"+
		"\13\4\3\4\3\4\7\4\65\n\4\f\4\16\48\13\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3"+
		"\4\7\4A\n\4\f\4\16\4D\13\4\3\4\5\4G\n\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3"+
		"\5\3\5\7\5Q\n\5\f\5\16\5T\13\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5"+
		"\5\5_\n\5\3\5\7\5b\n\5\f\5\16\5e\13\5\3\6\7\6h\n\6\f\6\16\6k\13\6\3\6"+
		"\5\6n\n\6\3\6\7\6q\n\6\f\6\16\6t\13\6\3\6\3\6\7\6x\n\6\f\6\16\6{\13\6"+
		"\3\6\3\6\7\6\177\n\6\f\6\16\6\u0082\13\6\3\6\7\6\u0085\n\6\f\6\16\6\u0088"+
		"\13\6\3\6\7\6\u008b\n\6\f\6\16\6\u008e\13\6\3\6\5\6\u0091\n\6\3\6\7\6"+
		"\u0094\n\6\f\6\16\6\u0097\13\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\5\3\2\4"+
		"\5\3\2\t\n\4\2\t\n\r\r\u00ad\2\21\3\2\2\2\4\35\3\2\2\2\6\"\3\2\2\2\bN"+
		"\3\2\2\2\ni\3\2\2\2\f\u0098\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\23"+
		"\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\27\3\2\2\2\23\21\3\2\2\2\24\26"+
		"\t\2\2\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3"+
		"\3\2\2\2\31\27\3\2\2\2\32\36\5\b\5\2\33\36\5\6\4\2\34\36\5\n\6\2\35\32"+
		"\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2\2\37!\t\2\2\2 \37\3\2"+
		"\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%)\5\f\7\2&("+
		"\7\4\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*<\3\2\2\2+)\3\2\2\2"+
		",.\7\4\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61"+
		"/\3\2\2\2\62\66\7\f\2\2\63\65\7\4\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29;\5\f\7\2:/\3\2\2\2;>\3"+
		"\2\2\2<:\3\2\2\2<=\3\2\2\2=B\3\2\2\2><\3\2\2\2?A\7\4\2\2@?\3\2\2\2AD\3"+
		"\2\2\2B@\3\2\2\2BC\3\2\2\2CF\3\2\2\2DB\3\2\2\2EG\7\3\2\2FE\3\2\2\2FG\3"+
		"\2\2\2GK\3\2\2\2HJ\t\2\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\7"+
		"\3\2\2\2MK\3\2\2\2NR\5\n\6\2OQ\7\4\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2R"+
		"S\3\2\2\2SU\3\2\2\2TR\3\2\2\2UY\7\b\2\2VX\7\4\2\2WV\3\2\2\2X[\3\2\2\2"+
		"YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\^\t\3\2\2]_\7\3\2\2^]\3\2\2"+
		"\2^_\3\2\2\2_c\3\2\2\2`b\t\2\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2"+
		"\2d\t\3\2\2\2ec\3\2\2\2fh\t\2\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2ln\7\13\2\2ml\3\2\2\2mn\3\2\2\2nr\3\2\2\2oq\7"+
		"\4\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uy\7"+
		"\r\2\2vx\7\4\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\u0086\3\2\2"+
		"\2{y\3\2\2\2|\u0080\7\7\2\2}\177\7\4\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0083\u0085\7\r\2\2\u0084|\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u008c\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008b\7\4\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0091\7\3\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0095\3\2"+
		"\2\2\u0092\u0094\t\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\13\3\2\2\2\u0097\u0095\3\2\2"+
		"\2\u0098\u0099\t\4\2\2\u0099\r\3\2\2\2\32\21\27\35\")/\66<BFKRY^cimry"+
		"\u0080\u0086\u008c\u0090\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}