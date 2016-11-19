/*
 * Phillip Viau
 * 10/26/2015
 * Receives input from user and calculates user's input into total price
 */
package dogboarding;

import javax.swing.JOptionPane;

/**
 *
 * @author bekkiviau
 */
public class DogBoarding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iPounds, iTotalDays;// TODO code application logic here
        float fTotalPrice;
        float fPricePerPound = 0.50f;
        String sInputDialog;
        sInputDialog = JOptionPane.showInputDialog(null, "How many pounds does your dog weigh?", "Weight", JOptionPane.INFORMATION_MESSAGE);
        iPounds = Integer.parseInt(sInputDialog);
        fTotalPrice = iPounds * fPricePerPound;
        sInputDialog = JOptionPane.showInputDialog(null, "How many days would you like your dog to stay?", "Total Days of Stay", JOptionPane.INFORMATION_MESSAGE);
        iTotalDays = Integer.parseInt(sInputDialog);
        fTotalPrice = fTotalPrice * iTotalDays;

        System.out.println("Your total price is $" + fTotalPrice + " for your " + iPounds + " pound dog that is staying for " + iTotalDays + " days."); 
        
        
        
        
        
        
        
        
    }
    
}
