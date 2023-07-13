/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.iff.edu.compiladores.algumalexer;

import br.iff.edu.compiladores.algumalexer.AlgumaParser.PageContext;

/**
 *
 * @author ayrtonborges
 */
public class Gerador extends AlgumaBaseVisitor<Void> {

    StringBuilder saida;

    public Gerador() {
        this.saida = new StringBuilder();
    }

    @Override
    public Void visitPage(PageContext ctx) {
        saida.append("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "    <style>\n" +
                    "        @import url('https://fonts.googleapis.com/css2?family=Roboto+Mono:wght@300&display=swap');\n" +
                    "\n" +
                    "        body {\n" +
                    "            background: linear-gradient(to right, #fbc2eb, #a6c1ee);\n" +
                    "            font-family: 'Roboto Mono', monospace;\n" +
                    "            color: #392D3D;\n" +
                    "            margin: 0;\n" +
                    "            padding: 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        .navbar {\n" +
                    "            background-color: #392D3D;\n" +
                    "            overflow: hidden;\n" +
                    "        }\n" +
                    "\n" +
                    "        .navbar a {\n" +
                    "            float: left;\n" +
                    "            display: block;\n" +
                    "            color: #f2f2f2;\n" +
                    "            text-align: center;\n" +
                    "            padding: 14px 16px;\n" +
                    "            text-decoration: none;\n" +
                    "        }\n" +
                    "\n" +
                    "        .navbar a:hover {\n" +
                    "            background-color: #ddd;\n" +
                    "            color: black;\n" +
                    "        }\n" +
                    "\n" +
                    "        footer {\n" +
                    "            position: fixed;\n" +
                    "            left: 0;\n" +
                    "            bottom: 0;\n" +
                    "            width: 100%;\n" +
                    "            background-color: #392D3D;\n" +
                    "            color: white;\n" +
                    "            text-align: center;\n" +
                    "            padding: 10px 0;\n" +
                    "        }\n" +
                    "\n" +
                    "        .content {\n" +
                    "            margin: 50px;\n" +
                    "            text-align: center;\n" +
                    "            font-size: 1.5em;\n" +
                    "        }\n" +
                    "    </style>\n" +
                    "</head>\n" +
                    "<body>");
        visitHeader(ctx.header());
        visitCorpo(ctx.corpo());
        visitPernas(ctx.pernas());

        
        saida.append("    </body>\n"+
                "</html>\n");
        System.out.println("Compilação terminada!");
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitHeader(AlgumaParser.HeaderContext ctx) {
        if(ctx != null)
        {
            saida.append("<div class=\"navbar\">\n");
            for (int i = 0; i < ctx.pequenas_ocasioes().size(); i++) {
                visitPequenas_ocasioes(ctx.pequenas_ocasioes(i));
            }
            saida.append("</div>\n");
        }
        
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitMenu(AlgumaParser.MenuContext ctx) {
        saida.append("<nav> </nav>\n");
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitCorpo(AlgumaParser.CorpoContext ctx) {
        if(ctx != null)
        {
             saida.append("<main>\n");
            for (int i = 0; i < ctx.funcoes().size(); i++) {
                visitFuncoes(ctx.funcoes(i));
            }
            saida.append("</main>\n");
        }
       
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitPernas(AlgumaParser.PernasContext ctx) {
        if(ctx != null)
        {
            saida.append("<footer>");
            for (int i = 0; i < ctx.pequenas_ocasioes().size(); i++) {
                visitPequenas_ocasioes(ctx.pequenas_ocasioes(i));
            }
            saida.append("</footer>\n");
        }
        
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitTexto(AlgumaParser.TextoContext ctx) {
        saida.append("<article>");
        for (int i = 0; i < ctx.valor_texto().size(); i++) {
            visitValor_texto(ctx.valor_texto(i));
        }
        saida.append("</article>\n");
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitTitulo(AlgumaParser.TituloContext ctx) {
        saida.append("<h1>" + ctx.string().getText() + "</h1>\n");
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitParagrafo(AlgumaParser.ParagrafoContext ctx) {
        saida.append("<p>" + ctx.string().getText() + "</p>\n");
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitSelo(AlgumaParser.SeloContext ctx) {
        String entrada = "<img src=" + ctx.url().getText() + " width=\"45\" height=\"45\" style=\"float:";
        String tempPos = ctx.POSICAO().getText();
        switch (tempPos) {
            case "1":
                entrada += "right;\">\n";
                break;
            case "2":
                entrada += "left;\">\n";
                break;
            default:
                entrada += ">";
        }
        saida.append(entrada);
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitImage(AlgumaParser.ImageContext ctx) {
        String entrada = "<img src=\"" + ctx.url().getText();
        String tam = ctx.TAMANHO().getText();
        switch (tam) {
            case "p":
                entrada += "height=\"100\" width=\"100\" style=\"display: block; margin: auto;\">\n";
                break;

            case "m":
                entrada += "height=\"250\" width=\"250\" style=\"display: block; margin: auto;\">\n";
                break;

            case "g":
                entrada += "height=\"400\" width=\"400\" style=\"display: block; margin: auto;\">\n";
                break;

            default:
                entrada += ">";
        }

        saida.append(entrada);
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
