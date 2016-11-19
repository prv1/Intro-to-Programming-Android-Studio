/*
 * Phillip Viau
 * 11/29/2015
 * 
 */
package debugeight1;
// Application prompts user showing valid shipping codes
// accepts a shipping code
// and determines if it is valid
import javax.swing.*;
public class DebugEight1
{
   public static void main(String args[])
   {
      char userCode;
      String entry, message;
      boolean found = true;
      char[] okayCodes = {'A','C','T','H'};
      StringBuffer prompt = new 
            StringBuffer("Enter shipping code for this delivery\nValid codes are: ");
        for(int x = 0; x < okayCodes.length; ++x) // cycles through each char to display to user
        {
            prompt.append(okayCodes[x]); // adds char to stringbuffer for display to user
            if(x != (okayCodes.length - (1)))
               prompt.append(", ");     // adds comma and space between each code
        }
      entry = JOptionPane.showInputDialog(null, // displays entire prompt to user
          prompt); 

      userCode = entry.charAt(0);
        for(int i = 0; i < okayCodes.length; ++i) // cycles through all chars and matches with user input
        {
           if(userCode == okayCodes[i]) // true if code matches user input
           {
              found = true;
           }
        }
        if(found) // sets message based on boolean 'found'
           message = "Good code";
        else
           message = "Sorry code not found";
        JOptionPane.showMessageDialog(null, message); // displays message after variable is set in if statement
   }
}
