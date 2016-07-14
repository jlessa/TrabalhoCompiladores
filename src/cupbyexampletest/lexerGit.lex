package cupbyexampletest;
import java_cup.runtime.Symbol;
%%

%public
%class lexxer
%unicode
%cup
%full
%line
%column


%{
        private void error(String message)
	{
		System.err.println("Error at line " + (yyline+1) + ", column " + (yycolumn+1) + " : " + message);
	}
%}

%eofval{
    return new Symbol(sym.EOF, yyline, yycolumn, new Token("EOF","EOF"));
%eofval}

Identifier              = [a-zA-Z_][a-zA-Z0-9_]*
Integer                 = 0 | [1-9]+
branco                  = \t|\f|" "|""|\r|\n
comentarioLinha         = \/\/.*(\t|\f|" "|\r|\n)
comentarioGrupo         = ((\/\*)(\n|\t|\r|\f|.)*(\*\/))
%%

//keywords
{branco}                                        {/*NAO FAZ NADA*/}
{comentarioLinha}				{/*NAO FAZ NADA*/}
{comentarioGrupo}                               {/*NAO FAZ NADA*/}
"class"                                         {return new Symbol(sym.CLASS, yyline+1, yycolumn+1 ,new Token("CLASS",yytext().intern()));}
"public"                                        {return new Symbol(sym.PUBLIC, yyline+1, yycolumn+1 ,new Token("PUBLIC",yytext().intern()));}
"static"                                        {return new Symbol(sym.STATIC, yyline+1, yycolumn+1 ,new Token("STATIC",yytext().intern()));}
"void"                                          {return new Symbol(sym.VOID, yyline+1, yycolumn+1 ,new Token("VOID",yytext().intern()));}
"main"                                          {return new Symbol(sym.MAIN, yyline+1, yycolumn+1 ,new Token("MAIN",yytext().intern()));}
"String"                                        {return new Symbol(sym.STRING, yyline+1, yycolumn+1 ,new Token("STRING",yytext().intern()));}
"extends"                                       {return new Symbol(sym.EXTENDS, yyline+1, yycolumn+1 ,new Token("EXTENDS",yytext().intern()));}
"return"                                        {return new Symbol(sym.RETURN, yyline+1, yycolumn+1 ,new Token("RETURN",yytext().intern()));}
"int"                                           {return new Symbol(sym.INT, yyline+1, yycolumn+1 ,new Token("INT",yytext().intern()));}
"boolean"                                       {return new Symbol(sym.BOOL, yyline+1, yycolumn+1 ,new Token("BOOL",yytext().intern()));}
"if"                                            {return new Symbol(sym.IF, yyline+1, yycolumn+1 ,new Token("IF",yytext().intern()));}
"else"                                          {return new Symbol(sym.ELSE, yyline+1, yycolumn+1 ,new Token("ELSE",yytext().intern()));}
"while"                                         {return new Symbol(sym.WHILE, yyline+1, yycolumn+1 ,new Token("WHILE",yytext().intern()));}
"System.out.println"                            {return new Symbol(sym.PRINT, yyline+1, yycolumn+1 ,new Token("PRINT",yytext().intern()));}
"true"                                          {return new Symbol(sym.TRUE, yyline+1, yycolumn+1 ,new Token("TRUE",yytext().intern()));}
"false"                                         {return new Symbol(sym.FALSE, yyline+1, yycolumn+1 ,new Token("FALSE",yytext().intern()));}
"this"                                          {return new Symbol(sym.THIS, yyline+1, yycolumn+1 ,new Token("THIS",yytext().intern()));}
"new"                                           {return new Symbol(sym.NEW, yyline+1, yycolumn+1 ,new Token("NEW",yytext().intern()));}
"!"						{return new Symbol(sym.EXCL, yyline+1, yycolumn+1 ,new Token("EXCL",yytext().intern()));}
"="						{return new Symbol(sym.EQUALS, yyline+1, yycolumn+1 ,new Token("EQUALS",yytext().intern()));}
"&&"                                            {return new Symbol(sym.AND, yyline+1, yycolumn+1 ,new Token("AND",yytext().intern()));}
"<"						{return new Symbol(sym.LESS, yyline+1, yycolumn+1 ,new Token("LESS",yytext().intern()));}
"+"						{return new Symbol(sym.PLUS, yyline+1, yycolumn+1 ,new Token("PLUS",yytext().intern()));}
"-"						{return new Symbol(sym.MINUS, yyline+1, yycolumn+1 ,new Token("MINUS",yytext().intern()));}
"*"						{return new Symbol(sym.TIMES, yyline+1, yycolumn+1 ,new Token("TIMES",yytext().intern()));}
","						{return new Symbol(sym.COMMA, yyline+1, yycolumn+1 ,new Token("COMMA",yytext().intern()));}
";"						{return new Symbol(sym.SEMI, yyline+1, yycolumn+1 ,new Token("SEMI",yytext().intern()));}
"{"						{return new Symbol(sym.LBRACE, yyline+1, yycolumn+1 ,new Token("LBRACE",yytext().intern()));}
"}"						{return new Symbol(sym.RBRACE, yyline+1, yycolumn+1 ,new Token("RBRACE",yytext().intern()));}
"("						{return new Symbol(sym.LPAR, yyline+1, yycolumn+1 ,new Token("LPAR",yytext().intern()));}
")"						{return new Symbol(sym.RPAR, yyline+1, yycolumn+1 ,new Token("RPAR",yytext().intern()));}
"["						{return new Symbol(sym.LBRACK, yyline+1, yycolumn+1 ,new Token("LBRACK",yytext().intern()));}
"]"						{return new Symbol(sym.RBRACK, yyline+1, yycolumn+1 ,new Token("RBRACK",yytext().intern()));}
{Integer}                                       {return new Symbol(sym.NUMBER, yyline+1, yycolumn+1 ,new Token("NUMBER",yytext().intern()));}
{Identifier}                                    {return new Symbol(sym.ID, yyline+1, yycolumn+1 ,new Token("ID",yytext().intern()));}
.                                               {/*NAO FAZ NADA*/}