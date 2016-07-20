/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syntaxtree;

import java.util.ArrayList;

/**
 *
 * @author Jefferson
 */
public class ArrayLengthExpr extends NodeP implements Expression {

    private Expression array;

    public ArrayLengthExpr(Expression array) {
        this.array = array;
        filhos = new ArrayList<>();
        filhos.add(this.array);
        filhos.add(new Terminal(Terminal.Terminais.DOT));
        filhos.add(new Terminal(Terminal.Terminais.LENGTH));
    }



    public Expression getArray() {
        return array;
    }

}
