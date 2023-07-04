// Generated from br/iff/edu/compiladores/algumalexer/Alguma.g4 by ANTLR 4.13.0
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
	 * Visit a parse tree produced by {@link AlgumaParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(AlgumaParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#menu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenu(AlgumaParser.MenuContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#funcoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncoes(AlgumaParser.FuncoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto(AlgumaParser.TextoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#valor_texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_texto(AlgumaParser.Valor_textoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#titulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitulo(AlgumaParser.TituloContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#paragrafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagrafo(AlgumaParser.ParagrafoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(AlgumaParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#selo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelo(AlgumaParser.SeloContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(AlgumaParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(AlgumaParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#tema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTema(AlgumaParser.TemaContext ctx);
}