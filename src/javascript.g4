/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar javascript;



prog:   sentencia* (NL|WS)*;


sentencia: asignacion           #asigna
        |  operacion            #opera
        |   declaracion         #declara
        ;



operacion : (WS|NL)* argumento WS* (WS* OPERADORES WS* argumento)* WS* PUNTOCOMA? (WS|NL)* ;
asignacion: declaracion WS* IGUAL WS* ((STRING|NUMERO)|operacion+) PUNTOCOMA? (WS|NL)* ;
declaracion : (WS|NL)* VAR? WS* VARIABLE WS* (COMA WS* VARIABLE)* WS* PUNTOCOMA? (WS|NL)* ;
argumento: (STRING|NUMERO|VARIABLE) ;



/*CARACTERES ESPECIALES*/
PUNTOCOMA: ';';
WS: (' ' | '   ' | '\f' |'    ') ; 
NL: ('\n' | '\r')+ ;
fragment GUIONBAJO: '_';
fragment SIGNODOLAR: '$';
PUNTO: '.';
COMA: ',';
IGUAL: '=';
fragment COMILLAS: '"';


/*CARACTERES ALFANUMERICOS*/
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

/*TIPOS DE DATO*/
NUMERO: DIGITO+ (PUNTO DIGITO+)?;
STRING: COMILLAS (LETRA|NUMERO|WS|NL)* COMILLAS;


/*PALABRAS RESERVADAS*/
VAR: 'var';

/*OPERACIONES MATEMATICAS*/
fragment MENOS: '-';
fragment MAS: '+';
fragment POR: '*';
fragment ENTRE: '/';

OPERADORES: (MENOS|MAS|POR|ENTRE);

/*TOKENS ESPECIALES*/
VARIABLE : (GUIONBAJO|SIGNODOLAR|LETRA)+ (GUIONBAJO|SIGNODOLAR|LETRA|DIGITO)*;

