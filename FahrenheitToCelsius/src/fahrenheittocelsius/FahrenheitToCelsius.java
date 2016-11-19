/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheittocelsius;

import javax.swing.JOptionPane;

/**
 *
 * @author prv1
 */
public class FahrenheitToCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iConversion = 32, iTemperature = 32;// TODO code application logic here
        float fCelciusTemp = 32.0f, fTemperature = 32.0f, fConversion = 32.0f;
        String sInputDialog;
        sInputDialog = JOptionPane.showInputDialog(null, "What temperature would you like to convert F to C", fTemperature);
        fTemperature = Float.parseFloat(sInputDialog);
        fCelciusTemp = fTemperature - fConversion * (5/9);
        System.out.println("The Celsius temperature is " + fCelciusTemp + "C");
    }   
    
    
}
