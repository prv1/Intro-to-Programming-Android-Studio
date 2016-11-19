import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Random;

/**
 * Coffee Class serves as an example of Java 
 * servlet code including taking data from a text box
 * @author rinsem.michael
 */
public class Game extends HttpServlet {

	private static final long serialVersionUID = 1L; // serialization of program
	//private String customerName = "";
        //private String sPlayerScore, sComputerScore;
	private int playerScore, computerScore, computerWeapon, iPlayerWeapon;
	private String[] weaponArray = {"Rock","Paper","Scissors"};
	
	private String sPlayerWeapon = "", sComputerWeapon, message;
	final private int costOfRock = 1; 
	final private int costOfPaper = 2;
	final private int costOfScissors = 3;
	
	private boolean win = false;
	
	
	
	
	
	
			
	/**
	 * Passes all calls to the doPost
	 * Automatically called by the system to handle get methods.  
	 * the doGet method is here to ensure that if this method
	 * is used it will roll over to the doPost method instead
	 * This saves us from having to program both possible options 
	 */

	public void doGet(HttpServletRequest request, HttpServletResponse response)		       
			throws ServletException, IOException 
			{ 
		doPost(request, response);		   	
			} 	

	/**
	 * Automatically called by the system to handle
	 * doPost methods
	 * 
	 * @param request serves as a  reference to 
	 * the forms data object 
	 * 
	 * @param response serves as a  reference to 
	 * the clients data object 
	 * 
	 * @throws ServletException
	 * @throws IOException
	 */    

	public void doPost(HttpServletRequest request, HttpServletResponse response)		       
			throws ServletException, IOException 
	{
		// initialize the PrintWriter so we can write to the page
		PrintWriter out = response.getWriter();	 
		
                Random generator = new Random();
                
                computerWeapon = generator.nextInt(3) + 1;
                
		if(request.getParameter("playerScore") != "0" || request.getParameter("computerScore") != "0"){
                    playerScore = Integer.parseInt(request.getParameter("playerScore"));
                    computerScore = Integer.parseInt(request.getParameter("computerScore"));
                }else{
			sPlayerScore = "0";
                        sComputerScore = "0";
                }

                
                
		if(request.getParameter("sPlayerWeapon") != null){
			sPlayerWeapon = (request.getParameter("sPlayerWeapon"));
	
			switch(sPlayerWeapon){
			
				case("rock"): 
					iPlayerWeapon = costOfRock;
					sPlayerWeapon = "Rock";
					break;
					
				case("paper"): 
					iPlayerWeapon = costOfPaper;
					sPlayerWeapon = "Paper";
					break;
				
				case("scissors"): 
					iPlayerWeapon = costOfScissors;
					sPlayerWeapon = "Scissors";
					break;
				
				default: 
					iPlayerWeapon = generator.nextInt(3) + 1;
					sPlayerWeapon = weaponArray[iPlayerWeapon];

			}
		}
                
                switch(computerWeapon){
                    case 1:
                        computerWeapon = costOfRock;
                        sComputerWeapon = "Rock";
                        break;
                    case 2:
                        computerWeapon = costOfPaper;
                        sComputerWeapon = "Paper";
                        break;
                    case 3:
                        computerWeapon = costOfScissors;
                        sComputerWeapon = "Scissors";
                        break;
                }
		
                if(computerWeapon == 1){
                    switch(iPlayerWeapon){
                        case 1:
                            win = false;
                            message = "ties";
                            break;
                        case 2:
                            win = true;
                            message = "beats";
                            playerScore++;
                            break;
                        case 3:
                            win = false;
                            message = "beats";
                            computerScore++;
                            break;
                    }
                }else if(computerWeapon == 2){
                    switch(iPlayerWeapon){
                        case 1:
                            win = false;
                            message = "beats";
                            computerScore++;
                            break;
                        case 2:
                            win = false;
                            message = "ties";
                            break;
                        case 3:
                            win = true;
                            message = "beats";
                            playerScore++;
                            break;
                    }                    
                            
                }else if(computerWeapon == 3){
                    switch(iPlayerWeapon){
                        case 1:
                            win = true;
                            message = "beats";
                            playerScore++;
                            break;
                        case 2:
                            win = false;
                            message = "beats";
                            computerScore++;
                            break;
                        case 3:
                            win = false;
                            message = "ties";
                            break;
                    }                    
                }
		
			
		response.setContentType("text/html");

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Rock Paper Scissors</title>");
		out.println("</head>");

		out.println("<center>");
		out.println("<table>");
		out.println("<tr>");
		
		out.println("<td valign='center'><center><H1>Star Lord Coffee</H1></center>");
		out.println("<center><H3>724-555-5555</H3></center>");
		out.println("<td valign='center'><img src='./StarLord.png' alt='Starlord' height='100' width='100'></td>");
		out.println("</tr>");
		out.println("</table> ");   
	    
		out.println("<HR width='80%'>");
		
		out.println("<TABLE cellpadding= '10'><TR><TD>");
                
                if(win){
                    out.println("<img src ='./" + sPlayerWeapon + ".jpg</td>");
                    out.println("<td>" + message + "</td>");
                    out.println("<td><img src ='./" + sComputerWeapon + ".jpg</td>");
                    out.println("</tr><tr><td>" + sPlayerWeapon + "</td><td>");
                    out.println("</tr><tr><td></td><td>");
                    out.println("</tr><tr><td>" + sComputerWeapon + "</td><td></tr></table>");
                    
                }else{
                    out.println("<img src ='./" + sComputerWeapon + ".jpg</td>");
                    out.println("<td>" + message + "</td>");
                    out.println("<td><img src ='./" + sPlayerWeapon + ".jpg</td>");
                    out.println("</tr><tr><td>" + sComputerWeapon + "</td><td>");
                    out.println("</tr><tr><td></td><td>");
                    out.println("</tr><tr><td>" + sPlayerWeapon + "</td><td></tr></table>");
                }
		
		
		    out.print("<FORM action = '/viau/servlet/Game' method = 'post'>");
                    out.println("<TABLE width=\"80%\" align=center>");
                    out.println("<TR>");
                    out.println("<TD align = center>");
                    out.println("Player Score:<INPUT type = 'text' value = '" + playerScore + "' name = 'playerScore'> ");	 
                    out.println("Computer Score:<INPUT type = 'text' value = '" + computerScore + "' name = 'computerScore'>");       
                    out.println("</TD>");	
                    out.println("</TR>");  		
  		
                    out.println("<TABLE width=\"100%\" align=center>");

                    out.println("<center><H2>Rock Paper Scissors:</H2></center>");
                    out.println("<TR>");
                    out.println("<TD align = left>");
                    out.println("<b>Select Weapon:</b> <BR>");
                    out.println("<INPUT type = 'radio' value = 'rock' name = 'playerWeapon'>Rock <img src=\".\\Rock.jpg\"><BR>");
                    out.println("<INPUT type = 'radio' value = 'paper' name = 'playerWeapon'>Paper <img src=\".\\Paper.jpg\"><BR>");
                    out.println("<INPUT type = 'radio' value = 'scissors' name = 'playerWeapon'>Scissors <img src=\".\\Scissors.jpg\"><BR>");
                    out.println("</TD>");
                      
                    out.println("</TR>");
                    out.println("</TABLE>");
        
                    out.println("<BR>");
                    out.println("<TABLE width=\"40%\" align=center>");
                    out.println("<TR>");  
                    out.println("<TD align = center>");
                    out.println("<INPUT type = 'submit' value = 'Submit Weapon' name = 'submitbutton'>");
                    out.println("</TD>\n" +
                    "        </TR>\n" +
                    "      </TABLE>\n" +
                    "    </FORM>");
          
                
                
                
                
                


		out.println("</center>");
		out.println("</body>");
		out.println("</html>");

	}
        

}