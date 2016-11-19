/*
 * Phillip Viau
 * 11/02/2015
 * prompts user for gpa and activities and determines if student is a candidate for a scholarship
 */
package scholarship;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class Scholarship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creates a new scanner class as input
        int iExtraCirricular = 0, iServiceActivities = 0; // creates and declares variables for program
        String sMessages[] = {"Please enter your GPA: ", "Please enter how many extra cirricular activites you are involved in: ", "Please enter how many service activites you are involved in: "};
        float fGPA = 0.0f;// TODO code application logic here
        
        
        System.out.print(sMessages[0]); // outputs first array in string
        fGPA = input.nextFloat(); // accepts input and writes it to fGPA variable if not float then it throws error
        System.out.print(sMessages[1]); // outputs second array in string
        iExtraCirricular = input.nextInt(); // accepts input and writes it to integer variable if not an integer value entered then it returns an error
        System.out.print(sMessages[2]); // outputs third array in string 
        iServiceActivities = input.nextInt(); // accepts input and writes it to integer variable if not an integer value entered then it returns an error
        
        if((fGPA >= 3.8 && iExtraCirricular >= 1) || (fGPA >= 3.4 && iExtraCirricular >= 3 && iServiceActivities >= 3) || (fGPA >= 3.0 && iExtraCirricular >= 2 && iServiceActivities >= 3)){
            System.out.println("Scholarship Candidate"); // if user falls within a specific range then theyre a candidate
        
            
        }else{
            System.out.println("Not a Candidate"); // if user falls outside of the specified range then theyre not a candidate
        }
        
            
        
        
    }
    
}
