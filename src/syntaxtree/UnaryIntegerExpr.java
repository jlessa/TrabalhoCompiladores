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
public class UnaryIntegerExpr extends NodeP implements Expression {

    private Expression expr;
    private UnaryIntegerOperation op;

    public UnaryIntegerExpr(Expression expr, UnaryIntegerOperation op) {
        this.expr = expr;
        this.op = op;
        filhos = new ArrayList<>();
        filhos.add(this.expr);
        filhos.add(new Terminal(escolheTerminal(op.toString())));
    }


    public enum UnaryIntegerOperation {
        NEGATE
    }
    private String escolheTerminal(String op) {
        switch (op) {
            case "NEGATE":
                return Terminal.Terminais.OPP;     
            default:
                return "";
        }
    }

}
