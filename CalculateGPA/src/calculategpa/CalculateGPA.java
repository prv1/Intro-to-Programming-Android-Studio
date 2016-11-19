/*
 * Phillip Viau
 * 11/3/2015
 * Your program should do the following:
Declare constants for:
General Education Credits = 4
Programming Credits = 7
Total Credits = 15
Declare variables for:
Grades for the three classes
Quality points for the three classes
Total quality points
Ask the user to enter their numeric grade for the following courses through the use of dialog boxes
Algebra
Critical Thinking
Programming
Store the input in each course variable
Multiple the grade point value for each course by the number of credits for each course and store as quality points for each class
Sum the total quality points
Divide sum of total quality points by the total credits
Output the quarter GPA
 */
package calculategpa;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class CalculateGPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iCredits[] = {4,4,7,0};//, iProgrammingCredits = 7, iTotalCredits = iGeCredits + iProgrammingCredits, iSelection = 0; // TODO code application logic here
        //iCredits[iCredits.length - (1)] = iCredits[0]+iCredits[1]+iCredits[2];
        float fGpa[] = {0,0,0,0};// sets values to zero for each class and is associated with sClass names
        String sClass[] = {"Algebra","Critical Thinking","Programming","Total GPA"}; // declares class names for associating with fGpa array
        for(int i=0;i<=fGpa.length - (2);i++){ // for loop that cycles through the length of the array
            System.out.print("Please enter your " + sClass[i] + " GPA: "); // prints message based on index of i
            fGpa[i] = input.nextFloat(); //  allows user input
            if(fGpa[i] < 0 || fGpa[i] > 4){ // if the user input is out of the gpa range it subtracts from i to go back one
                System.out.println("You are out of the GPA range - 0 - 4.0 scale Please try again!");
                i--;
            }else{
                fGpa[fGpa.length - (1)] += fGpa[i]; // adds each array input into the last index of the array
                iCredits[iCredits.length - (1)] += iCredits[i];
                if(i == fGpa.length - (2)){ // once the for loop has his the 2nd to last array then this if statement calculates the final gpa
                     fGpa[fGpa.length - (1)] /= fGpa.length - (1);
                     iCredits[iCredits.length - (1)] *= ((fGpa[fGpa.length - (1)]) / 4);
                } 
            }
            
        }
        System.out.println("Your " + sClass[sClass.length - (1)] + " is " + fGpa[fGpa.length - (1)] + ", you have " + iCredits[iCredits.length - (1)] + " total credits this quarter.");
    }
    
}
