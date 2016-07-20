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
public class BinaryBooleanExpr extends NodeP implements Expression {

    private Expression expr1;
    private Expression expr2;
    private BinaryBooleanOperation op;

    public BinaryBooleanExpr(Expression expr1, Expression expr2, BinaryBooleanOperation op) {
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.op = op;

        filhos = new ArrayList<>();
        filhos.add(this.expr1);
        filhos.add(this.expr2);
        filhos.add(new Terminal(escolheTerminal(op.toString())));
    }

    public enum BinaryBooleanOperation {
        AND, OR, EQUALS, DIFF, LESS, LESS_THAN, GREATER, GREATER_THAN
    }

    private String escolheTerminal(String op) {
        switch (op) {
            case "AND":
                return Terminal.Terminais.AND;
            case "OR":
                return Terminal.Terminais.OR;
            case "EQUALS":
                return Terminal.Terminais.EQUALS;
            case "DIFF":
                return Terminal.Terminais.DIFF;
            case "LESS":
                return Terminal.Terminais.LESS;
            case "LESS_THAN":
                return Terminal.Terminais.LESS_EQ;
            case "GREATER":
                return Terminal.Terminais.GREATER;
            case "GREATER_THAN":
                return Terminal.Terminais.GREATER_EQ;
            default:
                return "";
        }
    }

    public Expression getExpr1() {
        return expr1;
    }

    public Expression getExpr2() {
        return expr2;
    }

    public BinaryBooleanOperation getOp() {
        return op;
    }

}
