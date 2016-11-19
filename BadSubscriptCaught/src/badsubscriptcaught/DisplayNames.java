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
public class DisplayNames {
private String[] names = {"NameOne", "NameTwo","NameThree","NameFour","NameFive","NameSix","NameSeven","NameEight","NameNine","NameTen"};
private String menu = "";
private int choice;
    public String DisplayNames(){
        for(int x = 0; x < names.length; ++x){
            menu = menu + "\n" + (x + 1) + " for " + names[x];
        }
        String input = JOptionPane.showInputDialog(null, "Type your selection, then press Enter." + menu);
        choice = Integer.parseInt(input);
        return (names[choice -1]);
    }
    

}
