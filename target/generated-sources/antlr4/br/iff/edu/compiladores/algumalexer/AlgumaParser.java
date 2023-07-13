// Generated from br\iff\edu\compiladores\algumalexer\Alguma.g4 by ANTLR 4.13.0
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, PALAVRAS_CHAVES=15, TAMANHO=16, 
		POSICAO=17, IDENT=18, DELIM=19, VIRGULA=20, CADEIA=21, NUM_INT=22, NUM_REAL=23, 
		COMENTARIO=24, WS=25, CADEIA_ERR=26, COMENTARIO_ERR=27, ERRO=28;
	public static final int
		RULE_page = 0, RULE_header = 1, RULE_menu = 2, RULE_corpo = 3, RULE_pernas = 4, 
		RULE_funcoes = 5, RULE_pequenas_ocasioes = 6, RULE_botao = 7, RULE_texto = 8, 
		RULE_valor_texto = 9, RULE_titulo = 10, RULE_paragrafo = 11, RULE_string = 12, 
		RULE_selo = 13, RULE_image = 14, RULE_url = 15, RULE_tema = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"page", "header", "menu", "corpo", "pernas", "funcoes", "pequenas_ocasioes", 
			"botao", "texto", "valor_texto", "titulo", "paragrafo", "string", "selo", 
			"image", "url", "tema"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CRIARPAGINA'", "'('", "')'", "'FIM'", "'CABECA'", "'MENU'", "'CORPO'", 
			"'PERNAS'", "'BOTAO'", "'TEXTO'", "'TITULO'", "'PARAGRAFO'", "'SELO'", 
			"'IMAGE'", null, null, null, null, "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "PALAVRAS_CHAVES", "TAMANHO", "POSICAO", "IDENT", "DELIM", 
			"VIRGULA", "CADEIA", "NUM_INT", "NUM_REAL", "COMENTARIO", "WS", "CADEIA_ERR", 
			"COMENTARIO_ERR", "ERRO"
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
			setState(34);
			match(T__0);
			setState(35);
			match(T__1);
			setState(36);
			match(T__2);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(37);
				header();
				}
			}

			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(40);
				corpo();
				}
			}

			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(43);
				pernas();
				}
			}

			setState(46);
			match(T__3);
			setState(47);
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
		public List<Pequenas_ocasioesContext> pequenas_ocasioes() {
			return getRuleContexts(Pequenas_ocasioesContext.class);
		}
		public Pequenas_ocasioesContext pequenas_ocasioes(int i) {
			return getRuleContext(Pequenas_ocasioesContext.class,i);
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
			setState(49);
			match(T__4);
			setState(50);
			match(T__1);
			setState(51);
			match(T__2);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12800L) != 0)) {
				{
				{
				setState(52);
				pequenas_ocasioes();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
	public static class MenuContext extends ParserRuleContext {
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
		enterRule(_localctx, 4, RULE_menu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__5);
			setState(61);
			match(T__1);
			setState(62);
			match(T__2);
			setState(63);
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
		enterRule(_localctx, 6, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__6);
			setState(66);
			match(T__1);
			setState(67);
			match(T__2);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0)) {
				{
				{
				setState(68);
				funcoes();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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
		enterRule(_localctx, 8, RULE_pernas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__7);
			setState(77);
			match(T__1);
			setState(78);
			match(T__2);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12800L) != 0)) {
				{
				{
				setState(79);
				pequenas_ocasioes();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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
		enterRule(_localctx, 10, RULE_funcoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(87);
				selo();
				}
				break;
			case T__13:
				{
				setState(88);
				image();
				}
				break;
			case T__9:
				{
				setState(89);
				texto();
				}
				break;
			case T__10:
			case T__11:
				{
				setState(90);
				valor_texto();
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
		enterRule(_localctx, 12, RULE_pequenas_ocasioes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(93);
				selo();
				}
				break;
			case T__8:
				{
				setState(94);
				botao();
				}
				break;
			case T__11:
				{
				setState(95);
				paragrafo();
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
			setState(98);
			match(T__8);
			setState(99);
			match(T__1);
			setState(100);
			url();
			setState(101);
			match(VIRGULA);
			setState(102);
			string();
			setState(103);
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
		enterRule(_localctx, 16, RULE_texto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__9);
			setState(106);
			match(T__1);
			setState(107);
			match(T__2);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				{
				setState(108);
				valor_texto();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
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
		enterRule(_localctx, 18, RULE_valor_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(116);
				titulo();
				}
				break;
			case T__11:
				{
				setState(117);
				paragrafo();
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
		enterRule(_localctx, 20, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__10);
			setState(121);
			match(T__1);
			setState(122);
			string();
			setState(123);
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
		enterRule(_localctx, 22, RULE_paragrafo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__11);
			setState(126);
			match(T__1);
			setState(127);
			string();
			setState(128);
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
		enterRule(_localctx, 24, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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
		public TerminalNode POSICAO() { return getToken(AlgumaParser.POSICAO, 0); }
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
		enterRule(_localctx, 26, RULE_selo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__12);
			setState(133);
			match(T__1);
			setState(134);
			url();
			setState(135);
			match(VIRGULA);
			setState(136);
			match(POSICAO);
			setState(137);
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
		public TerminalNode VIRGULA() { return getToken(AlgumaParser.VIRGULA, 0); }
		public TerminalNode TAMANHO() { return getToken(AlgumaParser.TAMANHO, 0); }
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
		enterRule(_localctx, 28, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__13);
			setState(140);
			match(T__1);
			setState(141);
			url();
			setState(142);
			match(VIRGULA);
			setState(143);
			match(TAMANHO);
			setState(144);
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
		enterRule(_localctx, 30, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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
		enterRule(_localctx, 32, RULE_tema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
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
		"\u0004\u0001\u001c\u0097\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\'\b\u0000\u0001\u0000\u0003\u0000*\b\u0000\u0001\u0000"+
		"\u0003\u0000-\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00016\b\u0001\n\u0001\f\u0001"+
		"9\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003F\b\u0003\n\u0003\f\u0003I\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004Q\b\u0004"+
		"\n\u0004\f\u0004T\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\\\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006a\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\bn\b\b\n\b\f\bq\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003"+
		"\tw\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000"+
		"\u0000\u0092\u0000\"\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000"+
		"\u0000\u0004<\u0001\u0000\u0000\u0000\u0006A\u0001\u0000\u0000\u0000\b"+
		"L\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000"+
		"\u0000\u000eb\u0001\u0000\u0000\u0000\u0010i\u0001\u0000\u0000\u0000\u0012"+
		"v\u0001\u0000\u0000\u0000\u0014x\u0001\u0000\u0000\u0000\u0016}\u0001"+
		"\u0000\u0000\u0000\u0018\u0082\u0001\u0000\u0000\u0000\u001a\u0084\u0001"+
		"\u0000\u0000\u0000\u001c\u008b\u0001\u0000\u0000\u0000\u001e\u0092\u0001"+
		"\u0000\u0000\u0000 \u0094\u0001\u0000\u0000\u0000\"#\u0005\u0001\u0000"+
		"\u0000#$\u0005\u0002\u0000\u0000$&\u0005\u0003\u0000\u0000%\'\u0003\u0002"+
		"\u0001\u0000&%\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0001"+
		"\u0000\u0000\u0000(*\u0003\u0006\u0003\u0000)(\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+-\u0003\b\u0004\u0000"+
		",+\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000./\u0005\u0004\u0000\u0000/0\u0005\u0000\u0000\u00010\u0001\u0001"+
		"\u0000\u0000\u000012\u0005\u0005\u0000\u000023\u0005\u0002\u0000\u0000"+
		"37\u0005\u0003\u0000\u000046\u0003\f\u0006\u000054\u0001\u0000\u0000\u0000"+
		"69\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0005\u0004"+
		"\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<=\u0005\u0006\u0000\u0000"+
		"=>\u0005\u0002\u0000\u0000>?\u0005\u0003\u0000\u0000?@\u0005\u0004\u0000"+
		"\u0000@\u0005\u0001\u0000\u0000\u0000AB\u0005\u0007\u0000\u0000BC\u0005"+
		"\u0002\u0000\u0000CG\u0005\u0003\u0000\u0000DF\u0003\n\u0005\u0000ED\u0001"+
		"\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000JK\u0005\u0004\u0000\u0000K\u0007\u0001\u0000\u0000\u0000LM\u0005"+
		"\b\u0000\u0000MN\u0005\u0002\u0000\u0000NR\u0005\u0003\u0000\u0000OQ\u0003"+
		"\f\u0006\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000UV\u0005\u0004\u0000\u0000V\t\u0001\u0000\u0000"+
		"\u0000W\\\u0003\u001a\r\u0000X\\\u0003\u001c\u000e\u0000Y\\\u0003\u0010"+
		"\b\u0000Z\\\u0003\u0012\t\u0000[W\u0001\u0000\u0000\u0000[X\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\\u000b"+
		"\u0001\u0000\u0000\u0000]a\u0003\u001a\r\u0000^a\u0003\u000e\u0007\u0000"+
		"_a\u0003\u0016\u000b\u0000`]\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000a\r\u0001\u0000\u0000\u0000bc\u0005\t"+
		"\u0000\u0000cd\u0005\u0002\u0000\u0000de\u0003\u001e\u000f\u0000ef\u0005"+
		"\u0014\u0000\u0000fg\u0003\u0018\f\u0000gh\u0005\u0003\u0000\u0000h\u000f"+
		"\u0001\u0000\u0000\u0000ij\u0005\n\u0000\u0000jk\u0005\u0002\u0000\u0000"+
		"ko\u0005\u0003\u0000\u0000ln\u0003\u0012\t\u0000ml\u0001\u0000\u0000\u0000"+
		"nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u0005\u0004"+
		"\u0000\u0000s\u0011\u0001\u0000\u0000\u0000tw\u0003\u0014\n\u0000uw\u0003"+
		"\u0016\u000b\u0000vt\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000"+
		"w\u0013\u0001\u0000\u0000\u0000xy\u0005\u000b\u0000\u0000yz\u0005\u0002"+
		"\u0000\u0000z{\u0003\u0018\f\u0000{|\u0005\u0003\u0000\u0000|\u0015\u0001"+
		"\u0000\u0000\u0000}~\u0005\f\u0000\u0000~\u007f\u0005\u0002\u0000\u0000"+
		"\u007f\u0080\u0003\u0018\f\u0000\u0080\u0081\u0005\u0003\u0000\u0000\u0081"+
		"\u0017\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0015\u0000\u0000\u0083"+
		"\u0019\u0001\u0000\u0000\u0000\u0084\u0085\u0005\r\u0000\u0000\u0085\u0086"+
		"\u0005\u0002\u0000\u0000\u0086\u0087\u0003\u001e\u000f\u0000\u0087\u0088"+
		"\u0005\u0014\u0000\u0000\u0088\u0089\u0005\u0011\u0000\u0000\u0089\u008a"+
		"\u0005\u0003\u0000\u0000\u008a\u001b\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005\u000e\u0000\u0000\u008c\u008d\u0005\u0002\u0000\u0000\u008d\u008e"+
		"\u0003\u001e\u000f\u0000\u008e\u008f\u0005\u0014\u0000\u0000\u008f\u0090"+
		"\u0005\u0010\u0000\u0000\u0090\u0091\u0005\u0003\u0000\u0000\u0091\u001d"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0015\u0000\u0000\u0093\u001f"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0015\u0000\u0000\u0095!\u0001"+
		"\u0000\u0000\u0000\n&),7GR[`ov";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}