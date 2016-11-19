/*
 * Phillip Viau
 * 10/26/2015
 * Calculates input of inches defaulted in system and outputs its feet and inches
 */
package inchestofeet;

/**
 *
 * @author bekkiviau
 */
public class InchesToFeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iInchesToFoot = 12;// TODO code application logic here
        int iTotalInches = 86;
        int iFeet, iInches;
        iFeet = iTotalInches / iInchesToFoot;
        iInches = iTotalInches % iInchesToFoot;
        System.out.println("You are " + iFeet + " feet " + iInches + " inches tall");
        
        
    }
    
}
