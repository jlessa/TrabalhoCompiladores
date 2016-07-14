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
public class IfStmt   implements Statement {
    private Expression expr;
    private Statement ifStmt;
    private Statement elseStmt;

    public IfStmt(Expression expr, Statement ifStmt, Statement elseStmt) {
        this.expr = expr;
        this.ifStmt = ifStmt;
        this.elseStmt = elseStmt;        
    }

    public Expression getExpr() {
        return expr;
    }

    public Statement getIfStmt() {
        return ifStmt;
    }

    public Statement getElseStmt() {
        return elseStmt;
    }    
    
}
