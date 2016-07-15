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
public class Argument extends NodeP implements Node {

    private Type type;
    private Identifier name;

    public Argument(Type type, Identifier name) {
        this.type = type;
        this.name = name;
        filhos = new ArrayList<>();
        filhos.add(this.type);
        filhos.add(this.name);
    }
    
    public Type getType() {
        return type;
    }

    public Identifier getName() {
        return name;
    }


}
