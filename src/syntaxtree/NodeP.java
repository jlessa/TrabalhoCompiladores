/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syntaxtree;

import java.util.List;

/**
 *
 * @author jefferson.lessa
 */
public abstract class NodeP {
    public List<Node> filhos; 
    public String valor;
    public boolean visitado;

    public NodeP() {
        this.valor = this.getClass().getSimpleName();
    }
}
