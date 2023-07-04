/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.iff.edu.compiladores.algumalexer;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author ayrtonborges
 */
public class SemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();
    
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        System.out.println("Linha "+linha+" %s"+mensagem);
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }
}
