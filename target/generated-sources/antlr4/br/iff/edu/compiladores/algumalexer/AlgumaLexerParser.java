// Generated from br\iff\edu\compiladores\algumalexer\AlgumaLexer.g4 by ANTLR 4.13.0
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
public class AlgumaLexerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NUMINT=11, NUMREAL=12, VARIAVEL=13, CADEIA=14, OP_ARIT1=15, OP_ARIT2=16, 
		OP_BOOL=17, OP_REL=18, COMENTARIO=19, WS=20;
	public static final int
		RULE_page = 0, RULE_bloco_pagina = 1, RULE_header = 2, RULE_corpo = 3, 
		RULE_pernas = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"page", "bloco_pagina", "header", "corpo", "pernas"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CRIARPAGINA('", "')'", "'FIM_PAGINA'", "'CABECA'", "'('", "'FIM_CABECA'", 
			"'CORPO'", "'FIM_CORPO'", "'PERNAS'", "'FIM_PERNAS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "NUMINT", 
			"NUMREAL", "VARIAVEL", "CADEIA", "OP_ARIT1", "OP_ARIT2", "OP_BOOL", "OP_REL", 
			"COMENTARIO", "WS"
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
	public String getGrammarFileName() { return "AlgumaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlgumaLexerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PageContext extends ParserRuleContext {
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaLexerListener ) ((AlgumaLexerListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaLexerListener ) ((AlgumaLexerListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaLexerVisitor ) return ((AlgumaLexerVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(11);
			match(T__1);
			setState(12);
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
	public static class Bloco_paginaContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public PernasContext pernas() {
			return getRuleContext(PernasContext.class,0);
		}
		public Bloco_paginaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco_pagina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaLexerListener ) ((AlgumaLexerListener)listener).enterBloco_pagina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaLexerListener ) ((AlgumaLexerListener)listener).exitBloco_pagina(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaLexerVisitor ) return ((AlgumaLexerVisitor<? extends T>)visitor).visitBloco_pagina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloco_paginaContext bloco_pagina() throws RecognitionException {
		Bloco_paginaContext _localctx = new Bloco_paginaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco_pagina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			header();
			setState(15);
			corpo();
			setState(16);
			pernas();
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
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaLexerListener ) ((AlgumaLexerListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaLexerListener ) ((AlgumaLexerListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaLexerVisitor ) return ((AlgumaLexerVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__3);
			setState(19);
			match(T__4);
			setState(20);
			match(T__1);
			setState(21);
			match(T__5);
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
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaLexerListener ) ((AlgumaLexerListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaLexerListener ) ((AlgumaLexerListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaLexerVisitor ) return ((AlgumaLexerVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(T__6);
			setState(24);
			match(T__4);
			setState(25);
			match(T__1);
			setState(26);
			match(T__7);
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
		public PernasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pernas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaLexerListener ) ((AlgumaLexerListener)listener).enterPernas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaLexerListener ) ((AlgumaLexerListener)listener).exitPernas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaLexerVisitor ) return ((AlgumaLexerVisitor<? extends T>)visitor).visitPernas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PernasContext pernas() throws RecognitionException {
		PernasContext _localctx = new PernasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pernas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__8);
			setState(29);
			match(T__4);
			setState(30);
			match(T__1);
			setState(31);
			match(T__9);
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
		"\u0004\u0001\u0014\"\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000"+
		"\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000\u001c\u0000\n\u0001"+
		"\u0000\u0000\u0000\u0002\u000e\u0001\u0000\u0000\u0000\u0004\u0012\u0001"+
		"\u0000\u0000\u0000\u0006\u0017\u0001\u0000\u0000\u0000\b\u001c\u0001\u0000"+
		"\u0000\u0000\n\u000b\u0005\u0001\u0000\u0000\u000b\f\u0005\u0002\u0000"+
		"\u0000\f\r\u0005\u0003\u0000\u0000\r\u0001\u0001\u0000\u0000\u0000\u000e"+
		"\u000f\u0003\u0004\u0002\u0000\u000f\u0010\u0003\u0006\u0003\u0000\u0010"+
		"\u0011\u0003\b\u0004\u0000\u0011\u0003\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0005\u0004\u0000\u0000\u0013\u0014\u0005\u0005\u0000\u0000\u0014\u0015"+
		"\u0005\u0002\u0000\u0000\u0015\u0016\u0005\u0006\u0000\u0000\u0016\u0005"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0007\u0000\u0000\u0018\u0019"+
		"\u0005\u0005\u0000\u0000\u0019\u001a\u0005\u0002\u0000\u0000\u001a\u001b"+
		"\u0005\b\u0000\u0000\u001b\u0007\u0001\u0000\u0000\u0000\u001c\u001d\u0005"+
		"\t\u0000\u0000\u001d\u001e\u0005\u0005\u0000\u0000\u001e\u001f\u0005\u0002"+
		"\u0000\u0000\u001f \u0005\n\u0000\u0000 \t\u0001\u0000\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}