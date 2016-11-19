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
public class CreatePolicies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarInsurancePolicy first = new CarInsurancePolicy(123);
        CarInsurancePolicy second = new CarInsurancePolicy(456,4);
        CarInsurancePolicy third = new CarInsurancePolicy(789,12,"Newcastle");
        first.display();
        second.display();
        third.display();
        
        CarInsurancePolicy2 fourth = new CarInsurancePolicy2(123);
        CarInsurancePolicy2 fifth = new CarInsurancePolicy2(456,4);
        CarInsurancePolicy2 sixth = new CarInsurancePolicy2(789,12,"Newcastle");
        fourth.display();
        fifth.display();
        sixth.display();
        //CarInsurancePolicy fourth = new CarInsurancePolicy();
        
// TODO code application logic here
    }
    
}
