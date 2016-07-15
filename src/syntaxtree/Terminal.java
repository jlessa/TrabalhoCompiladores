/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syntaxtree;



/**
 *
 * @author jefferson.lessa
 */
public class Terminal extends NodeP implements Node {

    public Terminal(String value) {
        this.filhos = null;
        this.valor = value;
    }


}
