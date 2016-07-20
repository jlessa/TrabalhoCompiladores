/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syntaxtree;

import java.util.ArrayList;
import syntaxtree.Terminal.Terminais;

/**
 *
 * @author Jefferson
 */
public class VarDecl extends NodeP implements Node {

    private Type type;
    private Identifier id;

    public VarDecl(Type type, Identifier id) {
        this.type = type;
        this.id = id;
        filhos = new ArrayList<>();
        filhos.add(this.type);
        filhos.add(this.id);
        filhos.add(new Terminal(Terminais.SEMICOLON));

    }


    public Type getType() {
        return type;
    }

    public Identifier getId() {
        return id;
    }

}
