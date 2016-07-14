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
public class UnaryBooleanExpr implements Expression {
    private Expression expr;
    private UnaryBooleanOperation op;

    public UnaryBooleanExpr(Expression expr, UnaryBooleanOperation op) {
        this.expr = expr;
        this.op = op;
     
    }
    

    public enum UnaryBooleanOperation {
        OPPOSITE
    }

    public Expression getExpr() {
        return expr;
    }

    public UnaryBooleanOperation getOp() {
        return op;
    }

    
}
