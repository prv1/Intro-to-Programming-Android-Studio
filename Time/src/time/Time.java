/*
 * Phillip Viau
 * 10/27/2015
 * Write a class that declares a variable named minutes, which holds minutes worked 
 * on a job, and ask the user for the values. Display the value in hours and minutes; 
 * for example, 197 minutes becomes 3 hours and 17 minutes. Be sure to use a named constant 
 * where appropriate. Save the class as Time.java.
 */
package time;

import javax.swing.JOptionPane;

/**
 *
 * @author prv1
 */
public class Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iMin, iHours, iTotalMins;// TODO code application logic here
        String sInputDialog;
        sInputDialog = JOptionPane.showInputDialog(null, "Please enter the total number of minutes you worked?");
        iTotalMins = Integer.parseInt(sInputDialog);
        iHours = iTotalMins / 60;
        iMin = iTotalMins % 60;
        System.out.println("You have worked for " + iHours + " hours and " + iMin + " minutes");
    }
    
}
