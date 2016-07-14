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
public class NewObjectExpr implements Expression {
    public Identifier id;

    public NewObjectExpr(Identifier id) {
        this.id = id;
    }

    public Identifier getId() {
        return id;
    }

    
    
}
