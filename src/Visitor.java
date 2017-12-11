
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eyden Villanueva
 */
public class Visitor extends javascriptBaseVisitor<String>{
    
    
   
    
    @Override
    public String visitAsignacion(javascriptParser.AsignacionContext ctx ){
        
        String ctxCadena = ctx.getText();
           
        if(ctx.NUMERO() == null){
            if(ctxCadena.contains("\n") || ctxCadena.contains("\r")){
                ctxCadena = ctxCadena.concat( "//Asignacion de " + ctx.STRING().toString() + " a " + ctx.declaracion().VARIABLE(0));
            }
            else{
                ctxCadena = ctxCadena.concat( "\n//Asignacion de " + ctx.STRING().toString() + " a " + ctx.declaracion().VARIABLE(0));
            }
        }
        else{
            
            if(ctxCadena.contains("\n") || ctxCadena.contains("\r")){
                ctxCadena = ctxCadena.concat( "//Asignacion de " + ctx.NUMERO().toString() + " a " + ctx.declaracion().VARIABLE(0));
            }
            else{
                ctxCadena = ctxCadena.concat( "\n//Asignacion de " + ctx.NUMERO().toString() + " a " + ctx.declaracion().VARIABLE(0));
            }
        }
        
        System.out.println(ctxCadena);
        
        return ctxCadena;
    }
    
    @Override
    public String visitDeclaracion(javascriptParser.DeclaracionContext ctx ){
        
        String ctxCadena = ctx.getText();
        
        if(ctxCadena.contains("\n") || ctxCadena.contains("\r")){
            ctxCadena = ctxCadena.concat("//Declaracion de " + ctx.VARIABLE(0));
        }
        else{
            ctxCadena = ctxCadena.concat("\n//Declaracion de " + ctx.VARIABLE(0));
        }
        
        
        System.out.println(ctxCadena);
        
        return ctx.getText();
    }
    
    @Override
    public String visitOpera(javascriptParser.OperaContext ctx){
        
        OperaString operacion = new OperaString(ctx);
        
        System.out.println(operacion.CodigoComentado());
        

        return operacion.CodigoComentado();
    }
    
       
    @Override
    public String visitArgumento(javascriptParser.ArgumentoContext ctx){
        return ctx.VARIABLE().toString();
    }
}
