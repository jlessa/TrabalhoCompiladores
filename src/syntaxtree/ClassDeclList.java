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
public class ClassDeclList extends NodeP implements Node {

    private List<ClassDecl> classes;

    public ClassDeclList() {
        this.classes = new ArrayList<>();
        this.filhos =  new ArrayList<>();        
    }

    public void add(ClassDecl c) {
        this.classes.add(c);
    }
    
    public void addFilho(ClassDecl c){
        this.filhos.add(c);
    }
    
    public ClassDecl get(int i) {
        return this.classes.get(i);
    }

    public int size() {
        return this.classes.size();
    }
    

}
