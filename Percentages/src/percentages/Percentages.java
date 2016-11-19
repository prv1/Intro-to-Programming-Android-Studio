/*
 * Phillip Viau
 * 11/23/2015
 * Displays percentage of two default values
 */
package percentages;

/**
 *
 * @author bekkiviau
 */
public class Percentages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double value01 = 2.0d, value02 = 5.0d, dFinal = 0.0d;
        
        dFinal = Percentages.ComputePercent(value01, value02);
    //dFinal = Percentages.ComputePercent(value02)
        System.out.println(value01 + " is " + dFinal + "% of " + value02);
        


// TODO code application logic here
    }
    
    public static double ComputePercent(double value01,double value02){
        double value = 0;
        value = (value01 / value02) * 100;
        return value;
    }
    
}
