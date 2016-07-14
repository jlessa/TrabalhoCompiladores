/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import sun.misc.Queue;
import syntaxtree.Node;

/**
 *
 * @author Jefferson
 */
public class BTreePrinter {

    public static void printNode(Node root) throws InterruptedException {
        NodeTree node = convertObjecToNode(root);
        printNodeLargura(node, new Queue<NodeTree>());
    }

    private static NodeTree convertObjecToNode(Node root) {
        //faltou somente implementar a conversão para printar a árvore na tela
        return new NodeTree();
    }

    private static void printNodeLargura(NodeTree node, Queue<NodeTree> nodes) throws InterruptedException {
        if (!node.visitado) {
            visitaNo(node);
            System.out.println("");
        }
        
        if (nodes != null) {
            for(NodeTree n : node.filhos){
                nodes.enqueue(n);
            }            
        }
        printNodeLargura(nodes.dequeue(),nodes);
        
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private static void visitaNo(NodeTree no) {
        System.out.print(no.valor.toString());
        no.visitado = true;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null) {
                return false;
            }
        }

        return true;
    }

}
