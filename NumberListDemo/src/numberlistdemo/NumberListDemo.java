/*
 * Phillip Viau 
 * 11/19/2015
 * accepts 8 ints which displays functions of sum, ordered list, low and high
 */
package numberlistdemo;
import java.util.Scanner;

/**
 *
 * @author phill
 */
public class NumberListDemo {
//1NumberListDemo NumList = new NumberListDemo();
final int MAX_NUM_LIST = 8;

public int index, iNumList[] = new int[MAX_NUM_LIST], averageT, sumT, i;


//boolean bContinue = true;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        NumberListDemo NumList = new NumberListDemo(); // TODO code application logic here
        NumList.Start();
        
        //NumList.UserInput();
        
    }  
    
    public void Start(){
        System.out.print("Please enter " + MAX_NUM_LIST + " numbers: ");
        
        //for(int i = 0; i < iNumList.length; ++i){
            UserInput();
            
        //}
        
        System.out.println("1. Display all integers");
        
        for(i = 0; i < iNumList.length; ++i){
            DisplayIntegers(i);
        }
        
        System.out.println("2. Display all integers in reverse order");
        
        for(i = iNumList.length -1; 0 <= i; --i){
            DisplayIntegers(i);
        }
        
        System.out.println("3. Display the sum of the integers: ");
        
        for(i = 0; i < iNumList.length; ++i){
            
            SumIntegers(iNumList[i]);
            
            if(i == iNumList.length -1 ){
                System.out.println("Sum is: " + sumT);
            }
        }
        
        System.out.println("4. Display values less than 5: ");
        
        for(i = 0; i < iNumList.length; ++i){
            if(iNumList[i]< 5){
                System.out.println("Index " + (i + 1) +  " " + iNumList[i]);
            }
        }
        
        System.out.println("5. Display Lowest value: ");
        
        for(i = 0; i < iNumList.length; ++i)
            DisplayLowest(iNumList[i]);
            
               
        
        System.out.println("6. Display highest: ");
        
        for(i = 0; i < iNumList.length; ++i)
            DisplayHighest(iNumList[i]);
            
              
        
        System.out.println("7. Calculate and display the average: ");
        
        for(i = 0; i < iNumList.length; ++i){
            
            AverageIntegers(iNumList[i]);
            
        }
        averageT /= MAX_NUM_LIST;
        System.out.println("Your average is :" + averageT );
        
        System.out.println("8. Display all values higher than average: ");
        
        for(i = 0; i < iNumList.length; ++i){
            if(iNumList[i] > averageT){
                System.out.print("Index " + (i+1) + " ");
                System.out.println(iNumList[i]);   
            }
            
            
            
        }        
        
    }
    
    
    
    
    public void DisplayIntegers(int i){
        System.out.print("Index " + (i + 1) + " ");
        System.out.println(iNumList[i]);
    }    
    
    
    public int DisplayHighest(int highest){
        
        for(i = 0; i < iNumList.length; ++i){
            if(iNumList[i] > highest){
                highest = iNumList[i];
                
            }
        }
        System.out.println(" "+ highest);
        return highest;
    }
    public int DisplayLowest(int lowest){
        
        for(i = 0; i < iNumList.length; ++i){
            if(iNumList[i] < lowest){
                lowest = iNumList[i];
                
            }
        }
        System.out.println(" "+ lowest);
        return lowest;
    }
    

    
    public int SumIntegers(int sum){
        sumT += sum;
        return sum;
    }
    
    public int AverageIntegers(int average){
        averageT += average;
        
        return average;
    }
    
    public void UserInput(){
        Scanner input = new Scanner(System.in);
        
        for(i = 0; i < MAX_NUM_LIST; ++i){
            System.out.print("Number " + (i + 1) + " ");
            iNumList[i] = input.nextInt();
        }
        
    }
    

    


}


