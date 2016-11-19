/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomguess2;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author prv1
 */
public class RandomGuess2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iSelection = 0;

        MainMenu();
        //System.out.println("Would you like to set a higher random number\n1. Yes\n2. No");
        //iSelection = input.nextInt();
        //iRandomNumber = ;
        JOptionPane.showMessageDialog(null,"The number is " + RandomNumberGenerator() );// TODO code application logic here
    }
    
    public static int RandomNumberGenerator(int iRandom){
        Scanner input = new Scanner(System.in);
        int iRandomNumber, iMaxNumber = 10, iSelection = 0;
        //System.out.println("Hello, Welcome to the random number generator.\nTo begin would you like to set a higher range of random numbers? Default: 10 \n1. Yes\n2. No  ");
        iSelection = input.nextInt();        
        if(iSelection == 1){
            System.out.print("Please set new max number: ");
            iMaxNumber = input.nextInt();
            iRandomNumber = (1 + (int)(Math.random() * MaxNumber()));
        }else{
            iRandomNumber = (1 + (int)(Math.random() * 10));
        }
        
        return iRandomNumber;
    }
    
    public static int MaxNumber(){
        Scanner input = new Scanner(System.in);
        int iMaxNumber = 10;
        System.out.print("Please enter the max number you would like the random number to be: ");
        iMaxNumber = input.nextInt();
        
        return iMaxNumber;
    }
    
    public static void MainMenu(){
        Scanner input = new Scanner(System.in);
        String sMainMenu[] = {"Please make a selection:", "1. Random Number Game", "2. Set Maximum Random Number", "3. Quit"};
        int iSelection, iRandomNumber, iMaxNumber, iRandom;
        for(int i = 0; i < sMainMenu.length;i++){
            System.out.println(sMainMenu[i]);
        }
        iSelection = input.nextInt();
        if(iSelection == 1){
            System.out.print("Please set new max number: ");
            iMaxNumber = input.nextInt();
            
            iRandomNumber = (1 + (int)(Math.random() * MaxNumber()));
            RandomNumberGenerator(iRandom);
        }
    }
    
}
