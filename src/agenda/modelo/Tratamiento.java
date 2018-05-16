/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.modelo;

/**
 *
 * @author andre
 */
public enum Tratamiento {
    CORTES(30,0,0, 5,0,0),
    TINTES(45,10,10,0,20,0),
    MANICURE(60,0,0,0,0,5);

    
    private final int duracion; //en min 
    private final int shampoo;  // en ml
    private final int acondicionador; //en ml
    private final int locion;  //en ml
    private final int tinte;   //en ml
    private final int removedorCuticula;   //en ml
    
    Tratamiento (int duracion, int shampoo, int acondicionador, int locion, int tinte, int removedor){
        this.duracion = duracion;
        this.shampoo= shampoo; 
        this.acondicionador= acondicionador; 
        this.locion= locion; 
        this.tinte= tinte; 
        this.removedorCuticula= removedor; 
    }
    
    private int duracion(){ 
        return duracion; 
    }
    
    private int shampoo(){
        return shampoo;
    }
    
    
    private int acondicionador(){
        return acondicionador;
    }
    
    private int locion(){
        return locion;
    }
    
    private int tinte(){
        return tinte;
    }
   
    private int removedor(){ 
        return removedorCuticula;
    }
    
}
