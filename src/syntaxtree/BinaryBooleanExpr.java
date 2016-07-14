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
public class BinaryBooleanExpr   implements Expression {
    private Expression expr1;
    private Expression expr2;
    private BinaryBooleanOperation op;

    public BinaryBooleanExpr(Expression expr1, Expression expr2, BinaryBooleanOperation op) {
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.op = op;
      
    }    

    public enum BinaryBooleanOperation {
        AND, OR, EQUALS, DIFF, LESS, LESS_THAN, GREATER, GREATER_THAN
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
