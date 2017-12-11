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
    private String [] operaciones = {""};
    private String [] argumentos = {""};
    
    
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
    public String[] Operacion(){
        int tamano = ctx.operacion().OPERADORES().size();
        String auxiliar = "";
        
        if(tamano == 1){
            String operacion = ctx.operacion().OPERADORES().toString();
            
            if(operacion.contains("+")){
                auxiliar = "+";
            }
            if(operacion.contains("-")){
                auxiliar = "-";
            }
            if(operacion.contains("/")){
                auxiliar = "/";
            }
            if(operacion.contains("*")){
                auxiliar = "*";
            }
            
            operaciones[0] = auxiliar;
            return operaciones;
        }
        
        else if(ctx.operacion().OPERADORES().size() != 1){
            
            for(int i  = 0; i < tamano; i++ ){
                if(ctx.operacion().OPERADORES(i).toString().contains("+")){
                    operaciones[i] = "+";
                }
                if(ctx.operacion().OPERADORES(i).toString().contains("-")){
                    operaciones[i] = "-";
                }
                if(ctx.operacion().OPERADORES(i).toString().contains("/")){
                    operaciones[i] = "/";
                }
                if(ctx.operacion().OPERADORES(i).toString().contains("*")){
                    operaciones[i] = "*";
                }
            }
            
            return operaciones;
        }
        return operaciones;
    }
    
    //Devuelve la lista de argumentos en un array de una dimensión
    public String[] tiposArgumento(){
        
        int tamano = ctx.operacion().argumento().size();
        
        for (int i = 0; i < tamano; i++){
            if(ctx.operacion().argumento(i).VARIABLE() != null){
                argumentos[i] = ctx.operacion().argumento(i).VARIABLE().toString();
            }            
            if(ctx.operacion().argumento(i).NUMERO() != null){
                argumentos[i] = ctx.operacion().argumento(i).NUMERO().toString();
            }
        }
        
        return argumentos;
    }
    
    //devuelve el codigo comentado para la impresion
    public String CodigoComentado(){
        return "";
    }
}
