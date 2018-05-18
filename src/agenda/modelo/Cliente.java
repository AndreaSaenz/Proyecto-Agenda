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
public class Cliente {
    
    private String nombre;
    private String celular; 

    public Cliente(){
        this.nombre="";
        this.celular=""; 
    }
    
    public Cliente(String nombre, String numero){
        this.nombre=nombre;
        this.celular=numero;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return celular;
    }

    public void setNumero(String celular) {
        this.celular = celular;
    }

    
}
