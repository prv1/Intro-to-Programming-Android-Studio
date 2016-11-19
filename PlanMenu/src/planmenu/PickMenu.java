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
public class PickMenu {
    private Menu briefMenu;
    private String guestChoice = new String();
    public PickMenu(Menu theMenu){
        briefMenu = theMenu;
        setGuestChoice();
    }
    
    public void setGuestChoice(){
        JOptionPane.showMessageDialog(null, "Choose from the following menu:");
        guestChoice = briefMenu.displayMenu();
    }
    
    public String getGuestChoice(){
        return(guestChoice);
    }
}
