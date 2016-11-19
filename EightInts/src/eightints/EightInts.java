/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightints;

/**
 *
 * @author prv1
 */
public class EightInts {
private int ints[] = {1,2,3,4,5,6,7,8};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EightInts eightInts = new EightInts(); // adds public method from static
        eightInts.displayIntsUp();  // runs method 
        eightInts.displayIntsDown(); // then runs this method
    }
    
    public void displayIntsUp(){
        for(int i = 0; i < ints.length; ++i){ //
            System.out.println(ints[i]);
        }
    }
    
    public void displayIntsDown(){
        for(int i = 7; i >= 0; --i){
            System.out.println(ints[i]);
        }
    }
}
