/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jresortcalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author phillipviau
 */
public class JResortCalculator extends JFrame implements ItemListener{
final int basePrice = 200;
final int earlyBook = 100;
final int breakfastPremium = 20;
final int golfPremium = 75;
int totalPrice = basePrice;
        JCheckBox weekendBox = new JCheckBox("Weekend premium $" + earlyBook, false );
        JCheckBox breakfastBox = new JCheckBox("Breakfast $" + breakfastPremium, false );
        JCheckBox golfBox = new JCheckBox("Golf premium $" + earlyBook, false );
        JLabel resortLabel = new JLabel("Resort Price Calculator");
        JLabel ePrice = new JLabel("The price for your stay is");
        JLabel totPrice = new JLabel("");
        JLabel optionExplainLabel = new JLabel("Base price for room is$" + basePrice + ".");
        JLabel optionExplainLabel2 = new JLabel("Check the options you want");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JResortCalculator frame = new JResortCalculator(); // TODO code application logic here
       frame.setSize(300,300);
       frame.setVisible(true);
       
    }
    
    public JResortCalculator(){
        super("Resort Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(resortLabel);
        add(optionExplainLabel);
        add(optionExplainLabel2);
        add(weekendBox);
        add(breakfastBox);
        add(golfBox);
        add(ePrice);
        add(totPrice);
        totPrice.setText("$" + totalPrice);
        weekendBox.addItemListener(this);
        breakfastBox.addItemListener(this);
        golfBox.addItemListener(this);
        
    }
    
    public void itemStateChanged(ItemEvent event){
        Object source = event.getSource();
        int select = event.getStateChange();
        if(source == weekendBox)
            if(select == ItemEvent.SELECTED)
                totalPrice += earlyBook;
            else
                totalPrice -= earlyBook;
        else if(source == breakfastBox)
            if(select == ItemEvent.SELECTED)
                totalPrice += breakfastPremium;
            else
                totalPrice -= breakfastPremium;
        else
            if(select == ItemEvent.SELECTED)
                totalPrice += golfPremium;
            else
                totalPrice -= golfPremium;
        totPrice.setText("$" + totalPrice);
    }
    
}
