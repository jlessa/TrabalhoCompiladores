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
public class ArgumentList extends NodeP implements Node {

    private List<Argument> arguments;

    public ArgumentList() {
        this.arguments = new ArrayList<>();
        filhos = new ArrayList<>();

    }

    public void add(Argument a) {
        this.arguments.add(a);
    }

    public void addFilho(Argument a) {
        this.filhos.add(a);
    }

    public Argument get(int i) {
        return this.arguments.get(i);
    }

    public int size() {
        return this.arguments.size();
    }


}
