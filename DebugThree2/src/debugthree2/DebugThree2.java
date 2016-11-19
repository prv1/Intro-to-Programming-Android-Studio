/*
 * Phillip Viau
 * 11/24/2015
 * displays math facts
 */
package debugthree2;
// This application displays some math facts
public class DebugThree2
{
   public static void main(String args[])
   {
      int a = 2, b = 5, c = 10;
      add(a, b);
      add(b, c);
      subtract(c, a);            
   }
   public static void add(int a,int b)
   {
      System.out.println("The sum of " + a +
        " and " + b + " is " + (a + b));
   }
   public static void subtract(int a,int b)
   {
      System.out.println("The difference between " +
        a + " and " + b + " is " + (a - b));
   }
}
