/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createspaservices;

/**
 *
 * @author prv1
 */
public class SpaService {
private String serviceDescription;
private double price;

    public SpaService(){
        serviceDescription = "XXX";
        price = 0;
    }
    
    public void setServiceDescription(String service){
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
