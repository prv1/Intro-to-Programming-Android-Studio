/*
 * Phillip Viau
 * 12/02/2015
 * 
 */
package debugfour1;
// This program assigns values to two variables
// and performs mathematical operations with them
public class DebugFour1
{
   public static void main(String args[]) // static
   {
      int x = 5;
      int y = 8; // ;
      System.out.println("adding " + (x + y)); //missing paretheses

      int z = 19;
      System.out.println("subtracting "  + (z - y)); // () missing paretheses

      System.out.println("dividing " + (z / x)); // missing paretheses
      System.out.println("multiplying " + (x * z)); // missing paretheses
   }
}
