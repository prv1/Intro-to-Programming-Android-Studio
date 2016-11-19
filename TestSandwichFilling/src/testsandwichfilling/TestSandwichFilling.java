/*
 * Phillip Viau
 * 12/07/2015
 * Passes default information to sandwich filling java file
 */
package testsandwichfilling;

/**
 *
 * @author prv1
 */
public class TestSandwichFilling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SandwichFilling filling1 = new SandwichFilling("turkey", 22);// TODO code application logic here
        SandwichFilling filling2 = new SandwichFilling("ham", 15);
        SandwichFilling filling3 = new SandwichFilling("egg salad", 32);
        filling1.display();
        filling2.display();
        filling3.display();
             
    }
    
}
