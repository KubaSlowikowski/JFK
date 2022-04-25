grammar Qbson;

prog: 'styrt'( line? SEMI)* 'qniec';

line: ID EQ command     #assign
    | PRINT OB ID CB    #print;

command: command ADD command   #addition
    | command SUB command      #subtraction
    | command MULT command     #multiplication
    | command DIV command      #division
    | INT                      #int
    | REAL                     #real
    | ID                       #id
    | SCAN_INT                 #scanInt
    | SCAN_REAL                #scanReal;

PRINT: 'pokazMiSwojeTowary';
SCAN_INT: 'czytejIntidzer()';
SCAN_REAL: 'czytejRijal()';

ADD: '+';
SUB: '-';
MULT: '*';
DIV: '/';
EQ: '=';
OB: '(';
CB: ')';
SEMI : ';';
COMMENT: '//' ~[\r\n]* -> skip;
INT: '0' | '-'?[1-9][0-9]*;
REAL:  '-'?[1-9]*'.'[0-9]*|'-'?[0]*'.'[0-9]*;
ID: [a-z][a-zA-Z0-9_]*;
WS: [ \r\t\n]+ -> skip;