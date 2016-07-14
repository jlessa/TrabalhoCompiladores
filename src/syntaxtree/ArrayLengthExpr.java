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
    }

    public Expression getArray() {
        return array;
    }    
    
}
