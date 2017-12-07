/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar javascript;



declaracion : VAR (ESPACIO|TABULADOR) variable (COMA (ESPACIO|TABULADOR)? variable)* PUNTOCOMA?;


variable : VARIABLE;


/*CARACTERES ESPECIALES*/
PUNTOCOMA: ';';
ESPACIO: ' ';
fragment GUIONBAJO: '_';
fragment SIGNODOLAR: '$';
PUNTO: '.';
COMA: ',';
TABULADOR: '\t';

/*CARACTERES ALFANUMERICOS*/
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
NUMERO: DIGITO+ (PUNTO DIGITO+)?;

/*PALABRAS RESERVADAS*/
VAR: 'var';

/*OPERACIONES MATEMATICAS*/
MENOS: '-';

/*TOKENS*/
VARIABLE : GUIONBAJO|SIGNODOLAR|LETRA (GUIONBAJO|SIGNODOLAR|LETRA|DIGITO)*;