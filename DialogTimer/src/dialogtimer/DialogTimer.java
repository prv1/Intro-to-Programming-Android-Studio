/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogtimer;
import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author prv1
 */
public class DialogTimer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int time1, time2, milli1, milli2, sec1, sec2, timeDifference;
       final int MILLISECS_IN_SECOND = 1000;
       
       GregorianCalendar before = new GregorianCalendar();
       milli1 = before.get(GregorianCalendar.MILLISECOND);
       sec1 = before.get(GregorianCalendar.SECOND);
       time1 = MILLISECS_IN_SECOND * sec1 + milli1;
       
       sayConf("Is stealiing ever justified? ");
       GregorianCalendar after = new GregorianCalendar();
       milli2 = after.get(GregorianCalendar.MILLISECOND);
       sec2 = after.get(GregorianCalendar.SECOND);
       time2 = MILLISECS_IN_SECOND * sec2 + milli2;
       
       timeDifference = time2 - time1;
       
       say("It took " + timeDifference + " milliseconds for you to answer");

// TODO code application logic here
    }
    
    public static void say(String text){
        JOptionPane.showMessageDialog(null, text);
    }
    
    public static void sayConf(String text){
        JOptionPane.showConfirmDialog(null, text);
    }
}
