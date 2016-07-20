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
public class MethodDecl extends NodeP implements Node {

    private Type returnType;
    private Identifier name;
    private ArgumentList arguments;
    private VarDeclList variables;
    private StatementList statements;
    private Expression returnExpr;

    public MethodDecl(Type returnType, Identifier name, ArgumentList arguments, VarDeclList variables, StatementList statements, Expression returnExpr) {
        this.returnType = returnType;
        this.name = name;
        this.arguments = arguments;
        this.variables = variables;
        this.statements = statements;
        this.returnExpr = returnExpr;
        filhos = new ArrayList<>();
        filhos.add(new Terminal(Terminais.PUBLIC));
        filhos.add(this.returnType);
        filhos.add(this.name);
        filhos.add(new Terminal(Terminais.O_PAR));
        filhos.add(this.arguments);
        filhos.add(new Terminal(Terminais.C_PAR));
        filhos.add(new Terminal(Terminais.O_BRAC));
        filhos.add(this.variables);
        filhos.add(this.statements);
        filhos.add(this.returnExpr);
        filhos.add(new Terminal(Terminais.RETURN));
        filhos.add(new Terminal(Terminais.SEMICOLON));
        filhos.add(new Terminal(Terminais.C_BRAC));
    }

    public Type getReturnType() {
        return returnType;
    }

    public Identifier getName() {
        return name;
    }

    public ArgumentList getArguments() {
        return arguments;
    }

    public VarDeclList getVariables() {
        return variables;
    }

    public StatementList getStatements() {
        return statements;
    }

    public Expression getReturnExpr() {
        return returnExpr;
    }

}
