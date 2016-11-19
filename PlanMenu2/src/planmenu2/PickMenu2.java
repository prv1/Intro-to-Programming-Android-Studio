/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planmenu2;
import javax.swing.*;

/**
 *
 * @author bekkiviau
 */
public class PickMenu2 {
    private Menu2 briefMenu;
    private String guestChoice = new String();
    public PickMenu2(Menu2 theMenu) throws MenuException{
        briefMenu = theMenu;
        setGuestChoice();
    }
    
    public void setGuestChoice() throws MenuException{
        JOptionPane.showMessageDialog(null, "Choose from the following menu:");
        guestChoice = briefMenu.displayMenu();
    }
    
    public String getGuestChoice(){
        return(guestChoice);
    }
}
