/*
 * Phillip Viau
 * 10/27/2015
 * Corrected Debug 2 Chapter 2
 */
package debugtwo2;

/**
 *
 * @author prv1
 */
public class DebugTwo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a, b, c;
      a = 7;
      b = 4;
      c = 0; // added to store calculation
      c = a + b; // First calculation
      System.out.println("The sum is " + c); // replaced a + b and added completed caluclation
      c = a - b; // second calculation
      System.out.println("The difference is " + c); // println only outputs information not calculate, must be done outside of println 
      System.out.println("The product is " + c);    // TODO code application logic here
    }
    
}
