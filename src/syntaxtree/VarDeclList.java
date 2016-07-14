/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syntaxtree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jefferson
 */
public class VarDeclList implements Node{
    private List<VarDecl> variables;

    public VarDeclList() {
        variables = new ArrayList<>();
    }

    public void add(VarDecl v) {
        variables.add(v);
    }

    public VarDecl get(int i) {
        return variables.get(i);
    }

    public int size() {
        return variables.size();
    }

}
