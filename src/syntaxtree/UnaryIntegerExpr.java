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
public class UnaryIntegerExpr implements Expression {

    private Expression expr;
    private UnaryIntegerOperation op;

    public UnaryIntegerExpr(Expression expr, UnaryIntegerOperation op) {
        this.expr = expr;
        this.op = op;
    }

    public enum UnaryIntegerOperation {
        NEGATE
    }

}
