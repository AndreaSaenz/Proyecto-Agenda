/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.modelo;

import static agenda.modelo.Tratamiento.*;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Servicio {
    private Tratamiento tratamiento;
    private ArrayList<ProductoAlmacen> productos;
    
    public Servicio(){
    }
    
    public Servicio(Tratamiento tratamiento){
        this.tratamiento = tratamiento;
        this.productos= new ArrayList<ProductoAlmacen>();
        
    }
    
    public void agregarProductos(Tratamiento tratamiento){
        String info="";
        switch(tratamiento){
            case CORTES:
                ProductoAlmacen producto0= new ProductoAlmacen("Locion");
                info="";  //busqueda de info de BD
                producto0.setEstadoYCantDisponible(info, CORTES.locion());
                productos.add(producto0);
                break;
            case TINTES:
                ProductoAlmacen producto1= new ProductoAlmacen("Shampoo");
                info="";  //busqueda de info de BD
                producto1.setEstadoYCantDisponible(info, TINTES.shampoo());
                productos.add(producto1);
                ProductoAlmacen producto2= new ProductoAlmacen("Acondicionador");
                info="";  //busqueda de info de BD
                producto2.setEstadoYCantDisponible(info, TINTES.acondicionador());
                productos.add(producto2);
                ProductoAlmacen producto3= new ProductoAlmacen("Tinte");
                info="";  //busqueda de info de BD
                producto3.setEstadoYCantDisponible(info, TINTES.tinte());
                productos.add(producto3);
                break;
            case MANICURE:
                ProductoAlmacen producto4= new ProductoAlmacen("Removedor-Cuticula");
                info="";  //busqueda de info de BD
                producto4.setEstadoYCantDisponible(info, MANICURE.removedor());
                productos.add(producto4);
                break;
        } 
    }




}

