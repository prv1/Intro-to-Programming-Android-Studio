/*
 * Phillip Viau
 * 12/07/2015
 * class for passing values from test sandwich file
 */
package testsandwich;

/**
 *
 * @author prv1
 */
public class SandwichFilling {
    private final String fillingType;
    private final int caloriesPerServing;
    
    public SandwichFilling(String type, int cal){
        this.fillingType = type;
        this.caloriesPerServing = cal;
        
    }
    
    public String getFillingType(){
        
        return this.fillingType;
    }
    
    public int getCal(){
        return this.caloriesPerServing;
    }
    
    public String getFilling(){
        return this.fillingType;
    }
    
    public void display(){
        
        say( ". " + this.fillingType + " filling has "  + this.caloriesPerServing + " calories per serving");
    }
    
    public void say(String text){
       
        System.out.println(text);
        
    }
}
