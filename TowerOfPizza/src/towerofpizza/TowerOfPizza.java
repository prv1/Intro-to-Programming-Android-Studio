/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerofpizza;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author phillipviau
 */
public class TowerOfPizza extends JFrame implements ItemListener {
final int basePrice = 0;
final int small = 8;
final int medium = 9;
final int large = 11;
float toppingPrice, pizzaPrice;
float[] pizzaPriceArray = {8,9,11,14};
float[] toppingPriceArray = {0f, 1f, 0.5f, 1.5f, 1f};
float totalPrice = basePrice;
String[] sizeArray = {"Small", "Medium", "Large", "Extra Large"};
JComboBox sizeChoice = new JComboBox(sizeArray);
String[] toppingArray = {"None", "Pepperoni", "Onion", "Sweet Peppers", "Sausage"};
JComboBox toppingChoice = new JComboBox(toppingArray);
JLabel company = new JLabel("Tower of Pizza");
JLabel pizzaSizeLabel = new JLabel("Size List");
JLabel pizzaToppingLabel = new JLabel("Topping List");
JLabel totalPriceLabel = new JLabel("$8");
    public TowerOfPizza(){
        super("Resort Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        this.setBackground(Color.CYAN);
        add(company);
        add(pizzaSizeLabel);
        add(sizeChoice);
        add(pizzaToppingLabel);
        add(toppingChoice);
        add(totalPriceLabel);
        sizeChoice.addItemListener(this);
        toppingChoice.addItemListener(this);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TowerOfPizza frame = new TowerOfPizza();// TODO code application logic here
        frame.setSize(1000, 200);
        frame.setVisible(true);
        
    }
    
    public void itemStateChanged(ItemEvent event){
        Object source = event.getItem();
        int select = ItemEvent.SELECTED;
        System.out.println("" + select);
        if(event.getStateChange() == ItemEvent.SELECTED){
            
            pizzaPrice = pizzaPriceArray[source];
            toppingPrice = toppingPriceArray[ItemEvent.SELECTED];
                    
            
        }
        
        
        totalPrice = pizzaPrice + toppingPrice;
        totalPriceLabel.setText("Total Price $" + totalPrice);
    }
    
}
