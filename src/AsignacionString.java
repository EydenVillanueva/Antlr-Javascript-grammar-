/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eyden Villanueva
 */
public class AsignacionString {
    private javascriptParser.AsignacionContext ctx;
    OperaString opera;
    private String ctxCadena;
    boolean hayOperacion;
    
    public AsignacionString(javascriptParser.AsignacionContext ctx, javascriptParser.OperacionContext ctxOpera) {
        this.ctx = ctx;
        ctxCadena = ctx.getText();
        opera =  new OperaString(ctxOpera);
        hayOperacion = true;
        
    }
    
    public AsignacionString(javascriptParser.AsignacionContext ctx) {
        this.ctx = ctx;
        ctxCadena = ctx.getText();
        hayOperacion = false;
        
    }
    
    public String codigo (){
        if(hayOperacion){
            return codigoComentadoOp();
        }
        else{
            return codigoComentado();
        }
    }
    
    

    public javascriptParser.AsignacionContext getCtx() {
        return ctx;
    }

    public void setCtx(javascriptParser.AsignacionContext ctx) {
        this.ctx = ctx;
    }

    public String getCtxCadena() {
        return ctxCadena;
    }

    public void setCtxCadena(String ctxCadena) {
        this.ctxCadena = ctxCadena;
    }
    
    public String codigoComentado(){
        
        ctxCadena = quitarSaltos(ctxCadena);
        
        if(ctx.NUMERO() ==  null){
            ctxCadena = ctxCadena.concat("      //Asignacion de " +ctx.STRING().toString() + " a " + ctx.declaracion().VARIABLE(0));            
        }
        else{
            ctxCadena = ctxCadena.concat("      //Asignacion de " + ctx.NUMERO().toString() + " a " + ctx.declaracion().VARIABLE(0));
        }
        
        return ctxCadena;
    }
    
    public String codigoComentadoOp(){
        
        opera.setCtxCadena("");
        ctxCadena = quitarSaltos(ctxCadena);
        
        ctxCadena = ctxCadena.concat(opera.codigoComentado() + " Asignado a: " + ctx.declaracion().VARIABLE(0));
        
        return ctxCadena;
    }
    
    public String quitarSaltos(String cadena){
        return cadena.replaceAll("[\n\r]","");
    }


}
