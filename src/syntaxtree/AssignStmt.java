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
public class AssignStmt   implements  Statement {

    private Identifier id;
    private Expression assign;

    public AssignStmt(Identifier id, Expression assign) {
        this.id = id;
        this.assign = assign;
    }

    public Identifier getId() {
        return id;
    }

    public Expression getAssign() {
        return assign;
    }
    
}
