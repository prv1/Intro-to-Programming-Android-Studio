/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatures;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class Temperatures {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iDayHigh, iDayLow, iDifference;// TODO code application logic here
        System.out.print("Please enter a day low: ");
        iDayLow = input.nextInt();
        System.out.print("Please enter a day high: ");
        iDayHigh = input.nextInt();
        iDifference = iDayHigh - iDayLow;

        if(iDayHigh-iDayLow >= 0){
            if(iDayHigh >= 90){
                System.out.println("Heat Warning");

            }else if(iDayLow <= 32) {
                System.out.println("Freeze Warning");

            }
            if(iDifference > 40){
                System.out.println("Large temperature swing");
            }

        
        
            
            
        }else{
            System.out.println("You have entered invalid values");
        }
        
    }
    
}
