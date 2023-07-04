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
        System.out.println("hey");
           saida.append("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "    <head>\n" +
                        "        <meta charset=\"UTF-8\"/>");
        return super.visitPage(ctx); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
       
       
       
}

