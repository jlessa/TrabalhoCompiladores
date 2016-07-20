/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syntaxtree;

import syntaxtree.Terminal.Terminais;


/**
 *
 * @author Jefferson
 */
public class IntegerType extends NodeP implements Type {

    public IntegerType() {
        this.filhos = null;
        this.valor = Terminais.INT;
    }

}
