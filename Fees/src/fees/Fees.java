/*
 * Phillip Viau
 * 10/27/2015
 * Write a class that prompts a student for the number of credit hours in which 
 * the student is enrolled, and the amount of money spent on books. Display, with 
 * full explanation, the student’s total fees. The total is $85 per credit hour, 
 * plus the amount for books, plus a $65 athletic fee. Save the class as Fees.java.

 */
package fees;

import javax.swing.JOptionPane;

/**
 *
 * @author prv1
 */
public class Fees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float fCreditHours, fTotalSpentOnBooks, fTotalFees; // TODO code application logic here
       int iAthleticFee = 65, iTuitionFee = 85;
       String sInputDialog;
       sInputDialog = JOptionPane.showInputDialog(null, "How many credit hours are you currently enrolled in this year?");
       fCreditHours = Float.parseFloat(sInputDialog);
       sInputDialog = JOptionPane.showInputDialog(null, "How much money have you spent on books");
       fTotalSpentOnBooks = Float.parseFloat(sInputDialog);
       fTotalFees = (fCreditHours * iTuitionFee) + (fTotalSpentOnBooks + iAthleticFee);
       System.out.println("You have spent a total of $" + fTotalFees + " on tuition, fees, and books");
    }
    
}
