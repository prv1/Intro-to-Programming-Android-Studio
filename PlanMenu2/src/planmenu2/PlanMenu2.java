package planmenu2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
/**
 *
 * @author bekkiviau
 */
public class PlanMenu2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu2 briefMenu = new Menu2();// TODO code application logic here
        PickMenu2 entree = null;
        String guestChoice = new String();
        
        try
        {
            PickMenu2 selection = new PickMenu2(briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        
        }
        catch(MenuException error)
        {
            guestChoice = error.getMessage();
        }
        catch(Exception error)
        {
            guestChoice = "an invalid selection";
        }
        
        JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
        
    }
    
}
