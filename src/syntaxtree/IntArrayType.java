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
public class IntArrayType extends NodeP implements Type {

    public IntArrayType() {
        this.filhos=null;
        this.valor = Terminais.INT + Terminais.O_BRACK + Terminais.C_BRACK;
    }
    

}
