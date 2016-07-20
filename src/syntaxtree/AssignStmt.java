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
public class AssignStmt extends NodeP implements Statement {

    private Identifier id;
    private Expression assign;

    public AssignStmt(Identifier id, Expression assign) {
        this.id = id;
        this.assign = assign;
        filhos = new ArrayList<>();
        filhos.add(this.id);
        filhos.add(new Terminal(Terminal.Terminais.ASSIGN));
        filhos.add(this.assign);
        filhos.add(new Terminal(Terminal.Terminais.SEMICOLON));
    }


    public Identifier getId() {
        return id;
    }

    public Expression getAssign() {
        return assign;
    }

}
