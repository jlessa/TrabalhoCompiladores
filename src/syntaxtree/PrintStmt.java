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
public class PrintStmt extends NodeP implements Statement {

    private Expression expr;

    public PrintStmt(Expression expr) {
        this.expr = expr;
        filhos = new ArrayList<>();
        filhos.add(this.expr);
    }



    public Expression getExpr() {
        return expr;
    }

}
