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
public class Menu {
    private String[] entreeChoice = {"Rosemary Chicken","Beef Wellington","Maine Lobster"};
    private String menu = "";
    private int choice;
    
    public String displayMenu(){
        for(int x = 0; x < entreeChoice.length; ++x){
            menu = menu + "\n" + (x + 1) + " for " + entreeChoice[x];
        }
        String input = JOptionPane.showInputDialog(null, "Type your selection, then press Enter." + menu);
        choice = Integer.parseInt(input);
        return (entreeChoice[choice -1]);
    }
            
}
