/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dollars;

import javax.swing.JOptionPane;

/**
 *
 * @author prv1
 */
public class Dollars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iTwentyDen = 0, iTenDen = 0, iFiveDen = 0, iOneDen = 0, iTotalTwenty = 0, iTotalTen = 0, iTotalFive = 0, iTotalOne = 0, iTotalMoney = 0, iLeftOverTwenty = 0, iLeftOverTen = 0, iLeftOverFive = 0;
        iTwentyDen = 20;
        iTenDen = 10;
        iFiveDen = 5;
        iOneDen = 1;
        String sInputDialog;
        sInputDialog = JOptionPane.showInputDialog(null, "How much money do you have?", "Total Money", JOptionPane.INFORMATION_MESSAGE);
        iTotalMoney = Integer.parseInt(sInputDialog);
        if(iTotalMoney >= iTwentyDen){
            iTotalTwenty = iTotalMoney / iTwentyDen;
            iLeftOverTwenty = iTotalMoney % iTwentyDen;            
            iTotalTen = iLeftOverTwenty / iTenDen;
            
                if(iTotalTen != 0){
                    iLeftOverTen = iLeftOverTwenty % iTenDen;

                }else{
                    iTotalTen = iLeftOverTwenty / iTenDen;
                    iLeftOverTen = iLeftOverTwenty % iTenDen;
                }
                
                if(iTotalTen != 0){
                    iTotalFive = iLeftOverTen / iFiveDen;
                    iLeftOverFive = iLeftOverTen % iFiveDen;
                }else{
                    iTotalFive = iLeftOverTwenty / iFiveDen;
                    iLeftOverFive = iLeftOverTwenty % iFiveDen;
                }
                
                    

                if(iTotalFive != 0){
                    iTotalOne = iLeftOverFive / iOneDen;
                }else{
                    iTotalOne = iLeftOverTwenty / iOneDen;
                }
        
                    
        System.out.println("You have " + iTotalTwenty + " $20 dollar bills, " + iTotalTen + " $10 dollar bills, " + iTotalFive + " $5 dollar bills, and " + iTotalOne + " $1 dollar bills from $" + iTotalMoney + ".");           
        }else{
            System.out.println("You must enter 20 or greater!");
            Dollars.main(args);
        }      
    
    }

        

    
    
}
