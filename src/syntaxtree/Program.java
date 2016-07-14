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
public class Program extends NodeP implements Node {

    private MainClassDecl mainClass;
    private ClassDeclList classOpt;

    public Program(MainClassDecl mainClass, ClassDeclList classOpt) {        
        this.mainClass = mainClass;
        this.classOpt = classOpt; 
        filhos = new ArrayList<>();
        filhos.add(mainClass);
        filhos.add(classOpt);
        
    }

    public MainClassDecl getMainClass() {
        return mainClass;
    }

    public void setMainClass(MainClassDecl mainClass) {
        this.mainClass = mainClass;
    }

    public ClassDeclList getClassOpt() {
        return classOpt;
    }

    public void setClassOpt(ClassDeclList classOpt) {
        this.classOpt = classOpt;
    }
    

}
