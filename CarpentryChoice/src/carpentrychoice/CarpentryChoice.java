/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpentrychoice;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class CarpentryChoice {
Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarpentryChoice CChoice = new CarpentryChoice();// TODO code application logic here
        CChoice.Choices();
    }
    
    public void Choices(){
        String sOptions[] = {"table","desk","dresser","entertainment center"};
        float fPrices[] = {250,325,420,600};
        String sChoice = "";
        
        System.out.println("Please enter from the following options: ");
        for(int i = 0; i < sOptions.length; ++i){// prints all options available
            System.out.print(sOptions[i] + " "); // displays each variable in array
        }
        sChoice = input.nextLine(); // allows user input
        for(int i = 0; i < sOptions.length; ++i){ // checks if input matches any options
            if(sChoice.equals(sOptions[i])){
                System.out.println("Item: " + sOptions[i]);
                System.out.println("Price $" + fPrices[i]);
            }        
        }

    }
    
}
