/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortcircuttestand;

/**
 *
 * @author prv1
 */
public class ShortCircutTestAnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        if(trueMethod() && falseMethod()){
            System.out.println("Both are true");
        }else{
            System.out.println("Both are not true");
            
        }
    }
    
    public static boolean trueMethod(){
        System.out.println("True method");
        return true;
    }
    
    public static boolean falseMethod(){
        System.out.println("False method");
        return false;
    }
    
}
