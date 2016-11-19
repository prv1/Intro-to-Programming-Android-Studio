/*
 * Phillip Viau
 * 11/02/2015
 * Prompts user for selection and outputs selected view and price
 */
package condosales;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class CondoSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iSelection = 0, iPrice = 0;
        String sChoiceCondo[] = {"Please make a selection:", "1. Park View", "2. Golf Course View", "3. Lake View"};
        String sCondo = "", sPrice;
        
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
        System.out.println("Your total is $" + iPrice + " for the " + sCondo); 
        
        
        
        
        // TODO code application logic here
    }
    
}
