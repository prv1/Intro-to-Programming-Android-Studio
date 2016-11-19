/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortstrings;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class SortStrings {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] sString = new String[10];
        System.out.println("Please type 10 words as one sentence or word by word ");
        String temp = input.nextLine(); // allows user to write entire sentence
        if(!temp.contains(" ")){ // if only one word is written
            System.out.print("Only one word detected!");
            sString[0] = temp;
            for(int i = 1; i< sString.length; ++i)
                sString[i] = input.nextLine();
        }
        
        for(int i = 0; i < sString.length; ++i ){ // splits each word into an array slot
            sString = temp.split(" ");
        }
        SortString(sString); // calls method to run sorting array string
        for ( int i = 0;  i < sString.length;  ++i ) // prints all strings to screen
            System.out.println( sString [ i ] );
        
    }
    
    public static void SortString(String x[]){
        boolean flag = true; // defaults flag for while loop
        String temp; // stores temp string to compare in if loop
        
        while(flag){
            flag = false; // temporarily sets variable to false unless if statement is true
                  for ( int i = 0;  i < x.length - 1;  ++i )
                  {
                          if ( x [ i ].compareToIgnoreCase( x [ i+1 ] ) > 0 )
                          {                                             // ascending sort
                                      temp = x [ i ]; // assigns value to temp variable
                                      x [ i ] = x [ i+1];     // swapping strings with next string if if statement is true
                                      x [ i+1] = temp;  // assigns temp variable to the next value
                                      flag = true; // keeps while loop going
                           } 
                   }            
        }
    }
    
}
