/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar javascript;


instruccion: (declaracion|asignacion)*;
             

asignacion: declaracion WS* IGUAL WS* (STRING|NUMERO) PUNTOCOMA? (WS|NL)*;


declaracion : VAR? WS* variable WS* (COMA WS* variable)* PUNTOCOMA? (WS|NL)*;


variable : VARIABLE;



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
MENOS: '-';

/*TOKENS*/
VARIABLE : (GUIONBAJO|SIGNODOLAR|LETRA)+ (GUIONBAJO|SIGNODOLAR|LETRA|DIGITO)*;