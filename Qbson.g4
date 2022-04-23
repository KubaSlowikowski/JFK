grammar Qbson;

prog: 'styrt'( line? SEMI)* 'qniec';

line: ID EQ command     #assign;

command: command ADD command   #addition
    | command SUB command      #substraction
    | command MULT command     #multiplication
    | command DIV command      #division
    | INT       #int
    | REAL      #real
    | ID       #id;

ADD: '+';
SUB: '-';
MULT: '*';
DIV: '/';
EQ: '=';

SEMI : ';';
COMMENT: '//' ~[\r\n]* -> skip;
INT: '0' | '-'?[1-9][0-9]*;
REAL:  '-'?[1-9]*'.'[0-9]*|'-'?[0]*'.'[0-9]*;
ID: [a-z][a-zA-Z0-9_]*;
WS: [ \r\t\n]+ -> skip;