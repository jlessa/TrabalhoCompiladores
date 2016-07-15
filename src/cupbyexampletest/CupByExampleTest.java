/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cupbyexampletest;

import parser.Parser;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java_cup.runtime.Symbol;
import printer.BTreePrinter;
import syntaxtree.*;

/**
 *
 * @author jefferson.lessa
 */
public class CupByExampleTest {

    /**
     * @param args the command line arguments
     */
    public static final Path LEXER_PATH = Paths.get(".\\src\\lexer\\lexer.lex");
    public static final Path PARSER_PATH = Paths.get(".\\src\\parser\\cup.cup");
    public static final Path TEST_FILES_DIR = Paths.get(".\\src\\testFiles\\in.java");

    public static void main(String[] args) throws Exception {        

        //gerarLexer(LEXER_PATH);
        //gerarParser(PARSER_PATH,PARSER_PATH.getParent(),"Parser","sym",0);
        Parser p = new Parser(TEST_FILES_DIR);

        //Árvore na memória
        Node node = (Node) p.parse().value;
                        
        //JSONSerializer serializer = new JSONSerializer();
        //String json = serializer.exclude("filhos").serialize( (NodeP) node );
        
        //Print da árvore
        BTreePrinter.printNode((NodeP) node);
    }

    public static void gerarLexer(Path path) {
        jflex.Main.generate(new File(path.toString()));
    }

    public static void gerarParser(Path spec, Path dest, String parserClassName, String symbolClassName, int conflicts) throws IOException, Exception {
        try {
            // Setando atributos
            java_cup.Main.main(new String[]{"-parser", parserClassName, "-interface", "-symbols", symbolClassName,
                "-destdir", dest.toAbsolutePath().toString(), "-expect", Integer.toString(conflicts),
                spec.toAbsolutePath().toString()});

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
