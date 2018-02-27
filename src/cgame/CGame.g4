grammar CGame;
import CGameLexerRules;

prog: expression+;

expression  :
            function ('.' function)*                        # func              // 匹配函数链式调用表达式
            | '(' expression ')'                            # parens
            | '-' expression                                # minus
            | expression op=('*'|'/') expression            # MulDiv
            | expression op=('+'|'-') expression            # AddSub
            | expression op=('>'|'<'|'>='|'<=') expression  # GtLtGeLe
            | expression op=('==' | '!=') expression        # eqOrne
            | op='!' expression                             # negation
            | expression '&&' expression                    # theWith
            | expression '||' expression                    # theOr
            | expression '?' expression ':' expression      # ternaryOpt        // 匹配三目运算
            | expression ';' (expression ';')*              # codeBlock         // 匹配代码块
            | declare ';' (declare ';')*                    # decl
            | number                                        # num
            | expression NEWLINE                            # newline
            | ifControl                                     # ifctrl
            | forControl                                    # forctrl
            | group                                         # grp
            | ID                                            # id
            | BOOL                                          # bool
            ;

ifControl   : 'if('expression ')'statement ('elseif('expression ')' statement)*;
forControl  : 'for('ID ':' expression ')' statement;
statement : '{'NEWLINE? expression* '}';

declare     : ID '=' expression;                                             // 匹配变量声明

group       : LSQUARE ( parameter (COMMA parameter)* )? RSQUARE;                        //匹配数组

function    : ID '(' ( parameter (',' parameter)* )? ')';                       // 匹配函数以及参数

parameter   : expression
            | group
            | function
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

ID  : [a-zA-Z]+[0-9]* ;                     // 匹配标识符


NEWLINE : '\r'? '\n'? ; // 告诉语法分析器一个新行的开始(即语句终止标志)
WS  : [ \t]+ -> channel(HIDDEN) ;

