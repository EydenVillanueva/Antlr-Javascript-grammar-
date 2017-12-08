/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar javascript;


instruccion: (declaracion|asignacion)*;
             

asignacion: declaracion (ESPACIO|TABULADOR)? IGUAL (ESPACIO|TABULADOR)? (STRING|NUMERO) PUNTOCOMA?;

declaracion : VAR? (ESPACIO|TABULADOR) variable (COMA (ESPACIO|TABULADOR)? variable)* PUNTOCOMA?;


variable : VARIABLE;


/*CARACTERES ESPECIALES*/
PUNTOCOMA: ';';
ESPACIO: ' ';
fragment GUIONBAJO: '_';
fragment SIGNODOLAR: '$';
PUNTO: '.';
COMA: ',';
TABULADOR: '\t';
IGUAL: '=';
fragment COMILLAS: '"';

/*CARACTERES ALFANUMERICOS*/
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

/*TIPOS DE DATO*/
NUMERO: DIGITO+ (PUNTO DIGITO+)?;
STRING: COMILLAS (LETRA|NUMERO)* COMILLAS;


/*PALABRAS RESERVADAS*/
VAR: 'var';

/*OPERACIONES MATEMATICAS*/
MENOS: '-';

/*TOKENS*/
VARIABLE : (GUIONBAJO|SIGNODOLAR|LETRA)+ (GUIONBAJO|SIGNODOLAR|LETRA|DIGITO)*;