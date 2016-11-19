/*
 * Phillip Viau
 * 12/07/2015
 * answers math questions and displays the results
 */
package mathtest;

/**
 *
 * @author phillipviau
 */
public class MathTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double sqRt = 37, cos = 300, c = 22.8;
        final int number = 71;
        char up = 'D' + 1;
        char down = 'D' - 1;
        say("a. The Square root of 37 is: " + java.lang.Math.sqrt(sqRt));
        say("b. The sine and cosine of 300 is: " + Math.cos(sqRt));
        say("c. The value of 22.8 floor is: " + Math.floor(c) + " ceiling is: " + Math.ceil(c) + " round is: " + Math.round(c));
        say("d. The larger and smaller of char 'D' and int 71 up: " + up + " down: " + down + " Larger: " + (number+1) + " lower: " + (number-1));
        say("A random number between 0 and 20: " + (int)(Math.random() * 20));
        
        
        
        // TODO code application logic here
    }
    
    public static void say(String text){
        System.out.println(text);
    }
    
}
