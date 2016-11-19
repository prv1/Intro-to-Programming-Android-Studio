import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class OceanViauRentals extends HttpServlet {

	private static final long serialVersionUID = 1L; // serialization of program
	private String customerName = "";
	
	private static double drinkCost = 0.0; // total cost of order
	
	private String drinkSize = "";
	final private double costOfUniversal = 0.25; 
	final private double costOfGalactic = 0.75;
	final private double costOfCosmic = 1.50;
	
	private boolean drinkSelected = false;
	private String drinkType = "";
	final private double costOfRocket = 1.00;
	final private double costOfGamora = 1.50;
	final private double costOfGroot = 2.00;
	
	private String milkType = "";
	
	String[] drinkOptions;
	final private double costOfTerrigen = 0.25;
	final private double costOfInfinityDust = 0.75;
	final private double costOfTrinnamon = 1.50;
			
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
				
		if(request.getParameter("drinkSize") != null){
			drinkSize = (request.getParameter("drinkSize"));
	
			switch(drinkSize){
			
				case("universal"): 
					drinkCost = costOfUniversal;
					drinkSize = "Universal";
					break;
					
				case("galactic"): 
					drinkCost = costOfGalactic;
					drinkSize = "Galactic";
					break;
				
				case("cosmic"): 
					drinkCost = costOfCosmic;
					drinkSize = "Cosmic";
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
			
				case("rocket"): 
					drinkCost = costOfRocket;
					drinkType = "Rocket";
					drinkSelected = true;
					break;
					
				case("gamora"): 
					drinkCost = costOfGamora;
					drinkType = "Gamora";
					drinkSelected = true;
					break;
				
				case("groot"): 
					drinkCost = costOfGroot;
					drinkType = "Groot";
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
		out.println("<title>Star Lord Coffee</title>");
		out.println("</head>");

		out.println("<center>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td valign='center'><img src='/rinsem/StarLord.png' alt='Starlord' height='100' width='100'></td>");
		out.println("<td valign='center'><center><H1>Star Lord Coffee</H1></center>");
		out.println("<center><H3>724-555-5555</H3></center>");
		out.println("<td valign='center'><img src='/rinsem/StarLord.png' alt='Starlord' height='100' width='100'></td>");
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
		
		if(request.getParameter("drinkOptions") != null)
				drinkOptions=request.getParameterValues("drinkOptions");
		
		for(int i = 0; i < drinkOptions.length; i++){
			if(drinkOptions[i].contains("terrigen")){
				out.println("<BR>");
				out.println("with Terrigen + $" + costOfTerrigen);
				drinkCost += costOfTerrigen;
				out.println("Total: $" + drinkCost);
			}
		}
		
		for(int i = 0; i < drinkOptions.length; i++){
			if(drinkOptions[i].contains("infinityDust")){
				out.println("<BR>");
				out.println("with Infinity Dust + $" + costOfInfinityDust);
				drinkCost += costOfInfinityDust;
				out.println("Total: $" + drinkCost);
			}
		}
		
		for(int i = 0; i < drinkOptions.length; i++){
			if(drinkOptions[i].contains("trinnamon")){
				out.println("<BR>");
				out.println("with Trinnamon + $" + costOfTrinnamon);
				drinkCost += costOfTrinnamon;
				out.println("Total: $" + drinkCost);
			}
		}

		out.println("</center>");
		out.println("</body>");
		out.println("</html>");

	}
}
