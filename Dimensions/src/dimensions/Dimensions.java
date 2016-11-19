/*
 * Phillip Viau
 * 10/28/2015
 * Allows user to covert radius to diameter, area, and circumferance.
 * Diameter = 2 * Radius
 * Area = π * Radius^2
 * Circumferance = π • Diamete
 */
package dimensions;
import javax.swing.JOptionPane;
/**
 *
 * @author prv1
 */
public class Dimensions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float d, fRadius;// TODO code application logic here
        double a, c;
        String sInputDialog;
        sInputDialog = JOptionPane.showInputDialog(null, "What is the radius of circle?");
        fRadius = Float.parseFloat(sInputDialog);
        d = fRadius * 2;
        a = Math.PI * fRadius * fRadius;
        c = Math.PI * d;
        System.out.println("Your original radius is " + fRadius + ", with a diameter of " + d + ", an area of " + a + " and a circumferance of " + c);
        
    }
    
}
