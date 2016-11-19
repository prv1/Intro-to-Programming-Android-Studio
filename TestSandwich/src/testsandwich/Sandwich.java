/*
 * Phillip Viau
 * 12/07/2015
 * passes values to methods for sandwich from test file
 */
package testsandwich;

/**
 *
 * @author prv1
 */
public class Sandwich {
    private final Bread bread;
    private final SandwichFilling filling;
    
    public Sandwich(String b, String f, int bcal, int fcal){
        this.bread = new Bread(b,bcal);
        this.filling = new SandwichFilling(f,fcal);
        
        
    }
    
    public void display(){
        say(" " + bread.getBreadType() + " bread has " + (bread.getCal() / 2) + " calories per slice, " + bread.getCal() + " calories for the bread" + ". " + filling.getFilling() + " has "  + filling.getCal() + " calories per serving. Completed sandwich is " + (bread.getCal() + filling.getCal() + " calories."));
        
    }
    public void say(String text){
        System.out.println(text);
    }
    
}
