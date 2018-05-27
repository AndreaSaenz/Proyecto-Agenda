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
    private String correo; 

    public Cliente(){
        this.nombre="";
        this.correo=""; 
    }
    
    public Cliente(String nombre, String correo){
        this.nombre=nombre;
        this.correo=correo;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
