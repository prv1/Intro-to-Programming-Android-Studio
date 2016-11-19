/*
 * Phillip viau
 * 12/08/2015
 * 
 */
package debugtwelve2;
// A byte can't hold a value higher than 127
// This program throws an ArithmeticException
// if adding two bytes yields a value that is too high
public class DebugTwelve2
{
   public static void main(String[] args)
   {
      byte num1 = 120, num2 = 120;
      int result;
      final byte HIGHBYTE = 127;
      try
      {
         
         
         result = (num1 + num2);
         if(result > HIGHBYTE)
            throw(new ArithmeticException());
         
         
         System.out.println("Result is " + result);
      }
      catch(ArithmeticException error)
      {
         System.out.println("Byte can't hold value higher than " + HIGHBYTE);
      }
   }
}
