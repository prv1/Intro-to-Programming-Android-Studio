/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author bekkiviau
 */
public class ProductException extends Exception {

    public ProductException(){
        super("invalid product");
        //System.out.print("Less than $0.01");

        
    }
    

}
