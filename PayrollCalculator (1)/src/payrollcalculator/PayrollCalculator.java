/*
 * Phillip Viau
 * 11/06/2015
 * Asks user information about pay and calculates it based on factors
 */
package payrollcalculator;
import java.util.Scanner;
/**
 *
 * @author bekkiviau
 */
public class PayrollCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float fHoursWorked = 0, fOtHours = 0, fPayRate = 0, fOtRate = 0, fRegularPay = 0, fOtPay = 0, fTaxRate  = 0, fTaxDeduction = 0, fNetPay = 0, iTaxRate = 0;// TODO code application logic here
        int iDependents = -1;
        System.out.print("Please enter your pay rate: ");
        fPayRate = input.nextFloat();
        System.out.print("Please enter your hours worked this week: ");
        fHoursWorked = input.nextFloat();
        while(iDependents < 0){ // loops until 0 or above is entered
            System.out.print("Please enter the number of dependents you have: ");
            iDependents = input.nextInt();
            if(iDependents < 0){ // if user enters a number less than 0 then it loops until a valid number is entered
                System.out.println("You can't have negative kids, nice try!");
            }
        }
        switch(iDependents){ // determines tax rate based on dependents and sets tax rate variable
            case 0:
                fTaxRate = 0.35f;
                break;
            case 1:
                fTaxRate = 0.30f;
                break;
            case 2:
                fTaxRate = 0.25f;
                break;
            case 3:
                fTaxRate = 0.20f;
                break;
            default:
                fTaxRate = 0.20f;

        }        
        
        iTaxRate = fTaxRate * 100; // sets tax rate into a whole number for println
        
        if(fHoursWorked > 40){ // if user enters more than 40 hours then this statement is true
            fOtRate = fPayRate * 1.5f; // calculates overtime rate
            fOtHours = fHoursWorked - 40; // determines how many hours are greater than 40 hours and sets it
            fRegularPay = fPayRate * fHoursWorked; // multiplies the pay rate and hours worked to get pay
            fOtPay = fOtHours * fOtRate; // multiplies overtime hours and pay rate
            fNetPay = fRegularPay + fOtPay; // adds regular pay to overtime pay to get combined pay
            fTaxDeduction = fNetPay * fTaxRate;  // gets taxes to be paid and taken out from pay
            
        }else{ // only performs certain procedures since overtime isnt involved
            fRegularPay = fHoursWorked * fPayRate; // muliplies hours by regular pay and adds to the result
            fNetPay = fRegularPay;
            fTaxDeduction = fNetPay * fTaxRate;
        }
        System.out.println("Your pay information: "); // prints all the information to the user
        System.out.println("Hours Worked: " + fHoursWorked + " hours");
        System.out.println("Pay Rate: $" + fPayRate + " per hour");
        if(fOtHours > 0){ // will give congrats if user works overtime hours
            System.out.println("You worked pretty hard this week, keep it up!!!");
            System.out.println("OT Hours: " + fOtHours + " hours");
        }
        System.out.println("Gross Pay: $" + fNetPay);
        System.out.println("Regular Pay: $" + fRegularPay);
        if(fOtHours > 0) // only runs OT Pay if overtime is greater than 0
            System.out.println("OT Pay: $" + fOtPay);
        System.out.println("Tax Rate: " + iTaxRate + "%");
        System.out.println("Tax Deducted: $" + fTaxDeduction);
        fNetPay -= fTaxDeduction;
        System.out.println("Take Home Pay: $" + fNetPay);


        
    }
    
}
