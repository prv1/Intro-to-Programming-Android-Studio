/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classexample;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author phillipviau
 */
public class ClassExample extends JPanel {
private JRadioButton buttonOne, buttonTwo, buttonThree;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Combobox.main(args);
        //JFrame frame = new JFrame("JRadioButtonDemo");// TODO code application logic here
        //frame.setContentPane(new ClassExample());
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(300,300);
        //frame.setVisible(true);
    }
    
    public ClassExample(){
        // create 3 radio buttons
        buttonOne = new JRadioButton("One", true);
        buttonTwo = new JRadioButton("Two");
        buttonThree = new JRadioButton("Three");
       
        
        this.setBackground(Color.red);
        this.setLayout(new GridLayout(1,3));
        // add radio buttons to the container
        add(buttonOne);
        add(buttonTwo);
        add(buttonThree);

        
        // group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(buttonOne);
        group.add(buttonTwo);
        group.add(buttonThree);
        // set button background color
        buttonOne.setBackground(Color.red);
        buttonTwo.setBackground(Color.green);
        buttonThree.setBackground(Color.blue);         
        
    }
    
}
