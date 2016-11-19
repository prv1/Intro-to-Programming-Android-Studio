
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Random;



public class Game extends HttpServlet {
private int die_1_Score;
private int die_2_Score;

    private static final long serialVersionUID = 1L;
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    doPost(request,response);
}	
    
    public void doPost(HttpServletRequest request, 
                       HttpServletResponse response)		       
		               throws ServletException, IOException {

    int die_1;
    int die_2;

    HtmlImage Dice1;
    HtmlImage Dice2;
    HtmlImage Spacer;
    
    HtmlForm htmlForm = new HtmlForm("Game", "post");
    HtmlTable htmlTable = new HtmlTable(3);
   
    
    HtmlPage htmlPage = new HtmlPage();
    htmlPage.setTitle("Craps !");
    htmlPage.setBackgroundColor("#99CCFF");
    
    String die_1_selected;
    String die_2_selected;
    

    Random generator = new Random();
    
    die_1 = generator.nextInt(3) + 1;
    die_2 = generator.nextInt(3) + 1;
    
    switch(die_1){
        
    }
    
    
    // note we are currently in the 'servlet' folder and 'servlet' represents 
    // 2 folders, WEB-INF and 'classes'
    Dice1 = new HtmlImage("../images/dice" + die_1 + ".gif", "die_1");
    Dice2 = new HtmlImage("../images/dice" + die_2 + ".gif", "die_2");
    

    
    PrintWriter out = response.getWriter();	 

    response.setContentType("text/html");

    // now begin to build the page
    htmlPage.addText("<center>");
    // build teh table
    htmlTable.startRow();
    if(die_1 > die_2){
        die_1_Score++;
        htmlTable.addCell(Dice1.buildHtml());
        htmlTable.addCell("\t beats \t");
        htmlTable.addCell(Dice2.buildHtml());
    }else if(die_1 < die_2){
        die_1_Score++;
        htmlTable.addCell(Dice2.buildHtml());
        htmlTable.addCell("\t beats \t");
        htmlTable.addCell(Dice1.buildHtml());
    }else if(die_1 == die_2){
        htmlTable.addCell(Dice1.buildHtml());
        htmlTable.addCell("\t ties \t");
        htmlTable.addCell(Dice2.buildHtml());        
    }    

    htmlTable.endRow();
    
    htmlTable.startRow();
    if(die_1 > die_2){
        switch(die_1){
            case 1:
                htmlTable.addCell("Rock");
                break;
            case 2:
                htmlTable.addCell("Paper");
                break;
            case 3:
                htmlTable.addCell("Scissors");
                break;
        }
        
        htmlTable.addCell("");
        
        switch(die_2){
            case 1:
                htmlTable.addCell("Rock");
                break;
            case 2:
                htmlTable.addCell("Paper");
                break;
            case 3:
                htmlTable.addCell("Scissors");
                break;            
        }
        
    }else if(die_1 < die_2){
        switch(die_2){
            case 1:
                htmlTable.addCell("Rock");
                break;
            case 2:
                htmlTable.addCell("Paper");
                break;
            case 3:
                htmlTable.addCell("Scissors");
                break;            
        }
        
        htmlTable.addCell("");
        
        switch(die_1){
            case 1:
                htmlTable.addCell("Rock");
                break;
            case 2:
                htmlTable.addCell("Paper");
                break;
            case 3:
                htmlTable.addCell("Scissors");
                break;
        }
    }
    
   
    // add the table containing the dice to form
    htmlForm.addText(htmlTable.buildHtml());
    
    // add the form to the web page
    htmlPage.addText(htmlForm.buildHtml());
	htmlPage.addText("</center>");
	
    // sent the page to teh browser
 	out.println(htmlPage.buildHtml());
    }
    
}


