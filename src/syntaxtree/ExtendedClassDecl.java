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
public class ExtendedClassDecl extends SimpleClassDecl{
    private Identifier extendsClassName;

    public ExtendedClassDecl(Identifier className, VarDeclList attributes, MethodDeclList methods, Identifier extendsClassName) {
        super(className, attributes, methods);
        this.extendsClassName = extendsClassName;
        this.filhos = new ArrayList<>();
        filhos.add(super.getClassName());
        filhos.add(new Terminal("extends"));
        filhos.add(this.extendsClassName);
        filhos.add(super.getAttributes());
        filhos.add(super.getMethods());
        
    }

    public Identifier getExtendsClassName() {
        return extendsClassName;
    }
    
}
