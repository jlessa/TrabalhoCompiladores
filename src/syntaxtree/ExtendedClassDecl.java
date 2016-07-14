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
public class ExtendedClassDecl extends SimpleClassDecl{
    private Identifier extendsClassName;

    public ExtendedClassDecl(Identifier className, VarDeclList attributes, MethodDeclList methods, Identifier extendsClassName) {
        super(className, attributes, methods);
        this.extendsClassName = extendsClassName;
    }

    public Identifier getExtendsClassName() {
        return extendsClassName;
    }
    
}
