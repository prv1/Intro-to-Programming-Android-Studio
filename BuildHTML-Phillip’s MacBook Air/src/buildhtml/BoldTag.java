/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildhtml;

/**
 *
 * @author prv1
 */
public class BoldTag {
    private String open = "<strong>", close = "</strong>";
    private String boldText;
    public BoldTag(String text){
        this.boldText = open + text + close;
    }
    
    public String getBoldText(){
        
        return this.boldText;
    }
    
}
