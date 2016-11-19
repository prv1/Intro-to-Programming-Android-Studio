/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendardemo;
import java.util.*;
/**
 *
 * @author prv1
 */
public class CalendarDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar(); // TODO code application logic here
        say("Year: " + now.get(Calendar.YEAR));
        say("Month: " + now.get(Calendar.YEAR));
        say("WEEK_OF_YEAR: " + now.get(Calendar.WEEK_OF_YEAR));
        say("WEEK_OF_MONTH: " + now.get(Calendar.WEEK_OF_MONTH));
        say("Date: " + now.get(Calendar.DATE));
        say("DAY_OF_MONTH: " + now.get(Calendar.DAY_OF_MONTH));
        say("DAY_OF_YEAR: " + now.get(Calendar.DAY_OF_YEAR));
        say("DAY_OF_WEEK: " + now.get(Calendar.DAY_OF_WEEK));
        
        say("AM_PM: " + now.get(Calendar.AM_PM));
        say("HOUR: " + now.get(Calendar.HOUR));
        say("HOUR_OF_DAY: " + now.get(Calendar.HOUR_OF_DAY));
        say("MINUTE: " + now.get(Calendar.MINUTE));
        say("SECOND: " + now.get(Calendar.SECOND));
        say("MILLISECOND: " + now.get(Calendar.MILLISECOND));
    }
    
    public static void say(String text){
        System.out.println(text);
        //return text;
    }
    

    
}
