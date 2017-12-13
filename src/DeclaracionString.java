
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
public class DeclaracionString {
    
    private javascriptParser.DeclaracionContext ctx;
    private String ctxCadena;
    private ArrayList variables;
        
   
    public DeclaracionString(javascriptParser.DeclaracionContext ctx){
        this.ctx = ctx;    
        ctxCadena = ctx.getText();
        variables  = new ArrayList();
    }
    public javascriptParser.DeclaracionContext getCtx() {
        return ctx;
    }

    public void setCtx(javascriptParser.DeclaracionContext ctx) {
        this.ctx = ctx;
    }

    public String getCtxCadena() {
        return ctxCadena;
    }

    public void setCtxCadena(String ctxCadena) {
        this.ctxCadena = ctxCadena;
    }
    
    public ArrayList getVariables(){
        int tamano = ctx.VARIABLE().size();
        
        for(int i = 0; i < tamano; i++){
            variables.add(ctx.VARIABLE(i).getText());
        }
        
        return variables;
    }
    
    public String codigoComentado(){
        
        getVariables();
        
        int tamano = ctx.VARIABLE().size();
        String coma = ",";
        
        
        ctxCadena = quitarSaltos(ctxCadena);
        ctxCadena = ctxCadena.concat("       //Declaracion de ");
       
        for(int i = 0; i < tamano; i++){
            if(i == tamano-2){coma=" y";}
            if(i == tamano-1){coma="";}
            ctxCadena =  ctxCadena.concat(" " + variables.get(i).toString() + coma);
        }
        
        return ctxCadena;
    }
    
    public String quitarSaltos(String cadena){
        return cadena.replaceAll("[\n\r]","");
    }
    
}
