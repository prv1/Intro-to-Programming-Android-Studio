/*
 * Phillip Viau
 * 12/11/2015
 * converts string to html tag
 */
package stringtohtml;
import java.util.Scanner;
/**
 *
 * @author prv1
 */
public class StringToHTML {
String text;
Scanner input = new Scanner(System.in);


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringToHTML StringToHtml = new StringToHTML();// TODO code application logic here
    }
    
    public StringToHTML(){
        int entry;
        Tag tag2 = new Tag();

        while(tag2.getFlag()){ // gets flag status and continually runs if true
            entry = mainMenu(); // calls method and return int to variable
            if(entry == 1 || entry == 2){
                this.text = getString();
                Tag tag = new Tag(entry, text); // passes menu selected and text to be converted
                tag.getText();
            }else if (entry == 3){
                ask("Quitting now... ");
                tag2.setFlag();
            }else{
                ask("Invalid Entry! Please try again! \n");
            }
        }

    }
    
    public String getString(){ // returns user string to constructor
        Scanner input = new Scanner(System.in);
        ask("Please enter a string > ");
        this.text = input.nextLine();
        return this.text;
    }
    
    public void ask(String text){ // cuts down on using System.out.print(); into a single word
     
        System.out.print(text); 
    }
    
    public char mainMenu(){ // packs entire user menu into one method
        String[] menu = {"Please make a selection\n","1. Convert to Bold\n","2. Convert To Italics\n", "3. Create paragraph", "4. Quit"};
        int menuEntry = 0;
        String sMenu = "";
        char mEntry = '0';
        Scanner input = new Scanner(System.in);
            for(int i = 0; i < menu.length; ++i){
                ask(menu[i]);
            }
            ask("\n");
            sMenu = input.next();
            mEntry = sMenu.charAt(0);
        
        
        
        return mEntry;
    }


    
}
