/*
 * Phillip Viau
 * 12/08/2015
 * 
 */
package debugtwelve1;
// This class determines the logarithm of a number
public class DebugTwelve1
{
  public static void main(String[] args) throws ArithmeticException
  {
     double num = -8.8, result;
     try
     {
        result = Math.log(num);
        if(num <= 0)
           throw(new ArithmeticException());
        System.out.println("Result is " + result);
     }
     catch(ArithmeticException AException)
     {
        System.out.println("Can't take logarithm for value of zero or lower");
     }
  }
}
