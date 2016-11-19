/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classexample;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author phillipviau
 */
public class Combobox extends JFrame {
    
    public Combobox(){
        super("ComboBox Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        String[] majorArray = {"English", "Math", "Sociology"};
        JComboBox majorChoice = new JComboBox(majorArray);
        
        //majorChoice.addItem("English");
        //majorChoice.addItem("Math");
        //majorChoice.addItem("Sociology");
        add(majorChoice);
        
        
    }
    
    public static void main(String[] args){
        Combobox frame = new Combobox();
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
