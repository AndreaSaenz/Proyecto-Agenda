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
public class Notificacion {
    private boolean estadoActivacion;
    private int tiempoNotificacion;
    
    public Notificacion(){
        this.estadoActivacion= true;
        this.tiempoNotificacion = 6*60;
    }
    
    
    public Notificacion( int horas, int min){
        this.estadoActivacion=true;
        this.tiempoNotificacion= (60*horas)+min;
    }
    
    
    public void apagarNotificacion(){
        this.estadoActivacion = false;
    }

    public void setTiempoNotificacion(int horas, int min) {
        this.tiempoNotificacion = (60*horas)+min;
    }
    
    
}
