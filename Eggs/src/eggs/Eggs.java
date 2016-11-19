/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggs;

import javax.swing.JOptionPane;

/**
 *
 * @author bekkiviau
 */
public class Eggs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iEggsOrdered = 1;// TODO code application logic here
        int iOrderAgain = 0;
        int iTotalDozen, iDozenRemaining;
        float fPriceDozen = 3.25f;
        float fPriceIndividual = 0.45f;
        float fTotalPrice;

        String sTotalDozen = JOptionPane.showInputDialog(null, "How many eggs would you like to order?", "Order Form", JOptionPane.INFORMATION_MESSAGE);
        if(sTotalDozen != null){
            iEggsOrdered = Integer.parseInt(sTotalDozen);
            iTotalDozen = iEggsOrdered / 12;
            iDozenRemaining = iEggsOrdered % 12;
            fTotalPrice = (fPriceDozen * iTotalDozen) + (fPriceIndividual * iDozenRemaining);
            System.out.println( "You have ordered " + iEggsOrdered + " eggs. That is " + iTotalDozen + " dozen eggs at $3.25 per dozen and " + iDozenRemaining + " loose eggs at 45 cents each for a total of $" + fTotalPrice);
            iOrderAgain = JOptionPane.showConfirmDialog(null, "Would you like to place another order?", "Order", JOptionPane.YES_NO_OPTION);
            if(iOrderAgain == JOptionPane.YES_OPTION) {
                Eggs.main(args);
            }
        }


        
        
    }
    
}
