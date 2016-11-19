/*
 * Phillip Viau
 * 11/23/2015
 * Adds corresponding option selected from user menu adds 10, 100, 1000 to value
 */
package arithmeticmethods;
import java.util.Scanner;
/**
 *
 * @author bekkiviau
 */
public class ArithmeticMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int value01 = 0, value02 = 0, iChoice = 0;// TODO code application logic here
        boolean flag = true;
        
        Scanner input = new Scanner(System.in);
        while(flag){
            //lag = false;
            ArithmeticMethods.userMenu();
            iChoice = input.nextInt();
            switch(iChoice){
                case 1:
                    value01 = ArithmeticMethods.displayNumberPlus10(value01);
                    
                    break;
                case 2:
                    value01 = ArithmeticMethods.displayNumberPlus100(value01);
                    break;
                case 3:
                    value01 = ArithmeticMethods.displayNumberPlus1000(value01);
                    break;
                case 4:
                    value02 = ArithmeticMethods.displayNumberPlus10(value02);
                    
                    break;
                case 5:
                    value02 = ArithmeticMethods.displayNumberPlus100(value02);
                    break;
                case 6:
                    value02 = ArithmeticMethods.displayNumberPlus1000(value02);
                    break;                  
                case 7:
                    flag = false;
                    break;
                case 8:
                    value01 = 0;
                    value02 = 0;
                    break;
                default:
                    System.out.println("Please enter a valid entry");
            }
        }
    }
    
    public static int displayNumberPlus10(int value){
        value += 10;
        System.out.println("You successfully added 10, your new value is: " + value);
        return value;
    }
    
    public static int displayNumberPlus100(int value){
        value += 100;
        System.out.println("You successfully added 100, your new value is: " + value);
        return value;
    }    
    
    public static int displayNumberPlus1000(int value){
        value += 1000;
        System.out.println("You successfully added 1000, your new value is: " + value);
        return value;
    }
    
    public static void userMenu(){
        String[] sUserMenu = {"1. Add 10 to variable 01","2. Add 100 to variable 01","3. Add 1000 to variable 01","4. Add 10 to variable 02","5. Add 100 to variable 02","6. Add 1000 to variable 02","7. Quit","8.Reset Values"};
        for(int i = 0; i < sUserMenu.length; ++i){
            System.out.println(sUserMenu[i]);
        }
        
    }
    
    
    

}
