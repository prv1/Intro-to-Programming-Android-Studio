/*
 * Phillip Viau
 * 11/24/2015
 * calculates total cost of paint and how much is needed for a room
 */
package paintcalculator;
import java.util.Scanner;

/**
 *
 * @author bekkiviau
 */
public class PaintCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final float pricePerGallon = 32;// TODO code application logic here
        final int areaPerGallon = 350;
        float totalPaint;
        float totalPrice, totalArea, longArea, shortArea, w, h, l;
        System.out.print("Enter width: >> ");
        w = input.nextInt();
        System.out.print("Enter height: >> ");
        h = input.nextInt();
        System.out.print("Enter length: >> ");
        l = input.nextInt();
        PaintCalculator Room = new PaintCalculator();
        shortArea = (2*shortMeasure(w, h)); // runs twice since the measurement is only for one side
        longArea = (2*longMeasure(l,h)); // runs twice since the measurement is only for one side
        
        System.out.println("Total length area is: " + longArea + " sq. feet"); // displays length area measurement
        System.out.println("Total width area is : " + shortArea + " sq. feet"); // displays width area measurement
        totalArea = shortArea + longArea; // calculates combined area
        totalPaint = calculatePaint(totalArea, areaPerGallon); // passes variables to method for computation
        totalPrice = totalPaint * pricePerGallon; // calculates the final price
        System.out.println("Total combined area is " + (shortArea + longArea) +  // displays info to user and stats
                " sq. feet, using " + totalPaint + " gallons of paint,  and costing $" + 
                totalPrice);
        
    }
    
    public static float shortMeasure(float w,float h){
        //Scanner input = new Scanner(System.in);
        
        //float a = 0; // declares initial variable
        w *= h; // calculates final area
        return w; // returns back to main()
        
        
    }
    
    public static float longMeasure(float l, float h){
        //float a = 0; // declares initial variable
        l *= h; // calculates final area
        return l; // returns back to main()
    }
    
    public static float calculatePaint(float totalArea,int apg){
        //float totalGallons;
        totalArea /= apg;
        
        return totalArea;
    }
    
}
