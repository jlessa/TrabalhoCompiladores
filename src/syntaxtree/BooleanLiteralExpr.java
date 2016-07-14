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
public class BooleanLiteralExpr extends NodeP implements Expression {
    private boolean value;

    public BooleanLiteralExpr(boolean value) {
        this.value = value;
        filhos = new ArrayList<>();
        filhos.add(new Terminal(value ? "true" : "false"));  
    }

    public boolean isValue() {
        return value;
    }
    
    
}
