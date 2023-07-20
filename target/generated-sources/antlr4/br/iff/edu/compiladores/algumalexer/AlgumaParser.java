// Generated from br/iff/edu/compiladores/algumalexer/Alguma.g4 by ANTLR 4.13.0
package br.iff.edu.compiladores.algumalexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlgumaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, PALAVRAS_CHAVES=20, TAMANHO=21, POSICAO=22, IDENT=23, 
		DELIM=24, VIRGULA=25, CADEIA=26, NUM_INT=27, NUM_REAL=28, COMENTARIO=29, 
		WS=30, CADEIA_ERR=31, COMENTARIO_ERR=32, ERRO=33;
	public static final int
		RULE_page = 0, RULE_header = 1, RULE_corpo = 2, RULE_pernas = 3, RULE_funcoes = 4, 
		RULE_pequenas_ocasioes = 5, RULE_menu = 6, RULE_botao = 7, RULE_formulario = 8, 
		RULE_formulario_entrada = 9, RULE_entrada_texto = 10, RULE_pularlinha = 11, 
		RULE_botao_corpo = 12, RULE_entrada = 13, RULE_link = 14, RULE_texto = 15, 
		RULE_valor_texto = 16, RULE_titulo = 17, RULE_paragrafo = 18, RULE_string = 19, 
		RULE_selo = 20, RULE_image = 21, RULE_url = 22, RULE_tema = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"page", "header", "corpo", "pernas", "funcoes", "pequenas_ocasioes", 
			"menu", "botao", "formulario", "formulario_entrada", "entrada_texto", 
			"pularlinha", "botao_corpo", "entrada", "link", "texto", "valor_texto", 
			"titulo", "paragrafo", "string", "selo", "image", "url", "tema"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CRIARPAGINA'", "'('", "')'", "'FIM'", "'CABECA'", "'CORPO'", 
			"'PERNAS'", "'MENU'", "'BOTAO'", "'FORMULARIO'", "'ROTULO'", "'PULARLINHA()'", 
			"'ENTRADA'", "'LINK'", "'TEXTO'", "'TITULO'", "'PARAGRAFO'", "'SELO'", 
			"'IMAGEM'", null, null, null, null, "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "PALAVRAS_CHAVES", "TAMANHO", 
			"POSICAO", "IDENT", "DELIM", "VIRGULA", "CADEIA", "NUM_INT", "NUM_REAL", 
			"COMENTARIO", "WS", "CADEIA_ERR", "COMENTARIO_ERR", "ERRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	@Override
	public String getGrammarFileName() { return "Alguma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlgumaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PageContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AlgumaParser.EOF, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public PernasContext pernas() {
			return getRuleContext(PernasContext.class,0);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			setState(49);
			match(T__1);
			setState(50);
			match(T__2);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(51);
				header();
				}
			}

			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(54);
				corpo();
				}
			}

			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(57);
				pernas();
				}
			}

			setState(60);
			match(T__3);
			setState(61);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HeaderContext extends ParserRuleContext {
		public MenuContext menu() {
			return getRuleContext(MenuContext.class,0);
		}
		public List<FuncoesContext> funcoes() {
			return getRuleContexts(FuncoesContext.class);
		}
		public FuncoesContext funcoes(int i) {
			return getRuleContext(FuncoesContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__4);
			setState(64);
			match(T__1);
			setState(65);
			match(T__2);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(66);
				menu();
				}
			}

			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1037312L) != 0)) {
				{
				{
				setState(69);
				funcoes();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CorpoContext extends ParserRuleContext {
		public List<FuncoesContext> funcoes() {
			return getRuleContexts(FuncoesContext.class);
		}
		public FuncoesContext funcoes(int i) {
			return getRuleContext(FuncoesContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__5);
			setState(78);
			match(T__1);
			setState(79);
			match(T__2);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1037312L) != 0)) {
				{
				{
				setState(80);
				funcoes();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PernasContext extends ParserRuleContext {
		public List<Pequenas_ocasioesContext> pequenas_ocasioes() {
			return getRuleContexts(Pequenas_ocasioesContext.class);
		}
		public Pequenas_ocasioesContext pequenas_ocasioes(int i) {
			return getRuleContext(Pequenas_ocasioesContext.class,i);
		}
		public PernasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pernas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterPernas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitPernas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitPernas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PernasContext pernas() throws RecognitionException {
		PernasContext _localctx = new PernasContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pernas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__6);
			setState(89);
			match(T__1);
			setState(90);
			match(T__2);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 459264L) != 0)) {
				{
				{
				setState(91);
				pequenas_ocasioes();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncoesContext extends ParserRuleContext {
		public SeloContext selo() {
			return getRuleContext(SeloContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public Valor_textoContext valor_texto() {
			return getRuleContext(Valor_textoContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public FormularioContext formulario() {
			return getRuleContext(FormularioContext.class,0);
		}
		public PularlinhaContext pularlinha() {
			return getRuleContext(PularlinhaContext.class,0);
		}
		public FuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterFuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitFuncoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitFuncoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncoesContext funcoes() throws RecognitionException {
		FuncoesContext _localctx = new FuncoesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(99);
				selo();
				}
				break;
			case 2:
				{
				setState(100);
				image();
				}
				break;
			case 3:
				{
				setState(101);
				texto();
				}
				break;
			case 4:
				{
				setState(102);
				valor_texto();
				}
				break;
			case 5:
				{
				setState(103);
				link();
				}
				break;
			case 6:
				{
				setState(104);
				formulario();
				}
				break;
			case 7:
				{
				setState(105);
				link();
				}
				break;
			case 8:
				{
				setState(106);
				pularlinha();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pequenas_ocasioesContext extends ParserRuleContext {
		public SeloContext selo() {
			return getRuleContext(SeloContext.class,0);
		}
		public BotaoContext botao() {
			return getRuleContext(BotaoContext.class,0);
		}
		public ParagrafoContext paragrafo() {
			return getRuleContext(ParagrafoContext.class,0);
		}
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public Pequenas_ocasioesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pequenas_ocasioes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterPequenas_ocasioes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitPequenas_ocasioes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitPequenas_ocasioes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pequenas_ocasioesContext pequenas_ocasioes() throws RecognitionException {
		Pequenas_ocasioesContext _localctx = new Pequenas_ocasioesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pequenas_ocasioes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				{
				setState(109);
				selo();
				}
				break;
			case T__8:
				{
				setState(110);
				botao();
				}
				break;
			case T__16:
				{
				setState(111);
				paragrafo();
				}
				break;
			case T__15:
				{
				setState(112);
				titulo();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MenuContext extends ParserRuleContext {
		public List<Pequenas_ocasioesContext> pequenas_ocasioes() {
			return getRuleContexts(Pequenas_ocasioesContext.class);
		}
		public Pequenas_ocasioesContext pequenas_ocasioes(int i) {
			return getRuleContext(Pequenas_ocasioesContext.class,i);
		}
		public MenuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterMenu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitMenu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitMenu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenuContext menu() throws RecognitionException {
		MenuContext _localctx = new MenuContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_menu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__7);
			setState(116);
			match(T__1);
			setState(117);
			match(T__2);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 459264L) != 0)) {
				{
				{
				setState(118);
				pequenas_ocasioes();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BotaoContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public TerminalNode VIRGULA() { return getToken(AlgumaParser.VIRGULA, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BotaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_botao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterBotao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitBotao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitBotao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BotaoContext botao() throws RecognitionException {
		BotaoContext _localctx = new BotaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_botao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__8);
			setState(127);
			match(T__1);
			setState(128);
			url();
			setState(129);
			match(VIRGULA);
			setState(130);
			string();
			setState(131);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormularioContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(AlgumaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(AlgumaParser.VIRGULA, i);
		}
		public List<Formulario_entradaContext> formulario_entrada() {
			return getRuleContexts(Formulario_entradaContext.class);
		}
		public Formulario_entradaContext formulario_entrada(int i) {
			return getRuleContext(Formulario_entradaContext.class,i);
		}
		public List<Botao_corpoContext> botao_corpo() {
			return getRuleContexts(Botao_corpoContext.class);
		}
		public Botao_corpoContext botao_corpo(int i) {
			return getRuleContext(Botao_corpoContext.class,i);
		}
		public FormularioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterFormulario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitFormulario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitFormulario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormularioContext formulario() throws RecognitionException {
		FormularioContext _localctx = new FormularioContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formulario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__9);
			setState(134);
			match(T__1);
			setState(135);
			string();
			setState(136);
			match(VIRGULA);
			setState(137);
			string();
			setState(138);
			match(VIRGULA);
			setState(139);
			string();
			setState(140);
			match(T__2);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) {
				{
				{
				setState(141);
				formulario_entrada();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(147);
				botao_corpo();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Formulario_entradaContext extends ParserRuleContext {
		public Entrada_textoContext entrada_texto() {
			return getRuleContext(Entrada_textoContext.class,0);
		}
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public PularlinhaContext pularlinha() {
			return getRuleContext(PularlinhaContext.class,0);
		}
		public Formulario_entradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulario_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterFormulario_entrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitFormulario_entrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitFormulario_entrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formulario_entradaContext formulario_entrada() throws RecognitionException {
		Formulario_entradaContext _localctx = new Formulario_entradaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formulario_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(155);
				entrada_texto();
				}
				break;
			case T__12:
				{
				setState(156);
				entrada();
				}
				break;
			case T__11:
				{
				setState(157);
				pularlinha();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Entrada_textoContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Entrada_textoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterEntrada_texto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitEntrada_texto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitEntrada_texto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entrada_textoContext entrada_texto() throws RecognitionException {
		Entrada_textoContext _localctx = new Entrada_textoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_entrada_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__10);
			setState(161);
			match(T__1);
			setState(162);
			string();
			setState(163);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PularlinhaContext extends ParserRuleContext {
		public PularlinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pularlinha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterPularlinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitPularlinha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitPularlinha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PularlinhaContext pularlinha() throws RecognitionException {
		PularlinhaContext _localctx = new PularlinhaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pularlinha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__11);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Botao_corpoContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Botao_corpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_botao_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterBotao_corpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitBotao_corpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitBotao_corpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Botao_corpoContext botao_corpo() throws RecognitionException {
		Botao_corpoContext _localctx = new Botao_corpoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_botao_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__8);
			setState(168);
			match(T__1);
			setState(169);
			string();
			setState(170);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EntradaContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode VIRGULA() { return getToken(AlgumaParser.VIRGULA, 0); }
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitEntrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__12);
			setState(173);
			match(T__1);
			setState(174);
			string();
			setState(175);
			match(VIRGULA);
			setState(176);
			string();
			setState(177);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LinkContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public TerminalNode VIRGULA() { return getToken(AlgumaParser.VIRGULA, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitLink(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitLink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__13);
			setState(180);
			match(T__1);
			setState(181);
			url();
			setState(182);
			match(VIRGULA);
			setState(183);
			string();
			setState(184);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextoContext extends ParserRuleContext {
		public List<Valor_textoContext> valor_texto() {
			return getRuleContexts(Valor_textoContext.class);
		}
		public Valor_textoContext valor_texto(int i) {
			return getRuleContext(Valor_textoContext.class,i);
		}
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_texto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__14);
			setState(187);
			match(T__1);
			setState(188);
			match(T__2);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 200704L) != 0)) {
				{
				{
				setState(189);
				valor_texto();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Valor_textoContext extends ParserRuleContext {
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public ParagrafoContext paragrafo() {
			return getRuleContext(ParagrafoContext.class,0);
		}
		public PularlinhaContext pularlinha() {
			return getRuleContext(PularlinhaContext.class,0);
		}
		public Valor_textoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterValor_texto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitValor_texto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitValor_texto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_textoContext valor_texto() throws RecognitionException {
		Valor_textoContext _localctx = new Valor_textoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valor_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				{
				setState(197);
				titulo();
				}
				break;
			case T__16:
				{
				setState(198);
				paragrafo();
				}
				break;
			case T__11:
				{
				setState(199);
				pularlinha();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TituloContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTitulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTitulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__15);
			setState(203);
			match(T__1);
			setState(204);
			string();
			setState(205);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParagrafoContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ParagrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragrafo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParagrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParagrafo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParagrafo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParagrafoContext paragrafo() throws RecognitionException {
		ParagrafoContext _localctx = new ParagrafoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_paragrafo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__16);
			setState(208);
			match(T__1);
			setState(209);
			string();
			setState(210);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(AlgumaParser.CADEIA, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(CADEIA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SeloContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public TerminalNode VIRGULA() { return getToken(AlgumaParser.VIRGULA, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public SeloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterSelo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitSelo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitSelo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeloContext selo() throws RecognitionException {
		SeloContext _localctx = new SeloContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_selo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__17);
			setState(215);
			match(T__1);
			setState(216);
			url();
			setState(217);
			match(VIRGULA);
			setState(218);
			string();
			setState(219);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImageContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(AlgumaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(AlgumaParser.VIRGULA, i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__18);
			setState(222);
			match(T__1);
			setState(223);
			url();
			setState(224);
			match(VIRGULA);
			setState(225);
			string();
			setState(226);
			match(VIRGULA);
			setState(227);
			string();
			setState(228);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UrlContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(AlgumaParser.CADEIA, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(CADEIA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TemaContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(AlgumaParser.CADEIA, 0); }
		public TemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemaContext tema() throws RecognitionException {
		TemaContext _localctx = new TemaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(CADEIA);
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
		"\u0004\u0001!\u00eb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u00005\b\u0000\u0001\u0000\u0003\u0000"+
		"8\b\u0000\u0001\u0000\u0003\u0000;\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001D\b"+
		"\u0001\u0001\u0001\u0005\u0001G\b\u0001\n\u0001\f\u0001J\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002R\b\u0002\n\u0002\f\u0002U\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003]\b\u0003\n\u0003"+
		"\f\u0003`\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004l\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005r\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006x\b\u0006\n\u0006\f\u0006{\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0005\b\u008f\b\b\n\b\f\b\u0092\t\b\u0001\b\u0005\b\u0095\b\b"+
		"\n\b\f\b\u0098\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u009f"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00bf\b\u000f\n\u000f\f\u000f\u00c2\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c9\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.\u0000\u0000\u00eb\u00000\u0001\u0000\u0000\u0000\u0002?\u0001\u0000"+
		"\u0000\u0000\u0004M\u0001\u0000\u0000\u0000\u0006X\u0001\u0000\u0000\u0000"+
		"\bk\u0001\u0000\u0000\u0000\nq\u0001\u0000\u0000\u0000\fs\u0001\u0000"+
		"\u0000\u0000\u000e~\u0001\u0000\u0000\u0000\u0010\u0085\u0001\u0000\u0000"+
		"\u0000\u0012\u009e\u0001\u0000\u0000\u0000\u0014\u00a0\u0001\u0000\u0000"+
		"\u0000\u0016\u00a5\u0001\u0000\u0000\u0000\u0018\u00a7\u0001\u0000\u0000"+
		"\u0000\u001a\u00ac\u0001\u0000\u0000\u0000\u001c\u00b3\u0001\u0000\u0000"+
		"\u0000\u001e\u00ba\u0001\u0000\u0000\u0000 \u00c8\u0001\u0000\u0000\u0000"+
		"\"\u00ca\u0001\u0000\u0000\u0000$\u00cf\u0001\u0000\u0000\u0000&\u00d4"+
		"\u0001\u0000\u0000\u0000(\u00d6\u0001\u0000\u0000\u0000*\u00dd\u0001\u0000"+
		"\u0000\u0000,\u00e6\u0001\u0000\u0000\u0000.\u00e8\u0001\u0000\u0000\u0000"+
		"01\u0005\u0001\u0000\u000012\u0005\u0002\u0000\u000024\u0005\u0003\u0000"+
		"\u000035\u0003\u0002\u0001\u000043\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000057\u0001\u0000\u0000\u000068\u0003\u0004\u0002\u000076\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u0000"+
		"9;\u0003\u0006\u0003\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;<\u0001\u0000\u0000\u0000<=\u0005\u0004\u0000\u0000=>\u0005\u0000"+
		"\u0000\u0001>\u0001\u0001\u0000\u0000\u0000?@\u0005\u0005\u0000\u0000"+
		"@A\u0005\u0002\u0000\u0000AC\u0005\u0003\u0000\u0000BD\u0003\f\u0006\u0000"+
		"CB\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DH\u0001\u0000\u0000"+
		"\u0000EG\u0003\b\u0004\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0005\u0004\u0000\u0000L\u0003"+
		"\u0001\u0000\u0000\u0000MN\u0005\u0006\u0000\u0000NO\u0005\u0002\u0000"+
		"\u0000OS\u0005\u0003\u0000\u0000PR\u0003\b\u0004\u0000QP\u0001\u0000\u0000"+
		"\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0005"+
		"\u0004\u0000\u0000W\u0005\u0001\u0000\u0000\u0000XY\u0005\u0007\u0000"+
		"\u0000YZ\u0005\u0002\u0000\u0000Z^\u0005\u0003\u0000\u0000[]\u0003\n\u0005"+
		"\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000ab\u0005\u0004\u0000\u0000b\u0007\u0001\u0000\u0000"+
		"\u0000cl\u0003(\u0014\u0000dl\u0003*\u0015\u0000el\u0003\u001e\u000f\u0000"+
		"fl\u0003 \u0010\u0000gl\u0003\u001c\u000e\u0000hl\u0003\u0010\b\u0000"+
		"il\u0003\u001c\u000e\u0000jl\u0003\u0016\u000b\u0000kc\u0001\u0000\u0000"+
		"\u0000kd\u0001\u0000\u0000\u0000ke\u0001\u0000\u0000\u0000kf\u0001\u0000"+
		"\u0000\u0000kg\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000l\t\u0001\u0000\u0000\u0000"+
		"mr\u0003(\u0014\u0000nr\u0003\u000e\u0007\u0000or\u0003$\u0012\u0000p"+
		"r\u0003\"\u0011\u0000qm\u0001\u0000\u0000\u0000qn\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r\u000b\u0001\u0000"+
		"\u0000\u0000st\u0005\b\u0000\u0000tu\u0005\u0002\u0000\u0000uy\u0005\u0003"+
		"\u0000\u0000vx\u0003\n\u0005\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u0004\u0000\u0000"+
		"}\r\u0001\u0000\u0000\u0000~\u007f\u0005\t\u0000\u0000\u007f\u0080\u0005"+
		"\u0002\u0000\u0000\u0080\u0081\u0003,\u0016\u0000\u0081\u0082\u0005\u0019"+
		"\u0000\u0000\u0082\u0083\u0003&\u0013\u0000\u0083\u0084\u0005\u0003\u0000"+
		"\u0000\u0084\u000f\u0001\u0000\u0000\u0000\u0085\u0086\u0005\n\u0000\u0000"+
		"\u0086\u0087\u0005\u0002\u0000\u0000\u0087\u0088\u0003&\u0013\u0000\u0088"+
		"\u0089\u0005\u0019\u0000\u0000\u0089\u008a\u0003&\u0013\u0000\u008a\u008b"+
		"\u0005\u0019\u0000\u0000\u008b\u008c\u0003&\u0013\u0000\u008c\u0090\u0005"+
		"\u0003\u0000\u0000\u008d\u008f\u0003\u0012\t\u0000\u008e\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0096\u0001\u0000"+
		"\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0095\u0003\u0018"+
		"\f\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000"+
		"\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005\u0004\u0000\u0000\u009a\u0011\u0001\u0000\u0000"+
		"\u0000\u009b\u009f\u0003\u0014\n\u0000\u009c\u009f\u0003\u001a\r\u0000"+
		"\u009d\u009f\u0003\u0016\u000b\u0000\u009e\u009b\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u0013\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u000b\u0000\u0000"+
		"\u00a1\u00a2\u0005\u0002\u0000\u0000\u00a2\u00a3\u0003&\u0013\u0000\u00a3"+
		"\u00a4\u0005\u0003\u0000\u0000\u00a4\u0015\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005\f\u0000\u0000\u00a6\u0017\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005\t\u0000\u0000\u00a8\u00a9\u0005\u0002\u0000\u0000\u00a9\u00aa\u0003"+
		"&\u0013\u0000\u00aa\u00ab\u0005\u0003\u0000\u0000\u00ab\u0019\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005\r\u0000\u0000\u00ad\u00ae\u0005\u0002\u0000"+
		"\u0000\u00ae\u00af\u0003&\u0013\u0000\u00af\u00b0\u0005\u0019\u0000\u0000"+
		"\u00b0\u00b1\u0003&\u0013\u0000\u00b1\u00b2\u0005\u0003\u0000\u0000\u00b2"+
		"\u001b\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u000e\u0000\u0000\u00b4"+
		"\u00b5\u0005\u0002\u0000\u0000\u00b5\u00b6\u0003,\u0016\u0000\u00b6\u00b7"+
		"\u0005\u0019\u0000\u0000\u00b7\u00b8\u0003&\u0013\u0000\u00b8\u00b9\u0005"+
		"\u0003\u0000\u0000\u00b9\u001d\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005"+
		"\u000f\u0000\u0000\u00bb\u00bc\u0005\u0002\u0000\u0000\u00bc\u00c0\u0005"+
		"\u0003\u0000\u0000\u00bd\u00bf\u0003 \u0010\u0000\u00be\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0004"+
		"\u0000\u0000\u00c4\u001f\u0001\u0000\u0000\u0000\u00c5\u00c9\u0003\"\u0011"+
		"\u0000\u00c6\u00c9\u0003$\u0012\u0000\u00c7\u00c9\u0003\u0016\u000b\u0000"+
		"\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9!\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0010\u0000\u0000\u00cb\u00cc\u0005\u0002\u0000\u0000\u00cc"+
		"\u00cd\u0003&\u0013\u0000\u00cd\u00ce\u0005\u0003\u0000\u0000\u00ce#\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0005\u0011\u0000\u0000\u00d0\u00d1\u0005"+
		"\u0002\u0000\u0000\u00d1\u00d2\u0003&\u0013\u0000\u00d2\u00d3\u0005\u0003"+
		"\u0000\u0000\u00d3%\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u001a\u0000"+
		"\u0000\u00d5\'\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0012\u0000\u0000"+
		"\u00d7\u00d8\u0005\u0002\u0000\u0000\u00d8\u00d9\u0003,\u0016\u0000\u00d9"+
		"\u00da\u0005\u0019\u0000\u0000\u00da\u00db\u0003&\u0013\u0000\u00db\u00dc"+
		"\u0005\u0003\u0000\u0000\u00dc)\u0001\u0000\u0000\u0000\u00dd\u00de\u0005"+
		"\u0013\u0000\u0000\u00de\u00df\u0005\u0002\u0000\u0000\u00df\u00e0\u0003"+
		",\u0016\u0000\u00e0\u00e1\u0005\u0019\u0000\u0000\u00e1\u00e2\u0003&\u0013"+
		"\u0000\u00e2\u00e3\u0005\u0019\u0000\u0000\u00e3\u00e4\u0003&\u0013\u0000"+
		"\u00e4\u00e5\u0005\u0003\u0000\u0000\u00e5+\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0005\u001a\u0000\u0000\u00e7-\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0005\u001a\u0000\u0000\u00e9/\u0001\u0000\u0000\u0000\u000f47:CHS^k"+
		"qy\u0090\u0096\u009e\u00c0\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}