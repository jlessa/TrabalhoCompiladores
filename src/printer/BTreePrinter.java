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
import syntaxtree.NodeP;

/**
 *
 * @author Jefferson
 */
public class BTreePrinter {

    public static int nivel = 0;

    public static void printNode(NodeP root) throws InterruptedException {
        pulaLinha();
        printNodeProf(root, new Queue<NodeP>(), BTreePrinter.nivel);
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

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
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

    private static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null) {
                return false;
            }
        }

        return true;
    }

}
