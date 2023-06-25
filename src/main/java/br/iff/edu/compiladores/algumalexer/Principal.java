package br.iff.edu.compiladores.algumalexer;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class Principal 
{
    public static void main(String args[]) throws IOException
    {
        CharStream cs = null;
        try{
            cs = CharStreams.fromFileName(args[0]);
        }catch(ExceptionInInitializerError e){
            e.printStackTrace();
        };
        AlgumaLexer lex = new AlgumaLexer(cs);
        
        Token t = null;
        while((t = lex.nextToken()).getType() != Token.EOF)
        {
            System.out.print("<"+AlgumaLexer.VOCABULARY.getDisplayName(t.getType())+","+t.getText()+">");
        }
    }
}