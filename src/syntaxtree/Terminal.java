/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syntaxtree;

/**
 *
 * @author jefferson.lessa
 */
public class Terminal extends NodeP implements Node {

    public Terminal(String value) {
        this.filhos = null;
        this.valor = value;
    }

    public interface Terminais {

        public final static String CLASS = "class";
        public final static String PUBLIC = "public";
        public final static String EXTENDS = "extends";
        public final static String STATIC = "static";
        public final static String VOID = "void";
        public final static String INT = "int";
        public final static String BOOLEAN = "boolean";
        public final static String WHILE = "while";
        public final static String IF = "if";
        public final static String ELSE = "else";
        public final static String RETURN = "return";
        public final static String THIS = "this";
        public final static String NEW = "new";

        public final static String FALSE = "false";
        public final static String TRUE = "true";

        public final static String MAIN = "main";
        public final static String PRINTLN = "System.out.println";
        public final static String LENGTH = "length";
        public final static String STRING = "String";

        public final static String SEMICOLON = ";";
        public final static String DOT = ".";
        public final static String COMMA = ",";
        public final static String ASSIGN = "=";
        public final static String O_PAR = "(";
        public final static String C_PAR = ")";
        public final static String O_BRAC = "{";
        public final static String C_BRAC = "}";
        public final static String O_BRACK = "[";
        public final static String C_BRACK = "]";

        public final static String OR = "||";
        public final static String AND = "&&";
        public final static String EQUALS = "==";
        public final static String DIFF = "!=";
        public final static String LESS = "<";
        public final static String LESS_EQ = "<=";
        public final static String GREATER = ">";
        public final static String GREATER_EQ = ">=";
        public final static String PLUS = "+";
        public final static String MINUS = "-";
        public final static String MULT = "*";
        public final static String DIV = "/";
        public final static String PERCENT = "%";
        public final static String OPP = "!";
    }

}
