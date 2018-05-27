/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoagenda;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author andre
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //String[] ids= TimeZone.getAvailableIDs(America/Yucatan);
        // TODO code application logic here
        GregorianCalendar calendar1 = new GregorianCalendar();
        calendar1.set(Calendar.HOUR_OF_DAY, 22);
        calendar1.set(Calendar.MINUTE,15);
        
        GregorianCalendar calendar2 = new GregorianCalendar();
        calendar2.set(Calendar.HOUR_OF_DAY, 1);
       
        calendar2.set(Calendar.MINUTE,46);
        calendar1.add(Calendar.HOUR_OF_DAY, calendar2.get(Calendar.HOUR_OF_DAY));
        calendar1.add(Calendar.MINUTE, calendar2.get(Calendar.MINUTE));
       // GregorianCalendar calendar2= new GregorianCalendar (1900,0,0,0,44);
        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY)+","+calendar1.get(Calendar.MINUTE));
       /* int hora1= calendar1.get(Calendar.HOUR_OF_DAY);
        int hora2= calendar2.get(Calendar.HOUR_OF_DAY);
        int hora3= hora1+hora2;
        int min1= calendar1.get(Calendar.MINUTE);
        int min2 =  calendar2.get(Calendar.MINUTE);
        int min3= min1+min2;
        calendar1.set(calendar1.get(Calendar.YEAR),calendar1.get(Calendar.MONTH),calendar1.get(Calendar.DAY_OF_MONTH), hora3, min3);
        System.out.println(calendar1);*/
    }
    
}
