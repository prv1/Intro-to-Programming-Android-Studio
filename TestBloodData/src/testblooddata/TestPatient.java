/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testblooddata;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class TestPatient {
int ID = 0, age = 0;
Patient patient = new Patient();
    public void start(){
        String input = null;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter ID number for new patient: ");
        //input = keyboard.nextLine();
        //System.out.println(input);
        if((keyboard.nextLine().isEmpty())){
            ID = 0;
        }
        System.out.print("Please enter age for new patient: ");
        if((keyboard.nextLine().isEmpty())){
            age = 0;
        }
        if(ID == 0 && age == 0){
            patient.Patient();
        }else if(ID == 0){
            patient.Patient(ID);
        }else{
            patient.Patient(ID,age);
        }
        
        
    }
    
    public void display(){
        patient.display();
    }
    
}
