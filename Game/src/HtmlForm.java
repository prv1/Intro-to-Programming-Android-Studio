
public class HtmlForm {
	String src;
	String action;
	String content;
	
	public HtmlForm(String src, String action) {
		
		this.src = src;
		this.action = action;
		
		this.content = "";
	}
	
	public void addText(String content) {
		this.content += content; 
	}
	
	
	public String buildHtml() {
		// <form action='../servlet/Dice' method='post'>
		return "<form action = '../servlet/" + src + "' method = '" + action + "'>" + 
				  content +
				  "<input type='submit' value='Submit'>" +
				  "</form>";
	}

}
