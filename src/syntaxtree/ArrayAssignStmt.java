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
public class ArrayAssignStmt extends NodeP implements  Statement{

    private Identifier array;
    private Expression index;
    private Expression assign;

    public ArrayAssignStmt(Identifier array, Expression index, Expression assign) {
        this.array = array;
        this.index = index;
        this.assign = assign; 
        filhos = new ArrayList<>();        
        filhos.add(this.array);
        filhos.add(this.index);
        filhos.add(this.assign);
        
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
