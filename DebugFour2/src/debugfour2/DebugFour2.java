/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debugfour2;
// Some circle statistics
public class DebugFour2 // name not matching file
{
   public static void main(String args[])
   {
      double radius = 12.6; // incorrect type
      System.out.println("Circle statistics");
      double area = java.lang.Math.PI * radius * radius;
      System.out.println("area is " + area);
      double diameter = 2 * radius; // wrong variable
      System.out.println("diameter is " + diameter); // missing ;
   }
}