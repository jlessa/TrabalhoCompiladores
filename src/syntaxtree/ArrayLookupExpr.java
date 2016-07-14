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
public class ArrayLookupExpr implements Expression {
    private Expression array;
    private Expression index;

    public ArrayLookupExpr(Expression array, Expression index) {
        this.array = array;
        this.index = index;

    }

    public Expression getArray() {
        return array;
    }

    public Expression getIndex() {
        return index;
    }
    
    
}
