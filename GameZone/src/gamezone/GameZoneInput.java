/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone;

// Library imports
import javax.swing.JOptionPane;
import java.util.Random;
 

public class GameZoneInput {
// Variables

int inputHighest = 10;
    
    
    
    public static void main(String[] args) {
        GameZoneInput GameZoneInput = new GameZoneInput(); // Allows variables to be called publicly and creates them dynamically rather than statically
        GameZoneInput.ZoneInput();
    }
    
    public int ZoneInput() {
        int inputVariable = 1; // Resets variable to default value
        JOptionPane.showInputDialog("Please choose a number between 1-" + inputHighest);
            if(inputVariable > inputHighest || inputVariable < 1) {
                ZoneInput();            
            }
            else {
                RandomNumber();
            }
        return inputVariable;
    }
    public void RandomNumber() {
        int START = 1;
        int END = inputHighest;
        Random random = new Random();
        int Random = (1+ (int)(Math.random() * 10));
        //showRandomInteger(START, END, random);

    }
    
    
    private void showRandomInteger(int aStart, int aEnd, Random aRandom){
        
        if (aStart > aEnd) {
          throw new IllegalArgumentException("Start cannot exceed End.");
        }
        //get the range, casting to long to avoid overflow problems
        long range = (long)aEnd - (long)aStart + 1;
        // compute a fraction of the range, 0 <= frac < range
        long fraction = (long)(range * aRandom.nextDouble());
        int randomNumber =  (int)(fraction + aStart);
        
        if(ZoneInput() == Random()) {
            System.out.println("You have guessed the raandom number");
        }

    }


}

