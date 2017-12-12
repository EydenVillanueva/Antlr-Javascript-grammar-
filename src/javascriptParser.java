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
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(67); match(PUNTOCOMA);
				}
				break;
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
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84); match(WS);
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(90);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 2:
				{
				setState(92); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(91); operacion();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(94); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			setState(99);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(98); match(PUNTOCOMA);
				}
			}

			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(114);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(113); match(VAR);
				}
			}

			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(116); match(WS);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122); match(VARIABLE);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123); match(WS);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(129); match(WS);
						}
						}
						setState(134);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(135); match(COMA);
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(136); match(WS);
						}
						}
						setState(141);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(142); match(VARIABLE);
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(148); match(WS);
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(155);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(154); match(PUNTOCOMA);
				}
			}

			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			setState(163);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r\u00a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2"+
		"\3\2\7\2\26\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\5\3\36\n\3\3\4\7\4!\n\4\f"+
		"\4\16\4$\13\4\3\4\3\4\7\4(\n\4\f\4\16\4+\13\4\3\4\7\4.\n\4\f\4\16\4\61"+
		"\13\4\3\4\3\4\7\4\65\n\4\f\4\16\48\13\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3"+
		"\4\7\4A\n\4\f\4\16\4D\13\4\3\4\5\4G\n\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3"+
		"\5\3\5\7\5Q\n\5\f\5\16\5T\13\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5"+
		"\6\5_\n\5\r\5\16\5`\5\5c\n\5\3\5\5\5f\n\5\3\5\7\5i\n\5\f\5\16\5l\13\5"+
		"\3\6\7\6o\n\6\f\6\16\6r\13\6\3\6\5\6u\n\6\3\6\7\6x\n\6\f\6\16\6{\13\6"+
		"\3\6\3\6\7\6\177\n\6\f\6\16\6\u0082\13\6\3\6\7\6\u0085\n\6\f\6\16\6\u0088"+
		"\13\6\3\6\3\6\7\6\u008c\n\6\f\6\16\6\u008f\13\6\3\6\7\6\u0092\n\6\f\6"+
		"\16\6\u0095\13\6\3\6\7\6\u0098\n\6\f\6\16\6\u009b\13\6\3\6\5\6\u009e\n"+
		"\6\3\6\7\6\u00a1\n\6\f\6\16\6\u00a4\13\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f"+
		"\2\5\3\2\4\5\3\2\t\n\4\2\t\n\r\r\u00bd\2\21\3\2\2\2\4\35\3\2\2\2\6\"\3"+
		"\2\2\2\bN\3\2\2\2\np\3\2\2\2\f\u00a5\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2"+
		"\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\27\3\2\2\2\23\21\3\2\2"+
		"\2\24\26\t\2\2\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2"+
		"\2\30\3\3\2\2\2\31\27\3\2\2\2\32\36\5\b\5\2\33\36\5\6\4\2\34\36\5\n\6"+
		"\2\35\32\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2\2\37!\t\2\2\2"+
		" \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%)\5"+
		"\f\7\2&(\7\4\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*<\3\2\2\2+"+
		")\3\2\2\2,.\7\4\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62"+
		"\3\2\2\2\61/\3\2\2\2\62\66\7\f\2\2\63\65\7\4\2\2\64\63\3\2\2\2\658\3\2"+
		"\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29;\5\f\7\2:/\3"+
		"\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=B\3\2\2\2><\3\2\2\2?A\7\4\2\2@?\3"+
		"\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CF\3\2\2\2DB\3\2\2\2EG\7\3\2\2FE\3"+
		"\2\2\2FG\3\2\2\2GK\3\2\2\2HJ\t\2\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3"+
		"\2\2\2L\7\3\2\2\2MK\3\2\2\2NR\5\n\6\2OQ\7\4\2\2PO\3\2\2\2QT\3\2\2\2RP"+
		"\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UY\7\b\2\2VX\7\4\2\2WV\3\2\2\2X"+
		"[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Zb\3\2\2\2[Y\3\2\2\2\\c\t\3\2\2]_\5\6\4\2"+
		"^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b\\\3\2\2\2b^\3\2\2"+
		"\2ce\3\2\2\2df\7\3\2\2ed\3\2\2\2ef\3\2\2\2fj\3\2\2\2gi\t\2\2\2hg\3\2\2"+
		"\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\t\3\2\2\2lj\3\2\2\2mo\t\2\2\2nm\3\2"+
		"\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2su\7\13\2\2ts\3"+
		"\2\2\2tu\3\2\2\2uy\3\2\2\2vx\7\4\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3"+
		"\2\2\2z|\3\2\2\2{y\3\2\2\2|\u0080\7\r\2\2}\177\7\4\2\2~}\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0093\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0085\7\4\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008d\7\7\2\2\u008a\u008c\7\4\2\2\u008b\u008a\3\2"+
		"\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\7\r\2\2\u0091\u0086\3\2"+
		"\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0099\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\7\4\2\2\u0097\u0096\3\2"+
		"\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\7\3\2\2\u009d\u009c\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u00a2\3\2\2\2\u009f\u00a1\t\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\13\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\t\4\2\2\u00a6\r"+
		"\3\2\2\2\35\21\27\35\")/\66<BFKRY`bejpty\u0080\u0086\u008d\u0093\u0099"+
		"\u009d\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}