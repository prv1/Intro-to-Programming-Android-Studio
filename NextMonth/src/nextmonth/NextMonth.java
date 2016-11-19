/*
 * Phillip Viau
 * 12/03/2015
 * Determines how many days until the 1st of next month
 */
package nextmonth;
import java.util.*;
/**
 *
 * @author phillipviau
 */
public class NextMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();
        int daysUntil, future = 0;
        int month, year = (now.get(Calendar.YEAR));
        
        

        if(now.get(Calendar.MONTH) == 11){ // first sets month based on todays month
            month = 0; // sets month to 0 if month equals 11, 12 is out of range
            
        }else{
            month = now.get(Calendar.MONTH + (1)); // if this month is not december then 1 is added to month
            
        }
        GregorianCalendar lastDay = new GregorianCalendar(year,11,31); // gets last day of year compensates for leap year
        
        GregorianCalendar then = new GregorianCalendar(year+1,month,1); // creates a future object with assigned month variable based on if statement above
        
        if(now.get(Calendar.MONTH) != 11){ // 
            future = then.get(Calendar.DAY_OF_YEAR); // sets day of year based on set date this only occurs if month isnt december
            
        }else{
            future = lastDay.get(Calendar.DAY_OF_YEAR) + then.get(Calendar.DAY_OF_YEAR); // if this month is december then it sets to last day of year plus one which is 366
        }
        
        
        
        daysUntil = ((future - now.get(Calendar.DAY_OF_YEAR))); // calculates day of year of 1st day of next month

        say("Days Until " + (month + 1) + "/1/"  + (now.get(Calendar.YEAR)+1) + " is " + daysUntil + " days.");
        
    }
    
    public static void say(String text){
        System.out.println(text); // simpler way of printing to screen
    }
    
    

    
}
