// Generated from br\iff\edu\compiladores\algumalexer\Alguma.g4 by ANTLR 4.13.0
package br.iff.edu.compiladores.algumalexer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlgumaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlgumaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(AlgumaParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#bloco_pagina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco_pagina(AlgumaParser.Bloco_paginaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(AlgumaParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(AlgumaParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#pernas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPernas(AlgumaParser.PernasContext ctx);
}