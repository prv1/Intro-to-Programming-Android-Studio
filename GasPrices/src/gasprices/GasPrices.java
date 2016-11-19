/*
 * Phillip Viau
 * 11/24/2015
 * adjusts fuel prices based on price per barrel
 */
package gasprices;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class GasPrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pricePerBarrel = 100;// TODO code application logic here
        float multiplier = 1.0f, pricePerGallon = 3.50f;
        
        
        pricePerBarrel = setPricePerBarrel(pricePerBarrel);
        System.out.println("New Price per barrel is $" + pricePerBarrel);
        multiplier = setMultiplier(pricePerBarrel, multiplier);
        System.out.println("Multiplier is " + multiplier);
        pricePerGallon = setGasPrice(pricePerGallon, multiplier);
        pricePerGallon = pricePerGallon + (float)(pricePerGallon * 0.000001d);
        
        System.out.print("New price per gallon is: $" + pricePerGallon + " and $" + (pricePerGallon + 0.60f) + "\n");
    }
    
    public static int setPricePerBarrel(int p){
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter new price per barrel >> $");
        p = keyboard.nextInt();
        
        return p; // returns price input by user
    }
    
    public static float setMultiplier(int p, float m){
        final float pricePerBarrel = 100;
        
        
            
        m = (p / pricePerBarrel); // gets multiplier based on price per barrel change
            
        
        return m;
    }
    
    public static float setGasPrice(float p,float m){
        
        p = (p*m); // multiplies based on multiplier
        return p;
    }
    
}
