/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Queue;
import syntaxtree.Node;
import syntaxtree.NodeP;

/**
 *
 * @author Jefferson
 */
public class BTreeHTML {

    public static int nivel = 0;
    public static String path = "C:\\Users\\Jefferson\\Documents\\GitHub\\TrabalhoCompiladores\\html\\tree.html";        

    public static void printNode(NodeP root) throws InterruptedException {        
        printNodeProf(root, new Queue<NodeP>(), BTreeHTML.nivel);
    }

    private static void printNodeProf(NodeP node, Queue<NodeP> nodesQueue, int nivel) throws InterruptedException {
        if (!node.visitado) {
            visitaNo(node, nivel);
            pulaLinha();
            nivel++;
        }
        if (node.filhos != null && node.filhos.size() > 0) {
            for (Node f : node.filhos) {
                printNodeProf((NodeP) f, nodesQueue, nivel);
            }
        }

    }

    private static void visitaNo(NodeP no, int nivel) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("\t\t");
        }
        System.out.print(no.valor);
        no.visitado = true;
    }

    private static void pulaLinha() {
        System.out.println();
    }
    
    public static FileInputStream abreArquivo (String path){
        FileInputStream in;
        try {
            in = new FileInputStream(path);
        } catch (FileNotFoundException ex) {
            in = null;            
            System.err.println(ex);           
        }
        return in;
    }
    
    public static void fecharArquivo(FileInputStream in) throws IOException{
        if(in != null){
            in.close();
        }
    }
    
    public static void escreveArquivoEdge(String s) throws FileNotFoundException, IOException {
        
    }
    
    public static void escreveArquivoNode(String s, FileInputStream in) throws FileNotFoundException, IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));        
        
        String file = "";
        String line = "";
        while ((line = reader.readLine()) != null) {
            file += line+"\n";
            if (line.contains("nodes:")) {
                file += ("\n\t\t\t\t\t\t\t\tTeste");
                file += ("\n\t\t\t\t\t\t\t\tTeste");
            }
        }
        FileOutputStream fw = new FileOutputStream(path);
        fw.write(file.getBytes());
        
        fw.close();
    }

}
