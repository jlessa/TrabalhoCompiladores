/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syntaxtree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jefferson
 */
public class StatementList extends NodeP implements Node {

    private List<Statement> statements;

    public StatementList() {
        this.statements = new ArrayList<>();
        filhos = new ArrayList<>();

    }


    public void add(Statement s) {
        this.statements.add(s);
    }

    public void addFilho(Statement s) {
        this.filhos.add(s);
    }

    public Statement get(int i) {
        return this.statements.get(i);
    }

    public int size() {
        return this.statements.size();
    }

}
