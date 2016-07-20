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
public class NewArrayExpr extends NodeP implements Expression {

    private Expression expr;

    public NewArrayExpr(Expression expr) {
        this.expr = expr;
        filhos = new ArrayList<>();
        filhos.add(new Terminal(Terminais.NEW));
        filhos.add(new Terminal(Terminais.INT));
        filhos.add(new Terminal(Terminais.O_BRACK));        
        filhos.add(this.expr);
        filhos.add(new Terminal(Terminais.C_BRACK));
    }



    public Expression getExpr() {
        return expr;
    }

}
