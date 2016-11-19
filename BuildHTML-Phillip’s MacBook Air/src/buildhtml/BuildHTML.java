/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildhtml;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class BuildHTML {
private boolean flag = true;
StringBuffer HTMLOutput = new StringBuffer();
private int indent;
private int iUserSelection;
//private String sUserSelection;
String[] userMenu = {"Bold Tag","Italic Tag","Div Tag","Paragraph Tag","Hyperlink Tag","Image Tag","Display My Code","Quit"};

private String text;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuildHTML HTML = new BuildHTML();
    }
    
    public BuildHTML(){
        
        
        while(flag){
            userMenu();
            
            iUserSelection = askInt("Please make a selection ");
            
                if(iUserSelection > 0 && iUserSelection < (userMenu.length - 1)){
                    switch(iUserSelection){
                        case 1:
                            BoldTag boldTag = new BoldTag(text);
                            HTMLOutput.append(boldTag.getBoldText());
                            break;
                        case 2:
                            ItalicTag italicTag = new ItalicTag(text);
                            HTMLOutput.append(italicTag.getItalicText());
                            break;
                        case 8:
                        default:
                            say("Invalid entry! Valid options are 1 - " + (userMenu.length) + "\n");
                    }


                        say(HTMLOutput.toString());        
                }
            
        }
        
    }
    
    public void userMenu(){
        //Scanner input = new Scanner(System.in);
        
        say("Please make a selection\n");
        for(int i = 0; i < userMenu.length; ++i)
            say((i+1) + ". " + userMenu[i] + "\n");
        
        //say((userMenu.length + 1) + ". Quit\n");

        
    }
    
    public void say(String text){
        System.out.print(text);
    }
    
    public String ask(String text){
        Scanner input = new Scanner(System.in);
        text = input.nextLine();
        return text;
    }
    
    public int askInt(String text){
        say(text);
        Scanner input = new Scanner(System.in);
        iUserSelection = input.nextInt();
        return iUserSelection;
    }
    
    public String indentTag(int indent){
        StringBuffer text = new StringBuffer();
        String t;
        for(int i = 0; i < indent; ++i){
            text.append("\t");
        }
        t = text.toString();
        return t;
    }
    
}
