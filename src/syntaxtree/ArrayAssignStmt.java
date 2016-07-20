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
public class ArrayAssignStmt extends NodeP implements Statement {

    private Identifier array;
    private Expression index;
    private Expression assign;

    public ArrayAssignStmt(Identifier array, Expression index, Expression assign) {
        this.array = array;
        this.index = index;
        this.assign = assign;
        filhos = new ArrayList<>();
        filhos.add(this.array);
        filhos.add(new Terminal(Terminal.Terminais.O_BRACK));
        filhos.add(this.index);
        filhos.add(new Terminal(Terminal.Terminais.C_BRACK));
        filhos.add(new Terminal(Terminal.Terminais.ASSIGN));
        filhos.add(this.assign);
        filhos.add(new Terminal(Terminal.Terminais.SEMICOLON));

    }


    public Identifier getArray() {
        return array;
    }

    public Expression getIndex() {
        return index;
    }

    public Expression getAssign() {
        return assign;
    }

}
