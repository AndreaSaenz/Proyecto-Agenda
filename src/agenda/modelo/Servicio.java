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
        switch(tratamiento){
            case CORTES:
                ProductoAlmacen producto= new ProductoAlmacen("Acondicionador", CORTES.acondicionador());
                productos.add(producto);
                break;
            case TINTES:
                ProductoAlmacen producto1= new ProductoAlmacen("Shampoo", TINTES.shampoo());
                productos.add(producto1);
                producto1= new ProductoAlmacen("Acondicionador", TINTES.acondicionador());
                productos.add(producto1);
                producto1= new ProductoAlmacen("Tinte", TINTES.tinte());
                productos.add(producto1);
                break;
            case MANICURE:
                ProductoAlmacen producto2= new ProductoAlmacen("Removedor", MANICURE.removedor());
                productos.add(producto2);
                break;
        } 
    }




}

