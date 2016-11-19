/*
 * Phillip Viau
 * 11/02/2015
 * prompts user for coffee selection 3 times and adds price, unless user quits
 */
package coffee;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class Coffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sChoice = "";
        String sSelection[] = {"Please make a selection:","0. Quit Application","1. American\t1.99","2. Expresso\t2.50","3. Latte\t2.15"}; // creates string array for menu selection
        int iSelection = 0; // creates variable for user selection
        float fPrice = 0.0f, fTotal = 0.0f;
        for(int i=0; i < sSelection.length; i++){
            System.out.println(sSelection[i]);
            
            
        }
        for(int i=0; i < 3; i++){
            iSelection = input.nextInt();// accepts user selection
            switch(iSelection){ // matches user seletion with specified variables
                case 1:
                    sChoice = "American";
                    fPrice = 1.99f;
                    break;
                case 2:
                    sChoice = "Expresso";
                    fPrice = 2.50f;
                    break;
                case 3:
                    sChoice = "Latte";
                    fPrice = 2.15f;
                    break;
                case 0: 
                    sChoice = "Quit Application";
                    fPrice = 0.0f;
                    i = 3;
                    break;
                default:

            }
            fTotal += fPrice; // adds value to variable not replacing it
            
        }
        System.out.println("Your total is $" + fTotal + " for your selection");
    }
    
}
