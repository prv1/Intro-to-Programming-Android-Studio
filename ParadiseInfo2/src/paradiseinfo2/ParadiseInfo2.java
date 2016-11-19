/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradiseinfo2;
import java.util.Scanner;
/**
 *
 * @author bekkiviau
 */
public class ParadiseInfo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double price, discount,savings;// TODO code application logic here
        System.out.print("Enter cutoff price for discount >> ");
        price = keyboard.nextDouble();
        System.out.print("Enter discount rate as a whole number >> ");
        discount = keyboard.nextDouble();
        savings = computeDiscountInfo(price, discount);
        System.out.println("Special this week on any service over " + price);
        System.out.println("Discount of " + discount + " percent");
        System.out.println("That's a savings of at least $" + savings);
        
        
    }
    
    public static double computeDiscountInfo(double pr, double dscnt){
        double savings;
        savings = pr * dscnt / 100;
        return savings;
    }
    
}
