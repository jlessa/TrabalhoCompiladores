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
public class BlockStmt   implements Statement {

    private StatementList stmts;

    public BlockStmt(StatementList stmts) {
        this.stmts = stmts;

    }

    public StatementList getStmts() {
        return stmts;
    }

}
