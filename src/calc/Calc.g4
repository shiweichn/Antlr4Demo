grammar Calc ;

/** 起始规则，语法分析的起点*/
prog: stat+ ;

stat: expr NEWLINE          # printExpr
    | ID '=' expr NEWLINE   # assign
    | NEWLINE               # blank
    ;

expr: expr ('*'|'/') expr   # MulDiv
    | expr ('+'|'-') expr   # AddSub
    | INT                   # int
    | ID                    # id
    | '(' expr ')'          # parens
    ;

EQUAL : '=' ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
LPAREN : '(' ;
RPAREN : ')' ;

ID  : [a-zA-z]+ ;   // 匹配标识符
INT : [0-9]+    ;   // 匹配整数
NEWLINE : '\r'? '\n' ; // 告诉语法分析器一个新行的开始(即语句终止标志)
WS  : [ \t]+ -> skip ; // 丢弃空白字符

/**
语法分析器的规则以小写字母开头 例如：stat 、expr
词法分析器的规则以大写字母开头 例如：ID、INT、NEWLINE、WS等

使用 | 来分隔同一语言的若干备选分支，使用圆括号把一些符号组成子规则。
*/
