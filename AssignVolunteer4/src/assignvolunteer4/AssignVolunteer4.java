/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignvolunteer4;

import java.util.Scanner;

/**
 *
 * @author prv1
 */
public class AssignVolunteer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iDonationType;
        String sVolunteer, sMessage;
        //final int CLOTHING_CODE = 1, OTHER_CODE = 2;
        final String FURNITURE_PRICER = "Walter", ELECTRONIC_PRICER = "Lydia", CLOTHING_PRICER = "Regina", OTHER_PRICER = "Marco";
        Scanner input = new Scanner(System.in);// TODO code application logic here
        final int CLOTHING_CODE = 1, FURNITURE_CODE = 2, ELECTRONIC_CODE = 3, OTHER_CODE = 4;
        System.out.print("Enter an integer... ");
        //System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else...");
        iDonationType = input.nextInt();
        switch(iDonationType){
            case(CLOTHING_CODE): 
                sVolunteer = CLOTHING_PRICER;
                sMessage = "a clothing donation";
                break;
            case(FURNITURE_CODE):
                sVolunteer = FURNITURE_PRICER;
                sMessage = "a furniture donation";
                break;
            case(ELECTRONIC_CODE):
                sVolunteer = ELECTRONIC_PRICER;
                sMessage = "an electronics donation";
                break;
            case(OTHER_CODE):
                sVolunteer = OTHER_PRICER;
                sMessage = "another donation type";
                break;
            default:
                sVolunteer = "invalid";
                sMessage = "an invalid donation type";
                
        }
        /*if(iDonationType == CLOTHING_CODE || iDonationType == OTHER_CODE){
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
        }else{
            System.out.println("You have entered an invalid donation type");
            System.out.println("The volunteer who will price this item is invalid");
            AssignVolunteer4.main(args);
        }        // TODO code application logic here*/
        System.out.println("You entered " + iDonationType);
        System.out.println("The volunteer who will price this item is " + sVolunteer);
        System.out.println("This is " + sMessage); 
       
    }
    
}
