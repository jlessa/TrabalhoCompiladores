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
        filhos.add(new Terminal(Terminal.Terminais.NEW));
        filhos.add(this.id);
        filhos.add(new Terminal(Terminal.Terminais.O_PAR));
        filhos.add(new Terminal(Terminal.Terminais.C_PAR));
    }


    public Identifier getId() {
        return id;
    }

}
