package br.iff.edu.compiladores.algumalexer;

import br.iff.edu.compiladores.algumalexer.AlgumaParser.PageContext;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Principal 
{
    // Declaração de todos os Objetos
    static PrintWriter pw;
    static CharStream cs;
    static AlgumaLexer lex;
    static CommonTokenStream tokens;
    static AlgumaParser parser;
    static Tratamento_erros pegaErro;
    static PageContext arvore;
    static Semantico as;
    
    public static void main(String args[]) throws IOException
    {    
        inicializa(args);
        
        // Registra o erro personalizado da analise sintática
        pegaErro = new Tratamento_erros(pw);
        parser.addErrorListener(pegaErro);
        
        as = new Semantico();
        as.visitPage(arvore); // Verifica erro semantico
        
        if(!SemanticoUtils.errosSemanticos.isEmpty()) { 
            mensagemErroSemantico();
        }else if (parser.getNumberOfSyntaxErrors() > 1 ) { // Verifica a quantiade de erro (OBS: se houver um, é normal)
            mensagemErroSintatico();
        }else {
            geradorHTML(args);
        }
    }
    
    public static void inicializa(String args[]) throws IOException
    {
        pw = new PrintWriter(new File(args[1]));
        /* Erro sintático */
        cs = CharStreams.fromFileName(args[0]);
        lex = new AlgumaLexer(cs);
        tokens = new CommonTokenStream(lex);
        parser = new AlgumaParser(tokens);
        
        // Remove a mensagem de erro padrão
        parser.removeErrorListeners(); 
        
        arvore = parser.page();
    }
    
    public static void mensagemErroSemantico()
    {
        List<String> errosSemanticos = SemanticoUtils.errosSemanticos;
        for(var erroSemantico : errosSemanticos) {
            pw.append(erroSemantico + "\n");
        }
        pw.append("Fim da compilação\n");
        pw.close();
    }
    
    public static void mensagemErroSintatico() throws IOException
    {
        System.out.println("Houve erro sintático no código!");
        System.out.println("Quantidade de erros: "+(parser.getNumberOfSyntaxErrors()-1));
        System.out.println("Olhe no arquivo de saída para verificar o erro!");
    }
    
    public static void geradorHTML(String args[]) throws IOException
    {
        Gerador lac = new Gerador();
        lac.visitPage(arvore);
        try (PrintWriter pwc = new PrintWriter(args[1])) {
            pwc.println(lac.saida.toString());
        }
    }
    
}
