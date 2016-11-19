/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaservice;

/**
 *
 * @author prv1
 */
public class SpaService {
private String serviceDescription;
private double price;


    
    public void setServiceDesctription(String service){
        serviceDescription = service;
        
    }
    public void setPrice(double pr){
        price = pr;
    }
    
    public String getServiceDesctription(){
        return serviceDescription;
    }
    public double getPrice(){
        return price;
    }
    
}
