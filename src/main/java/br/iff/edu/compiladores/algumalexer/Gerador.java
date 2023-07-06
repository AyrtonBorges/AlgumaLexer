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
public class Gerador extends AlgumaBaseVisitor<Void>
{
       StringBuilder saida;
       
       public Gerador()
       {
           this.saida = new StringBuilder();
       }

    @Override
    public Void visitPage(PageContext ctx) {
           saida.append("<!DOCTYPE html>\n" +
                        "<html lang=\"pt-br\">\n" +
                        "    <head>\n" +
                        "        <meta charset=\"UTF-8\"/>\n" + 
                        "           <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "           <title>CSL - Site</title>\n" + 
                        "    </head>\n");
           visitHeader(ctx.header());
           visitCorpo(ctx.corpo());
           visitPernas(ctx.pernas());
           
        return super.visitPage(ctx); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitHeader(AlgumaParser.HeaderContext ctx) {
        saida.append("<header> </header>\n");
        visitFuncoes(ctx.funcoes(0));
        
        return super.visitHeader(ctx); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitMenu(AlgumaParser.MenuContext ctx) {
        saida.append("<nav> </nav>\n");
        return super.visitMenu(ctx); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitCorpo(AlgumaParser.CorpoContext ctx) {
        saida.append("<main> </main>\n");
        return super.visitCorpo(ctx); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitPernas(AlgumaParser.PernasContext ctx) {
        saida.append("<footer> </footer>\n");
        return super.visitPernas(ctx); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitTexto(AlgumaParser.TextoContext ctx) {
        saida.append("<article> </article>\n");
        return super.visitTexto(ctx); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitTitulo(AlgumaParser.TituloContext ctx) {
        saida.append("<h1> </h1>\n");
        return super.visitTitulo(ctx); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitParagrafo(AlgumaParser.ParagrafoContext ctx) {
        saida.append("<p> </p>\n");
        return super.visitParagrafo(ctx); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitSelo(AlgumaParser.SeloContext ctx) {
        String entrada = "<img src=\""+ctx.url().getText()+"\" width=\"75\" height=\"75\" style=\"float:";
        String tempPos = ctx.POSICAO().getText();
        switch(tempPos){
            case "1":
                entrada += "right;\">\n";
                break;
                
        }
        saida.append("<img src=\"\" width=\"75\" height=\"75\" style=\"float:;\">\n");
        return super.visitSelo(ctx); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitImage(AlgumaParser.ImageContext ctx) {
        saida.append("<img src=\"\" height=\"\" width=\"\" style=\"display: block; margin: auto;\">\n");
        return super.visitImage(ctx); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }     
}

