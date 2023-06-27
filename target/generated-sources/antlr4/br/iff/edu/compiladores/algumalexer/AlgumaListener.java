// Generated from br\iff\edu\compiladores\algumalexer\Alguma.g4 by ANTLR 4.13.0
package br.iff.edu.compiladores.algumalexer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaParser}.
 */
public interface AlgumaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(AlgumaParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(AlgumaParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#bloco_pagina}.
	 * @param ctx the parse tree
	 */
	void enterBloco_pagina(AlgumaParser.Bloco_paginaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#bloco_pagina}.
	 * @param ctx the parse tree
	 */
	void exitBloco_pagina(AlgumaParser.Bloco_paginaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(AlgumaParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(AlgumaParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(AlgumaParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(AlgumaParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#pernas}.
	 * @param ctx the parse tree
	 */
	void enterPernas(AlgumaParser.PernasContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#pernas}.
	 * @param ctx the parse tree
	 */
	void exitPernas(AlgumaParser.PernasContext ctx);
}