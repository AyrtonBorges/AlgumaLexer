/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.iff.edu.compiladores.algumalexer;

/**
 *
 * @author ayrtonborges
 */
public class Semantico extends AlgumaBaseVisitor<Void> 
{
    @Override
    public Void visitPage(AlgumaParser.PageContext ctx) {
        return super.visitPage(ctx); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public Void visitHeader(AlgumaParser.HeaderContext ctx) {
        return super.visitHeader(ctx); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitCorpo(AlgumaParser.CorpoContext ctx) {
        return super.visitCorpo(ctx); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public Void visitPernas(AlgumaParser.PernasContext ctx) {
        return super.visitPernas(ctx); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Void visitMenu(AlgumaParser.MenuContext ctx) {
        return super.visitMenu(ctx); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
