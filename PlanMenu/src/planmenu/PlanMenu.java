/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planmenu;
import javax.swing.*;
/**
 *
 * @author bekkiviau
 */
public class PlanMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu briefMenu = new Menu();// creates object briefMenu
        PickName names = null;
        String guestChoice = new String();
        
        try
        {
            PickMenu selection = new PickMenu(briefMenu);
            names = selection;
            guestChoice = names.getChoice();
        
        }
        
        catch(Exception error)
        {
            guestChoice = error.getMessage();
        }
        
        JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
        
    }
    
}
