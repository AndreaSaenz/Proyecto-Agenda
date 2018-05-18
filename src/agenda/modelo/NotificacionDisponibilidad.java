/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.modelo;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class NotificacionDisponibilidad extends Notificacion {
    private Cliente cliente;
    private ArrayList<Servicio> servicios; 
    
    public NotificacionDisponibilidad(int horas, int min, Cliente cliente, ArrayList<Servicio>  servicios){
        super(horas,min);
        this.cliente = cliente;
        this.servicios= servicios;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void setServicios(ArrayList<Servicio> servicios){
        this.servicios=servicios;
    }
    
    
    public void addServicio(Servicio servicio){
        servicios.add(servicio);
    }
    
    
}
