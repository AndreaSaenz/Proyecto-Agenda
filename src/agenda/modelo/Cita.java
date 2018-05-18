/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author andre
 */
public class Cita {
    private ArrayList<Servicio> servicios;
    private Cliente cliente;
    private int duracionTotal; //En min
    private Notificacion noti;
    private GregorianCalendar hora;
    
    public Cita(){
        this.servicios= new ArrayList<Servicio>();
        this.cliente= new Cliente();
        
        
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDuracionTotal(int duracionTotal) {
        this.duracionTotal = duracionTotal;
    }
    
    public void agregarServicio(Servicio serv){
        servicios.add(serv);
    }
    
    public void eliminarServicio(Servicio serv){
        int indice = buscarServicio(serv);
        
    }
    
    public void editarNombreCliente(String name){
        this.cliente.setNombre(name);
    }
    
    public void editarCelularCliente(String celular){
        this.cliente.setNumero(celular);
    }

    public int getDuracionTotal() {
        return duracionTotal;
    }
    
    
}
