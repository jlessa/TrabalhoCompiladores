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
public class SimpleClassDecl extends ClassDecl{

    private Identifier className;
    private VarDeclList attributes;
    private MethodDeclList methods;

    public SimpleClassDecl(Identifier className, VarDeclList attributes, MethodDeclList methods) {
        this.className = className;
        this.attributes = attributes;
        this.methods = methods;
        this.filhos = new ArrayList<>();
        filhos.add(new Terminal(Terminal.Terminais.CLASS));
        filhos.add(this.className);
        filhos.add(new Terminal(Terminais.O_BRAC));
        filhos.add(this.attributes);
        filhos.add(this.methods);
        filhos.add(new Terminal(Terminais.C_BRAC));
        
    }

    public Identifier getClassName() {
        return className;
    }

    public VarDeclList getAttributes() {
        return attributes;
    }

    public MethodDeclList getMethods() {
        return methods;
    }
}
