


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eyden Villanueva
 */
public class OperaString {


    private javascriptParser.OperacionContext ctx;
    private String ctxCadena;
    private ArrayList operaciones;
    private ArrayList argumentos;
 
    
    public OperaString(javascriptParser.OperacionContext ctx){
        this.ctx = ctx;
        ctxCadena = ctx.getText();
        operaciones = new ArrayList();
        argumentos = new ArrayList();
    }
    
    public String getCtxCadena() {
        return ctxCadena;
    }

    public void setCtxCadena(String ctxCadena) {
        this.ctxCadena = ctxCadena;
    }
    
    
    public javascriptParser.OperacionContext getCtx() {
        return ctx;
    }

    public void setCtx(javascriptParser.OperacionContext ctx) {
        this.ctx = ctx;
    }
    
    //Devuelve la lista de operaciones en un array de una dimensión
    public ArrayList Operacion(){
        int tamano = ctx.OPERADORES().size();
        
        
        
        if(tamano == 1){
            String auxiliar = "";
            String operacion = ctx.OPERADORES().toString();
            
            if(operacion.contains("+")){
                auxiliar = "mas";
            }
            if(operacion.contains("-")){
                auxiliar = "menos";
            }
            if(operacion.contains("/")){
                auxiliar = "entre";
            }
            if(operacion.contains("*")){
                auxiliar = "por";
            }
            
            operaciones.add(auxiliar);
            return operaciones;
        }
        
        else if(ctx.OPERADORES().size() != 1){
            
            
            for(int i  = 0; i < tamano; i++ ){
                if(ctx.OPERADORES(i).toString().contains("+")){
                    operaciones.add("mas");
                }
                if(ctx.OPERADORES(i).toString().contains("-")){
                    operaciones.add("menos");
                }
                if(ctx.OPERADORES(i).toString().contains("/")){
                    operaciones.add("entre");
                }
                if(ctx.OPERADORES(i).toString().contains("*")){
                    operaciones.add("por");
                }
            }
            
            return operaciones;
        }
        return operaciones;
    }
    
    //Devuelve la lista de argumentos en un array de una dimensión
    public ArrayList tiposArgumento(){
        
        int tamano = ctx.argumento().size();
        
        for (int i = 0; i < tamano; i++){
            if(ctx.argumento(i).VARIABLE() != null){
                argumentos.add(ctx.argumento(i).VARIABLE().toString());
            }            
            if(ctx.argumento(i).NUMERO() != null){
                argumentos.add(ctx.argumento(i).NUMERO().toString());
            }
            if(ctx.argumento(i).STRING() != null){
                argumentos.add(ctx.argumento(i).STRING().toString());
            }
        }
        
        return argumentos;
    }
    
    //devuelve el codigo comentado para la impresion
    public String codigoComentado(){
        
        tiposArgumento();
        Operacion();
        
        String codigoComentado;
        codigoComentado = ctxCadena;
        int tamano = operaciones.size() + argumentos.size();
        
        
        codigoComentado = quitarSaltos(codigoComentado);
        codigoComentado = codigoComentado.concat("      //Operacion:");
        
        
        int contadorArgumento = 0;
        int contadorOperacion = 0;
        
        try{
            for(int i = 1; i <= tamano; i++){

                if(i%2 == 0){
                    codigoComentado = codigoComentado.concat(" " + operaciones.get(contadorOperacion));
                    contadorOperacion++;
                }
                if(i%2 != 0){
                    codigoComentado = codigoComentado.concat(" " + argumentos.get(contadorArgumento));
                    contadorArgumento++;    
                }
            }
        }catch(Exception e){}
        
        
        return codigoComentado;
    }
    
    public String quitarSaltos(String cadena){
        return cadena.replaceAll("[\n\r]","");
    }


}
