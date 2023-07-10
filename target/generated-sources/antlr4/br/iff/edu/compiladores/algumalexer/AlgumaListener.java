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
	 * Enter a parse tree produced by {@link AlgumaParser#menu}.
	 * @param ctx the parse tree
	 */
	void enterMenu(AlgumaParser.MenuContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#menu}.
	 * @param ctx the parse tree
	 */
	void exitMenu(AlgumaParser.MenuContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void enterFuncoes(AlgumaParser.FuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void exitFuncoes(AlgumaParser.FuncoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterTexto(AlgumaParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitTexto(AlgumaParser.TextoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#valor_texto}.
	 * @param ctx the parse tree
	 */
	void enterValor_texto(AlgumaParser.Valor_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#valor_texto}.
	 * @param ctx the parse tree
	 */
	void exitValor_texto(AlgumaParser.Valor_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#titulo}.
	 * @param ctx the parse tree
	 */
	void enterTitulo(AlgumaParser.TituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#titulo}.
	 * @param ctx the parse tree
	 */
	void exitTitulo(AlgumaParser.TituloContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#paragrafo}.
	 * @param ctx the parse tree
	 */
	void enterParagrafo(AlgumaParser.ParagrafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#paragrafo}.
	 * @param ctx the parse tree
	 */
	void exitParagrafo(AlgumaParser.ParagrafoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(AlgumaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(AlgumaParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#selo}.
	 * @param ctx the parse tree
	 */
	void enterSelo(AlgumaParser.SeloContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#selo}.
	 * @param ctx the parse tree
	 */
	void exitSelo(AlgumaParser.SeloContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(AlgumaParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(AlgumaParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(AlgumaParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(AlgumaParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#tema}.
	 * @param ctx the parse tree
	 */
	void enterTema(AlgumaParser.TemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#tema}.
	 * @param ctx the parse tree
	 */
	void exitTema(AlgumaParser.TemaContext ctx);
}