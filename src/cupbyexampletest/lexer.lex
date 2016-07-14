package cupbyexampletest;

import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;

// Imports adicionados
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import cupbyexampletest.sym;

%%

%class Lexer
%cup
%implements sym
%public
%unicode
%line
%column

%{
    private ComplexSymbolFactory symbolFactory;
    
	public Lexer(Path file, ComplexSymbolFactory symbolFactory) throws IOException {
		this(Files.newBufferedReader(file));
        this.symbolFactory = symbolFactory;
    }  

    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }

    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" +
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
%}

%eofval{
    return symbolFactory.newSymbol("EOF", EOF);
%eofval}

endline = \r|\n|\r\n
space = [ \t\f]
letter = [A-Za-z]
digit = [0-9]
slcomment = \/\/.*
mlcomment = \/\*([^\*]|[\r\n]|(\*+([^\*\/]|[\r\n])))*\*+\/

wspace = {space}|{endline}
integer = 0|-?[1-9]({digit})*
id = ({letter}|_)({letter}|{digit}|_)*
comment = {slcomment}|{mlcomment}

%%

class {return symbolFactory.newSymbol(yytext(), CLASS);}
public {return symbolFactory.newSymbol(yytext(), PUBLIC);}
extends {return symbolFactory.newSymbol(yytext(), EXTENDS);}
static {return symbolFactory.newSymbol(yytext(), STATIC);}
void {return symbolFactory.newSymbol(yytext(), VOID);}
int {return symbolFactory.newSymbol(yytext(), INT);}
boolean {return symbolFactory.newSymbol(yytext(), BOOLEAN);}
while {return symbolFactory.newSymbol(yytext(), WHILE);}
if {return symbolFactory.newSymbol(yytext(), IF);}
else {return symbolFactory.newSymbol(yytext(), ELSE);}
return {return symbolFactory.newSymbol(yytext(), RETURN);}
this {return symbolFactory.newSymbol(yytext(), THIS);}
new {return symbolFactory.newSymbol(yytext(), NEW);}

false {return symbolFactory.newSymbol(yytext(), FALSE, false);}
true {return symbolFactory.newSymbol(yytext(), TRUE, true);}

main {return symbolFactory.newSymbol(yytext(), MAIN);}
System\.out\.println {return symbolFactory.newSymbol(yytext(), PRINTLN);}
length {return symbolFactory.newSymbol(yytext(), LENGTH);}
String\[\] {return symbolFactory.newSymbol(yytext(), STRGARG);}

; {return symbolFactory.newSymbol(yytext(), SEMICOLON);}
\. {return symbolFactory.newSymbol(yytext(), DOT);}
, {return symbolFactory.newSymbol(yytext(), COMMA);}
= {return symbolFactory.newSymbol(yytext(), ASSIGN);}
\( {return symbolFactory.newSymbol(yytext(), O_PAR);}
\) {return symbolFactory.newSymbol(yytext(), C_PAR);}
\{ {return symbolFactory.newSymbol(yytext(), O_BRAC);}
\} {return symbolFactory.newSymbol(yytext(), C_BRAC);}
\[ {return symbolFactory.newSymbol(yytext(), O_BRACK);}
\] {return symbolFactory.newSymbol(yytext(), C_BRACK);}

\|\| {return symbolFactory.newSymbol(yytext(), OR);}
&& {return symbolFactory.newSymbol(yytext(), AND);}
== {return symbolFactory.newSymbol(yytext(), EQUALS);}
\!= {return symbolFactory.newSymbol(yytext(), DIFF);}
\< {return symbolFactory.newSymbol(yytext(), LESS);}
\<= {return symbolFactory.newSymbol(yytext(), LESS_EQ);}
> {return symbolFactory.newSymbol(yytext(), GREATER);}
>= {return symbolFactory.newSymbol(yytext(), GREATER_EQ);}
\+ {return symbolFactory.newSymbol(yytext(), PLUS);}
- {return symbolFactory.newSymbol(yytext(), MINUS);}
\* {return symbolFactory.newSymbol(yytext(), TIMES);}
\/ {return symbolFactory.newSymbol(yytext(), SLASH);}
% {return symbolFactory.newSymbol(yytext(), PERCENT);}
\! {return symbolFactory.newSymbol(yytext(), OPP);}

{wspace}
{ /* Não cria tokens */ }

{integer}
{return symbolFactory.newSymbol(yytext(), INTEGER, Integer.parseInt(yytext()));}

{id}
{return symbolFactory.newSymbol(yytext(), ID, yytext());}

{comment}
{ /* Não cria tokens */ }

// Tokens não reconhecidos já encerram o programa no lexer
.
{
throw new UnsupportedOperationException("ERROR: not recognized (" + yytext() + ")\n"
        + "line: " + yyline + "\n"
        + "column: " + yycolumn);
}