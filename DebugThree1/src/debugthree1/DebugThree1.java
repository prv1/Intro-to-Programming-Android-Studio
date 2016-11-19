/*
 * Phillip Viau
 * 11/24/2015
 * tip calculator of a bill
 */
package debugthree1;
// This class calculates a waitperson's tip as 15% of the bill
public class DebugThree1
{
   public static void main(String args[])
   {
      double myCheck = 50.00d;
      double yourCheck = 19.95d;
      System.out.println("Tips are");
      calcTip(myCheck);
      calcTip(yourCheck);
    }
    public static double calcTip(double bill)
    {
        double tip;
      final double RATE = 0.15;
      tip = bill + RATE;
      System.out.println("The tip should be at least " + tip);
      return tip;
    }
}
