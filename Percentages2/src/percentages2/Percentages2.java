/*
 * Phillip Viau
 * 11/23/2015
 * Displays percentage of two values with user input
 */
package percentages2;
import java.util.Scanner;
/**
 *
 * @author bekkiviau
 */
public class Percentages2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value01 = 2.0d, value02 = 5.0d, dFinal = 0.0d;
        double iChoice = 0.0d;
        System.out.print("Please enter first value: ");
        value01 = input.nextDouble();
        System.out.print("Please enter second value: ");
        value02 = input.nextDouble();
        dFinal = Percentages2.ComputePercent(value01, value02);
    //dFinal = Percentages.ComputePercent(value02)
        System.out.println(value01 + " is " + dFinal + "% of " + value02);
        


// TODO code application logic here
    }
    
    public static double ComputePercent(double value01,double value02){
        double value = 0;
        value = (value01 / value02) * 100;
        return value;
    }
    
}
