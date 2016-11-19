/*
 * Phillip Viau
 * 10/26/2015
 * Displays users initals on screen
 */
package initials;

/**
 *
 * @author bekkiviau
 */
public class Initials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char cInitials[] = {'P','R','V'};// TODO code application logic here
        
        String sInitials;
        sInitials = cInitials[0] + "." + cInitials[1] + "." + cInitials[2] + ".";
        System.out.println("Your initials are: " + sInitials);

    }
    
}
