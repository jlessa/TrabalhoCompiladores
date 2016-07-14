/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syntaxtree;

/**
 *
 * @author Jefferson
 */
public class ArrayAssignStmt implements  Statement{

    private Identifier array;
    private Expression index;
    private Expression assign;

    public ArrayAssignStmt(Identifier array, Expression index, Expression assign) {
        this.array = array;
        this.index = index;
        this.assign = assign;        
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
