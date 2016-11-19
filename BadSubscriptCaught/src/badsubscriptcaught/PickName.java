/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badsubscriptcaught;

import javax.swing.JOptionPane;

/**
 *
 * @author bekkiviau
 */
public class PickName {
    private DisplayNames briefName;
    private String Choice = new String();
    public PickName(DisplayNames theName){
        briefName = theName;
        setChoice();
    }
    
    public void setChoice(){
        JOptionPane.showMessageDialog(null, "Choose from the following menu:");
        Choice = briefName.DisplayNames();
    }
    
    public String getChoice(){
        return(Choice);
    }    
}
