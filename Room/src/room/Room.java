/*
 * Phillip Viau
 * 10/27/2015
 * Write a Java class that declares variables to represent the length and width 
 * of a room in feet. Ask the user for input to accept values for length and width. 
 * Compute and display the floor space of the room in square feet (area = length * width). 
 * Display explanatory text with the value—for example, The floor space is 375 square feet. 
 * Save the class as Room.java.
 */
package room;

import javax.swing.JOptionPane;

/**
 *
 * @author prv1
 */
public class Room {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int l,w,a; // TODO code application logic here
       String sInputDialog;
       sInputDialog = JOptionPane.showInputDialog(null, "Please enter the width in feet");
       w = Integer.parseInt(sInputDialog);
       sInputDialog = JOptionPane.showInputDialog(null, "Please enter the length in feet");
       l = Integer.parseInt(sInputDialog);
       a = l * w;
       System.out.println("The area is: " + a + " square feet");
    }
    
}
