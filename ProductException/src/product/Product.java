/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;
import java.util.Scanner;
/**
 *
 * @author bekkiviau
 */


public class Product {
private int productNum, productNumLen;

private double price;
Scanner input = new Scanner(System.in);
    
     public static void main(String[] args) {
        Product product = new Product(555,3.45);// TODO code application logic here
    }
     
     
    public Product(int p, double price) throws ProductException{
       
        if(p < 100 || p > 999)
            throw(new ProductException());   
        
        
        this.productNum = p;
        this.price = price;
        
    }
    

    
    
    public int getProductNum() {

        return productNum;
    }

    public void setProductNum(int productNum) {
        
        this.productNum = productNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    
    
    
    


}


