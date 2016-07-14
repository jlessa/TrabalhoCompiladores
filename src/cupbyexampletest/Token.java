/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cupbyexampletest;

/**
 *
 * @author Jefferson
 */
public class Token {
    private static String value;
    private static String tipo;
    static private String EOF = "< EOF , EOF >";
    
    public Token (Token token){
        this.value = token.value;
        this.tipo = token.tipo;
    }
    public Token(String tipo, String value){
        this.tipo = tipo;
        this.value = value;
    }
    
    public static String getValue()
    {
        return Token.value;
    }
    
    public static String getEOF()
    {
        return Token.EOF;
    }
    @Override
    public String toString()
    {
        return "< " + this.tipo + " , " + this.value + " >"; 
    }
}
