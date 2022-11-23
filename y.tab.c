#ifndef lint
static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";
#endif
#define YYBYACC 1
#line 3 "exemploGC.y"
  import java.io.*;
  import java.util.ArrayList;
  import java.util.Stack;
#line 10 "y.tab.c"
#define ID 257
#define INT 258
#define FLOAT 259
#define BOOL 260
#define NUM 261
#define LIT 262
#define VOID 263
#define MAIN 264
#define READ 265
#define WRITE 266
#define IF 267
#define ELSE 268
#define CONTINUE 269
#define BREAK 270
#define WHILE 271
#define FOR 272
#define TRUE 273
#define FALSE 274
#define EQ 275
#define LEQ 276
#define GEQ 277
#define NEQ 278
#define AND 279
#define OR 280
#define YYERRCODE 256
short yylhs[] = {                                        -1,
    3,    0,    5,    7,    4,    2,    2,    8,    1,    1,
    1,    6,    6,   10,   10,    9,    9,    9,   12,    9,
    9,   14,   15,    9,    9,    9,   17,   18,   19,    9,
   20,    9,   22,   21,   21,   16,   11,   11,   11,   11,
   13,   13,   13,   13,   13,   13,   13,   13,   13,   13,
   13,   13,   13,   13,   13,   13,   13,   13,   13,
};
short yylen[] = {                                         2,
    0,    3,    0,    0,    9,    2,    0,    3,    1,    1,
    1,    3,    0,    1,    0,    1,    3,    4,    0,    7,
    4,    0,    0,    7,    1,    1,    0,    0,    0,   12,
    0,    7,    0,    3,    0,    3,    1,    4,    3,    3,
    1,    1,    1,    1,    3,    2,    3,    3,    3,    3,
    3,    3,    3,    3,    3,    3,    3,    3,    3,
};
short yydefred[] = {                                      1,
    0,    0,    9,   10,   11,    0,    0,    0,    0,    0,
    2,    6,    8,    0,    0,    3,    0,   13,    0,    0,
    0,    0,    0,   26,   25,   22,    0,    0,   13,    0,
    0,   16,   37,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    5,   14,   12,   44,   41,   42,   43,    0,
    0,    0,    0,   39,    0,    0,    0,    0,    0,    0,
   40,   17,   46,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   21,   18,
    0,    0,    0,   27,   45,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   49,   50,   51,    0,    0,
   23,    0,    0,    0,    0,    0,   20,   33,   32,   24,
   28,    0,    0,   34,    0,   29,    0,   30,
};
short yydgoto[] = {                                       1,
    6,    7,    2,   11,   17,   19,   30,    8,   31,   45,
   32,   81,   52,   39,  105,   33,  102,  113,  117,   82,
  109,  112,
};
short yysindex[] = {                                      0,
    0, -167,    0,    0,    0, -255, -260, -167,  -50, -248,
    0,    0,    0,   -5,   15,    0,  -82,    0,  499,   -3,
   20,   22,   24,    0,    0,    0,   29,   27,    0,  -45,
   23,    0,    0,   35,    2, -174, -177,   35,   55, -170,
 -161,  261,    0,    0,    0,    0,    0,    0,    0,   35,
   35,   -9,   35,    0,   56,   57,   -9,   35,   38,   41,
    0,    0,    0,  -37,   35,   35,   35,   35,   35,   35,
   35,   35,   35,   35,   35,   35,   35,   -9,    0,    0,
   58,   60,  -30,    0,    0,   34,   34,   34,   34,   12,
    5,   34,   34,   47,   47,    0,    0,    0,   35,  499,
    0,   35,  -23, -165,  499,  -16,    0,    0,    0,    0,
    0,  499,  -42,    0,   65,    0,  499,    0,
};
short yyrindex[] = {                                      0,
    0, -155,    0,    0,    0,    0,    0, -155,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  -14,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  466,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  432,    0,    0,    0,   71,   68,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  448,    0,    0,
    0,    0,    0,    0,    0,   85,  101,  152,  168,  349,
  416,  333,  400,   45,   69,    0,    0,    0,    0,    0,
    0,    0,    0,  367,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,
};
short yygindex[] = {                                      0,
    0,  105,    0,    0,    0,   87,    0,    0,  -39,    0,
    4,    0,  114,    0,    0,   78,    0,    0,    0,    0,
    0,    0,
};
#define YYTABLESIZE 771
short yytable[] = {                                      77,
   28,    9,   10,   85,   75,   73,   77,   74,   13,   76,
  101,   75,   73,   77,   74,   14,   76,  107,   75,   73,
   77,   74,   72,   76,   71,   75,   73,   77,   74,   72,
   76,   71,   75,   73,   15,   74,   72,   76,   71,   35,
   18,   77,  111,   72,   54,   71,   75,   73,   77,   74,
   72,   76,   71,   75,   73,   16,   74,   34,   76,   36,
  104,   37,   53,   38,   72,  110,   71,   50,   40,   41,
   77,   72,  114,   71,   51,   75,   73,  118,   74,   43,
   76,   44,   55,   77,   56,   47,   59,   47,   75,   47,
    3,    4,    5,   76,   58,   61,   79,   80,   34,   84,
  100,   99,  108,   47,   47,  116,   47,    7,   31,   48,
    4,   48,   12,   48,   19,   42,  115,   60,    0,    0,
    0,    0,    0,    0,    0,   54,    0,   48,   48,    0,
   48,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,   55,    0,   54,   54,    0,   54,    0,    0,    0,
    0,   57,    0,    0,    0,    0,    0,    0,    0,   55,
   55,    0,   55,   63,   64,    0,   78,   47,    0,   47,
    0,   83,    0,    0,    0,    0,    0,    0,   86,   87,
   88,   89,   90,   91,   92,   93,   94,   95,   96,   97,
   98,   48,   56,   48,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   54,   57,   54,
   56,   56,  103,   56,   20,  106,    0,    0,    0,    0,
    0,    0,    0,   55,    0,   55,   57,   57,    0,   57,
    0,    0,    0,    0,    0,    0,    0,   65,   66,   67,
   68,   69,   70,    0,   65,   66,   67,   68,   69,   70,
    0,   65,   66,   67,   68,   69,   70,    0,   65,   66,
   67,   68,   69,   70,    0,   65,   66,   67,   68,   69,
   70,    0,    0,    0,   56,    0,   56,    0,    0,   65,
   66,   67,   68,   69,    0,    0,   65,   66,   67,   68,
   57,   46,   57,    0,    0,   47,    0,    0,    0,    0,
    0,   47,    0,   28,    0,    0,    0,   48,   49,   47,
   47,   47,   47,   47,   47,   47,   47,    0,    0,   47,
   47,   47,   47,   47,   47,   48,    0,    0,    0,    0,
    0,    0,    0,   48,   48,   48,   48,   48,   48,   48,
   48,   54,    0,   48,   48,   48,   48,   48,   48,   54,
   54,   54,   54,   54,   54,   54,   54,   55,    0,   54,
   54,   54,   54,   54,   54,   55,   55,   55,   55,   55,
   55,   55,   55,   52,    0,   55,   55,   55,   55,   55,
   55,    0,    0,   29,    0,   62,    0,    0,    0,   59,
    0,   52,   52,    0,   52,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   59,   56,   35,
    0,    0,    0,    0,    0,    0,   56,   56,   56,   56,
   56,   56,   56,   56,   57,   35,   56,   56,   56,   56,
   56,   56,   57,   57,   57,   57,   57,   57,   57,   57,
   53,    0,   57,   57,   57,   57,   57,   57,    0,    0,
    0,    0,    0,    0,    0,   52,   58,   52,   53,   53,
    0,   53,    0,    0,    0,    0,    0,    0,    0,    0,
    0,   59,   36,   59,   58,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   38,   35,
   36,   35,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   38,    0,   15,    0,
    0,    0,    0,    0,    0,    0,    0,   20,    0,    0,
    0,    0,   53,    0,   53,   21,   22,   23,    0,   24,
   25,   26,   27,    0,    0,    0,    0,    0,   58,    0,
   58,   28,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   36,    0,   36,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   38,    0,   38,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   15,   52,
   15,    0,    0,    0,    0,    0,    0,   52,   52,   52,
   52,   52,   52,   52,   52,   59,    0,   52,   52,   52,
   52,   52,   52,   59,   59,   59,   59,   59,   59,   59,
   59,   29,    0,   35,    0,    0,    0,   59,   59,    0,
    0,   35,   35,   35,    0,   35,   35,   35,   35,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   53,    0,    0,    0,
    0,    0,    0,    0,   53,   53,   53,   53,   53,   53,
   53,   53,   58,    0,   53,   53,   53,   53,   53,   53,
   58,   58,   58,   58,   58,   58,   58,   58,   36,    0,
    0,    0,    0,    0,    0,   58,   36,   36,   36,   36,
   36,   36,   36,   36,   38,    0,    0,    0,    0,    0,
    0,    0,   38,   38,   38,   38,   38,   38,   38,   38,
    0,    0,   15,    0,    0,    0,    0,    0,    0,    0,
   15,   15,   15,    0,   15,   15,   15,   15,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   20,    0,    0,    0,    0,
    0,    0,    0,   21,   22,   23,    0,   24,   25,   26,
   27,
};
short yycheck[] = {                                      37,
   43,  257,  263,   41,   42,   43,   37,   45,   59,   47,
   41,   42,   43,   37,   45,  264,   47,   41,   42,   43,
   37,   45,   60,   47,   62,   42,   43,   37,   45,   60,
   47,   62,   42,   43,   40,   45,   60,   47,   62,   43,
  123,   37,   59,   60,   43,   62,   42,   43,   37,   45,
   60,   47,   62,   42,   43,   41,   45,   61,   47,   40,
  100,   40,   61,   40,   60,  105,   62,   33,   40,   43,
   37,   60,  112,   62,   40,   42,   43,  117,   45,  125,
   47,   59,  257,   37,  262,   41,  257,   43,   42,   45,
  258,  259,  260,   47,   40,  257,   41,   41,   61,   59,
   41,   44,  268,   59,   60,   41,   62,  263,   41,   41,
  125,   43,    8,   45,   44,   29,  113,   40,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   41,   -1,   59,   60,   -1,
   62,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   41,   -1,   59,   60,   -1,   62,   -1,   -1,   -1,
   -1,   38,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   59,
   60,   -1,   62,   50,   51,   -1,   53,  123,   -1,  125,
   -1,   58,   -1,   -1,   -1,   -1,   -1,   -1,   65,   66,
   67,   68,   69,   70,   71,   72,   73,   74,   75,   76,
   77,  123,   41,  125,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,  123,   41,  125,
   59,   60,   99,   62,  257,  102,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,  123,   -1,  125,   59,   60,   -1,   62,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,  275,  276,  277,
  278,  279,  280,   -1,  275,  276,  277,  278,  279,  280,
   -1,  275,  276,  277,  278,  279,  280,   -1,  275,  276,
  277,  278,  279,  280,   -1,  275,  276,  277,  278,  279,
  280,   -1,   -1,   -1,  123,   -1,  125,   -1,   -1,  275,
  276,  277,  278,  279,   -1,   -1,  275,  276,  277,  278,
  123,  257,  125,   -1,   -1,  261,   -1,   -1,   -1,   -1,
   -1,  257,   -1,   43,   -1,   -1,   -1,  273,  274,  265,
  266,  267,  268,  269,  270,  271,  272,   -1,   -1,  275,
  276,  277,  278,  279,  280,  257,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,  265,  266,  267,  268,  269,  270,  271,
  272,  257,   -1,  275,  276,  277,  278,  279,  280,  265,
  266,  267,  268,  269,  270,  271,  272,  257,   -1,  275,
  276,  277,  278,  279,  280,  265,  266,  267,  268,  269,
  270,  271,  272,   41,   -1,  275,  276,  277,  278,  279,
  280,   -1,   -1,  123,   -1,  125,   -1,   -1,   -1,   41,
   -1,   59,   60,   -1,   62,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   59,  257,   43,
   -1,   -1,   -1,   -1,   -1,   -1,  265,  266,  267,  268,
  269,  270,  271,  272,  257,   59,  275,  276,  277,  278,
  279,  280,  265,  266,  267,  268,  269,  270,  271,  272,
   41,   -1,  275,  276,  277,  278,  279,  280,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,  123,   41,  125,   59,   60,
   -1,   62,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,  123,   41,  125,   59,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   41,  123,
   59,  125,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   59,   -1,   43,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,  257,   -1,   -1,
   -1,   -1,  123,   -1,  125,  265,  266,  267,   -1,  269,
  270,  271,  272,   -1,   -1,   -1,   -1,   -1,  123,   -1,
  125,   43,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,  123,   -1,  125,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
  123,   -1,  125,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  123,  257,
  125,   -1,   -1,   -1,   -1,   -1,   -1,  265,  266,  267,
  268,  269,  270,  271,  272,  257,   -1,  275,  276,  277,
  278,  279,  280,  265,  266,  267,  268,  269,  270,  271,
  272,  123,   -1,  257,   -1,   -1,   -1,  279,  280,   -1,
   -1,  265,  266,  267,   -1,  269,  270,  271,  272,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  257,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,  265,  266,  267,  268,  269,  270,
  271,  272,  257,   -1,  275,  276,  277,  278,  279,  280,
  265,  266,  267,  268,  269,  270,  271,  272,  257,   -1,
   -1,   -1,   -1,   -1,   -1,  280,  265,  266,  267,  268,
  269,  270,  271,  272,  257,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  265,  266,  267,  268,  269,  270,  271,  272,
   -1,   -1,  257,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
  265,  266,  267,   -1,  269,  270,  271,  272,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,  257,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,  265,  266,  267,   -1,  269,  270,  271,
  272,
};
#define YYFINAL 1
#ifndef YYDEBUG
#define YYDEBUG 0
#endif
#define YYMAXTOKEN 280
#if YYDEBUG
char *yyname[] = {
"end-of-file",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
"'!'",0,0,0,"'%'",0,0,"'('","')'","'*'","'+'","','","'-'",0,"'/'",0,0,0,0,0,0,0,
0,0,0,0,"';'","'<'","'='","'>'",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,"'{'",0,
"'}'",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,"ID","INT","FLOAT","BOOL","NUM","LIT","VOID","MAIN",
"READ","WRITE","IF","ELSE","CONTINUE","BREAK","WHILE","FOR","TRUE","FALSE","EQ",
"LEQ","GEQ","NEQ","AND","OR",
};
char *yyrule[] = {
"$accept : prog",
"$$1 :",
"prog : $$1 dList mainF",
"$$2 :",
"$$3 :",
"mainF : VOID MAIN '(' ')' $$2 '{' lcmd $$3 '}'",
"dList : decl dList",
"dList :",
"decl : type ID ';'",
"type : INT",
"type : FLOAT",
"type : BOOL",
"lcmd : lcmd cmd gambiarra",
"lcmd :",
"gambiarra : ';'",
"gambiarra :",
"cmd : aexp",
"cmd : '{' lcmd '}'",
"cmd : WRITE '(' LIT ')'",
"$$4 :",
"cmd : WRITE '(' LIT $$4 ',' exp ')'",
"cmd : READ '(' ID ')'",
"$$5 :",
"$$6 :",
"cmd : WHILE $$5 '(' exp ')' $$6 cmd",
"cmd : BREAK",
"cmd : CONTINUE",
"$$7 :",
"$$8 :",
"$$9 :",
"cmd : FOR '(' atrib ';' $$7 exp ';' $$8 aexp ')' $$9 cmd",
"$$10 :",
"cmd : IF '(' exp $$10 ')' cmd restoIf",
"$$11 :",
"restoIf : ELSE $$11 cmd",
"restoIf :",
"atrib : ID '=' exp",
"aexp : atrib",
"aexp : ID '+' '=' exp",
"aexp : ID '+' '+'",
"aexp : '+' '+' ID",
"exp : NUM",
"exp : TRUE",
"exp : FALSE",
"exp : ID",
"exp : '(' exp ')'",
"exp : '!' exp",
"exp : exp '+' exp",
"exp : exp '-' exp",
"exp : exp '*' exp",
"exp : exp '/' exp",
"exp : exp '%' exp",
"exp : exp '>' exp",
"exp : exp '<' exp",
"exp : exp EQ exp",
"exp : exp LEQ exp",
"exp : exp GEQ exp",
"exp : exp NEQ exp",
"exp : exp OR exp",
"exp : exp AND exp",
};
#endif
#define yyclearin (yychar=(-1))
#define yyerrok (yyerrflag=0)
#ifdef YYSTACKSIZE
#ifndef YYMAXDEPTH
#define YYMAXDEPTH YYSTACKSIZE
#endif
#else
#ifdef YYMAXDEPTH
#define YYSTACKSIZE YYMAXDEPTH
#else
#define YYSTACKSIZE 500
#define YYMAXDEPTH 500
#endif
#endif
int yydebug;
int yynerrs;
int yyerrflag;
int yychar;
short *yyssp;
YYSTYPE *yyvsp;
YYSTYPE yyval;
YYSTYPE yylval;
short yyss[YYSTACKSIZE];
YYSTYPE yyvs[YYSTACKSIZE];
#define yystacksize YYSTACKSIZE
#line 234 "exemploGC.y"

  private Yylex lexer;

  private TabSimb ts = new TabSimb();

  private int strCount = 0;
  private ArrayList<String> strTab = new ArrayList<String>();

  private Stack<Integer> pRot = new Stack<Integer>();
  private Stack<Integer> breakRot = new Stack<Integer>();
  private Stack<Integer> continueRot = new Stack<Integer>();
  
  private int proxRot = 1;


  public static int ARRAY = 100;


  private int yylex () {
    int yyl_return = -1;
    try {
      yylval = new ParserVal(0);
      yyl_return = lexer.yylex();
    }
    catch (IOException e) {
      System.err.println("IO error :"+e);
    }
    return yyl_return;
  }


  public void yyerror (String error) {
    System.err.println ("Error: " + error + "  linha: " + lexer.getLine());
  }


  public Parser(Reader r) {
    lexer = new Yylex(r, this);
  }  

  public void setDebug(boolean debug) {
    yydebug = debug;
  }

  public void listarTS() { ts.listar();}

  public static void main(String args[]) throws IOException {

    Parser yyparser;
    if ( args.length > 0 ) {
      // parse a file
      yyparser = new Parser(new FileReader(args[0]));
      yyparser.yyparse();
      // yyparser.listarTS();

    }
    else {
      // interactive mode
      System.out.println("\n\tFormato: java Parser entrada.cmm >entrada.s\n");
    }

  }

							
		void gcExpArit(int oparit) {
 				System.out.println("\tPOPL %EBX");
   			System.out.println("\tPOPL %EAX");

   		switch (oparit) {
     		case '+' : System.out.println("\tADDL %EBX, %EAX" ); break;
     		case '-' : System.out.println("\tSUBL %EBX, %EAX" ); break;
     		case '*' : System.out.println("\tIMULL %EBX, %EAX" ); break;

    		case '/': 
           		     System.out.println("\tMOVL $0, %EDX");
           		     System.out.println("\tIDIVL %EBX");
           		     break;
     		case '%': 
           		     System.out.println("\tMOVL $0, %EDX");
           		     System.out.println("\tIDIVL %EBX");
           		     System.out.println("\tMOVL %EDX, %EAX");
           		     break;
    		}
   		System.out.println("\tPUSHL %EAX");
		}

	public void gcExpRel(int oprel) {

    System.out.println("\tPOPL %EAX");
    System.out.println("\tPOPL %EDX");
    System.out.println("\tCMPL %EAX, %EDX");
    System.out.println("\tMOVL $0, %EAX");
    
    switch (oprel) {
       case '<':  			System.out.println("\tSETL  %AL"); break;
       case '>':  			System.out.println("\tSETG  %AL"); break;
       case Parser.EQ:  System.out.println("\tSETE  %AL"); break;
       case Parser.GEQ: System.out.println("\tSETGE %AL"); break;
       case Parser.LEQ: System.out.println("\tSETLE %AL"); break;
       case Parser.NEQ: System.out.println("\tSETNE %AL"); break;
       }
    
    System.out.println("\tPUSHL %EAX");

	}


	public void gcExpLog(int oplog) {

	   	System.out.println("\tPOPL %EDX");
 		 	System.out.println("\tPOPL %EAX");

  	 	System.out.println("\tCMPL $0, %EAX");
 		  System.out.println("\tMOVL $0, %EAX");
   		System.out.println("\tSETNE %AL");
   		System.out.println("\tCMPL $0, %EDX");
   		System.out.println("\tMOVL $0, %EDX");
   		System.out.println("\tSETNE %DL");

   		switch (oplog) {
    			case Parser.OR:  System.out.println("\tORL  %EDX, %EAX");  break;
    			case Parser.AND: System.out.println("\tANDL  %EDX, %EAX"); break;
       }

    	System.out.println("\tPUSHL %EAX");
	}

	public void gcExpNot(){

  	 System.out.println("\tPOPL %EAX" );
 	   System.out.println("	\tNEGL %EAX" );
  	 System.out.println("	\tPUSHL %EAX");
	}

   private void geraInicio() {
			System.out.println(".text\n\n#\t nome COMPLETO e matricula dos componentes do grupo...\n#\n"); 
			System.out.println(".GLOBL _start\n\n");  
   }

   private void geraFinal(){
	
			System.out.println("\n\n");
			System.out.println("#");
			System.out.println("# devolve o controle para o SO (final da main)");
			System.out.println("#");
			System.out.println("\tmov $0, %ebx");
			System.out.println("\tmov $1, %eax");
			System.out.println("\tint $0x80");
	
			System.out.println("\n");
			System.out.println("#");
			System.out.println("# Funcoes da biblioteca (IO)");
			System.out.println("#");
			System.out.println("\n");
			System.out.println("_writeln:");
			System.out.println("\tMOVL $__fim_msg, %ECX");
			System.out.println("\tDECL %ECX");
			System.out.println("\tMOVB $10, (%ECX)");
			System.out.println("\tMOVL $1, %EDX");
			System.out.println("\tJMP _writeLit");
			System.out.println("_write:");
			System.out.println("\tMOVL $__fim_msg, %ECX");
			System.out.println("\tMOVL $0, %EBX");
			System.out.println("\tCMPL $0, %EAX");
			System.out.println("\tJGE _write3");
			System.out.println("\tNEGL %EAX");
			System.out.println("\tMOVL $1, %EBX");
			System.out.println("_write3:");
			System.out.println("\tPUSHL %EBX");
			System.out.println("\tMOVL $10, %EBX");
			System.out.println("_divide:");
			System.out.println("\tMOVL $0, %EDX");
			System.out.println("\tIDIVL %EBX");
			System.out.println("\tDECL %ECX");
			System.out.println("\tADD $48, %DL");
			System.out.println("\tMOVB %DL, (%ECX)");
			System.out.println("\tCMPL $0, %EAX");
			System.out.println("\tJNE _divide");
			System.out.println("\tPOPL %EBX");
			System.out.println("\tCMPL $0, %EBX");
			System.out.println("\tJE _print");
			System.out.println("\tDECL %ECX");
			System.out.println("\tMOVB $'-', (%ECX)");
			System.out.println("_print:");
			System.out.println("\tMOVL $__fim_msg, %EDX");
			System.out.println("\tSUBL %ECX, %EDX");
			System.out.println("_writeLit:");
			System.out.println("\tMOVL $1, %EBX");
			System.out.println("\tMOVL $4, %EAX");
			System.out.println("\tint $0x80");
			System.out.println("\tRET");
			System.out.println("_read:");
			System.out.println("\tMOVL $15, %EDX");
			System.out.println("\tMOVL $__msg, %ECX");
			System.out.println("\tMOVL $0, %EBX");
			System.out.println("\tMOVL $3, %EAX");
			System.out.println("\tint $0x80");
			System.out.println("\tMOVL $0, %EAX");
			System.out.println("\tMOVL $0, %EBX");
			System.out.println("\tMOVL $0, %EDX");
			System.out.println("\tMOVL $__msg, %ECX");
			System.out.println("\tCMPB $'-', (%ECX)");
			System.out.println("\tJNE _reading");
			System.out.println("\tINCL %ECX");
			System.out.println("\tINC %BL");
			System.out.println("_reading:");
			System.out.println("\tMOVB (%ECX), %DL");
			System.out.println("\tCMP $10, %DL");
			System.out.println("\tJE _fimread");
			System.out.println("\tSUB $48, %DL");
			System.out.println("\tIMULL $10, %EAX");
			System.out.println("\tADDL %EDX, %EAX");
			System.out.println("\tINCL %ECX");
			System.out.println("\tJMP _reading");
			System.out.println("_fimread:");
			System.out.println("\tCMPB $1, %BL");
			System.out.println("\tJNE _fimread2");
			System.out.println("\tNEGL %EAX");
			System.out.println("_fimread2:");
			System.out.println("\tRET");
			System.out.println("\n");
     }

     private void geraAreaDados(){
			System.out.println("");		
			System.out.println("#");
			System.out.println("# area de dados");
			System.out.println("#");
			System.out.println(".data");
			System.out.println("#");
			System.out.println("# variaveis globais");
			System.out.println("#");
			ts.geraGlobais();	
			System.out.println("");
	
    }

     private void geraAreaLiterais() { 

         System.out.println("#\n# area de literais\n#");
         System.out.println("__msg:");
	       System.out.println("\t.zero 30");
	       System.out.println("__fim_msg:");
	       System.out.println("\t.byte 0");
	       System.out.println("\n");

         for (int i = 0; i<strTab.size(); i++ ) {
             System.out.println("_str_"+i+":");
             System.out.println("\t .ascii \""+strTab.get(i)+"\""); 
	           System.out.println("_str_"+i+"Len = . - _str_"+i);  
	      }		
   }
   
#line 625 "y.tab.c"
#define YYABORT goto yyabort
#define YYACCEPT goto yyaccept
#define YYERROR goto yyerrlab
int
yyparse()
{
    register int yym, yyn, yystate;
#if YYDEBUG
    register char *yys;
    extern char *getenv();

    if (yys = getenv("YYDEBUG"))
    {
        yyn = *yys;
        if (yyn >= '0' && yyn <= '9')
            yydebug = yyn - '0';
    }
#endif

    yynerrs = 0;
    yyerrflag = 0;
    yychar = (-1);

    yyssp = yyss;
    yyvsp = yyvs;
    *yyssp = yystate = 0;

yyloop:
    if (yyn = yydefred[yystate]) goto yyreduce;
    if (yychar < 0)
    {
        if ((yychar = yylex()) < 0) yychar = 0;
#if YYDEBUG
        if (yydebug)
        {
            yys = 0;
            if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
            if (!yys) yys = "illegal-symbol";
            printf("yydebug: state %d, reading %d (%s)\n", yystate,
                    yychar, yys);
        }
#endif
    }
    if ((yyn = yysindex[yystate]) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
    {
#if YYDEBUG
        if (yydebug)
            printf("yydebug: state %d, shifting to state %d (%s)\n",
                    yystate, yytable[yyn],yyrule[yyn]);
#endif
        if (yyssp >= yyss + yystacksize - 1)
        {
            goto yyoverflow;
        }
        *++yyssp = yystate = yytable[yyn];
        *++yyvsp = yylval;
        yychar = (-1);
        if (yyerrflag > 0)  --yyerrflag;
        goto yyloop;
    }
    if ((yyn = yyrindex[yystate]) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
    {
        yyn = yytable[yyn];
        goto yyreduce;
    }
    if (yyerrflag) goto yyinrecovery;
#ifdef lint
    goto yynewerror;
#endif
yynewerror:
    yyerror("syntax error");
#ifdef lint
    goto yyerrlab;
#endif
yyerrlab:
    ++yynerrs;
yyinrecovery:
    if (yyerrflag < 3)
    {
        yyerrflag = 3;
        for (;;)
        {
            if ((yyn = yysindex[*yyssp]) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
#if YYDEBUG
                if (yydebug)
                    printf("yydebug: state %d, error recovery shifting\
 to state %d\n", *yyssp, yytable[yyn]);
#endif
                if (yyssp >= yyss + yystacksize - 1)
                {
                    goto yyoverflow;
                }
                *++yyssp = yystate = yytable[yyn];
                *++yyvsp = yylval;
                goto yyloop;
            }
            else
            {
#if YYDEBUG
                if (yydebug)
                    printf("yydebug: error recovery discarding state %d\n",
                            *yyssp);
#endif
                if (yyssp <= yyss) goto yyabort;
                --yyssp;
                --yyvsp;
            }
        }
    }
    else
    {
        if (yychar == 0) goto yyabort;
#if YYDEBUG
        if (yydebug)
        {
            yys = 0;
            if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
            if (!yys) yys = "illegal-symbol";
            printf("yydebug: state %d, error recovery discards token %d (%s)\n",
                    yystate, yychar, yys);
        }
#endif
        yychar = (-1);
        goto yyloop;
    }
yyreduce:
#if YYDEBUG
    if (yydebug)
        printf("yydebug: state %d, reducing by rule %d (%s)\n",
                yystate, yyn, yyrule[yyn]);
#endif
    yym = yylen[yyn];
    yyval = yyvsp[1-yym];
    switch (yyn)
    {
case 1:
#line 30 "exemploGC.y"
{ geraInicio(); }
break;
case 2:
#line 30 "exemploGC.y"
{ geraAreaDados(); geraAreaLiterais(); }
break;
case 3:
#line 32 "exemploGC.y"
{ System.out.println("_start:"); }
break;
case 4:
#line 33 "exemploGC.y"
{ geraFinal(); }
break;
case 8:
#line 38 "exemploGC.y"
{  TS_entry nodo = ts.pesquisa(yyvsp[-1].sval);
    	                if (nodo != null) 
                            yyerror("(sem) variavel >" + yyvsp[-1].sval + "< jah declarada");
                        else ts.insert(new TS_entry(yyvsp[-1].sval, yyvsp[-2].ival)); }
break;
case 9:
#line 44 "exemploGC.y"
{ yyval.ival = INT; }
break;
case 10:
#line 45 "exemploGC.y"
{ yyval.ival = FLOAT; }
break;
case 11:
#line 46 "exemploGC.y"
{ yyval.ival = BOOL; }
break;
case 17:
#line 58 "exemploGC.y"
{ System.out.println("\t\t# terminou o bloco..."); }
break;
case 18:
#line 60 "exemploGC.y"
{ 
								strTab.add(yyvsp[-1].sval);
                            	System.out.println("\tMOVL $_str_"+strCount+"Len, %EDX"); 
								System.out.println("\tMOVL $_str_"+strCount+", %ECX"); 
                                System.out.println("\tCALL _writeLit"); 
								System.out.println("\tCALL _writeln"); 
                                strCount++;
							}
break;
case 19:
#line 70 "exemploGC.y"
{ 
					strTab.add(yyvsp[0].sval);
                    System.out.println("\tMOVL $_str_"+strCount+"Len, %EDX"); 
					System.out.println("\tMOVL $_str_"+strCount+", %ECX"); 
                    System.out.println("\tCALL _writeLit"); 
					strCount++;
				}
break;
case 20:
#line 78 "exemploGC.y"
{ 
					System.out.println("\tPOPL %EAX"); 
					System.out.println("\tCALL _write");	
					System.out.println("\tCALL _writeln"); 
            	}
break;
case 21:
#line 85 "exemploGC.y"
{
								System.out.println("\tPUSHL $_"+yyvsp[-1].sval);
								System.out.println("\tCALL _read");
								System.out.println("\tPOPL %EDX");
								System.out.println("\tMOVL %EAX, (%EDX)");
							}
break;
case 22:
#line 92 "exemploGC.y"
{
				pRot.push(proxRot);  
				proxRot += 2;
				System.out.printf("rot_%02d:\n",pRot.peek());
				continueRot.push((int)pRot.peek());
				breakRot.push((int)pRot.peek()+1);
			}
break;
case 23:
#line 99 "exemploGC.y"
{
			 				System.out.println("\tPOPL %EAX   # desvia se falso...");
							System.out.println("\tCMPL $0, %EAX");
							System.out.printf("\tJE rot_%02d\n", (int)pRot.peek()+1);
						}
break;
case 24:
#line 105 "exemploGC.y"
{
				  			System.out.printf("\tJMP rot_%02d   # terminou cmd na linha de cima\n", pRot.peek());
							System.out.printf("rot_%02d:\n",(int)pRot.peek()+1);
							pRot.pop();
							breakRot.pop();
							continueRot.pop();
						}
break;
case 25:
#line 112 "exemploGC.y"
{ System.out.printf("\t JMP rot_%02d\n", breakRot.peek()); }
break;
case 26:
#line 113 "exemploGC.y"
{ System.out.printf("\t JMP rot_%02d\n", continueRot.peek());}
break;
case 27:
#line 121 "exemploGC.y"
{ 	/*aloca 4 rótulos e insere o primeiro*/
				pRot.push(proxRot);  proxRot += 4;
				continueRot.push(pRot.peek()+3);
				breakRot.push(pRot.peek()+1);
				
				/* RÓTULO 1: VERIFICA EXPRESSÃO */
				System.out.printf("rot_%02d: \t\t#EXP \n",(int)pRot.peek());
			}
break;
case 28:
#line 130 "exemploGC.y"
{   /*se exp é falsa, salta para o final*/
				System.out.println("\tPOPL %EAX");
				System.out.println("\tCMPL $0, %EAX");
				System.out.printf("\tJE rot_%02d\n", pRot.peek()+1); /* SALTA RÓTULO 2 (FIM)*/
				System.out.printf("\tJMP rot_%02d\n", pRot.peek()+2); /* SALTA RÓTULO 3 (COMANDO)*/
			
				/* RÓTULO 3: INCREMENTA i*/
				System.out.printf("rot_%02d: \t\t#INCR\n",(int)pRot.peek()+3);
			}
break;
case 29:
#line 140 "exemploGC.y"
{
				System.out.printf("\tJMP rot_%02d\n", pRot.peek()); /* SALTA RÓTULO 1 (VERIF. EXPRESSÃO)*/
			
				/* RÓTULO 3: COMANDO*/
				System.out.printf("rot_%02d: \t\t#COMANDO\n",(int)pRot.peek()+2);
			}
break;
case 30:
#line 147 "exemploGC.y"
{
				System.out.printf("\tJMP rot_%02d\n", pRot.peek()+3); /* SALTA RÓTULO 3 (INCREMENTO i)*/
				/* RÓTULO 2: FIM*/
				System.out.printf("rot_%02d:\t\t#FIM\n",(int)pRot.peek()+1);
				pRot.pop();
				continueRot.pop();
				breakRot.pop();
			}
break;
case 31:
#line 157 "exemploGC.y"
{	
					pRot.push(proxRot);  proxRot += 2;
					System.out.println("\tPOPL %EAX");
					System.out.println("\tCMPL $0, %EAX");
					System.out.printf("\tJE rot_%02d\n", pRot.peek());
				}
break;
case 32:
#line 164 "exemploGC.y"
{
					System.out.printf("rot_%02d:\n",pRot.peek()+1);
					pRot.pop();
				}
break;
case 33:
#line 171 "exemploGC.y"
{
					System.out.printf("\tJMP rot_%02d\n", pRot.peek()+1);
					System.out.printf("rot_%02d:\n",pRot.peek());
				}
break;
case 35:
#line 178 "exemploGC.y"
{
		    System.out.printf("\tJMP rot_%02d\n", pRot.peek()+1);
			System.out.printf("rot_%02d:\n",pRot.peek());
		}
break;
case 36:
#line 184 "exemploGC.y"
{
						System.out.println("\tPOPL %EDX");
  						System.out.println("\tMOVL %EDX, _"+yyvsp[-2].sval);
					}
break;
case 38:
#line 190 "exemploGC.y"
{
							System.out.println("\tPUSHL _"+yyvsp[-3].sval);
						   	System.out.println("\tPOPL %EBX");
   						   	System.out.println("\tPOPL %EAX");
						   	System.out.println("\tADDL %EBX, %EAX" );
							System.out.println("\tPUSHL %EAX");
						 	System.out.println("\tPOPL %EDX");
						   	System.out.println("\tMOVL %EDX, _"+yyvsp[-3].sval);
						}
break;
case 39:
#line 199 "exemploGC.y"
{
						System.out.println("\tPUSHL $1");
						System.out.println("\tPOPL %EBX");
   						System.out.println("\tPOPL %EAX");
						System.out.println("\tADDL %EBX, %EAX" );
						System.out.println("\tPUSHL %EAX");
						System.out.println("\tPOPL %EDX");
						System.out.println("\tMOVL %EDX, _"+yyvsp[-2].sval);
					}
break;
case 41:
#line 211 "exemploGC.y"
{ System.out.println("\tPUSHL $"+yyvsp[0].sval); }
break;
case 42:
#line 212 "exemploGC.y"
{ System.out.println("\tPUSHL $1"); }
break;
case 43:
#line 213 "exemploGC.y"
{ System.out.println("\tPUSHL $0"); }
break;
case 44:
#line 214 "exemploGC.y"
{ System.out.println("\tPUSHL _"+yyvsp[0].sval); }
break;
case 46:
#line 216 "exemploGC.y"
{ gcExpNot(); }
break;
case 47:
#line 217 "exemploGC.y"
{ gcExpArit('+'); }
break;
case 48:
#line 218 "exemploGC.y"
{ gcExpArit('-'); }
break;
case 49:
#line 219 "exemploGC.y"
{ gcExpArit('*'); }
break;
case 50:
#line 220 "exemploGC.y"
{ gcExpArit('/'); }
break;
case 51:
#line 221 "exemploGC.y"
{ gcExpArit('%'); }
break;
case 52:
#line 222 "exemploGC.y"
{ gcExpRel('>'); }
break;
case 53:
#line 223 "exemploGC.y"
{ gcExpRel('<'); }
break;
case 54:
#line 224 "exemploGC.y"
{ gcExpRel(EQ); }
break;
case 55:
#line 225 "exemploGC.y"
{ gcExpRel(LEQ); }
break;
case 56:
#line 226 "exemploGC.y"
{ gcExpRel(GEQ); }
break;
case 57:
#line 227 "exemploGC.y"
{ gcExpRel(NEQ); }
break;
case 58:
#line 228 "exemploGC.y"
{ gcExpLog(OR); }
break;
case 59:
#line 229 "exemploGC.y"
{ gcExpLog(AND); }
break;
#line 1054 "y.tab.c"
    }
    yyssp -= yym;
    yystate = *yyssp;
    yyvsp -= yym;
    yym = yylhs[yyn];
    if (yystate == 0 && yym == 0)
    {
#if YYDEBUG
        if (yydebug)
            printf("yydebug: after reduction, shifting from state 0 to\
 state %d\n", YYFINAL);
#endif
        yystate = YYFINAL;
        *++yyssp = YYFINAL;
        *++yyvsp = yyval;
        if (yychar < 0)
        {
            if ((yychar = yylex()) < 0) yychar = 0;
#if YYDEBUG
            if (yydebug)
            {
                yys = 0;
                if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
                if (!yys) yys = "illegal-symbol";
                printf("yydebug: state %d, reading %d (%s)\n",
                        YYFINAL, yychar, yys);
            }
#endif
        }
        if (yychar == 0) goto yyaccept;
        goto yyloop;
    }
    if ((yyn = yygindex[yym]) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn];
    else
        yystate = yydgoto[yym];
#if YYDEBUG
    if (yydebug)
        printf("yydebug: after reduction, shifting from state %d \
to state %d\n", *yyssp, yystate);
#endif
    if (yyssp >= yyss + yystacksize - 1)
    {
        goto yyoverflow;
    }
    *++yyssp = yystate;
    *++yyvsp = yyval;
    goto yyloop;
yyoverflow:
    yyerror("yacc stack overflow");
yyabort:
    return (1);
yyaccept:
    return (0);
}
