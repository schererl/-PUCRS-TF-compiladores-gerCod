//### This file created by BYACC 1.8(/Java extension  1.15)
//### Java capabilities added 7 Jan 97, Bob Jamison
//### Updated : 27 Nov 97  -- Bob Jamison, Joe Nieten
//###           01 Jan 98  -- Bob Jamison -- fixed generic semantic constructor
//###           01 Jun 99  -- Bob Jamison -- added Runnable support
//###           06 Aug 00  -- Bob Jamison -- made state variables class-global
//###           03 Jan 01  -- Bob Jamison -- improved flags, tracing
//###           16 May 01  -- Bob Jamison -- added custom stack sizing
//###           04 Mar 02  -- Yuval Oren  -- improved java performance, added options
//###           14 Mar 02  -- Tomas Hurka -- -d support, static initializer workaround
//### Please send bug reports to tom@hukatronic.cz
//### static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";






//#line 4 "exemploGC.y"
  import java.io.*;
  import java.util.ArrayList;
  import java.util.Stack;
//#line 21 "Parser.java"




public class Parser
{

boolean yydebug;        //do I want debug output?
int yynerrs;            //number of errors so far
int yyerrflag;          //was there an error?
int yychar;             //the current working character

//########## MESSAGES ##########
//###############################################################
// method: debug
//###############################################################
void debug(String msg)
{
  if (yydebug)
    System.out.println(msg);
}

//########## STATE STACK ##########
final static int YYSTACKSIZE = 500;  //maximum stack size
int statestk[] = new int[YYSTACKSIZE]; //state stack
int stateptr;
int stateptrmax;                     //highest index of stackptr
int statemax;                        //state when highest index reached
//###############################################################
// methods: state stack push,pop,drop,peek
//###############################################################
final void state_push(int state)
{
  try {
		stateptr++;
		statestk[stateptr]=state;
	 }
	 catch (ArrayIndexOutOfBoundsException e) {
     int oldsize = statestk.length;
     int newsize = oldsize * 2;
     int[] newstack = new int[newsize];
     System.arraycopy(statestk,0,newstack,0,oldsize);
     statestk = newstack;
     statestk[stateptr]=state;
  }
}
final int state_pop()
{
  return statestk[stateptr--];
}
final void state_drop(int cnt)
{
  stateptr -= cnt; 
}
final int state_peek(int relative)
{
  return statestk[stateptr-relative];
}
//###############################################################
// method: init_stacks : allocate and prepare stacks
//###############################################################
final boolean init_stacks()
{
  stateptr = -1;
  val_init();
  return true;
}
//###############################################################
// method: dump_stacks : show n levels of the stacks
//###############################################################
void dump_stacks(int count)
{
int i;
  System.out.println("=index==state====value=     s:"+stateptr+"  v:"+valptr);
  for (i=0;i<count;i++)
    System.out.println(" "+i+"    "+statestk[i]+"      "+valstk[i]);
  System.out.println("======================");
}


//########## SEMANTIC VALUES ##########
//public class ParserVal is defined in ParserVal.java


String   yytext;//user variable to return contextual strings
ParserVal yyval; //used to return semantic vals from action routines
ParserVal yylval;//the 'lval' (result) I got from yylex()
ParserVal valstk[];
int valptr;
//###############################################################
// methods: value stack push,pop,drop,peek.
//###############################################################
void val_init()
{
  valstk=new ParserVal[YYSTACKSIZE];
  yyval=new ParserVal();
  yylval=new ParserVal();
  valptr=-1;
}
void val_push(ParserVal val)
{
  if (valptr>=YYSTACKSIZE)
    return;
  valstk[++valptr]=val;
}
ParserVal val_pop()
{
  if (valptr<0)
    return new ParserVal();
  return valstk[valptr--];
}
void val_drop(int cnt)
{
int ptr;
  ptr=valptr-cnt;
  if (ptr<0)
    return;
  valptr = ptr;
}
ParserVal val_peek(int relative)
{
int ptr;
  ptr=valptr-relative;
  if (ptr<0)
    return new ParserVal();
  return valstk[ptr];
}
final ParserVal dup_yyval(ParserVal val)
{
  ParserVal dup = new ParserVal();
  dup.ival = val.ival;
  dup.dval = val.dval;
  dup.sval = val.sval;
  dup.obj = val.obj;
  return dup;
}
//#### end semantic value section ####
public final static short ID=257;
public final static short INT=258;
public final static short FLOAT=259;
public final static short BOOL=260;
public final static short NUM=261;
public final static short LIT=262;
public final static short VOID=263;
public final static short MAIN=264;
public final static short READ=265;
public final static short WRITE=266;
public final static short IF=267;
public final static short ELSE=268;
public final static short CONTINUE=269;
public final static short BREAK=270;
public final static short WHILE=271;
public final static short FOR=272;
public final static short TRUE=273;
public final static short FALSE=274;
public final static short EQ=275;
public final static short LEQ=276;
public final static short GEQ=277;
public final static short NEQ=278;
public final static short AND=279;
public final static short OR=280;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    3,    0,    5,    7,    4,    2,    2,    8,    1,    1,
    1,    6,    6,   10,   10,    9,    9,    9,   12,    9,
    9,   14,   15,    9,    9,    9,   17,   18,   19,    9,
   20,    9,   22,   21,   21,   16,   11,   11,   11,   11,
   13,   13,   13,   13,   13,   13,   13,   13,   13,   13,
   13,   13,   13,   13,   13,   13,   13,   13,   13,
};
final static short yylen[] = {                            2,
    0,    3,    0,    0,    9,    2,    0,    3,    1,    1,
    1,    3,    0,    1,    0,    1,    3,    4,    0,    7,
    4,    0,    0,    7,    1,    1,    0,    0,    0,   12,
    0,    7,    0,    3,    0,    3,    1,    4,    3,    3,
    1,    1,    1,    1,    3,    2,    3,    3,    3,    3,
    3,    3,    3,    3,    3,    3,    3,    3,    3,
};
final static short yydefred[] = {                         1,
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
final static short yydgoto[] = {                          1,
    6,    7,    2,   11,   17,   19,   30,    8,   31,   45,
   32,   81,   52,   39,  105,   33,  102,  113,  117,   82,
  109,  112,
};
final static short yysindex[] = {                         0,
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
final static short yyrindex[] = {                         0,
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
final static short yygindex[] = {                         0,
    0,  105,    0,    0,    0,   87,    0,    0,  -39,    0,
    4,    0,  114,    0,    0,   78,    0,    0,    0,    0,
    0,    0,
};
final static int YYTABLESIZE=771;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                         77,
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
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         37,
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
}
final static short YYFINAL=1;
final static short YYMAXTOKEN=280;
final static String yyname[] = {
"end-of-file",null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,"'!'",null,null,null,"'%'",null,null,"'('","')'","'*'","'+'",
"','","'-'",null,"'/'",null,null,null,null,null,null,null,null,null,null,null,
"';'","'<'","'='","'>'",null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,"'{'",null,"'}'",null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,"ID","INT","FLOAT","BOOL","NUM","LIT",
"VOID","MAIN","READ","WRITE","IF","ELSE","CONTINUE","BREAK","WHILE","FOR",
"TRUE","FALSE","EQ","LEQ","GEQ","NEQ","AND","OR",
};
final static String yyrule[] = {
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
"lcmd : lcmd cmd endcmd",
"lcmd :",
"endcmd : ';'",
"endcmd :",
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

//#line 236 "exemploGC.y"

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
			System.out.println(".text\n\n#\t Victor Scherer Putrich(17104197-3)\n#\n"); 
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
   
//#line 692 "Parser.java"
//###############################################################
// method: yylexdebug : check lexer state
//###############################################################
void yylexdebug(int state,int ch)
{
String s=null;
  if (ch < 0) ch=0;
  if (ch <= YYMAXTOKEN) //check index bounds
     s = yyname[ch];    //now get it
  if (s==null)
    s = "illegal-symbol";
  debug("state "+state+", reading "+ch+" ("+s+")");
}





//The following are now global, to aid in error reporting
int yyn;       //next next thing to do
int yym;       //
int yystate;   //current parsing state from state table
String yys;    //current token string


//###############################################################
// method: yyparse : parse input and execute indicated items
//###############################################################
int yyparse()
{
boolean doaction;
  init_stacks();
  yynerrs = 0;
  yyerrflag = 0;
  yychar = -1;          //impossible char forces a read
  yystate=0;            //initial state
  state_push(yystate);  //save it
  val_push(yylval);     //save empty value
  while (true) //until parsing is done, either correctly, or w/error
    {
    doaction=true;
    if (yydebug) debug("loop"); 
    //#### NEXT ACTION (from reduction table)
    for (yyn=yydefred[yystate];yyn==0;yyn=yydefred[yystate])
      {
      if (yydebug) debug("yyn:"+yyn+"  state:"+yystate+"  yychar:"+yychar);
      if (yychar < 0)      //we want a char?
        {
        yychar = yylex();  //get next token
        if (yydebug) debug(" next yychar:"+yychar);
        //#### ERROR CHECK ####
        if (yychar < 0)    //it it didn't work/error
          {
          yychar = 0;      //change it to default string (no -1!)
          if (yydebug)
            yylexdebug(yystate,yychar);
          }
        }//yychar<0
      yyn = yysindex[yystate];  //get amount to shift by (shift index)
      if ((yyn != 0) && (yyn += yychar) >= 0 &&
          yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
        {
        if (yydebug)
          debug("state "+yystate+", shifting to state "+yytable[yyn]);
        //#### NEXT STATE ####
        yystate = yytable[yyn];//we are in a new state
        state_push(yystate);   //save it
        val_push(yylval);      //push our lval as the input for next rule
        yychar = -1;           //since we have 'eaten' a token, say we need another
        if (yyerrflag > 0)     //have we recovered an error?
           --yyerrflag;        //give ourselves credit
        doaction=false;        //but don't process yet
        break;   //quit the yyn=0 loop
        }

    yyn = yyrindex[yystate];  //reduce
    if ((yyn !=0 ) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
      {   //we reduced!
      if (yydebug) debug("reduce");
      yyn = yytable[yyn];
      doaction=true; //get ready to execute
      break;         //drop down to actions
      }
    else //ERROR RECOVERY
      {
      if (yyerrflag==0)
        {
        yyerror("syntax error");
        yynerrs++;
        }
      if (yyerrflag < 3) //low error count?
        {
        yyerrflag = 3;
        while (true)   //do until break
          {
          if (stateptr<0)   //check for under & overflow here
            {
            yyerror("stack underflow. aborting...");  //note lower case 's'
            return 1;
            }
          yyn = yysindex[state_peek(0)];
          if ((yyn != 0) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
            if (yydebug)
              debug("state "+state_peek(0)+", error recovery shifting to state "+yytable[yyn]+" ");
            yystate = yytable[yyn];
            state_push(yystate);
            val_push(yylval);
            doaction=false;
            break;
            }
          else
            {
            if (yydebug)
              debug("error recovery discarding state "+state_peek(0)+" ");
            if (stateptr<0)   //check for under & overflow here
              {
              yyerror("Stack underflow. aborting...");  //capital 'S'
              return 1;
              }
            state_pop();
            val_pop();
            }
          }
        }
      else            //discard this token
        {
        if (yychar == 0)
          return 1; //yyabort
        if (yydebug)
          {
          yys = null;
          if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
          if (yys == null) yys = "illegal-symbol";
          debug("state "+yystate+", error recovery discards token "+yychar+" ("+yys+")");
          }
        yychar = -1;  //read another
        }
      }//end error recovery
    }//yyn=0 loop
    if (!doaction)   //any reason not to proceed?
      continue;      //skip action
    yym = yylen[yyn];          //get count of terminals on rhs
    if (yydebug)
      debug("state "+yystate+", reducing "+yym+" by rule "+yyn+" ("+yyrule[yyn]+")");
    if (yym>0)                 //if count of rhs not 'nil'
      yyval = val_peek(yym-1); //get current semantic value
    yyval = dup_yyval(yyval); //duplicate yyval if ParserVal is used as semantic value
    switch(yyn)
      {
//########## USER-SUPPLIED ACTIONS ##########
case 1:
//#line 31 "exemploGC.y"
{ geraInicio(); }
break;
case 2:
//#line 31 "exemploGC.y"
{ geraAreaDados(); geraAreaLiterais(); }
break;
case 3:
//#line 33 "exemploGC.y"
{ System.out.println("_start:"); }
break;
case 4:
//#line 34 "exemploGC.y"
{ geraFinal(); }
break;
case 8:
//#line 39 "exemploGC.y"
{  TS_entry nodo = ts.pesquisa(val_peek(1).sval);
    	                if (nodo != null) 
                            yyerror("(sem) variavel >" + val_peek(1).sval + "< jah declarada");
                        else ts.insert(new TS_entry(val_peek(1).sval, val_peek(2).ival)); }
break;
case 9:
//#line 45 "exemploGC.y"
{ yyval.ival = INT; }
break;
case 10:
//#line 46 "exemploGC.y"
{ yyval.ival = FLOAT; }
break;
case 11:
//#line 47 "exemploGC.y"
{ yyval.ival = BOOL; }
break;
case 17:
//#line 59 "exemploGC.y"
{ System.out.println("\t\t# terminou o bloco..."); }
break;
case 18:
//#line 61 "exemploGC.y"
{ 
								strTab.add(val_peek(1).sval);
                            	System.out.println("\tMOVL $_str_"+strCount+"Len, %EDX"); 
								System.out.println("\tMOVL $_str_"+strCount+", %ECX"); 
                                System.out.println("\tCALL _writeLit"); 
								System.out.println("\tCALL _writeln"); 
                                strCount++;
							}
break;
case 19:
//#line 71 "exemploGC.y"
{ 
					strTab.add(val_peek(0).sval);
                    System.out.println("\tMOVL $_str_"+strCount+"Len, %EDX"); 
					System.out.println("\tMOVL $_str_"+strCount+", %ECX"); 
                    System.out.println("\tCALL _writeLit"); 
					strCount++;
				}
break;
case 20:
//#line 79 "exemploGC.y"
{ 
					System.out.println("\tPOPL %EAX"); 
					System.out.println("\tCALL _write");	
					System.out.println("\tCALL _writeln"); 
            	}
break;
case 21:
//#line 86 "exemploGC.y"
{
								System.out.println("\tPUSHL $_"+val_peek(1).sval);
								System.out.println("\tCALL _read");
								System.out.println("\tPOPL %EDX");
								System.out.println("\tMOVL %EAX, (%EDX)");
							}
break;
case 22:
//#line 93 "exemploGC.y"
{
				pRot.push(proxRot);  
				proxRot += 2;
				System.out.printf("rot_%02d:\n",pRot.peek());
				continueRot.push((int)pRot.peek());
				breakRot.push((int)pRot.peek()+1);
			}
break;
case 23:
//#line 100 "exemploGC.y"
{
			 				System.out.println("\tPOPL %EAX   # desvia se falso...");
							System.out.println("\tCMPL $0, %EAX");
							System.out.printf("\tJE rot_%02d\n", (int)pRot.peek()+1);
						}
break;
case 24:
//#line 106 "exemploGC.y"
{
				  			System.out.printf("\tJMP rot_%02d   # terminou cmd na linha de cima\n", pRot.peek());
							System.out.printf("rot_%02d:\n",(int)pRot.peek()+1);
							pRot.pop();
							breakRot.pop();
							continueRot.pop();
						}
break;
case 25:
//#line 113 "exemploGC.y"
{ System.out.printf("\t JMP rot_%02d\n", breakRot.peek()); }
break;
case 26:
//#line 114 "exemploGC.y"
{ System.out.printf("\t JMP rot_%02d\n", continueRot.peek());}
break;
case 27:
//#line 122 "exemploGC.y"
{ 	/*aloca 4 rótulos e insere o primeiro*/
				pRot.push(proxRot);  proxRot += 4;
				continueRot.push(pRot.peek()+3);
				breakRot.push(pRot.peek()+1);
				
				/* RÓTULO 1: VERIFICA EXPRESSÃO */
				System.out.printf("rot_%02d: \t\t#EXP \n",(int)pRot.peek());
			}
break;
case 28:
//#line 131 "exemploGC.y"
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
//#line 141 "exemploGC.y"
{
				System.out.printf("\tJMP rot_%02d\n", pRot.peek()); /* SALTA RÓTULO 1 (VERIF. EXPRESSÃO)*/
			
				/* RÓTULO 3: COMANDO*/
				System.out.printf("rot_%02d: \t\t#COMANDO\n",(int)pRot.peek()+2);
			}
break;
case 30:
//#line 148 "exemploGC.y"
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
//#line 158 "exemploGC.y"
{	
					pRot.push(proxRot);  proxRot += 2;
					System.out.println("\tPOPL %EAX");
					System.out.println("\tCMPL $0, %EAX");
					System.out.printf("\tJE rot_%02d\n", pRot.peek());
				}
break;
case 32:
//#line 165 "exemploGC.y"
{
					System.out.printf("rot_%02d:\n",pRot.peek()+1);
					pRot.pop();
				}
break;
case 33:
//#line 172 "exemploGC.y"
{
					System.out.printf("\tJMP rot_%02d\n", pRot.peek()+1);
					System.out.printf("rot_%02d:\n",pRot.peek());
				}
break;
case 35:
//#line 179 "exemploGC.y"
{
		    System.out.printf("\tJMP rot_%02d\n", pRot.peek()+1);
			System.out.printf("rot_%02d:\n",pRot.peek());
		}
break;
case 36:
//#line 185 "exemploGC.y"
{
						System.out.println("\tPOPL %EDX");
  						System.out.println("\tMOVL %EDX, _"+val_peek(2).sval);
					}
break;
case 38:
//#line 191 "exemploGC.y"
{
							System.out.println("\tPUSHL _"+val_peek(3).sval);
						   	System.out.println("\tPOPL %EBX");
   						   	System.out.println("\tPOPL %EAX");
						   	System.out.println("\tADDL %EBX, %EAX" );
							System.out.println("\tPUSHL %EAX");
						 	System.out.println("\tPOPL %EDX");
						   	System.out.println("\tMOVL %EDX, _"+val_peek(3).sval);
						}
break;
case 39:
//#line 200 "exemploGC.y"
{ /*o incremento ocorre depois do processamento do comando atual. */
						System.out.println("\tPUSHL $1");
						System.out.println("\tPOPL %EBX");
   						System.out.println("\tPOPL %EAX");
						System.out.println("\tADDL %EBX, %EAX" );
						System.out.println("\tPUSHL %EAX");
						System.out.println("\tPOPL %EDX");
						System.out.println("\tMOVL %EDX, _"+val_peek(2).sval);
					}
break;
case 41:
//#line 212 "exemploGC.y"
{ System.out.println("\tPUSHL $"+val_peek(0).sval); }
break;
case 42:
//#line 213 "exemploGC.y"
{ System.out.println("\tPUSHL $1"); }
break;
case 43:
//#line 214 "exemploGC.y"
{ System.out.println("\tPUSHL $0"); }
break;
case 44:
//#line 215 "exemploGC.y"
{ System.out.println("\tPUSHL _"+val_peek(0).sval); }
break;
case 46:
//#line 217 "exemploGC.y"
{ gcExpNot(); }
break;
case 47:
//#line 218 "exemploGC.y"
{ gcExpArit('+'); }
break;
case 48:
//#line 219 "exemploGC.y"
{ gcExpArit('-'); }
break;
case 49:
//#line 220 "exemploGC.y"
{ gcExpArit('*'); }
break;
case 50:
//#line 221 "exemploGC.y"
{ gcExpArit('/'); }
break;
case 51:
//#line 222 "exemploGC.y"
{ gcExpArit('%'); }
break;
case 52:
//#line 223 "exemploGC.y"
{ gcExpRel('>'); }
break;
case 53:
//#line 224 "exemploGC.y"
{ gcExpRel('<'); }
break;
case 54:
//#line 225 "exemploGC.y"
{ gcExpRel(EQ); }
break;
case 55:
//#line 226 "exemploGC.y"
{ gcExpRel(LEQ); }
break;
case 56:
//#line 227 "exemploGC.y"
{ gcExpRel(GEQ); }
break;
case 57:
//#line 228 "exemploGC.y"
{ gcExpRel(NEQ); }
break;
case 58:
//#line 229 "exemploGC.y"
{ gcExpLog(OR); }
break;
case 59:
//#line 230 "exemploGC.y"
{ gcExpLog(AND); }
break;
//#line 1130 "Parser.java"
//########## END OF USER-SUPPLIED ACTIONS ##########
    }//switch
    //#### Now let's reduce... ####
    if (yydebug) debug("reduce");
    state_drop(yym);             //we just reduced yylen states
    yystate = state_peek(0);     //get new state
    val_drop(yym);               //corresponding value drop
    yym = yylhs[yyn];            //select next TERMINAL(on lhs)
    if (yystate == 0 && yym == 0)//done? 'rest' state and at first TERMINAL
      {
      if (yydebug) debug("After reduction, shifting from state 0 to state "+YYFINAL+"");
      yystate = YYFINAL;         //explicitly say we're done
      state_push(YYFINAL);       //and save it
      val_push(yyval);           //also save the semantic value of parsing
      if (yychar < 0)            //we want another character?
        {
        yychar = yylex();        //get next character
        if (yychar<0) yychar=0;  //clean, if necessary
        if (yydebug)
          yylexdebug(yystate,yychar);
        }
      if (yychar == 0)          //Good exit (if lex returns 0 ;-)
         break;                 //quit the loop--all DONE
      }//if yystate
    else                        //else not done yet
      {                         //get next state and push, for next yydefred[]
      yyn = yygindex[yym];      //find out where to go
      if ((yyn != 0) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn]; //get new state
      else
        yystate = yydgoto[yym]; //else go to new defred
      if (yydebug) debug("after reduction, shifting from state "+state_peek(0)+" to state "+yystate+"");
      state_push(yystate);     //going again, so push state & val...
      val_push(yyval);         //for next action
      }
    }//main loop
  return 0;//yyaccept!!
}
//## end of method parse() ######################################



//## run() --- for Thread #######################################
/**
 * A default run method, used for operating this parser
 * object in the background.  It is intended for extending Thread
 * or implementing Runnable.  Turn off with -Jnorun .
 */
public void run()
{
  yyparse();
}
//## end of method run() ########################################



//## Constructors ###############################################
/**
 * Default constructor.  Turn off with -Jnoconstruct .

 */
public Parser()
{
  //nothing to do
}


/**
 * Create a parser, setting the debug to true or false.
 * @param debugMe true for debugging, false for no debug.
 */
public Parser(boolean debugMe)
{
  yydebug=debugMe;
}
//###############################################################



}
//################### END OF CLASS ##############################
