/*
 * Phillip Viau
 * 11/29/2015
 * 
 */
package debugeight3;
// Application looks up home price
// for different floor plans
// allows upper or lowercase data entry
import javax.swing.*;
public class DebugEight3
{
   public static void main(String[] args)
   { 
      String entry;
      char[] floorPlans = {'A','B','C','a','b','c'};
      int[] pricesInThousands = {145, 190, 235, 145, 190, 235};
      char plan = 'A';
      int x, fp = 99;
      boolean bFp = false;
      String prompt = "Please select a floor plan\n" +
          "Our floorPlanss are:\n" + "A - Augusta, a ranch\n" +
          "B - Brittany, a split level\n" +
          "C - Colonial, a two-story\n" +
          "Enter floorPlans letter";
      entry = JOptionPane.showInputDialog(null, prompt);
      plan = entry.charAt(0);
      for(x = 0; x < floorPlans.length; ++x){
	 if(entry.charAt(0) == floorPlans[x]){
           bFp = true; // sets boolean for if statement
           fp = (x); // sets int variable to whatever x 
         }
      }
      if(bFp){ // changed to boolean since easier to understand
          // if(fp < floorPlans.length) pretty pointless to have if statment when the for statement doesnt allow to be true if outside of length
              //fp = fp - floorPlans.length;
              JOptionPane.showMessageDialog(null, "Model " +
                      plan + " is priced at only $" +
                      pricesInThousands[fp] + ",000");
      }else{
          JOptionPane.showMessageDialog(null,
                  "Invalid floor plan code entered");
      }
   }
}
