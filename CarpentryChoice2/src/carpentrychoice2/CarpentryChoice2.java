/*
 * Phillip Viau
 * 11/20/2015
 * lets user enter 3 characters instead of entire word
 */
package carpentrychoice2;

import java.util.Scanner;

/**
 *
 * @author bekkiviau
 */
public class CarpentryChoice2 {
Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarpentryChoice2 CChoice = new CarpentryChoice2();// TODO code application logic here
        CChoice.Choices();
    }
    
    public void Choices(){
        String sOptions[] = {"table","desk","dresser","entertainment center"}; // array that matches string with price
        float fPrices[] = {250,325,420,600}; // array that matches price with string
        String sChoice = "";
        int iChoice = 0;
        System.out.println("Please enter from the following options: ");
        for(int i = 0; i < sOptions.length; ++i){
            System.out.print(sOptions[i] + " ");
        }
        sChoice = input.nextLine();
        for(int i = 0; i < sOptions.length; ++i){
            if(sChoice.equals(sOptions[i])){ // checks if input matches any words in array
                System.out.println("Item: " + sOptions[i]);
                System.out.println("Price $" + fPrices[i]);
            }else if(i == sOptions.length - (1) && !sChoice.equals(sOptions[i])){ 
                System.out.println("You did not enter a valid item"); // prints message if item entered is invalid
            }
            if(sChoice.startsWith(sOptions[i], 3)){
                System.out.println("Matches " + i);
            }
        }

    }
}
