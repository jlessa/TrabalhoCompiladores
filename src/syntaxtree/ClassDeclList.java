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
public class ClassDeclList implements Node {

    private List<ClassDecl> classes;

    public ClassDeclList() {
        this.classes = new ArrayList<>();
    }

    public void add(ClassDecl c) {
        this.classes.add(c);
    }

    public ClassDecl get(int i) {
        return this.classes.get(i);
    }

    public int size() {
        return this.classes.size();
    }

}
