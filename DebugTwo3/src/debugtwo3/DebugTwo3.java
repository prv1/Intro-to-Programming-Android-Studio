/*
 * Phillip Viau
 * 10/27/2015
 * Corrected Debug 3 Chapter 2
 */
package debugtwo3;

/**
 *
 * @author prv1
 */
public class DebugTwo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a = 99, b = 8, result = a % b; // if one is declared, they all must be declared added = 0 to result
      long c = 777777777; // long only stores 9 removed 4x 7's
      //result = a % b; moved declaration to above
      System.out.println("Divide " + a + " by " + b);
      System.out.println("remainder is " + result); // missing dot separating the class from the object should be result and not a
      System.out.print("c is a very large number: ");
      System.out.println(c); // TODO code application logic here
    }
    
}
