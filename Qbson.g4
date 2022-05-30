grammar Qbson;

prog: 'styrt' lines 'qniec';

lines: ( (line | function)? SEMI)*;

line: ID EQ command                         #assign
    | PRINT OB ID CB                        #print
    | IF cond THEN blockif ENDIF            #if
    | REPEAT repetitions blockrepeat ENDREPEAT    #repeat;

command: command ADD command   #addition
    | command SUB command      #subtraction
    | command MULT command     #multiplication
    | command DIV command      #division
    | INT                      #int
    | REAL                     #real
    | ID                       #id
    | SCAN_INT                 #scanInt
    | SCAN_REAL                #scanReal;


function: FUNCTION fparam fblock ENDFUNCTION;

fparam: ID #fParam;

fblock: (line? SEMI)* #fBlock;

cond: ID '==' INT #condition;

blockif: lines #blockIf;

blockrepeat: lines #blockRepeat;

repetitions: value;

value: ID
       | INT;

REPEAT: 'powtarzaj';
ENDREPEAT: 'juz nie powtarzaj';
FUNCTION: 'fun';
ENDFUNCTION: 'endfun';

IF: 'jesli';
THEN: 'to';
ENDIF: 'wystarczy';

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