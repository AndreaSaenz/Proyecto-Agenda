/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.controller;

import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class AgendaController {
    
    public final LocalTime INICIO = LocalTime.of(9,0,0,0);
    public final LocalTime FIN = LocalTime.of(18,0,0,0);
    public  List<LocalTime> horarios;
    
    public AgendaController(){
        this.horarios = new ArrayList<>();
        int numberOfMeets = FIN.getHour() - INICIO.getHour();
        for(int i = 0; i< numberOfMeets; i++){
            int hora = INICIO.getHour() + i;
            
        }
        
        
        
    }
    
    
}
