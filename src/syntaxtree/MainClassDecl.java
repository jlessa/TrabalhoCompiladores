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
public class MainClassDecl extends NodeP implements Node {
    private Identifier mainClassName;
    private Identifier argsName;
    private StatementList cmd;

    public MainClassDecl(Identifier mainClassName, Identifier argsName, StatementList cmd) {
        this.mainClassName = mainClassName;
        this.argsName = argsName;
        this.cmd = cmd;  
        filhos = new ArrayList<>();
        filhos.add(new Terminal(Terminais.CLASS));
        filhos.add(mainClassName);
        filhos.add(new Terminal(Terminais.O_BRAC));
        filhos.add(new Terminal(Terminais.PUBLIC));
        filhos.add(new Terminal(Terminais.STATIC));
        filhos.add(new Terminal(Terminais.VOID));
        filhos.add(new Terminal(Terminais.MAIN));
        filhos.add(new Terminal(Terminais.O_PAR));
        filhos.add(new Terminal(Terminais.STRING));
        filhos.add(new Terminal(Terminais.O_BRACK));
        filhos.add(new Terminal(Terminais.C_BRACK));
        filhos.add(argsName);
        filhos.add(new Terminal(Terminais.C_PAR));
        filhos.add(cmd);
        filhos.add(new Terminal(Terminais.C_BRAC));
        filhos.add(new Terminal(Terminais.C_BRAC));
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
