/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2debug;
import javax.swing.JOptionPane;
/**
 *
 * @author phill
 */
public class Chapter2Debug {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DebugTwo3();// TODO code application logic here
    }
    
    
    public void DebugTwo1(){
      int oneInt = 315; // Incorrect variable being initialised changed 315.0 to 315
      double oneDouble = 12.4;
      char oneChar = 'A'; // Missing single quotation
      System.out.print("The int is ");
      System.out.println(oneInt); // missing r in pintln
      System.out.print("The double is ");
      System.out.println(oneDouble); // Missing object between class and method
      System.out.print("The char is "); // missing a double quoatation mark
      System.out.println(oneChar);
    }

    public void DebugTwo2(){
      int a, b, c;
      a = 7;
      b = 4;
      c = 0; // added to store calculation
      c = a + b; // First calculation
      System.out.println("The sum is " + c); // replaced a + b and added completed caluclation
      c = a - b; // second calculation
      System.out.println("The difference is " + c); // println only outputs information not calculate, must be done outside of println 
      System.out.println("The product is " + c);        
    }    
    
    public void DebugTwo3(){
      int a = 99, b = 8, result = a % b; // if one is declared, they all must be declared added = 0 to result
      long c = 777777777; // long only stores 9 removed 4x 7's
      //result = a % b; moved declaration to above
      System.out.println("Divide " + a + " by " + b);
      System.out.println("remainder is " + result); // missing dot separating the class from the object should be result and not a
      System.out.print("c is a very large number: ");
      System.out.println(c);       
    }
    
    public void DebugTwo4(){
     String costString; // missing semicolon
     float cost; // cost will be fine as a float not a double
     final float TAX = 0.06f; // TAX will be fine as a float
     costString = JOptionPane.showInputDialog(null, "Enter price of item you are buying", "Purchases", // missing libraries import javax.swing.JOptionPane; missing null input
        JOptionPane.INFORMATION_MESSAGE);
     cost = Float.parseFloat(costString); //changed to float
     JOptionPane.showMessageDialog(null,"With " + TAX * 100 + // case sensitive variables
        "% tax,  purchase  is $" + (cost - cost * TAX));      
    }    
    
}
