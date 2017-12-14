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
		PUNTOCOMA=1, WS=2, NL=3, PUNTO=4, COMA=5, IGUAL=6, ABRIRPARENTESIS=7, 
		CERRARPARENTESIS=8, ABRIRLLAVES=9, CERRARLLAVES=10, NUMERO=11, STRING=12, 
		VAR=13, IF=14, OPERADORES=15, OPERADORESLOGICOS=16, VARIABLE=17;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "WS", "NL", "'.'", "','", "'='", "'('", "')'", "'{'", 
		"'}'", "NUMERO", "STRING", "'var'", "'if'", "OPERADORES", "OPERADORESLOGICOS", 
		"VARIABLE"
	};
	public static final int
		RULE_prog = 0, RULE_sentencia = 1, RULE_condicional = 2, RULE_operacion = 3, 
		RULE_asignacion = 4, RULE_declaracion = 5, RULE_argumento = 6, RULE_condicion = 7, 
		RULE_contenido = 8;
	public static final String[] ruleNames = {
		"prog", "sentencia", "condicional", "operacion", "asignacion", "declaracion", 
		"argumento", "condicion", "contenido"
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
			setState(21);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(18); sentencia();
					}
					} 
				}
				setState(23);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(24);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(29);
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
	public static class CondiContext extends SentenciaContext {
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CondiContext(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).enterCondi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).exitCondi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javascriptVisitor ) return ((javascriptVisitor<? extends T>)visitor).visitCondi(this);
			else return visitor.visitChildren(this);
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
			setState(34);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new AsignaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30); asignacion();
				}
				break;
			case 2:
				_localctx = new OperaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31); operacion();
				}
				break;
			case 3:
				_localctx = new DeclaraContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32); declaracion();
				}
				break;
			case 4:
				_localctx = new CondiContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(33); condicional();
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode ABRIRLLAVES() { return getToken(javascriptParser.ABRIRLLAVES, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public List<TerminalNode> NL() { return getTokens(javascriptParser.NL); }
		public TerminalNode IF() { return getToken(javascriptParser.IF, 0); }
		public TerminalNode WS(int i) {
			return getToken(javascriptParser.WS, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(javascriptParser.WS); }
		public TerminalNode CERRARLLAVES() { return getToken(javascriptParser.CERRARLLAVES, 0); }
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode NL(int i) {
			return getToken(javascriptParser.NL, i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javascriptVisitor ) return ((javascriptVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_condicional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(36);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42); match(IF);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(43); match(WS);
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(49); condicion();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(50);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56); match(ABRIRLLAVES);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(63); sentencia();
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(69);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75); match(CERRARLLAVES);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 6, RULE_operacion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(82);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88); argumento();
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89); match(WS);
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(95); match(WS);
						}
						}
						setState(100);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(101); match(OPERADORES);
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(102); match(WS);
						}
						}
						setState(107);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(108); argumento();
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114); match(WS);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(121);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(120); match(PUNTOCOMA);
				}
				break;
			}
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public List<TerminalNode> WS() { return getTokens(javascriptParser.WS); }
		public TerminalNode NUMERO() { return getToken(javascriptParser.NUMERO, 0); }
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
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
		enterRule(_localctx, 8, RULE_asignacion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129); declaracion();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(130); match(WS);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136); match(IGUAL);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137); match(WS);
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(143);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 2:
				{
				setState(145); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(144); operacion();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(147); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			setState(152);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(151); match(PUNTOCOMA);
				}
			}

			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(159);
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
		enterRule(_localctx, 10, RULE_declaracion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(160);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(167);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(166); match(VAR);
				}
			}

			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(169); match(WS);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175); match(VARIABLE);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176); match(WS);
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(182); match(WS);
						}
						}
						setState(187);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(188); match(COMA);
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(189); match(WS);
						}
						}
						setState(194);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(195); match(VARIABLE);
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(201); match(WS);
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(208);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(207); match(PUNTOCOMA);
				}
			}

			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		enterRule(_localctx, 12, RULE_argumento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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

	public static class CondicionContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(javascriptParser.NL); }
		public TerminalNode WS(int i) {
			return getToken(javascriptParser.WS, i);
		}
		public TerminalNode ABRIRPARENTESIS() { return getToken(javascriptParser.ABRIRPARENTESIS, 0); }
		public List<ArgumentoContext> argumento() {
			return getRuleContexts(ArgumentoContext.class);
		}
		public List<TerminalNode> WS() { return getTokens(javascriptParser.WS); }
		public ArgumentoContext argumento(int i) {
			return getRuleContext(ArgumentoContext.class,i);
		}
		public TerminalNode OPERADORESLOGICOS() { return getToken(javascriptParser.OPERADORESLOGICOS, 0); }
		public TerminalNode NL(int i) {
			return getToken(javascriptParser.NL, i);
		}
		public TerminalNode CERRARPARENTESIS() { return getToken(javascriptParser.CERRARPARENTESIS, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javascriptVisitor ) return ((javascriptVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(218);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224); match(ABRIRPARENTESIS);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(225); match(WS);
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231); argumento();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(232); match(WS);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238); match(OPERADORESLOGICOS);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(239); match(WS);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245); argumento();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(246); match(WS);
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252); match(CERRARPARENTESIS);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class ContenidoContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ContenidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).enterContenido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javascriptListener ) ((javascriptListener)listener).exitContenido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javascriptVisitor ) return ((javascriptVisitor<? extends T>)visitor).visitContenido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContenidoContext contenido() throws RecognitionException {
		ContenidoContext _localctx = new ContenidoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_contenido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(259); operacion();
				}
				break;
			case 2:
				{
				setState(260); asignacion();
				}
				break;
			case 3:
				{
				setState(261); declaracion();
				}
				break;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23\u010b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7"+
		"\2\26\n\2\f\2\16\2\31\13\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\3"+
		"\3\3\5\3%\n\3\3\4\7\4(\n\4\f\4\16\4+\13\4\3\4\3\4\7\4/\n\4\f\4\16\4\62"+
		"\13\4\3\4\3\4\7\4\66\n\4\f\4\16\49\13\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13"+
		"\4\3\4\7\4C\n\4\f\4\16\4F\13\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\4\3\4\7\4"+
		"P\n\4\f\4\16\4S\13\4\3\5\7\5V\n\5\f\5\16\5Y\13\5\3\5\3\5\7\5]\n\5\f\5"+
		"\16\5`\13\5\3\5\7\5c\n\5\f\5\16\5f\13\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13"+
		"\5\3\5\7\5p\n\5\f\5\16\5s\13\5\3\5\7\5v\n\5\f\5\16\5y\13\5\3\5\5\5|\n"+
		"\5\3\5\7\5\177\n\5\f\5\16\5\u0082\13\5\3\6\3\6\7\6\u0086\n\6\f\6\16\6"+
		"\u0089\13\6\3\6\3\6\7\6\u008d\n\6\f\6\16\6\u0090\13\6\3\6\3\6\6\6\u0094"+
		"\n\6\r\6\16\6\u0095\5\6\u0098\n\6\3\6\5\6\u009b\n\6\3\6\7\6\u009e\n\6"+
		"\f\6\16\6\u00a1\13\6\3\7\7\7\u00a4\n\7\f\7\16\7\u00a7\13\7\3\7\5\7\u00aa"+
		"\n\7\3\7\7\7\u00ad\n\7\f\7\16\7\u00b0\13\7\3\7\3\7\7\7\u00b4\n\7\f\7\16"+
		"\7\u00b7\13\7\3\7\7\7\u00ba\n\7\f\7\16\7\u00bd\13\7\3\7\3\7\7\7\u00c1"+
		"\n\7\f\7\16\7\u00c4\13\7\3\7\7\7\u00c7\n\7\f\7\16\7\u00ca\13\7\3\7\7\7"+
		"\u00cd\n\7\f\7\16\7\u00d0\13\7\3\7\5\7\u00d3\n\7\3\7\7\7\u00d6\n\7\f\7"+
		"\16\7\u00d9\13\7\3\b\3\b\3\t\7\t\u00de\n\t\f\t\16\t\u00e1\13\t\3\t\3\t"+
		"\7\t\u00e5\n\t\f\t\16\t\u00e8\13\t\3\t\3\t\7\t\u00ec\n\t\f\t\16\t\u00ef"+
		"\13\t\3\t\3\t\7\t\u00f3\n\t\f\t\16\t\u00f6\13\t\3\t\3\t\7\t\u00fa\n\t"+
		"\f\t\16\t\u00fd\13\t\3\t\3\t\7\t\u0101\n\t\f\t\16\t\u0104\13\t\3\n\3\n"+
		"\3\n\5\n\u0109\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\5\3\2\4\5\3\2\r\16"+
		"\4\2\r\16\23\23\u012d\2\27\3\2\2\2\4$\3\2\2\2\6)\3\2\2\2\bW\3\2\2\2\n"+
		"\u0083\3\2\2\2\f\u00a5\3\2\2\2\16\u00da\3\2\2\2\20\u00df\3\2\2\2\22\u0108"+
		"\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30"+
		"\3\2\2\2\30\35\3\2\2\2\31\27\3\2\2\2\32\34\t\2\2\2\33\32\3\2\2\2\34\37"+
		"\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37\35\3\2\2\2 %\5\n"+
		"\6\2!%\5\b\5\2\"%\5\f\7\2#%\5\6\4\2$ \3\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3"+
		"\2\2\2%\5\3\2\2\2&(\t\2\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2"+
		"*,\3\2\2\2+)\3\2\2\2,\60\7\20\2\2-/\7\4\2\2.-\3\2\2\2/\62\3\2\2\2\60."+
		"\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\67\5\20\t\2\64\66"+
		"\t\2\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\2"+
		"9\67\3\2\2\2:>\7\13\2\2;=\t\2\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2"+
		"\2\2?D\3\2\2\2@>\3\2\2\2AC\5\4\3\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2"+
		"\2\2EJ\3\2\2\2FD\3\2\2\2GI\t\2\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2"+
		"\2\2KM\3\2\2\2LJ\3\2\2\2MQ\7\f\2\2NP\t\2\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2"+
		"\2\2QR\3\2\2\2R\7\3\2\2\2SQ\3\2\2\2TV\t\2\2\2UT\3\2\2\2VY\3\2\2\2WU\3"+
		"\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z^\5\16\b\2[]\7\4\2\2\\[\3\2\2\2]"+
		"`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_q\3\2\2\2`^\3\2\2\2ac\7\4\2\2ba\3\2\2\2"+
		"cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gk\7\21\2\2hj\7\4\2"+
		"\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2np\5\16"+
		"\b\2od\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rw\3\2\2\2sq\3\2\2\2tv\7\4"+
		"\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2yw\3\2\2\2z|\7\3"+
		"\2\2{z\3\2\2\2{|\3\2\2\2|\u0080\3\2\2\2}\177\t\2\2\2~}\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\t\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0087\5\f\7\2\u0084\u0086\7\4\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008e\7\b\2\2\u008b\u008d\7\4\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0097\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0098\t\3\2\2\u0092"+
		"\u0094\5\b\5\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0091\3\2\2\2\u0097"+
		"\u0093\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b\7\3\2\2\u009a\u0099\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009f\3\2\2\2\u009c\u009e\t\2\2\2\u009d"+
		"\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\13\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\t\2\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\7\17\2\2\u00a9\u00a8\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ad\7\4\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b5\7\23\2\2\u00b2"+
		"\u00b4\7\4\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00c8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00ba\7\4\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00c2\7\7\2\2\u00bf\u00c1\7\4\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c7\7\23\2\2\u00c6\u00bb\3\2\2\2\u00c7\u00ca\3"+
		"\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ce\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00cd\7\4\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d3\7\3\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d7\3\2\2\2\u00d4\u00d6\t\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\r\3\2\2\2"+
		"\u00d9\u00d7\3\2\2\2\u00da\u00db\t\4\2\2\u00db\17\3\2\2\2\u00dc\u00de"+
		"\t\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e6\7\t"+
		"\2\2\u00e3\u00e5\7\4\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\u00ed\5\16\b\2\u00ea\u00ec\7\4\2\2\u00eb\u00ea\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f4\7\22\2\2\u00f1\u00f3\7\4\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fb\5\16\b\2\u00f8"+
		"\u00fa\7\4\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u0102\7\n\2\2\u00ff\u0101\t\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\21\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0105\u0109\5\b\5\2\u0106\u0109\5\n\6\2\u0107\u0109\5\f\7\2\u0108"+
		"\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\23\3\2\2"+
		"\2+\27\35$)\60\67>DJQW^dkqw{\u0080\u0087\u008e\u0095\u0097\u009a\u009f"+
		"\u00a5\u00a9\u00ae\u00b5\u00bb\u00c2\u00c8\u00ce\u00d2\u00d7\u00df\u00e6"+
		"\u00ed\u00f4\u00fb\u0102\u0108";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}