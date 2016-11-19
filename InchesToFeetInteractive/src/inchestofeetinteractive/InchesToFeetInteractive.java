/*
 * Phillip Viau
 * 10/26/2015
 * converts users input into feet and inches
 */
package inchestofeetinteractive;
import javax.swing.JOptionPane;
/**
 *
 * @author bekkiviau
 */
public class InchesToFeetInteractive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iInchesToFoot = 12;// TODO code application logic here
        int iTotalInches = 0;
        int iFeet, iInches;
        String sInputDialog = null;
        int iPlayAgain;
        sInputDialog = JOptionPane.showInputDialog(null, "How tall are you?", JOptionPane.INFORMATION_MESSAGE);
        iTotalInches = Integer.parseInt(sInputDialog);
        iFeet = iTotalInches / iInchesToFoot;
        iInches = iTotalInches % iInchesToFoot;
        System.out.println("You are " + iFeet + " feet " + iInches + " inches tall");
        iPlayAgain = JOptionPane.showConfirmDialog(null, "Would you like to play Again?", "Choose", JOptionPane.YES_NO_OPTION);
        if(iPlayAgain == JOptionPane.YES_OPTION) {
            InchesToFeetInteractive.main(args);
        }
        
    }
    
}
