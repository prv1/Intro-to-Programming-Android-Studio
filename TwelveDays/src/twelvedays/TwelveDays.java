/*
 * Phillip Viau
 * 11/03/2015
 * Asks users for days of Christmas and goes thru lyrics based on user input.
 */
package twelvedays;
import java.util.Scanner;
/**
 *
 * @author bekkiviau
 */
public class TwelveDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iDays = 0;// TODO code application logic here
        String sDays[] = {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
        System.out.print("How many days of christmas? "); // asks user question
        iDays = input.nextInt(); // accepts user input and writes to iDays variable

        System.out.println("On the " + sDays[iDays-1] + " day of Christmas\nmy true love sent to me:");// prints line and uses user input minus one to stay within range of array
        switch(iDays){ // based on user input, puts out information without breaks
            case 12:
                System.out.println("12 Drummers Drumming");
            case 11:
                System.out.println("11 Pipers Piping");
            case 10:
                System.out.println("10 Lords a Leaping");                
            case 9:
                System.out.println("9 Ladies Dancing");                
            case 8:
                System.out.println("8 Maids a Milking");                
            case 7:
                System.out.println("7 Swans a Swimming");                
            case 6:
                System.out.println("6 Geese a Laying");                
            case 5:
                System.out.println("5 Golden Rings");                
            case 4:
                System.out.println("4 Calling Birds");                
            case 3:
                System.out.println("3 French Hens");                
            case 2:
                System.out.println("2 Turtle Doves\nand a Partridge in a Pear Tree");
                break;
            case 1:
                System.out.println("A Partridge in a Pear Tree");                
                break;
            default:
                System.out.println("Sorry that value is out of range of Days of Christmas");
                
                
        }
        
        
    }
    
}
