/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formletterwriter;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class FormLetterWriter {
    public String lastName;
    private String fullName;
    private String firstName;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FormLetterWriter start = new FormLetterWriter();// TODO code application logic here
        
        start.start();
        
        
    }
    
    public void start(){
        Scanner input = new Scanner(System.in);
        {
            System.out.print("Please enter your last name: ");
            Name(input.nextLine());
            displaySalutation(lastName);
        }
        
        {
            System.out.print("Please enter your first name: ");
            Name(input.nextLine(), lastName);
            fullName = firstName + " " + lastName;
            displaySalutation(fullName);
        }
    }
    
    public void Name(String name){
        
        lastName = name;
    }
    public void Name(String fName, String lName){
        firstName = fName;
        lastName = lName;
    }
    
    public void displaySalutation(String name){
        String salutation = "Dear Mr or Mrs. ";
        System.out.println(salutation + name + ". Thank you for your recent order.");
    }
    
}
