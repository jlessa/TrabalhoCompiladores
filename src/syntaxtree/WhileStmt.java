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
public class WhileStmt implements Statement {
    private Expression expr;
    private Statement stmt;

    public WhileStmt(Expression expr, Statement stmt) {
        this.expr = expr;
        this.stmt = stmt;        
    }

    public Expression getExpr() {
        return expr;
    }

    public Statement getStmt() {
        return stmt;
    }  
    
}
