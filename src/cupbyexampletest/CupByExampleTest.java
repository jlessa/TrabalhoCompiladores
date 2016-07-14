/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cupbyexampletest;

import printer.NodeTree;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java_cup.runtime.Scanner;
import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;
import sun.reflect.generics.tree.Tree;
import syntaxtree.*;
import printer.BTreePrinter;
import printer.NodeTree;


/**
 *
 * @author jefferson.lessa
 */
public class CupByExampleTest {

    /**
     * @param args the command line arguments
     */
    public static final Path LEXER_PATH = Paths.get(".\\src\\cupbyexampletest\\lexer.lex");
    public static final Path PARSER_PATH = Paths.get(".\\src\\cupbyexampletest\\cup.cup");
    public static final Path TEST_FILES_DIR = Paths.get(".\\src\\cupbyexampletest\\in.java");
    
    
           
    public static void main(String[] args) throws Exception {

        Symbol symbol;
        
        
        //gerarLexer(LEXER_PATH);
        //gerarParser(PARSER_PATH,PARSER_PATH.getParent(),"Parser","sym",0);
        
        Parser p = new Parser(TEST_FILES_DIR);               
        
        //Árvore na memória
        Node node = (Node)p.parse().value;
        
        //BTreePrinter.printNode(node);

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
