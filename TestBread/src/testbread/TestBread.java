/*
 * Phillip Viau
 * 12/07/2015
 * tests bread.java with random values
 */
package testbread;

/**
 *
 * @author prv1
 */
public class TestBread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bread bread1 = new Bread("White", 12);// TODO code application logic here
        Bread bread2 = new Bread("Wheat", 7);
        Bread bread3 = new Bread("Rye", 10);
        bread1.display();
        bread2.display();
        bread3.display();
    }
    
}
