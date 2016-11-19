/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testblooddata;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class BloodData {
    private char blood;
    private char rH;

    
    
    public void setBlood(char type){
        blood = type;
    }
    
    public void setRh(char factor){
        rH = factor;
    }
    
    public char getBlood(){
        
        return blood;
    }
    
    public char getRh(){
        
        return rH;
    }
    
    public void blood(){
        blood = 'O';
        rH = '+';
    }
    
    public void display(){
        System.out.println("Blood type is " + getBlood() + getRh());
    }
    
    public void displayMessage(){
        Scanner keyboard = new Scanner(System.in);
        StringBuffer message = new StringBuffer("Please enter ");
        String[] bloodTypes = {"A","B","AB","O"};
        String[] rHFactor = {"+","-"};
        char inputChar = 'A';
        String inputString = "";
        
        
        

            
        for(int i = 0; i < bloodTypes.length; ++i){
            if(i == 0)
            message.append("blood type ");

            message.append(bloodTypes[i]);
            if(i < (bloodTypes.length -1)){
                message.append(", ");
            }
            if(i == (bloodTypes.length - (1))){
                message.append(": ");
                System.out.print(message);
                inputString = keyboard.nextLine();
                if(!inputString.isEmpty())
                    inputChar = inputString.charAt(0);
                else
                    inputChar = 'O';
                setBlood(inputChar);
            }
        }
        

        for(int i = 0; i < rHFactor.length; ++i){
            if(i == 0)
                message.append("rH Factor ");
            
            message.append(rHFactor[i]);
                if(i < (rHFactor.length - 1)){
                    message.append(", ");

                }
                if(i == (rHFactor.length - (1))){
                    message.append(": ");
                    System.out.print(message);
                    inputString = keyboard.nextLine();
                    if(!inputString.isEmpty())
                        inputChar = inputString.charAt(0);
                    else
                        inputChar = '+';
                    setRh(inputChar);
                }
            }
        }
}
    
    
    
    
    
    
    

