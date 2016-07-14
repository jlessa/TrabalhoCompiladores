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
public class MethodDecl implements Node {

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
