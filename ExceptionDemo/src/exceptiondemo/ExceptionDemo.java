/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiondemo;
import javax.swing.*;

/**
 *
 * @author bekkiviau
 */
public class ExceptionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numerator = 0, denominator = 0, result;// TODO code application logic here
        String inputString;
        
        try
        {
            inputString = JOptionPane.showInputDialog(null, "Enter a number to be divided");
            numerator = Integer.parseInt(inputString);
            inputString = JOptionPane.showInputDialog(null, "Enter a number to divide into the first number");
            denominator = Integer.parseInt(inputString);
            result = numerator / denominator;
            
        }
        
        catch(ArithmeticException exception)
        {
            JOptionPane.showMessageDialog(null, exception.getMessage());
            result = 0;
        
        }
        
        JOptionPane.showMessageDialog(null, numerator + " / " + denominator + "\nResult is " + result);
        
    }
    
}
