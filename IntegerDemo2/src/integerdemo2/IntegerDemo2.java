/*
 * Phillip Viau
 * 10/26/2015
 * Outputs various integers to screen calculates another integer and displays on screen
 */
package integerdemo2;

/**
 *
 * @author prv1
 */
public class IntegerDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iAnInt = 12;
        byte bAByte = 12;
        short sAShort = 12345;
        long aLong = 123567890987654321L;
        int iAnotherInt = iAnInt * 10000000;
        System.out.println("The int is " + iAnInt);
        System.out.println("The byte is " + bAByte);
        System.out.println("The short is " + sAShort);
        System.out.println("The long is " + aLong);        // TODO code application logic here
        System.out.println("Another in " + iAnotherInt);
    }
    
}
