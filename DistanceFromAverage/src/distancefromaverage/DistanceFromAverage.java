/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancefromaverage;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class DistanceFromAverage {
private int i = 10;
private int iTotalDouble = 0;
private boolean quit;
private double values[] = new double[i];
private double distanceAverage[] = new double[i];
private double average;
private final int MAX = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DistanceFromAverage Distance = new DistanceFromAverage();
        
        Distance.Distance(); // runs first to total all inputs
        Distance.getAverage(); // runs to average all inputs
    }
    public void Distance(){
        Scanner input = new Scanner(System.in);
        while(!quit){
            System.out.println("Please enter  10 double values: ");
            for(int j = 0; j < i && !quit; ++j){
                System.out.print((j + 1) + ": "); //shows what number user is on
                values[j] = input.nextDouble(); // accepts user input
                if(values[j] == 99999){ // if user enters 99999 then the program exits
                    setQuit(); // if this occurs boolean is set to true and exits
                }else{
                    average += values[j]; // 
                    iTotalDouble++;
                }
                
            }

            setQuit(); // once completed boolean is set to true
        }
    }
    
    public void setQuit(){
        quit = true;
       
    }
        
    public void getAverage(){
            average /= (iTotalDouble);
            System.out.println("Average: " + average);
            for(int j = 0; j < iTotalDouble; ++j){
                if(average >= values[j]){
                    distanceAverage[j] = average - values[j];
                }else{
                    distanceAverage[j] = values[j] - average;
                }
                //distanceAverage[j] = 
                System.out.println("Number " + (j+1) + ": " + values[j] + " Distance from average: " + distanceAverage[j]);
            }
    }
    
}
