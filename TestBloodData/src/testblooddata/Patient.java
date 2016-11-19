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
public class Patient {
    private int ID = 0, age = 0;
    BloodData Patient = new BloodData();
    
    
    public void Patient(){ // default overload() for patient information
        ID = 0;
        age = 0;
        
        
    }
    
    public void Patient(int i){ // default overload() for patient information
        ID = i;
        age = 0;
        
        
    }
    
    public void Patient(int i, int a){ // default overload() for patient information
        ID = i;
        age = a;
        
        
    }
    
    public int getID(){
        int i;
        i = ID;
        return i;
    }
    
    public int getAge(){
        int a;
        a = age;
        return a;
    }
    
    
    
    
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
            Patient();
        }else if(ID == 0){
            Patient(ID);
        }else{
            Patient(ID,age);
        }
        
        
    }
    
    
    
    public void display(){
        System.out.println("Your ID # is " + getID() + ". Your age is " + getAge() + ". ");
    }
    
}
