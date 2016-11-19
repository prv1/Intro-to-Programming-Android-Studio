/*
 * Phillip Viau
 * 11/17/2015
 * Asks user for grades of classes and gives average and final grade
 */
package gpacalculator;

import java.util.Scanner;

/**
 *
 * @author prv1
 */
public class GPACalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int iCredits[] = {4,4,7,0}, iTotalClasses = 0;//, iProgrammingCredits = 7, iTotalCredits = iGeCredits + iProgrammingCredits, iSelection = 0; // TODO code application logic here
        char cClass[] = {'A','A','A','A'}, cFinalGrade;
        String cInput = "";
        float fGpa[] = {0,0,0,0}, fCredit = 0; // sets values to zero for each class and is associated with sClass names
        float fGpaLength = fGpa.length - 1;
        String sClass[] = {"Algebra","Critical Thinking","Programming","Total GPA"}; // declares class names for associating with fGpa array
        String sInput = "";
        
        
        for(int i=0;i<=fGpa.length - (2);i++){ // for loop that cycles through the length of the array
            System.out.println("Please press enter or enter 0 to skip a class");
            System.out.print("Please enter your " + sClass[i] + " grade letter: "); // prints message based on index of i
            //fGpa[i] = input.nextFloat(); //  allows user input
            cInput = input.nextLine();
            cClass[i] = cInput.charAt(0);
            switch(cClass[i]){
                case 'a':
                case 'A':
                    fGpa[i] = 4.0f;
                    break;
                case 'b':
                case 'B':
                    fGpa[i] = 3.0f;
                    break;
                case 'c':
                case 'C':
                    fGpa[i] = 2.0f;
                    break;
                case 'd':
                case 'D':
                    fGpa[i] = 1.0f;
                    break;
                case 'f':
                case 'F':
                    fGpa[i] = 0.0f;
                    break;
                default:
                    fGpa[i] = -1.0f;
                        
            }
            if((fGpa[i] < 0 || fGpa[i] > 4) && fGpa[i] != -1.0) { // if the user input is out of the gpa range it subtracts from i to go back one
                System.out.println("You are out of the GPA range - 0 - 4.0 scale Please try again!");
                i--;
            }else if(fGpa[i] == -1.0){
                System.out.println("You dont have this class");
                
            }else{
                iCredits[iCredits.length - (1)] += iCredits[i]*(fGpa[i]/4.0);
                fGpa[fGpa.length - (1)] += fGpa[i]; // adds each array input into the last index of the array

                //iCredits[iCredits.length - (1)] += iCredits[i];
                iTotalClasses++;
 
            }
            /*if(i == fGpa.length - (2)){ // once the for loop has his the 2nd to last array then this if statement calculates the final gpa
                 fGpa[fGpa.length - (1)] /= fGpa.length - (1);
                 iCredits[iCredits.length - (1)] *= ((fGpa[fGpa.length - (1)]) / iTotalClasses);
            }*/
            //fGpa[fGpa.length - (1)] = (fGpa[fGpa.length - (1)]/iTotalClasses);
            
        }
        
        if(fGpa[fGpa.length - (1)] == 4){
            cClass[cClass.length - (1)] = 'A';
        }else if(fGpa[fGpa.length - (1)] >= 3){
            cClass[cClass.length - (1)] = 'B';
        }else if(fGpa[fGpa.length - (1)] >= 2){
            cClass[cClass.length - (1)] = 'C';
        }else if(fGpa[fGpa.length - (1)] >= 1){
            cClass[cClass.length - (1)] = 'D';
        }else if(fGpa[fGpa.length - (1)] >= 0){
            cClass[cClass.length - (1)] = 'F';
        }
        
        
        
        
        if(iTotalClasses != 0.0){
            fGpa[fGpa.length - (1)] = (fGpa[fGpa.length - (1)]/iTotalClasses);
            System.out.println("Your " + sClass[sClass.length - (1)] + " GPA is averaged at " + fGpa[fGpa.length - (1)] + ", you have " + iCredits[iCredits.length - (1)] + " total credits this quarter. Total Classes " + iTotalClasses + ", your final grade is: " + cClass[cClass.length - (1)] );
            System.out.println("Your class details are as follows: ");
            System.out.println("Class\t\t\tCredits\tGPA\tFinal Grade");
            for(int i=0;i<=fGpa.length - (1);++i){
                if(iCredits[i] != 0.0){
                    System.out.print(sClass[i]+ "\t\t");
                    System.out.print(iCredits[i]+ "\t");
                    System.out.print(fGpa[i]+ "\t");
                    System.out.print(cClass[i]+ "\t\n");
                }
                
            }
        }else{
            System.out.println("You didn't enter any values, so your GPA is 0");
            
        }        // TODO code application logic here
    }
    
}
