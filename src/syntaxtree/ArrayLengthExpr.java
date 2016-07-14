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
public class ArrayLengthExpr implements Expression {
    private Expression array;

    public ArrayLengthExpr(Expression array) {
        this.array = array;
       
    }

    public Expression getArray() {
        return array;
    }    
    
}
