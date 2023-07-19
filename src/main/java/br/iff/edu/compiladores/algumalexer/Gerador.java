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
                    "   .form-container {\n" +
                    "      width: 300px;\n" +
                    "      margin: 0 auto;\n" +
                    "      padding: 20px;\n" +
                    "      border: 1px solid #ccc;\n" +
                    "      border-radius: 5px;\n" +
                    "      background-color: #f5f5f5;\n" +
                    "    }\n" +
                    "  \n" +
                    "    .form-container label,\n" +
                    "    .form-container input {\n" +
                    "      display: block;\n" +
                    "      margin-bottom: 10px;\n" +
                    "    }\n" +
                    "  \n" +
                    "    .form-container input[type=\"text\"],\n" +
                    "    .form-container input[type=\"number\"] {\n" +
                    "      width: 100%;\n" +
                    "      padding: 5px;\n" +
                    "      border-radius: 3px;\n" +
                    "      border: 1px solid #ccc;\n" +
                    "    }\n" +
                    "  \n" +
                    "    .form-container input[type=\"submit\"] {\n" +
                    "      width: 100%;\n" +
                    "      padding: 10px;\n" +
                    "      border-radius: 3px;\n" +
                    "      border: none;\n" +
                    "      background-color: #4caf50;\n" +
                    "      color: white;\n" +
                    "      cursor: pointer;\n" +
                    "    }" +
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
            saida.append("<div class=\"cabeca\">");
                visitMenu(ctx.menu());
                for(int i = 0; i < ctx.funcoes().size(); i++)
                    visitFuncoes(ctx.funcoes(i));
            saida.append("<div>");
        }
        
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitMenu(AlgumaParser.MenuContext ctx) {
        if(ctx != null)
        {
            saida.append("<nav>");
            saida.append("<div class=\"navbar\">\n");
            for (int i = 0; i < ctx.pequenas_ocasioes().size(); i++) {
                visitPequenas_ocasioes(ctx.pequenas_ocasioes(i));
            }
            saida.append("</div>\n");
        saida.append("</nav>\n");
        }
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitPularlinha(AlgumaParser.PularlinhaContext ctx) {
        saida.append("<br>");
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitEntrada_texto(AlgumaParser.Entrada_textoContext ctx) {
        String entrada = ctx.string().getText();
        saida.append("<label>"+entrada.substring(1, entrada.length() - 1)+"</label>");
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitLink(AlgumaParser.LinkContext ctx) {
        String entrada = ctx.string().getText();
        saida.append("<a href="+ctx.url().getText()+" class=\"button\">"+entrada.substring(1, entrada.length() - 1)+"</a>");
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitEntrada(AlgumaParser.EntradaContext ctx) {
        saida.append("<input type="+ctx.string(0).getText()+" id="+ctx.string(1).getText()+" name="+ctx.string(1).getText()+">");
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitBotao_corpo(AlgumaParser.Botao_corpoContext ctx) {
        saida.append("<input type=\"submit\" value="+ctx.string().getText()+">");
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitFormulario(AlgumaParser.FormularioContext ctx) {
        saida.append("<div class=\"form-container\">");
        saida.append("<form action="+ctx.string(0).getText()+" target="+ctx.string(1).getText()+" name="+ctx.string(2).getText()+">");
        for(int i = 0; i < ctx.formulario_entrada().size(); i++)
        {
            visitFormulario_entrada(ctx.formulario_entrada(i));
        }
        for(int i = 0; i < ctx.botao_corpo().size(); i++)
        {
            visitBotao_corpo(ctx.botao_corpo(i));
        }
        saida.append("</form>"
                + "</div>");
        
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitBotao(AlgumaParser.BotaoContext ctx) {
        String entrada = ctx.string().getText();
        saida.append("<a href="+ctx.url().getText()+" class=\"button\">"+entrada.substring(1, entrada.length() - 1)+"</a>");
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
        String entrada = ctx.string().getText();
        saida.append("<h1>" + entrada.substring(1, entrada.length() - 1) + "</h1>\n");
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitParagrafo(AlgumaParser.ParagrafoContext ctx) {
        String entrada = ctx.string().getText();
        saida.append("<p>" + entrada.substring(1, entrada.length() - 1) + "</p>\n");
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitSelo(AlgumaParser.SeloContext ctx) {
        String entrada = "<img src=" + ctx.url().getText() + " width=\"45\" height=\"45\" ";
        String tempPos = ctx.POSICAO().getText();
        switch (tempPos) {
            case "1":
                entrada += "style=\"float:right;\">\n";
                break;
            case "2":
                entrada += "style=\"float:left;\">\n";
                break;
            default:
                entrada += ">";
        }
        saida.append(entrada);
        return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitImage(AlgumaParser.ImageContext ctx) {
        String entrada = "<img src=" + ctx.url().getText();
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
