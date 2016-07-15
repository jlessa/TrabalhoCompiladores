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
public class IntegerLiteralExpr extends NodeP implements Expression {

    private int value;

    public IntegerLiteralExpr(int value) {
        this.value = value;
        filhos = null;
        this.valor = Integer.toString(this.value);
    }

    public int getValue() {
        return value;
    }



}
