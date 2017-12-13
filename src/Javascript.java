/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;



/**
 *
 * @author Eyden Villanueva
 */
public class Javascript {
    
    public static void main(String[] args) {
        
        String arcSalida = "salida.txt";
        String archEntrada = null;
        InputStream fuenteEntrada = null;
        OutputStream salida = null;
        ANTLRInputStream entrada = null;
        
        
        try{
            File archivo = new File("C:\\Users\\Eyden Villanueva\\Documents\\GitHub\\Antlr-Javascript-grammar-\\src\\salida.txt");
            
            
            if(archivo.exists()){
                archivo.delete();
            }
            
            
            archEntrada = "C:\\Users\\Eyden Villanueva\\Documents\\GitHub\\Antlr-Javascript-grammar-\\src\\entrada.js";
            fuenteEntrada = new FileInputStream(archEntrada);
            entrada = new ANTLRInputStream(fuenteEntrada);
        
        }catch(Exception e){
            System.out.println("Algo Ocurrio");
        }
        
        javascriptLexer lexer = new javascriptLexer(entrada);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        javascriptParser parser = new javascriptParser(tokens);
        ParseTree tree = parser.prog();
        
        Visitor visit = new Visitor();
        
        visit.visit(tree);
   
    }
    
}
