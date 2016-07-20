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
public class MethodCallExpr extends NodeP implements Expression {

    private Expression object;
    private Identifier method;
    private ExpressionList params;

    public MethodCallExpr(Expression object, Identifier method, ExpressionList params) {
        this.object = object;
        this.method = method;
        this.params = params;
        filhos = new ArrayList<>();
        filhos.add(this.object);
        filhos.add(new Terminal(Terminal.Terminais.DOT));
        filhos.add(this.method);
        filhos.add(new Terminal(Terminal.Terminais.O_PAR));
        filhos.add(this.params);
        filhos.add(new Terminal(Terminal.Terminais.C_PAR));
    }


    public Expression getObject() {
        return object;
    }

    public Identifier getMethod() {
        return method;
    }

    public ExpressionList getParams() {
        return params;
    }

}
