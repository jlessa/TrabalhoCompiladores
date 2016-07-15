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
public class BlockStmt extends NodeP implements Statement {

    private StatementList stmts;

    public BlockStmt(StatementList stmts) {
        this.stmts = stmts;

        filhos = new ArrayList<>();
        filhos.add(stmts);

    }


    public StatementList getStmts() {
        return stmts;
    }

}
