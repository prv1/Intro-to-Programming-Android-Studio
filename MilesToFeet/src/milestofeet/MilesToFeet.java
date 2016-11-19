/*
 * Phillip Viau
 * 10/23/2015
 * Calculates distance from miles to feet
 */
package milestofeet;

/**
 *
 * @author prv1
 */
public class MilesToFeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iMilesToFeet = 5280;// declares variable
        float fDistance = 8.5f * iMilesToFeet; // calculates distance based on feet in a mile
        System.out.println("Total distance in feet is: " + fDistance); // displays information to user
       
        
    }
    
}
