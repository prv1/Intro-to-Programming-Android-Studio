/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtohtml;

/**
 *
 * @author prv1
 */
public class Tag {
    private String[] convertToTagBold = {"<b>","</b>"};
    private String[] convertToTagItalic = {"<i>","</i>"};
    private String[] convertToTagParagraph = {"<p>","</p>"};
    //String text;
    StringBuffer text = new StringBuffer("");
    boolean flag;
    
    public Tag(){ // constructor for while loop
        this.flag = true;
    }
    
    public Tag(int i,String t){ // constructor for menu entry
        if(i == 1){
            ConvertToBold(t); // passes text to method and is returned back to main class
        }
        if(i == 2){
            ConvertToItalic(t); // passes text to method and is returned back to main class
        }

        
    }
    
    public String ConvertToBold(String text){ // returns text to method to be outputted to screen
        
        this.text.append(convertToTagBold[0] +  text + convertToTagBold[1]);// = convertToTagBold[0] +  text + convertToTagBold[1];

        return this.text.toString();
    }
    
    public String ConvertToItalic(String text){ // returns text to method to be outputted to screen
        
        this.text.append(convertToTagItalic[0] +  text + convertToTagItalic[1]);// = convertToTagItalic[0] +  text + convertToTagItalic[1];

        return this.text.toString();
    }    
    
    public String startParagraph(String text){
        this.text.insert(0, convertToTagParagraph[0]);
        
        return this.text.toString();
    }
    
    public String endParagraph(String text){
        this.text.append(convertToTagParagraph[1]);
        return this.text.toString();
    }
    
    public void getText(){ // returns instantiated text to main class, if text is returned with spaces an error flag is thrown, so i had to return it from the instantiated object
        ask(this.text.toString());
    }
    
    public void ask(String text){ // cuts down on using System.out.print(); into a single word
        System.out.println(text);
    }
    
    public boolean getFlag(){ //returns flag status to while loop in main class
        return this.flag;
    }
    
    public void setFlag(){ // sets flag to false for while loop in main class
        this.flag = false;
    }
    
    
}
