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
    public static void main(String args[]) throws IOException
    {
        PrintWriter pw = new PrintWriter(new File(args[1]));
        
        /* Erro sintático */
        CharStream cs = CharStreams.fromFileName(args[0]);
        AlgumaLexer lex = new AlgumaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        AlgumaParser parser = new AlgumaParser(tokens);
        
        // Remove a mensagem de erro padrão
        parser.removeErrorListeners(); 
        
        // Registra o erro personalizado da analise sintática
        Tratamento_erros pegaErro = new Tratamento_erros(pw);
        parser.addErrorListener(pegaErro);
        
        PageContext arvore = parser.page();
        Semantico as = new Semantico();
        as.visitPage(arvore);
        if(SemanticoUtils.errosSemanticos.isEmpty() == false) {
            List<String> errosSemanticos = SemanticoUtils.errosSemanticos;
            for(var erroSemantico : errosSemanticos) {
                pw.append(erroSemantico + "\n");
            }
            pw.append("Fim da compilação\n");
            pw.close();
        }else if (parser.getNumberOfSyntaxErrors() > 1 ) {
            System.out.println("Houve erro sintaxe no código!");
            System.out.println("Quantidade de erros: "+(parser.getNumberOfSyntaxErrors()-1));
            System.out.println("Leia o arquivo de saida para ver qual foi o erro!");
        }else {
            Gerador lac = new Gerador();
            lac.visitPage(arvore);
            try (PrintWriter pwc = new PrintWriter(args[1])) {
                pwc.println(lac.saida.toString());
            }
        }
        parser.page();
    }
}