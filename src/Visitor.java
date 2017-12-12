
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
        
        AsignacionString asignacion;
        if(ctx.operacion().isEmpty()){
            asignacion = new AsignacionString(ctx);
            System.out.println(asignacion.codigo());
        }
        else{
            asignacion = new AsignacionString(ctx,ctx.operacion(0));
            System.out.println(asignacion.codigo());
        }        
        
        return asignacion.codigo();
    }
    
    @Override
    public String visitDeclaracion(javascriptParser.DeclaracionContext ctx ){
        
        DeclaracionString declaracion = new DeclaracionString(ctx);
        System.out.println(declaracion.codigoComentado());
        
        return declaracion.codigoComentado();
    }
    
    @Override
    public String visitOperacion(javascriptParser.OperacionContext ctx){
        
        OperaString operacion = new OperaString(ctx);
        System.out.println(operacion.codigoComentado());
        
        return operacion.codigoComentado();
    }
    
       
    @Override
    public String visitArgumento(javascriptParser.ArgumentoContext ctx){
        return ctx.VARIABLE().toString();
    }
}
