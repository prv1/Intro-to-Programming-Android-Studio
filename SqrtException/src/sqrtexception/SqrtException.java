/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqrtexception;
import java.util.Scanner;
/**
 *
 * @author bekkiviau
 */
public class SqrtException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SqrtException sqrt = new SqrtException();
    }
    
    
    public SqrtException(){
        double num, squareRt;
        String message;
        Scanner input = new Scanner(System.in);
        try{
        ask("Enter a number to find the square root of");
        
        num = input.nextDouble();
        squareRt = Math.sqrt(num);
        if(num < 0)
            throw(new ArithmeticException("Negative values disallowed "));
        
        message = "The Square root of " + num + " is " + squareRt;
        }
        
        catch(ArithmeticException format)
        {
            message = "Only digits are accepted";
        }
        ask(message);
    }
    
    public void ask(String text){
        System.out.print(text + " > ");
    }
    
    
}
