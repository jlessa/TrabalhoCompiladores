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
public class IntegerLiteralExpr   implements  Expression {
    private int value;

    public IntegerLiteralExpr(int value) {
        this.value = value;
        
    }

    public int getValue() {
        return value;
    }

    
    
}
