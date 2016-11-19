/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        int iMilesToFeet = 5280;// TODO code application logic here
        float fDistance = 8.5f * iMilesToFeet;
        System.out.println("Total distance in feet is: " + fDistance);
        MilesToFeetInteractive.main(args);
        
    }
    
}
