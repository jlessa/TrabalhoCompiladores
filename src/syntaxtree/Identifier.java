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
public class Identifier extends NodeP implements Node{

    private String name;

    public Identifier(String name) {
        this.name = name;
        filhos = null;
    }

    public String getName() {
        return name;
    }    

}
