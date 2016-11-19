/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// DebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents

package debugfive1;
import javax.swing.*;

/**
 *
 * @author prv1
 */
public class DebugFive1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
      final double HIGH_PRICE = 2.59;
      final double MED_PRICE = 1.99;
      final double LOW_PRICE = 0.89;
      String usersChoiceString;
      int usersChoice;
      double bill = 0.0;
      usersChoiceString = JOptionPane.showInputDialog(null,
         "Order please\n1 - Burger\n2 - Hotdog" +
         "\n3 - Grilled cheese\n4 - Fish sandwich");
      usersChoice= Integer.parseInt(usersChoiceString); // changed to usersChoiceString
      if(usersChoice == 1 || usersChoice == 2) // changed to OR operator
         bill += HIGH_PRICE; // changed to HIGH_PRICE variable and += to add to bill variable
      else if(usersChoice == 3 || usersChoice == 4){ // added if do define the last two options
         bill += MED_PRICE; // changed - to + and += to add to bill variable
      }// added curly braces before asking fries addition
      usersChoiceString = JOptionPane.showInputDialog(null,
          "Fries with that?\n1 - Yes\n2 - No");
      usersChoice = Integer.parseInt(usersChoiceString); // missing parseInt()
      if (usersChoice == 1);
          bill += LOW_PRICE; // added += to add to bill variable
      JOptionPane.showMessageDialog(null,"Bill is " + bill);
    }
    
}
