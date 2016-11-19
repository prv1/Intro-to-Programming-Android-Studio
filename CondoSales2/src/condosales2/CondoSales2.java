/*
 * Phillip Viau
 * 11/02/2015
 * Prompts user for selection and outputs selected view and price with or without garage
 */
package condosales2;

import java.util.Scanner;

/**
 *
 * @author prv1
 */
public class CondoSales2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iSelection = 0, iPrice = 0;
        String sChoiceCondo[] = {"Please make a selection:", "1. Park View", "2. Golf Course View", "3. Lake View"};
        String sChoiceParking[] = {"Please make a selection:", "1. With Garage", "2. Without Garage"};
        String sCondo = "", sPrice, sGarage = "";
        
        for(int i = 0; i < sChoiceCondo.length; i++){
            System.out.println(sChoiceCondo[i]);
            if(i == sChoiceCondo.length-(1)){
                iSelection = input.nextInt();
            }
            switch(iSelection){
            case 1:
                sCondo = "Park View";
                iPrice = 150000;
                break;
            case 2:
                sCondo = "Golf Course View";
                iPrice = 170000;
                break;
            case 3:
                sCondo = "Lake View";
                iPrice = 210000;
                break;
            default:
                sCondo = "Invalid Selection";
                iPrice = 0;
                
            }
            
        }
        for(int i = 0; i < sChoiceParking.length; i++){
            System.out.println(sChoiceParking[i]);
            if(i == sChoiceParking.length-(1)){
                iSelection = input.nextInt();
                switch(iSelection){
                case 1:
                    sCondo = sCondo + " with garage";
                    iPrice = iPrice + 5000;
                    break;
                case 2:
                    sCondo = sCondo + " without garage";
                    iPrice = iPrice;
                    break;
                default:
                    sCondo = sCondo + " without garage";
                    iPrice = iPrice;
                    
            }
            }
            
            
            
        }
        
        
        System.out.println("Your total is $" + iPrice + " for the " + sCondo);
    }
    
}
