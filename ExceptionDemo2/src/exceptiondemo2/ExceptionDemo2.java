/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiondemo2;

import javax.swing.JOptionPane;

/**
 *
 * @author bekkiviau
 */
public class ExceptionDemo2 {

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
        
        catch(NumberFormatException exception)
        {
            JOptionPane.showMessageDialog(null, "This application accepts digits only!");
            numerator = 999;
            denominator = 999;
            result = 1;
        }
        
        JOptionPane.showMessageDialog(null, numerator + " / " + denominator + "\nResult is " + result);
                // TODO code application logic here
    }
    
}
