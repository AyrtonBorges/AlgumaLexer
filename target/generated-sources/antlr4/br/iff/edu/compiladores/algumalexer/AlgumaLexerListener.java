// Generated from br\iff\edu\compiladores\algumalexer\AlgumaLexer.g4 by ANTLR 4.13.0
package br.iff.edu.compiladores.algumalexer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaLexerParser}.
 */
public interface AlgumaLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(AlgumaLexerParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(AlgumaLexerParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#bloco_pagina}.
	 * @param ctx the parse tree
	 */
	void enterBloco_pagina(AlgumaLexerParser.Bloco_paginaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#bloco_pagina}.
	 * @param ctx the parse tree
	 */
	void exitBloco_pagina(AlgumaLexerParser.Bloco_paginaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(AlgumaLexerParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(AlgumaLexerParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(AlgumaLexerParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(AlgumaLexerParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaLexerParser#pernas}.
	 * @param ctx the parse tree
	 */
	void enterPernas(AlgumaLexerParser.PernasContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaLexerParser#pernas}.
	 * @param ctx the parse tree
	 */
	void exitPernas(AlgumaLexerParser.PernasContext ctx);
}