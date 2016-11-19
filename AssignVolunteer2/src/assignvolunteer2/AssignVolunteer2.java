/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignvolunteer2;

import java.util.Scanner;

/**
 *
 * @author prv1
 */
public class AssignVolunteer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iDonationType;
        String sVolunteer, sMessage;
        final int CLOTHING_CODE = 1, OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina", OTHER_PRICER = "Marco";
        Scanner input = new Scanner(System.in);// TODO code application logic here
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else...");
        iDonationType = input.nextInt();
            if(iDonationType == CLOTHING_CODE){
                sVolunteer = CLOTHING_PRICER;
                sMessage = "a clothing donation";
                
            }else{
                sVolunteer = OTHER_PRICER;
                sMessage = "another donation type";
            }
        System.out.println("You entered " + iDonationType);
        System.out.println("The volunteer who will price this item is " + sVolunteer);
        System.out.println("This is " + sMessage);
    }
    
}
