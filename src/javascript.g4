/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar javascript;



prog:   sentencia* (NL|WS)*;


sentencia:  
        asignacion          #asigna
        |   operacion           #opera
        |   declaracion         #declara
        |   condicional         #condi
        ;




condicional: (WS|NL)* IF (WS)* condicion (WS|NL)* ABRIRLLAVES (WS|NL)* (sentencia)* (WS|NL)* CERRARLLAVES (WS|NL)*; 

operacion : (WS|NL)* argumento WS* (WS* OPERADORES WS* argumento)* WS* PUNTOCOMA? (WS|NL)* ;

asignacion: declaracion WS* IGUAL WS* ((STRING|NUMERO)|operacion+) PUNTOCOMA? (WS|NL)* ;

declaracion : (WS|NL)* VAR? WS* VARIABLE  WS*( WS* COMA WS* VARIABLE)* WS* PUNTOCOMA? (WS|NL)* ;

argumento: (STRING|NUMERO|VARIABLE);

condicion: (WS|NL)* ABRIRPARENTESIS (WS)* argumento (WS)* OPERADORESLOGICOS (WS)* argumento (WS)* CERRARPARENTESIS (WS|NL)*;

contenido: (operacion|asignacion|declaracion);



/*CARACTERES ESPECIALES*/
fragment DIF: '!';
PUNTOCOMA: ';';
WS: (' ' | '   ' | '\f' |'    ') ; 
NL: ('\n' | '\r')+ ;
fragment GUIONBAJO: '_';
fragment SIGNODOLAR: '$';
PUNTO: '.';
COMA: ',';
IGUAL: '=';
fragment COMILLAS: '"';
ABRIRPARENTESIS: '(';
CERRARPARENTESIS: ')';
ABRIRLLAVES: '{';
CERRARLLAVES: '}';


/*CARACTERES ALFANUMERICOS*/
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

/*TIPOS DE DATO*/
NUMERO: DIGITO+ (PUNTO DIGITO+)?;
STRING: COMILLAS (LETRA|NUMERO|WS|NL)* COMILLAS;

/*PALABRAS RESERVADAS*/
VAR: 'var';
IF: 'if';

/*OPERACIONES MATEMATICAS*/
fragment MENOS: '-';
fragment MAS: '+';
fragment POR: '*';
fragment ENTRE: '/';

OPERADORES: (MENOS|MAS|POR|ENTRE);

/*OPERADORES LOGICOS*/
fragment MAYOR: '>';
fragment MENOR: '<';
fragment MAYORIGUAL: MAYOR IGUAL;
fragment MENORIGUAL: MENOR IGUAL;
fragment DIFERENTE: DIF IGUAL;
fragment IGUALOGICO: IGUAL IGUAL;
fragment OR: '||';
fragment AND: '&&';


OPERADORESLOGICOS: MAYOR | MENOR | MAYORIGUAL | MENORIGUAL | DIFERENTE | IGUALOGICO | OR | AND;

/*TOKENS ESPECIALES*/
VARIABLE : (GUIONBAJO|SIGNODOLAR|LETRA)+ (GUIONBAJO|SIGNODOLAR|LETRA|DIGITO)*;

