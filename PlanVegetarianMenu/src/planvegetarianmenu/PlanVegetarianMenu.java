/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planvegetarianmenu;

import javax.swing.JOptionPane;

/**
 *
 * @author bekkiviau
 */
public class PlanVegetarianMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VegetarianMenu briefMenu = new VegetarianMenu();// TODO code application logic here
        PickMenu entree = null;
        String guestChoice = new String();
        
        try
        {
            PickMenu selection = new PickMenu(briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        
        }
        
        catch(Exception error)
        {
            guestChoice = "an invalid vegetarian selection";
        }
        
        JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
    }
    
}
