/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syntaxtree;

import java.util.ArrayList;
import java.util.List;
import syntaxtree.Terminal.Terminais;


/**
 *
 * @author Jefferson
 */
public class ExpressionList extends NodeP implements Node {

    private List<Expression> expressions;

    public ExpressionList() {
        this.expressions = new ArrayList<>();
        filhos = new ArrayList<>();

    }



    public void add(Expression e) {
        this.expressions.add(e);
    }

    public void addFilho(Expression e) {
        if(this.filhos != null && this.filhos.size() > 0){
            this.filhos.add(new Terminal(Terminais.COMMA));
        }
        
        this.filhos.add(e);
    }

    public Expression get(int i) {
        return this.expressions.get(i);
    }

    public int size() {
        return this.expressions.size();
    }

}
