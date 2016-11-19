/*
 * Phillip Viau
 * 11/02/2015
 * 
 */
package pay;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class Pay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sLevelAndPay[] = {"Skill Level\tHourly Pay Rate ($)","1\t\t17.00","2\t\t20.00","3\t\t22.00"};
        String sInsurance[] = {"Option\tExplanation\t\t\tWeekly Cost to Employees ($)","1\tMedical Insurance\t\t32.50","2\tDentalInsurance\t\t\t20.00","3\tLong-term disability insurance\t10.00"};// TODO code application logic here
        String sInsuranceName = "";
        boolean bRetirementOption = false;
        float fHoursWorked = 0, fHourlyRate = 0, fRegularPay = 0, fOTPay = 0, fTotalPay = 0, fGrossPay = 0, fTotalDeductions = 0, fWeeklyCost = 0, fOtHours = 0;
        int iSkillSelection = 0, iInsuranceSelection = 0, iSkillLevel = 0, iInsuranceLevel = 0, iSelection = 0;
        for(int i=0; i< sLevelAndPay.length; i++){
            System.out.println(sLevelAndPay[i]);
            if(i == sLevelAndPay.length-(1)){
                System.out.print("Please enter the skill level: ");
                iSkillSelection = input.nextInt();
            }
        }
        switch(iSkillSelection){
            
            case 1:
                fHourlyRate = 17.00f;
                iSkillLevel = 1;
                break;
            case 2:
                fHourlyRate = 20.00f;
                iSkillLevel = 2;
                break;
            case 3:
                fHourlyRate = 22.00f;
                iSkillLevel = 3;
                break;
            default:
                fHourlyRate = 17.00f;
                iSkillLevel = 1;   
        }
         

        System.out.print("Enter the total hours have you worked: ");
        fHoursWorked = input.nextFloat();
        if(fHoursWorked > 40){
            fOtHours = fHoursWorked - 40;
            fHoursWorked -= fOtHours; // i could have subtracted 40, but this seemed 'funner' :D
            fRegularPay = fHourlyRate * 40;
            fOTPay = fOtHours * (fHourlyRate * 1.5f);
            fTotalPay = fRegularPay + fOTPay;
            fGrossPay = fTotalPay;
        }else{
            fRegularPay = fHourlyRate * fHoursWorked;
            fTotalPay = fRegularPay;
            fGrossPay = fTotalPay;
            
                      
        }
         for(int i=0; i< sInsurance.length; i++){
            System.out.println(sInsurance[i]);
            if(i == sInsurance.length-(1)){
                System.out.print("Please select an option: ");
                iInsuranceSelection = input.nextInt();
            }
        }
        switch(iInsuranceSelection){
            
            case 1:
                sInsuranceName = "Medical Insurance";
                fWeeklyCost = 32.50f;
                iInsuranceLevel = 1;
                fTotalDeductions += fWeeklyCost;
                break;
            case 2:
                sInsuranceName = "Dental Insurance";
                fWeeklyCost = 20.00f;
                iInsuranceLevel = 2;
                fTotalDeductions += fWeeklyCost;
                break;
            case 3:
                sInsuranceName = "Long-term Disability Insurance";
                fWeeklyCost = 10.00f;
                iInsuranceLevel = 3;
                System.out.print("Would you like to participate in a retirement plan?\n1. Yes\n2. No\nPlease Select an option: ");
                iSelection = input.nextInt();
                if(iSelection == 1){
                    
                    fTotalDeductions += fTotalPay * 0.03;
                }
                fTotalDeductions += fWeeklyCost;
                break;
            default:
                sInsuranceName = "Medical Insurance";
                fWeeklyCost = 17.00f;
                iInsuranceLevel = 1;
                fTotalDeductions += fWeeklyCost;
                
        }
        if(fTotalDeductions > fGrossPay){
            float fErrorPay = 0;
            fErrorPay = fGrossPay - fTotalDeductions;
            fErrorPay /= -1;
            System.out.println("Error, your total deductions exceed your total pay. You owe the company $" + fErrorPay);
            
                    
        }else{
            fTotalPay -= fTotalDeductions;
            System.out.println("Your pay information: ");
            System.out.println("Hours Worked: " + fHoursWorked);
            System.out.println("Hourly Pay Rate: $" + fHourlyRate);
            
            System.out.println("Regular Pay Total: $" + fRegularPay);
            if(fOTPay > 0){
                System.out.println("Overtime Pay: $" + fOTPay);
            }
            System.out.println("Total Gross Pay: $" + fGrossPay);
            System.out.println("Total Deductions: $" + fTotalDeductions);
            System.out.println("Your total pay is: $" + fTotalPay);
            
        }
        
        
    }
    
}
