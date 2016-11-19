/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badsubscriptcaught;
import javax.swing.*;
/**
 *
 * @author bekkiviau
 */
public class BadSubscriptCaught {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DisplayNames briefName = new DisplayNames();// creates object briefMenu
        PickName names = null;
        String Choice = new String();
        
        try
        {
            PickName selection = new PickName(briefName);
            names = selection;
            Choice = names.getChoice();
        
        }
        catch(ArrayIndexOutOfBoundsException boundsException)
        {
            Choice = "an invalid selection";
        }
        /*catch(Exception error)
        {
            Choice = error.getMessage();
        }*/
        
        JOptionPane.showMessageDialog(null, "You chose " + Choice);
        
        
        
        
    }
    
}
