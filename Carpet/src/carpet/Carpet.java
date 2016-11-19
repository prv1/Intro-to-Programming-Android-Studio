/*
 * Phillip Viau
 * 10/27/2015
 * Write a Java class that declares variables to represent the length and width of a 
 * room in feet and the price of carpeting per square foot in dollars and cents. Ask the 
 * user for input of length, width and price. Compute and display, with explanatory text, 
 * the cost of carpeting the room. Save the class as Carpet.java.
 */
package carpet;

import javax.swing.JOptionPane;

/**
 *
 * @author prv1
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int l, w, a;
       float fPrice, fTotal;// TODO code application logic here
       String sInputDialog;
       
       sInputDialog = JOptionPane.showInputDialog(null, "Please enter the length in feet");
       l = Integer.parseInt(sInputDialog);
       sInputDialog = JOptionPane.showInputDialog(null, "Please enter the width in feet");
       w = Integer.parseInt(sInputDialog);
       a = l * w;
       sInputDialog = JOptionPane.showInputDialog(null, "Please enter the price per square foot");
       fPrice = Float.parseFloat(sInputDialog);
       fTotal = fPrice * a;
       System.out.println("Your total amount is $" + fTotal + " for " + a + " square feet of carpet at $" + fPrice + " per square foot");
    }
    
}
