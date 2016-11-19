/*
 * Phillip Viau
 * 10/30/2015
 * Determines if number entered is odd or even
 */
package evenodd;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iNum;// TODO code application logic here
        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        iNum = input.nextInt();
        iNum = iNum % 2;
        System.out.println(iNum);
            if(iNum == 0){
                System.out.println("You entered an even number");
            }else if(iNum == 1){
                System.out.println("You entered an odd number");
            }
    }
    
}
