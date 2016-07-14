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
public class MethodDeclList implements Node {

    private List<MethodDecl> methods;

    public MethodDeclList() {
        this.methods = new ArrayList<>();
     
    }

    public void add(MethodDecl m) {
        this.methods.add(m);
    }

    public MethodDecl get(int i) {
        return this.methods.get(i);
    }

    public int size() {
        return this.methods.size();
    }
    

}
