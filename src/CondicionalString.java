
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eyden Villanueva
 */
public class CondicionalString {
    
    javascriptParser.CondicionalContext ctx;
    List <javascriptParser.SentenciaContext> sentencia = new ArrayList();
   
    String ctxCadena = "";
    
    
    
    
    public CondicionalString(javascriptParser.CondicionalContext ctx, List <javascriptParser.SentenciaContext> sentencia){    
        this.ctx = ctx;
        this.sentencia = sentencia;
        
        
    
    }
    
    
    
    public String codigoComentado(){
        
        ctxCadena = ctxCadena.concat("if");
        ctxCadena = ctxCadena.concat(ctx.condicion().getText());
        ctxCadena = ctxCadena.concat(ctx.ABRIRLLAVES().getText());
        ctxCadena = ctxCadena.concat("\t" + "//Sentencia If");
        ctxCadena = ctxCadena.concat("\n");

        sentencias();


        ctxCadena = ctxCadena.concat("\n" + ctx.CERRARLLAVES().getText());

        return ctxCadena;
    }
    
    public void sentencias(){
        
        int tamano = sentencia.size();
        
        for(int i = 0; i < tamano; i++){
            
            if(sentencia.get(i).getText().contains("=") && (sentencia.get(i).getText().contains("+") == false &&
                    sentencia.get(i).getText().contains("-") == false &&  sentencia.get(i).getText().contains("/") == false &&
                     sentencia.get(i).getText().contains("*") == false
                    )){
                ctxCadena = ctxCadena.concat("\t"+sentencia.get(i).getText() + "\t"
                + "//" + " Asignacion de: " + sentencia.get(i).getText());
            }
            
            if(sentencia.get(i).getText().contains("=") && (sentencia.get(i).getText().contains("+")||
                    sentencia.get(i).getText().contains("-") ||  sentencia.get(i).getText().contains("/")||
                     sentencia.get(i).getText().contains("*")
                    )){
                ctxCadena = ctxCadena.concat("\t"+sentencia.get(i).getText() + "\t"
                + "//" + " Asignacion de la operacion: " + sentencia.get(i).getText());
            }
            if(sentencia.get(i).getText().contains("var") && sentencia.get(i).getText().contains("=") == false){
                ctxCadena = ctxCadena.concat("\t"+sentencia.get(i).getText() + "\t"
                + "//" + " Declaracion de: " + sentencia.get(i).getText());
            }            
            if(sentencia.get(i).getText().contains("+") || sentencia.get(i).getText().contains("/") ||
                    sentencia.get(i).getText().contains("*") || sentencia.get(i).getText().contains("-")){
                ctxCadena = ctxCadena.concat("\t"+sentencia.get(i).getText() + "\t"
                + "//" + " Operacion de: " + sentencia.get(i).getText());
            }            
            
 
        }
    }
    
}
