/*
 * Phillip Viau
 * 11/29/2015
 * 
 */
package debugeight2;
// Sum and average an array of integers
public class DebugEight2
{
   public static void main(String args[])
   {
      int[] someNums = {4, 17, 22, 8, 35};
      
      int tot = 0;
      int x;
      for(x = 0; x < someNums.length; ++x)
        tot += someNums[x]; // adds to variable with what is in array element

      System.out.println("Sum is " + tot); 
      
      tot = (tot / someNums.length); // divides tot variable by length of someNums
      System.out.println("Average is " + tot);
   }
}
