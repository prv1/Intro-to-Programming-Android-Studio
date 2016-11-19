/*
 * Phillip Viau
 * 12/04/2015
 * passes instantiated object information to another instantiated object and displays is results
 */
package debugfour3;
// This class uses a FixDebugBox class to instantiate two Box objects
public class DebugFour3
{
   public static void main(String args[])
   {
      int width = 12,
      length = 10,
      height = 8;
      DebugBox box1 = new DebugBox();
      DebugBox box2 = new DebugBox(width, length, height);
      DebugFour3 vol1 = new DebugFour3();
      DebugFour3 vol2 = new DebugFour3();
      System.out.println("The dimensions of the first box are");
      box1.showData();
      System.out.print("  The volume of the first box is ");
      vol1.showVolume(box1);
      System.out.println("The dimensions of the second box are");
      box2.showData();
      System.out.print("  The volume of the second box is ");
      vol2.showVolume(box2);
   }
   public DebugBox showVolume(DebugBox aBox)
   {
      double vol = aBox.getVolume();
      System.out.println(vol);
      return aBox;
   }
}
