/*
 * Phillip Viau
 * 12/07/2015
 * class for passing values from test sandwich file
 */
package testsandwichfilling;

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
    
    public void display(){
        say( ". " + this.fillingType + " filling has "  + this.caloriesPerServing + " calories per serving");
    }
    
    public void say(String text){
        System.out.println(text);
    }
}
