
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


    private javascriptParser.OperaContext ctx;
    private String ctxCadena;
    private ArrayList operaciones = new ArrayList();
    private ArrayList argumentos = new ArrayList();
    
    
    public OperaString(javascriptParser.OperaContext ctx){
        this.ctx = ctx;
        ctxCadena = ctx.getText();
    }
    
    
    public javascriptParser.OperaContext getCtx() {
        return ctx;
    }

    public void setCtx(javascriptParser.OperaContext ctx) {
        this.ctx = ctx;
    }
    
    //Devuelve la lista de operaciones en un array de una dimensión
    public ArrayList Operacion(){
        int tamano = ctx.operacion().OPERADORES().size();
        
        
        
        if(tamano == 1){
            String auxiliar = "";
            String operacion = ctx.operacion().OPERADORES().toString();
            
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
        
        else if(ctx.operacion().OPERADORES().size() != 1){
            
            
            for(int i  = 0; i < tamano; i++ ){
                if(ctx.operacion().OPERADORES(i).toString().contains("+")){
                    operaciones.add("mas");
                }
                if(ctx.operacion().OPERADORES(i).toString().contains("-")){
                    operaciones.add("menos");
                }
                if(ctx.operacion().OPERADORES(i).toString().contains("/")){
                    operaciones.add("entre");
                }
                if(ctx.operacion().OPERADORES(i).toString().contains("*")){
                    operaciones.add("por");
                }
            }
            
            return operaciones;
        }
        return operaciones;
    }
    
    //Devuelve la lista de argumentos en un array de una dimensión
    public ArrayList tiposArgumento(){
        
        int tamano = ctx.operacion().argumento().size();
        
        for (int i = 0; i < tamano; i++){
            if(ctx.operacion().argumento(i).VARIABLE() != null){
                argumentos.add(ctx.operacion().argumento(i).VARIABLE().toString());
            }            
            if(ctx.operacion().argumento(i).NUMERO() != null){
                argumentos.add(ctx.operacion().argumento(i).NUMERO().toString());
            }
            if(ctx.operacion().argumento(i).STRING() != null){
                argumentos.add(ctx.operacion().argumento(i).STRING().toString());
            }
        }
        
        return argumentos;
    }
    
    //devuelve el codigo comentado para la impresion
    public String CodigoComentado(){
        
        tiposArgumento();
        Operacion();
        
        String codigoComentado;
        codigoComentado = ctxCadena;
        int tamano = operaciones.size() + argumentos.size();
        
        if(codigoComentado.contains("\n") || codigoComentado.contains("\r")){
            codigoComentado = codigoComentado.concat("//");
        }
        else{
            codigoComentado = codigoComentado.concat("\n//");
        }
        
        //codigoComentado = codigoComentado.concat(" "+argumentos.get(0));
        int contadorArgumento = 0;
        int contadorOperacion = 0;
        
        try{
            for(int i = 1; i <= tamano; i++){

                if(i%2 == 0){
                    //System.out.println(i);
                    codigoComentado = codigoComentado.concat(" " + operaciones.get(contadorOperacion));
                    contadorOperacion++;
                }
                if(i%2 != 0){
                    //System.out.println(i);
                    codigoComentado = codigoComentado.concat(" " + argumentos.get(contadorArgumento));
                    contadorArgumento++;    
                }
            }
        }catch(Exception e){}
        
        
        return codigoComentado;
    }
}
