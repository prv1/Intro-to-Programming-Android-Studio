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
public class ItalicTag {
    private String open = "<strong>", close = "</strong>";
    private String italicText;
    public ItalicTag(String text){
        this.italicText = open + text + close;
    }
    
    public String getItalicText(){
        
        return this.italicText;
    }    
}
