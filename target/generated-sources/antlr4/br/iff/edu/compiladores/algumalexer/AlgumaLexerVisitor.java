// Generated from br\iff\edu\compiladores\algumalexer\AlgumaLexer.g4 by ANTLR 4.13.0
package br.iff.edu.compiladores.algumalexer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlgumaLexerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlgumaLexerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlgumaLexerParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(AlgumaLexerParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaLexerParser#bloco_pagina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco_pagina(AlgumaLexerParser.Bloco_paginaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaLexerParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(AlgumaLexerParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaLexerParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(AlgumaLexerParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaLexerParser#pernas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPernas(AlgumaLexerParser.PernasContext ctx);
}