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
public class MethodCallExpr implements Expression {
    private Expression object;
    private Identifier method;
    private ExpressionList params;

    public MethodCallExpr(Expression object, Identifier method, ExpressionList params) {
        this.object = object;
        this.method = method;
        this.params = params;
       
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
