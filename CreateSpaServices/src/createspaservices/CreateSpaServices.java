/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createspaservices;
import java.util.Scanner;

/**
 *
 * @author prv1
 */
public class CreateSpaServices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String service = "";// TODO code application logic here
        double price = 0;
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        Scanner keyboard;
        firstService = getData(firstService);
        secondService = getData(secondService);
        
        
        //firstService.setServiceDescription(service);
        //firstService.setPrice(price);
        
        //keyboard.nextLine();
        //System.out.print("Enter Service >> ");
        //service = keyboard.nextLine();
        //System.out.print("Enter price >> ");
        //price = keyboard.nextDouble();
        //secondService.setServiceDesctription(service);
        //secondService.setPrice(price);
        
        System.out.println("First service details:");
            System.out.println(firstService.getServiceDesctription() +
                    " $" + firstService.getPrice());
        System.out.println("Second service details:");
            System.out.println(secondService.getServiceDesctription() +
                    " $" + secondService.getPrice());    
        
        
    }
    
    public static SpaService getData(SpaService s){
        String service;
        double price;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter service >> ");
        service = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();
        keyboard.nextLine();
        
        s.setServiceDescription(service);
        s.setPrice(price);
        return s;
        
    }
    
}
