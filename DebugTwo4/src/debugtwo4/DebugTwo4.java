/*
 * Phillip Viau
 * 10/27/2015
 * Corrected Debug 4 Chapter 2
 */
package debugtwo4;

import javax.swing.JOptionPane; // added for calling of library within code

/**
 *
 * @author prv1
 */
public class DebugTwo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String costString; // missing semicolon
     float cost; // cost will be fine as a float not a double
     final float TAX = 0.06f; // TAX will be fine as a float
     costString = JOptionPane.showInputDialog(null, "Enter price of item you are buying", "Purchases", // missing libraries import javax.swing.JOptionPane; missing null input
        JOptionPane.INFORMATION_MESSAGE);
     cost = Float.parseFloat(costString); //changed to float
     JOptionPane.showMessageDialog(null,"With " + TAX * 100 + // case sensitive variables
        "% tax,  purchase  is $" + (cost - cost * TAX));        // TODO code application logic here
    }
    
}
