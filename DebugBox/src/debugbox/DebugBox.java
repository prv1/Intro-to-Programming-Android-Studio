/*
 * Phillip Viau
 * 12/04/2015
 * calls methods and assigns variables in default construct then displays to user as well as volume
 */
package debugbox;
public class DebugBox
{
   private int width;
   private int length;
   private int height;
   
   public static void main(String[] args){
       DebugBox test = new DebugBox();
       test.showData();
       
   }
   
   
   public DebugBox()
   {
     length = 12;
     width = 11;
     height = 10;
   }
   public DebugBox(int w, int l, int h)
   {
      width = w;
      length = l;
      height = h;
   }
   public void showData()
   {
     System.out.println("Width: "  + width + "  Length: " +
       length + "  Height: " + height + "Volume: " + getVolume());
   }
   public double getVolume()
   { 
     double vol = length * width * height;
     return vol;
   }
}
