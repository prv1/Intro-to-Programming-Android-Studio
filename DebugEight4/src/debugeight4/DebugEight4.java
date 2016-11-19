/*
 * Phillip Viau
 * 11/29/2015
 * 
 */
package debugeight4;
// Allows user to enter a series of words
// and displays them in reverse order
// Allows user to enter a series of words
// and displays them in reverse order
import javax.swing.*;
public class DebugEight4
{
   public static void main(String[] args)
   {
      int x = 0, y = 0;
      String array[] = new String[100];
      String entry = "";
      final String STOP = "XXX";
      StringBuffer message = new
          StringBuffer("The words in reverse order are\n");
     
      //entry = JOptionPane.showInputDialog(null,
        //"Enter any word\n" +
        //"Enter " + STOP + " when you want to stop"); 
      while(!(entry.equals(STOP)))
      {
        
        entry = JOptionPane.showInputDialog(null,
            "Enter another word\n" +
            "Enter " + STOP + " when you want to stop");
        
        if(!(entry.equals(STOP))){ //checks if user entered stop
            
            array[x] = entry;
            x++;
        }
      }
      
      
      for(y = x; y >= 0; --y)
      {
        if(!(array[y] == null)){ // appends each word backwards starting at whatever x was left at
         message.append(array[y]);
         message.append("\n");
        }
      }
      JOptionPane.showMessageDialog(null, message);
   }
}
