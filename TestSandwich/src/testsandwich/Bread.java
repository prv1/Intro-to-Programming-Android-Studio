/*
 * Phillip Viau
 * 12/07/2015
 * passes values to methods for bread from test file
 */
package testsandwich;

/**
 *
 * @author prv1
 */
public class Bread {
    public final static String MOTTO = "The staff of life";
    
    private final String sBreadType;
    private final int caloriesPerSlice;
    public Bread(String bType,int cal){

        this.caloriesPerSlice = cal * 2;
        
        this.sBreadType = bType;
        
    }
    
    public String getBreadType(){
        return this.sBreadType;
        
    }
    

    
    public int getCal(){
        return this.caloriesPerSlice;
    }
    
    public void display(){
        say(MOTTO + " " + this.sBreadType + " bread has " + this.caloriesPerSlice + " calories per slice");
    }
    
    public void say(String text){
        System.out.println(text);
    }
    
}
