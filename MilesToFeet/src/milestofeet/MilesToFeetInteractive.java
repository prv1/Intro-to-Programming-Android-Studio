/*************************************************************
*Phillip Viau
*$(date)
*
*************************************************************/


package milestofeet;
import javax.swing.JOptionPane;
/**
 *
 * @author prv1
 */
public class MilesToFeetInteractive {
        public static void main(String[] args) {
            String sInputDialog;
            float iMilesToFeet = 5280;// TODO code application logic here
            float fDistance;
            sInputDialog = JOptionPane.showInputDialog(null, "Enter the distance", "Input 1",JOptionPane.INFORMATION_MESSAGE);
            fDistance = Float.parseFloat(sInputDialog);
            fDistance = iMilesToFeet * fDistance;
            System.out.println("Total distance in feet: " + fDistance);
        }
        
        
        
}
