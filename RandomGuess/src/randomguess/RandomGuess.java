/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomguess;
import javax.swing.JOptionPane;
/**
 *
 * @author prv1
 */
public class RandomGuess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iRandomNumber = (1 + (int)(Math.random() * 10));
        
        JOptionPane.showMessageDialog(null,"The number is " + iRandomNumber );// TODO code application logic here
    }
    
}
