/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Decides if two numbers are evenly divisible
package debugfive2;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class DebugFive2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num;
      int num2;
      int num3; // added for extra placeholder
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number ");
      num = input.nextInt();  // added Int to nextInt
      System.out.print("Enter another number ");
      num2 = input.nextInt();
      num3 = num2 % num;  // added placeholder for two sets of checks
      num = num % num2; // 
      if((num == 0) || (num3 == 0)){ // changed double ampersand to double pipes
         System.out.println("One of these numbers is evenly divisible into the other");
      }else{
         System.out.println("Neither of these numbers is evenly divisible into the other"); // added double quotation marks
      }
    }
    
}
