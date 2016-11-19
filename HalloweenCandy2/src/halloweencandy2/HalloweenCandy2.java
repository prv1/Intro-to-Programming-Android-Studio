/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halloweencandy2;
import java.util.Scanner;
/**
 *
 * @author bekkiviau
 */
public class HalloweenCandy2 {



    public static void main(String[] args) {
        float fBeforeWeight = 0, fAfterWeight = 0, fFinalWeight = 0, fCaloriesPerBar = 100, fNumBarsEaten = 0, fTimeWorkedOut = 0, fTotalBarsEaten = 0, fOriginalWeight = 0, fExerciseTime = 0;
        final int MAX_CANDY = 10;
        int iDaysBefore = 0;
        String sContinueString[] = {"Would you like to continue?", "1. Yes", "2. No", "3. Reset Game"};
        String sDayBefore[] = {"today", "yesterday", "day before yesterday"};
        //String sWeightLevel;
        int iSelection;
        boolean bContinue = true;
        Scanner input = new Scanner(System.in);
        
        System.out.print("What was your weight prior to eating the candy bars? "); // runs only once to get users base weight
        fBeforeWeight = input.nextFloat(); 
        fOriginalWeight = fBeforeWeight;
        
        while(bContinue == true){
            
            if(iDaysBefore < 3){
                System.out.print("How many candy bars have you eaten " + sDayBefore[iDaysBefore] + "?");
                
            }else if(iDaysBefore >= 3){
                System.out.print("How many candy bars have you eaten " + iDaysBefore + " days ago?");
                
            }
            fNumBarsEaten = input.nextFloat();
            fTotalBarsEaten = fTotalBarsEaten + fNumBarsEaten;
            fCaloriesPerBar = 100;
            if(fNumBarsEaten >= MAX_CANDY){
                System.out.println("You shouldn't even be reading this, because you should be dead from that much sugar!");
                bContinue = true;
                
            }else{
                fAfterWeight = fNumBarsEaten  * 2;
                fFinalWeight = fBeforeWeight + fAfterWeight;
                fExerciseTime = fNumBarsEaten;
                if(fNumBarsEaten > 0){
                    System.out.println("You will have to exercise for " + fExerciseTime + " hours to burn that weight you gained");
                    System.out.println("How long did you worked out? ");
                    fTimeWorkedOut = input.nextFloat();
                        if(fTimeWorkedOut > 0){
                            fFinalWeight = fAfterWeight - fTimeWorkedOut;
                        }
                }else{
                    System.out.println("You have some self-control, Good Job!");
                    fExerciseTime = fAfterWeight + 0;
                }
                
                System.out.println("You have gained " + fAfterWeight + " lbs. Your new weight is " + fFinalWeight + " lbs");
            }
            
            
            

            
            
            
            for (String sContinueString1 : sContinueString) {
                System.out.println(sContinueString1);
            }

            System.out.print("Please make a selection: ");

            iSelection = input.nextInt();
            if(iSelection == 1){
                iDaysBefore++;  
            }else if(iSelection == 2){
                bContinue = false; // Ends while loop and exits application
            }else if (iSelection == 3){
                HalloweenCandy2.main(args);
            }else{
                System.out.println("Your selection is invalid! Please Try Agian!");
            }
            
        
        }
        
        
    }            // TODO code application logic here
    
}
