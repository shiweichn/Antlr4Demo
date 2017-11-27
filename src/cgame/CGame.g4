grammar CGame;
import CGameLexerRules;

prog: expression+;

expression  :
            function ('.' function)*                        # func              // 匹配函数链式调用表达式
            | '(' expression ')'                            # parens
            | expression op=('*'|'/') expression            # MulDiv
            | expression op=('+'|'-') expression            # AddSub
            | expression op=('>'|'<'|'>='|'<=') expression  # GtLtGtFt
            | expression op=('==' | '!=') expression        # eqOrne
            | expression '?' expression ':' expression ';'* # ternaryOpt        // 匹配三目运算
            | expression NEWLINE                            # print
            | declare                                       # decl
            | number                                        # num
            | ID                                            # id
            ;

declare     : ID '=' '('* expression ')'* ';' ;                                 // 匹配变量声明

function    : ID '(' ( parameter (',' parameter)* )? ')';                       // 匹配函数以及参数

parameter   : function
            | number
            | ID
            ;

number      : INT                                           # int
            | FLOAT                                         # float
            ;

INT         : [0-9]+ ;
BOOL        : 'TRUE' | 'FALSE';
FLOAT       : INT '.' INT EXP?   // 1.35, 1.35E-9, 0.3, -4.5
            | INT EXP            // 1e10 -3e4
            | INT                // -3, 45
            ;

fragment EXP :   [Ee] [+\-]? INT ;

ID  : [a-zA-z]+[0-9]* ;                     // 匹配标识符


NEWLINE : '\r'? '\n' ; // 告诉语法分析器一个新行的开始(即语句终止标志)
WS  : [ \t]+ -> channel(HIDDEN) ;
