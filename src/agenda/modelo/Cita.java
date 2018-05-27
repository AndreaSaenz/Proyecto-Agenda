/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author andre
 */
public class Cita {
    public final int HORA_APERTURA=9;
    public final int HORA_CIERRE=21;

    private ArrayList<Servicio> servicios;
    private Cliente cliente;
    private int duracionTotal; //En min
    private Notificacion noti;
    private GregorianCalendar hora;
    
    public Cita(ArrayList<Servicio> servicios, Cliente cliente, int duracionTotalMin){
        this.servicios= new ArrayList<Servicio>();
        this.cliente= new Cliente();
        this.noti=new Notificacion(); 
        this.hora= new GregorianCalendar()
        hora.set(Calendar.HOUR, )
        
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
