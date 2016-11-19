/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negativearray;
import java.util.Scanner;
/**
 *
 * @author bekkiviau
 */
public class NegativeArray {
private int[] numbers;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NegativeArray arr = new NegativeArray();
    }
    
    public NegativeArray(){
        int keyboard;
        String message;
        Scanner input = new Scanner(System.in);// TODO code application logic here
        ask("Please enter a number for an array size:");
        try{
            keyboard = input.nextInt();
            int[] arr = new int[keyboard];
            message = "You have successfully initiated an array";
        }
        catch(NegativeArraySizeException negArr){
            message = "Error! You did not initiate an array";
        }
        catch(NumberFormatException numFormat){
            message = "Error! You did not initiate an array";
        }
        ask(message);
    }
    
    
    public void ask(String text){
        System.out.print(text + "> ");
        
    }
    
}
