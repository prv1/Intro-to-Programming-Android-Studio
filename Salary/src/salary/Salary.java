/*
 * Phillip Viau
 * 11/24/2015
 * calculates regular pay and overtime pay
 */
package salary;
import java.util.Scanner;
/**
 *
 * @author bekkiviau
 */
public class Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String[] prompt = {"regular hours", "overtime hours"};// TODO code application logic here
        float hourlyRate = 0, hoursWorked = 0, overtimeHours = 0;
        
        System.out.print("Please enter your hourly rate: >> ");
        hourlyRate = input.nextFloat();
        System.out.print("Please enter your regular hours worked: >> ");
        hoursWorked = input.nextFloat();
        
        System.out.print("Please enter your overtime hours worked: >> ");
        overtimeHours = input.nextFloat();
        
        
        overtimeHours = calculateOT(hourlyRate, overtimeHours);
        hoursWorked = totalPay(hourlyRate, hoursWorked, overtimeHours);
        System.out.println("Your total pay is: $" + hoursWorked);
        
    }
    
    
    public static float calculateOT(float hRate, float otHours){
        
        hRate *= 1.5 * (otHours);
        return hRate;
    }
    
    public static float totalPay(float hRate,float hWorked,float otHours){
        float tp = 0;
        tp = (hRate * hWorked) + otHours;
        return tp;
    }
    
    
    
}
