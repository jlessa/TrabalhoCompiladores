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
public class ArrayLookupExpr extends NodeP implements Expression {

    private Expression array;
    private Expression index;

    public ArrayLookupExpr(Expression array, Expression index) {
        this.array = array;
        this.index = index;

        filhos = new ArrayList<>();
        filhos.add(this.array);
        filhos.add(new Terminal(Terminal.Terminais.O_PAR));
        filhos.add(this.index);
        filhos.add(new Terminal(Terminal.Terminais.C_PAR));
    }

    public Expression getArray() {
        return array;
    }

    public Expression getIndex() {
        return index;
    }

}
