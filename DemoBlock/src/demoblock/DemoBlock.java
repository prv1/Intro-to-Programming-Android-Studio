/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoblock;

/**
 *
 * @author prv1
 */
public class DemoBlock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Demonstrating block scope");// TODO code application logic here
        int x = 1111;
        System.out.println("In first block x is " + x);
        {
            int y = 2222;
            System.out.println("In second block x is " + x);
            System.out.println("In second block y is " + y);
        }
        {
            int y = 3333;
            System.out.println("In third block x is " + x);
            System.out.println("In third block y is " + y);
            demoMethod();
            System.out.println("After method x is " + x);
            System.out.println("After method block y is " + y);
        }
        System.out.println("At the end x is " + x);
    }
    public static void demoMethod(){
        int x = 8888, y = 9999;
        System.out.println("In demoMethod x is " + x);
        System.out.println("In demoMethod y is " + y);
    }
    
}
