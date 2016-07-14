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
public class BinaryIntegerExpr extends NodeP implements  Expression {
    private Expression expr1;
    private Expression expr2;
    private BinaryIntegerOperation op;

    public BinaryIntegerExpr(Expression expr1, Expression expr2, BinaryIntegerOperation op) {
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.op = op;     
        filhos = new ArrayList<>();
        filhos.add(expr1);
        filhos.add(expr2);
        filhos.add(new Terminal(this.op.toString()));
    }
  
    public enum BinaryIntegerOperation {
        PLUS, MINUS, MUL, DIV, MOD
    }

    public Expression getExpr1() {
        return expr1;
    }

    public Expression getExpr2() {
        return expr2;
    }

    public BinaryIntegerOperation getOp() {
        return op;
    }

    
}
