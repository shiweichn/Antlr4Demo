grammar CGame;

prog: expression+ ;

expression: method ('.' method)*        // 匹配表达式
        | expression op=('*'|'/') expression
        | expression op=('+'|'-') expression
        | INT
        | FLOAT
        ;

method  : ID '(' args (',' args)* ')'; // 匹配方法
args    : method
        | ID
        | INT
        | FLOAT
        |
        ;

ID  : [a-zA-z]+ ;                     // 匹配标识符
FLOAT                                 // 匹配浮点数
    :   '-'? INT '.' INT EXP?   // 1.35, 1.35E-9, 0.3, -4.5
    |   '-'? INT EXP            // 1e10 -3e4
    |   '-'? INT                // -3, 45
    ;

INT :   '0' | [1-9] [0-9]* ;        // 匹配整数
EXP :   [Ee] [+\-]? INT ;

