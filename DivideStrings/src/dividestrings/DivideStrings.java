/*
 * Phillip viau
 * 11/20/2015
 * Takes string and divides it into 20 array slots
 */
package dividestrings;
import java.util.Scanner;
/**
 *
 * @author bekkiviau
 */
public class DivideStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// TODO code application logic here
        String[] sInputArray = new String[20];
        String sSentence;
        int iInput = 0, iTotalWords = 0;
        String temp = "";
        System.out.println("Please enter a sentence with 20 or less words");
        sSentence = input.nextLine();
        
        for(int i = 0; i < sInputArray.length; ++i){
            sInputArray = sSentence.split(" ");
            iTotalWords++;
        }
        System.out.println("Please enter 1 for short strings or 2 for long strings");
        iInput = input.nextInt();
        
        
        switch(iInput){

            case 2: 
                System.out.println("Long strings " );
                if(iTotalWords != 0){
                    for(int i = 0; i < iTotalWords; ++i){
                        temp = sInputArray[i];
                        if(temp.length() > 5){ // if word is greater than 5 then it prints whatever i is
                        System.out.println(temp);
                        }
                    }
                }else
                    System.out.println("No words typed");
            break;
            default:
                System.out.println("Short strings " );
                if(iTotalWords != 0){
                    for(int i = 0; i < iTotalWords; ++i){ // cycles through all words
                        temp = sInputArray[i]; // temporarily assigns variable into temp variable for comparison
                        if(temp.length() <= 5){ // if word is less than or equal to 5 words then it prints whatever i is
                        System.out.println(temp);
                        }
                    }            
               }else
                    System.out.println("No words typed");
            
        }

        
        

        
        
    }
    
}
