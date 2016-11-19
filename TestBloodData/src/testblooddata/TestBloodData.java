/*
 * Phillip Viau
 * 12/01/2015
 * displays blood type in overload()
 */
package testblooddata;

/**
 *
 * @author prv1
 */
public class TestBloodData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BloodData testFirst = new BloodData();// TODO code application logic here
        BloodData testSecond = new BloodData();
        BloodData testThird = new BloodData();
        Patient first = new Patient();
        Patient second = new Patient();
        Patient third = new Patient();
        
        String[] message = {"blood type ", "rH Factor "};
        
        first.Patient();
        //for(int i = 0; i < (message.length); ++i){
            testFirst.displayMessage();
        //}
        second.Patient(224);
        //for(int i = 0; i < (message.length); ++i){
            testSecond.displayMessage();
        //}
        third.Patient(443,34);
        //for(int i = 0; i < (message.length); ++i){
            testThird.displayMessage();
        //}
        
        first.display();
        testFirst.display();
        second.display();
        testSecond.display();
        third.display();
        testThird.display();
    }
    
}
