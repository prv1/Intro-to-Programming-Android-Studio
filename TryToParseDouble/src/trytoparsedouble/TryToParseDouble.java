/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trytoparsedouble;
import javax.swing.*;
/**
 *
 * @author bekkiviau
 */
public class TryToParseDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double number;// TODO code application logic here
        String keyboard, message;
        try{
        keyboard = JOptionPane.showInputDialog(null, "Please enter a double");
        number = Double.parseDouble(keyboard);
        message = "You entered " + number;
        }
        catch(NumberFormatException numberFormat){
            message = "0 Error! Only numbers are accepted";
        }
        
        JOptionPane.showMessageDialog(null, message);
        
    }
    
}
