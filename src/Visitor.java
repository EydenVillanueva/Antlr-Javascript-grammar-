
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


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
    
    File archivo = new File("C:\\Users\\Eyden Villanueva\\Documents\\GitHub\\Antlr-Javascript-grammar-\\src\\salida.txt");
    FileWriter fw;
    BufferedWriter bw;
    PrintWriter pw;
    
    @Override
    public String visitCondicional(javascriptParser.CondicionalContext ctx){
        
        
        CondicionalString condicion = new CondicionalString(ctx,ctx.sentencia());
        
       

        try{
                fw = new FileWriter(archivo,true);
                bw = new BufferedWriter(fw);
                pw = new PrintWriter(bw);
                
   

                pw.write(condicion.codigoComentado());
                bw.newLine(); 

                bw.close();
                pw.close();
            

            }catch(Exception e){e.printStackTrace();}         
   
        return "";
    }
    
    
    @Override
    public String visitAsignacion(javascriptParser.AsignacionContext ctx ){
        
        AsignacionString asignacion;
        if(ctx.operacion().isEmpty()){
            
            asignacion = new AsignacionString(ctx);
            //System.out.println(asignacion.codigo());
            
            try{
                fw = new FileWriter(archivo,true);
                bw = new BufferedWriter(fw);
                pw = new PrintWriter(bw);

                pw.write(asignacion.codigo());
                bw.newLine();
            
                bw.close();
                pw.close();
                
                
                            

            }catch(Exception e){System.out.println("NO SE ESCRIBIO EN EL ACHIVO");}            
        }
        else{
            
            asignacion = new AsignacionString(ctx,ctx.operacion(0));
            try{
                fw = new FileWriter(archivo,true);
                bw = new BufferedWriter(fw);
                pw = new PrintWriter(bw);

                pw.write(asignacion.codigo());
                bw.newLine();         
            
                bw.close();
                pw.close();
                            

            }catch(Exception e){System.out.println("NO SE ESCRIBIO EN EL ACHIVO");}                  
            
            
            //System.out.println(asignacion.codigo());
        }
        
        
        return "";
    }
    
    
    @Override
    public String visitDeclaracion(javascriptParser.DeclaracionContext ctx ){
        DeclaracionString declaracion = new DeclaracionString(ctx);
        try{
            fw = new FileWriter(archivo,true);
            bw =  new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            
            pw.write(declaracion.codigoComentado());
            bw.newLine();         
            
            bw.close();
            pw.close();
            
        
        }catch(Exception e){}

        return declaracion.codigoComentado();
    }
    
    @Override
    public String visitOperacion(javascriptParser.OperacionContext ctx){
        
        OperaString operacion = new OperaString(ctx);
        
        try{
            fw = new FileWriter(archivo,true);
            bw =  new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            
            pw.write(operacion.codigoComentado());
            bw.newLine();         
            
            bw.close();
            pw.close();
            
        
        }catch(Exception e){}
        
        
        
        return operacion.codigoComentado();
    }
    
       
    @Override
    public String visitArgumento(javascriptParser.ArgumentoContext ctx){
        return ctx.VARIABLE().toString();
    }

}
    