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
public class ProductoAlmacen {
    private boolean estadoDisponibilidad;
    private int cantidadDisponible;
    
    public ProductoAlmacen(boolean estado, int cantidad){
        this.estadoDisponibilidad= estado;
        this.cantidadDisponible = cantidad;
    }
    
    
}
