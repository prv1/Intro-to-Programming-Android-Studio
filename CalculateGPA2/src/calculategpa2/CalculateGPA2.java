/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculategpa2;

import java.util.Scanner;

/**
 *
 * @author prv1
 */
public class CalculateGPA2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int iCredits[] = {4,4,7,0}, iTotalClasses = 0;//, iProgrammingCredits = 7, iTotalCredits = iGeCredits + iProgrammingCredits, iSelection = 0; // TODO code application logic here
        
//iCredits[iCredits.length - (1)] = iCredits[0]+iCredits[1]+iCredits[2];
        float fGpa[] = {0,0,0,0}, fCredit = 0; // sets values to zero for each class and is associated with sClass names
        String sClass[] = {"Algebra","Critical Thinking","Programming","Total GPA"}; // declares class names for associating with fGpa array
        
        
        
        for(int i=0;i<=fGpa.length - (2);i++){ // for loop that cycles through the length of the array
            System.out.println("Please press enter or enter 0 to skip a class");
            System.out.print("Please enter your " + sClass[i] + " GPA: "); // prints message based on index of i
            fGpa[i] = input.nextFloat(); //  allows user input
            if(fGpa[i] < 0 || fGpa[i] > 4){ // if the user input is out of the gpa range it subtracts from i to go back one
                System.out.println("You are out of the GPA range - 0 - 4.0 scale Please try again!");
                i--;
            }else if(fGpa[i] == 0){
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
        
        if(iTotalClasses != 0.0){
            fGpa[fGpa.length - (1)] = (fGpa[fGpa.length - (1)]/iTotalClasses);
            System.out.println("Your " + sClass[sClass.length - (1)] + " GPA is averaged at " + fGpa[fGpa.length - (1)] + ", you have " + iCredits[iCredits.length - (1)] + " total credits this quarter. Total Classes " + iTotalClasses );
            System.out.println("Your class details are as follows: ");
            System.out.println("Class\t\t\tCredits\tGPA");
            for(int i=0;i<=fGpa.length - (1);++i){
                if(iCredits[i] != 0.0){
                    System.out.print(sClass[i]+ "\t\t");
                    System.out.print(iCredits[i]+ "\t");
                    System.out.print(fGpa[i]+ "\t\n");
                }
                
            }
        }else{
            System.out.println("You didn't enter any values, so your GPA is 0");
            
        }
    }
    

    
    
}
