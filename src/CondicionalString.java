
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
    //Variables fundamentales
    private javascriptParser.CondicionalContext ctx;
    private String ctxCadena = "";
    //Objetos necesarios
    private DeclaracionString declaracion;
    private AsignacionString asignacion;
    private OperaString operacion;
    
    //Listas de declaraciones, asignaciones y operaciones
    private List<javascriptParser.DeclaracionContext> listaDeclaracion = new ArrayList<>();
    private List<javascriptParser.AsignacionContext> listaAsignacion = new ArrayList<>();
    private List<javascriptParser.OperacionContext> listaOperaciones = new ArrayList<>();
    
    //Variables booleanas de control
    private boolean hayAsignacion = false;
    private boolean hayOperacion = false;
    private boolean hayDeclaracion = false;
    //private boolean primeraVez = true;
    
    public CondicionalString(javascriptParser.CondicionalContext ctx){
        this.ctx = ctx;
        
    }

    
    /*
    public String llenarCadena(String ctxCadena, javascriptParser.CondicionalContext ctx){
        
        if(condicionesHijas(ctx) != 0 || primeraVez == true){
            
            
            contador++;
           // javascriptParser.CondicionalContext auxiliar = ctx.cond;
            int numero = condicionesHijas(ctx);
            
            
            ctxCadena = ctxCadena.concat("if");
            ctxCadena = ctxCadena.concat(ctx.condicion().getText());
            ctxCadena = ctxCadena.concat(ctx.ABRIRLLAVES().getText());
            ctxCadena = ctxCadena.concat("      //IF CONDICIONAL\n");

            for(int i = 0; i < ctx.asignacion().size(); i++){
                if(hayAsignacion){
                    ctxCadena = ctxCadena.concat(ctx.declaracion(i).getText());
                }
            }
            for(int i = 0; i < ctx.operacion().size(); i++){
                if(hayOperacion){
                    ctxCadena = ctxCadena.concat(ctx.operacion(i).getText());
                }
            }
            for(int i = 0; i < ctx.declaracion().size(); i++){
                if(hayDeclaracion){
                    ctxCadena = ctxCadena.concat(ctx.declaracion(i).getText());
                }
            }

           
            
            primeraVez = false;
            ctx = ctx.condicional(0);
            llenarCadena(ctxCadena,ctx);
            
            ctxCadena = ctxCadena.concat(ctx.CERRARLLAVES().getText());
        
        }
        
        primeraVez = true;
        return ctxCadena;
    }
    
    public int condicionesHijas(javascriptParser.CondicionalContext ctx){
        int tamano = ctx.condicional().size();
        int numeroCondicionales = 0;
        
        for(int i = 0; i < tamano; i++){
            if(ctx.condicional(i).condicional().isEmpty() == true){
                numeroCondicionales++;
            }
        }
        
        return numeroCondicionales;
    }
    

    */
    
    
    
    public String llenarCadena(){
        
        int tamanoListaDec = listaDeclaracion.size();
        int tamanoListaAsig = listaAsignacion.size();
        int tamanoListaOp = listaOperaciones.size();
        
        
        ctxCadena = ctxCadena.concat("if");
        ctxCadena = ctxCadena.concat(ctx.condicion().getText());
        ctxCadena = ctxCadena.concat(ctx.ABRIRLLAVES().getText());
        ctxCadena = ctxCadena.concat("      //Sentencia Condcional\n");
        
        
        for(int i = 0; i < tamanoListaOp; i++){
            if(hayOperacion){
                operacion = new OperaString(listaOperaciones.get(i));
                ctxCadena = ctxCadena.concat("\n"+ "\t"+operacion.codigoComentado());
                
            }
        }        

        for(int i = 0; i < tamanoListaAsig; i++){
            if(hayAsignacion){
                //NO ENTRO
                if(listaAsignacion.get(i).operacion().isEmpty()){
                    asignacion = new AsignacionString(listaAsignacion.get(i));
                }
                else{
                    asignacion = new AsignacionString(listaAsignacion.get(i),listaAsignacion.get(i).operacion().get(0));
                }
                ctxCadena = ctxCadena.concat("\n"+"\t"+asignacion.codigo());
            }
        }

        for(int i = 0; i < tamanoListaDec; i++){
            if(hayDeclaracion){
                    declaracion = new DeclaracionString(listaDeclaracion.get(i));
                    ctxCadena = ctxCadena.concat("\n"+ "\t"+declaracion.codigoComentado());
                
            }
        }
        

        ctxCadena = ctxCadena.concat("\n"+ctx.CERRARLLAVES().getText());
  
        return ctxCadena;
    }
    
    public String codigoComentado(){    
        
        return llenarCadena();
    }
    
    
    public void setBooleanos(){
        if(listaAsignacion.isEmpty() == false){
            hayAsignacion = true;
        }
        if(listaDeclaracion.isEmpty() == false){
            hayDeclaracion = true;
        }
        if(listaOperaciones.isEmpty() == false){
            hayOperacion =  true;
        }
    
    }
    
    public javascriptParser.CondicionalContext getCtx() {
        return ctx;
    }

    public void setCtx(javascriptParser.CondicionalContext ctx) {
        this.ctx = ctx;
    }

    public String getCtxCadena() {
        return ctxCadena;
    }

    public void setCtxCadena(String ctxCadena) {
        this.ctxCadena = ctxCadena;
    }
    
        public DeclaracionString getDeclaracion() {
        return declaracion;
    }

    public void setDeclaracion(DeclaracionString declaracion) {
        this.declaracion = declaracion;
    }

    public AsignacionString getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(AsignacionString asignacion) {
        this.asignacion = asignacion;
    }

    public boolean isHayAsignacion() {
        return hayAsignacion;
    }

    public void setHayAsignacion(boolean hayAsignacion) {
        this.hayAsignacion = hayAsignacion;
    }

    public boolean isHayOperacion() {
        return hayOperacion;
    }

    public void setHayOperacion(boolean hayOperacion) {
        this.hayOperacion = hayOperacion;
    }

    public boolean isHayDeclaracion() {
        return hayDeclaracion;
    }

    public void setHayDeclaracion(boolean hayDeclaracion) {
        this.hayDeclaracion = hayDeclaracion;
    }
    
    public String quitarSaltos(String cadena){
        return cadena.replaceAll("[\n\r]","");
    }
    
    public List<javascriptParser.DeclaracionContext> getListaDeclaracion() {
        return listaDeclaracion;
    }

    public void setListaDeclaracion(List<javascriptParser.DeclaracionContext> listaDeclaracion) {
        this.listaDeclaracion = listaDeclaracion;
    }

    public List<javascriptParser.AsignacionContext> getListaAsignacion() {
        return listaAsignacion;
    }

    public void setListaAsignacion(List<javascriptParser.AsignacionContext> listaAsignacion) {
        this.listaAsignacion = listaAsignacion;
    }

    public List<javascriptParser.OperacionContext> getListaOperaciones() {
        return listaOperaciones;
    }

    public void setListaOperaciones(List<javascriptParser.OperacionContext> listaOperaciones) {
        this.listaOperaciones = listaOperaciones;
    }
    

}
