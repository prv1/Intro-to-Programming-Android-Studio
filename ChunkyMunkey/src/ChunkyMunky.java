import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class ChunkyMunky extends HttpServlet {

	private static final long serialVersionUID = 1L; // serialization of program
	private String customerName = "";
	
	private static double drinkCost = 0.0; // total cost of order
	private static double entreeCost = 0.0;
        private static double dessertCost = 0.0;
        
        private String entreeType = "";
        final private double costOfChunk = 3.25;
        final private double costOfChunky = 4.50;
        final private double costOfMunky = 5.65;
        
        private String dessertType = "";
        final private double costOfChunkOfMunk = 1.50;
        final private double costOfMunkOfChunk = 2.25;
        final private double costOfChunkyMunky = 2.75;
        
        
	private String drinkSize = "";
	final private double costOfKiloBytes = 0.25; 
	final private double costOfGigaBytes = 0.75;
	final private double costOfPhetaBytes = 1.50;
	
	private boolean drinkSelected = false;
	private String drinkType = "";
	final private double costOfTangerineTwist = 1.00;
	final private double costOfGrapeEscape = 1.50;
	final private double costOfBustaLime = 2.00;
	
	private String milkType = "";
	
	String[] extraOptions;
	final private double costOfExtraChunk = 0.25;
	final private double costOfExtraMunk = 0.75;
	final private double costOfExtraChunkyMunky = 1.50;
			
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
		
		if(request.getParameter("customerName") != null || request.getParameter("customerName") != "")
			customerName = (request.getParameter("customerName"));
		else
			customerName = "Not Sure";
		
                if(request.getParameter("entreeType") != null){
                        entreeType = (request.getParameter("entreeType"));
                        
                        switch(entreeType){
                                case("chunk"):
                                    entreeCost = costOfChunk;
                                    entreeType = "Chunk";
                                    break;
                                    
                                case("chunky"):
                                    entreeCost = costOfChunky;
                                    entreeType = "Chunky";
                                    break;
                                    
                                case("munky"):
                                    entreeCost = costOfMunky;
                                    entreeType = "Munky";
                                    break;
                                
                                default:
                                    entreeCost = 0.0;
                                    entreeType = "";
                                    
                            
                        }
                }
                
		if(request.getParameter("drinkSize") != null){
			drinkSize = (request.getParameter("drinkSize"));
	
			switch(drinkSize){
			
				case("kilobytes"): 
					drinkCost = costOfKiloBytes;
					drinkSize = "Kilo Bytes";
					break;
					
				case("gigabytes"): 
					drinkCost = costOfGigaBytes;
					drinkSize = "Giga Bytes";
					break;
				
				case("phetabytes"): 
					drinkCost = costOfPhetaBytes;
					drinkSize = "Pheta Bytes";
					break;
				
				default: 
					drinkCost = 0.0;
					drinkSize = "none";
					drinkSelected = false;
			}
		}
		
		if(request.getParameter("drinkType") != null){
			drinkType = (request.getParameter("drinkType"));
	
			switch(drinkType){
			
				case("tangerinetwist"): 
					drinkCost = costOfTangerineTwist;
					drinkType = "Tangerine Twist";
					drinkSelected = true;
					break;
					
				case("grapeescape"): 
					drinkCost = costOfGrapeEscape;
					drinkType = "GrapeEscape";
					drinkSelected = true;
					break;
				
				case("bustalime"): 
					drinkCost = costOfBustaLime;
					drinkType = "Busta Lime";
					drinkSelected = true;
					break;
				
				default: 
					drinkCost = 0.0;
					drinkType = "";
					drinkSelected = false;

			}
		}
		
		if(request.getParameter("milkType") != null){
			milkType = (request.getParameter("milkType"));
	
			switch(milkType){
			
				case("noMilk"): 
					milkType = "no ";
					break;
					
				case("spartaxMilk"): 
					milkType = "Spartax ";
					break;
				
				case("skrullMilk"): 
					milkType = "Skrull ";
					break;
				
				default: milkType = "no ";
			}
		}
		
			
		response.setContentType("text/html");

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Chunky Munky</title>");
		out.println("</head>");

		out.println("<center>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td valign='center'><img src='/viau/StarLord.png' alt='Starlord' height='100' width='100'></td>");
		out.println("<td valign='center'><center><H1>Chunky Munky</H1></center>");
		out.println("<center><H3>724-555-5555</H3></center>");
		out.println("<td valign='center'><img src='/viau/StarLord.png' alt='Starlord' height='100' width='100'></td>");
		out.println("</tr>");
		out.println("</table> ");   
	    
		out.println("<HR width='80%'>");
		
		out.print("<H2>Thank you for your order, ");
		out.print(customerName); 
		out.print("</H2>");
		
		out.println("<H3>Order #1 </H3> ");
		
		if(drinkSelected != false){
			out.println(drinkSize);
			out.print(drinkType);
			out.print(" with ");
			out.print(milkType);
			out.print(" milk");
			out.println(":$" + drinkCost);
		}else
			out.println("No Drink Selected");
		
		if(request.getParameter("extraOptions") != null)
				extraOptions=request.getParameterValues("extraOptions");
		
		for(int i = 0; i < extraOptions.length; i++){
			if(extraOptions[i].contains("chunk")){
				out.println("<BR>");
				out.println("with extra chunk + $" + costOfExtraChunk);
				drinkCost += costOfExtraChunk;
				out.println("Total: $" + drinkCost);
			}
		}
		
		for(int i = 0; i < extraOptions.length; i++){
			if(extraOptions[i].contains("munk")){
				out.println("<BR>");
				out.println("with extra munk + $" + costOfExtraMunk);
				drinkCost += costOfExtraMunk;
				out.println("Total: $" + drinkCost);
			}
		}
		
		for(int i = 0; i < extraOptions.length; i++){
			if(extraOptions[i].contains("chunkymunky")){
				out.println("<BR>");
				out.println("with extra chunky munky + $" + costOfExtraChunkyMunky);
				drinkCost += costOfExtraChunkyMunky;
				out.println("Total: $" + drinkCost);
			}
		}

		out.println("</center>");
		out.println("</body>");
		out.println("</html>");

	}
}

