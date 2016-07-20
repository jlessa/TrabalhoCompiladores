/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syntaxtree;

import java.util.ArrayList;
import syntaxtree.Terminal.Terminais;


/**
 *
 * @author Jefferson
 */
public class ParExpr extends NodeP implements Expression {
    

    public ParExpr(Expression exp) {
        
        filhos = new ArrayList<>();
        filhos.add(new Terminal(Terminais.O_PAR));
        filhos.add(exp);
        filhos.add(new Terminal(Terminais.C_PAR));
    }

}
