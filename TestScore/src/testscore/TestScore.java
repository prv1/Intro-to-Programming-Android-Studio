/*
 *Phillip Viau
 * 12/08/2015
 * throws exception if user enters more than 100 or less than 0
 */
package testscore;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class TestScore {
Scanner input = new Scanner(System.in);
ScoreException scoreException;
int num;
private int[] score, stuID;
private final int MAX = 100, MIN = 0, t = 5;



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestScore score = new TestScore();// TODO code application logic here
    }
    public TestScore(){
        String message = "";
        
            score = new int[t];
            stuID = new int[t];
        
        for(int i = 0; i < t; ++i){
            try{
                say("Enter student ID: > ");
                this.stuID[i] = input.nextInt();
                say("Enter a number from " + this.MIN + " to " + this.MAX + ": > ");
                this.score[i] = input.nextInt();
                
                if(score[i] > MAX || score[i] < MIN){
                    throw(new ScoreException());
                }else{
                    message += "Student ID: " + stuID[i] + " Score: " + score[i];
                }
            }
            catch(ScoreException se){
                if(score[i] > MAX){
                    message = message + "Student ID: " + stuID[i] + " " + score[i] + " is greater than " + MAX + " Score: 0" + "\n";
                    score[i] = 0;
                }
                if(score[i] < MIN){
                    message = message + "Student ID: " + stuID[i] + " " + score[i] + " is less than " + MIN + " Score: 0"  + "\n";
                    score[i] = 0;
                }
                
            }

        }
        say(message);
        
    }
    
    public void say(String text){
        System.out.print(text);
    }
    
}
