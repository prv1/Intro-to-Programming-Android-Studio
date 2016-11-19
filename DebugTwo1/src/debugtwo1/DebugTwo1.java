/*
 * Phillip Viau
 * 10/27/2015
 * Corrected Debug 1 Chapter 2
 */
package debugtwo1;

/**
 *
 * @author prv1
 */
public class DebugTwo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int oneInt = 315; // Incorrect variable being initialised changed 315.0 to 315
      double oneDouble = 12.4;
      char oneChar = 'A'; // Missing single quotation
      System.out.print("The int is ");
      System.out.println(oneInt); // missing r in pintln
      System.out.print("The double is ");
      System.out.println(oneDouble); // Missing object between class and method
      System.out.print("The char is "); // missing a double quoatation mark
      System.out.println(oneChar);// TODO code application logic here
    }
    
}
