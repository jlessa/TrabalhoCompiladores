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
public class VarDecl implements Node{

    private Type type;
    private Identifier id;

    public VarDecl(Type type, Identifier id) {
        this.type = type;
        this.id = id;
        
    }

    public Type getType() {
        return type;
    }

    public Identifier getId() {
        return id;
    }

}
