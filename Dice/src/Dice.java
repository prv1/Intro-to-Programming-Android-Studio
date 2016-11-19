
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Random;

public class Dice extends HttpServlet {
	
    private static final long serialVersionUID = 1L;
    private int pScore, cScore, totalGames;
    private int pHealth = 100, cHealth = 100;
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    doPost(request,response);
}	
    
    public void doPost(HttpServletRequest request, 
                       HttpServletResponse response)		       
		               throws ServletException, IOException {
    
    int die_1, die_2, die_3, die_4;
    
    HtmlImage Dice1, Dice2, Dice3, Dice4;
    String[] actionType = {"Attack", "Heal", "Dodge", "Critical", "Double Hit", "Barrage"};
    
    HtmlForm htmlForm = new HtmlForm("Dice", "post");
    HtmlTable htmlTable = new HtmlTable(3);
   
    
    HtmlPage htmlPage = new HtmlPage();
    htmlPage.setTitle("Craps !");
    htmlPage.setBackgroundColor("#99CCFF");
    
    

    Random generator = new Random();

    die_1 = generator.nextInt(6) + 1;
    die_2 = generator.nextInt(6) + 1;
    die_3 = generator.nextInt(6) + 1;
    die_4 = generator.nextInt(6) + 1;
    
    // note we are currently in the 'servlet' folder and 'servlet' represents 
    // 2 folders, WEB-INF and 'classes'
    Dice1 = new HtmlImage("../images/" + actionType[die_1-1] + ".gif", actionType[die_1-1]);
    Dice2 = new HtmlImage("../images/dice" + die_2 + ".gif", "die_2");
    Dice3 = new HtmlImage("../images/" + actionType[die_3-1] + ".gif", actionType[die_3-1]);
    Dice4 = new HtmlImage("../images/dice" + die_4 + ".gif", "die_4");
    totalGames++;
    PrintWriter out = response.getWriter();
    
    if(die_2 > die_4){
        pScore++;
        switch(actionType[(die_1 - 1)]){
            case("Attack"):
                cHealth -= die_2;
                break;
            case("Heal"):
                pHealth += die_2;
                break;
            case("Dodge"):
                if(die_3 == 0 || die_3 == 3 || die_3 == 4){
                    pHealth += die_2;
                }
                break;
            case("Critical"):
                cHealth -= (2 * die_2) + (2 * die_4);
                break;
            case("Double Hit"):
                cHealth -= 2 * die_2;
                break;
            case("Barrage"):
                cHealth -= (5 * die_4);
                break;
        }
        
    }else if(die_2 < die_4){
        cScore++;
        switch(actionType[(die_3 - 1)]){
            case("Attack"):
                pHealth -= die_4;
                break;
            case("Heal"):
                cHealth += die_4;
                break;
            case("Dodge"):
                if(die_1 == 0 || die_1 == 3 || die_1 == 4){
                    cHealth += die_4;
                }
                break;
            case("Critical"):
                pHealth -= (2 * die_2) + (2 * die_4);
                break;
            case("Double Hit"):
                pHealth -= 2 * die_4;
                break;
            case("Barrage"):
                pHealth -= (5 * die_4);
                break;
        }
    }else if(die_2 == die_4){
        switch(actionType[die_3 - 1]){
            case("Attack"):
                cHealth -= die_2;
                pHealth -= die_4;
                break;
            case("Heal"):
                pHealth += die_2;
                cHealth += die_4;
                break;
            case("Dodge"):
                if(die_1 == 0 || die_1 == 3 || die_1 == 4){
                    cHealth += die_4;
                }
                if(die_3 == 0 || die_3 == 3 || die_3 == 4){
                    pHealth += die_2;
                }
                break;
            case("Critical"):
                cHealth -= (2 * die_2) + (2 * die_4);
                pHealth -= (2 * die_2) + (2 * die_4);
                break;
            case("Double Hit"):
                cHealth -= 2 * die_2;
                pHealth -= 2 * die_4;
                break;
            case("Barrage"):
                cHealth -= (5 * die_2);
                pHealth -= (5 * die_4);
                break;
        }        
    }
    
    
    response.setContentType("text/html");

    // now begin to build the page
    htmlPage.addText("<center>");
    // build teh table
    htmlTable.startRow();
    htmlTable.addCell(Dice1.buildHtml());
    htmlTable.addCell(Dice2.buildHtml());
    htmlTable.endRow();
    
    htmlTable.startRow();
    htmlTable.addCell(actionType[die_1-1]);
    htmlTable.addCell("");
    htmlTable.addCell("" + die_2);
    htmlTable.endRow();
    
    htmlTable.startRow();
    htmlTable.addCell("Player Score: " + pScore);
    htmlTable.addCell("");
    htmlTable.addCell("Player Health: " + pHealth);
    htmlTable.endRow();    
    
    htmlTable.startRow();
    htmlTable.addCell(Dice3.buildHtml());
    htmlTable.addCell(Dice4.buildHtml());
    htmlTable.endRow();
    
    htmlTable.startRow();
    htmlTable.addCell(actionType[die_3-1]);
    htmlTable.addCell("");
    htmlTable.addCell("" + die_4);
    htmlTable.endRow();
    
    htmlTable.startRow();
    htmlTable.addCell("Computer Score: " + cScore);
    htmlTable.addCell("");
    htmlTable.addCell("Computer Health: " + cHealth);
    htmlTable.endRow();
    
    htmlPage.addText("<br><br>");
  
    htmlTable.startRow();
    if(die_2 > die_4){
        htmlTable.addCell("Player");
        htmlTable.addCell(actionType[die_1-1] + "s");
        if(die_1 != 2)
            htmlTable.addCell("Computer");
        else
            htmlTable.addCell("Player");
    }else{
        htmlTable.addCell("Computer");
        htmlTable.addCell(actionType[die_3-1] + "s");
        if(die_3 != 2)
            htmlTable.addCell("Player");
        else
            htmlTable.addCell("Computer");
    }
    htmlTable.endRow();
    
    // add the table containing the dice to form
    htmlForm.addText(htmlTable.buildHtml());
    
    // add the form to the web page
    htmlPage.addText(htmlForm.buildHtml());
	htmlPage.addText("</center>");
	
    // sent the page to teh browser
 	out.println(htmlPage.buildHtml());
    }
    
}


