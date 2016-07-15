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
public class NewObjectExpr extends NodeP implements Expression {

    public Identifier id;

    public NewObjectExpr(Identifier id) {
        this.id = id;
        filhos = new ArrayList<>();
        filhos.add(this.id);
    }


    public Identifier getId() {
        return id;
    }

}
