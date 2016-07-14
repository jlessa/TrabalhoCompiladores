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
public class BooleanLiteralExpr   implements Expression {
    private boolean value;

    public BooleanLiteralExpr(boolean value) {
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }
    
    
}
