/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createpolicies;

/**
 *
 * @author prv1
 */
public class CarInsurancePolicy2 {
    private int policyNumber;
    private int numPayments;
    private String residentCity;
    
    
    public CarInsurancePolicy2(int num, int payments,String city){
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
    }
    
    public CarInsurancePolicy2(int num, int payments){
        this(num, payments, "Mayfield");
        
        //policyNumber = num;
        //numPayments = payments;
        //residentCity = "Mayfield";
    }
    public CarInsurancePolicy2(int num){
        this(num,2, "Mayfield");
        //policyNumber = num;
        //numPayments = 2;
        //residentCity = "Mayfield";
    }
    
    public void display(){
        System.out.println("Policy #" + policyNumber + ". " + numPayments + " payments annually. Driver resides in " + residentCity + ".");
    }
    
}


