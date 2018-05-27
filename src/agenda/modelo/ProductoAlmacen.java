/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.modelo;

import java.lang.String;
import java.lang.Integer;
import java.sql.ResultSet;
/**
 *
 * @author andre
 */
public class ProductoAlmacen {
    private String producto;
    private boolean estadoDisponibilidad;
    private int cantidadDisponible;
    
    public ProductoAlmacen(String name){
        this.producto= name;
        this.estadoDisponibilidad=false;
        this.cantidadDisponible=-1;
    }
    
    
    public void setEstadoYCantDisponible(String info, int mlNecesarios){
        String[] segmentacion = info.split(",");
        this.cantidadDisponible = Integer.parseInt(segmentacion[2]);
        if(this.cantidadDisponible>0 && this.cantidadDisponible>=mlNecesarios){
            this.estadoDisponibilidad=true;
        }
        else{
            this.estadoDisponibilidad=false;
        }
         
    }
    
    public boolean isEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
    
      
    public int cambiarCantidadDisponibleBD(int cantidadUsada){
        int nuevaCantidad = this.cantidadDisponible - cantidadUsada;
        return nuevaCantidad;
    }
   
}
