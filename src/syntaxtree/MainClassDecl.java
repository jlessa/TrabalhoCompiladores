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
public class MainClassDecl extends NodeP implements Node {
    private Identifier mainClassName;
    private Identifier argsName;
    private StatementList cmd;

    public MainClassDecl(Identifier mainClassName, Identifier argsName, StatementList cmd) {
        this.mainClassName = mainClassName;
        this.argsName = argsName;
        this.cmd = cmd;  
        filhos = new ArrayList<>();
        filhos.add(mainClassName);
        filhos.add(argsName);
        filhos.add(cmd);
    }

    public Identifier getMainClassName() {
        return mainClassName;
    }

    public Identifier getArgs() {
        return argsName;
    }

    public StatementList getMain() {
        return cmd;
    }
    
}
