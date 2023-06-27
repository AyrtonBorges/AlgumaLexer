package br.iff.edu.compiladores.algumalexer;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Principal 
{
    public static void main(String args[]) throws IOException
    {
        CharStream cs = CharStreams.fromFileName(args[0]);
        AlgumaLexer lex = new AlgumaLexer(cs);
//        Token t = null;
//        while((t = lex.nextToken()).getType() != Token.EOF)
//        {
//            System.out.println("<"+AlgumaLexer.VOCABULARY.getDisplayName(t.getType())+","+t.getText()+">");
//        }
        CommonTokenStream tokens = new CommonTokenStream(lex);
        AlgumaParser parser = new AlgumaParser(tokens);
        parser.page();
    }
}