/*
 * Phillip Viau
 * 12/04/2015
 * assigns default values with methods and displays certificate information
 */
package certificateofdeposit;
import java.util.*;
import java.text.DateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author phillipviau
 */
public class CertificateOfDeposit {
int custNumber;
private DateFormat sIssue, sMature;
private String Issue, Mature;
private long certificateNumber;
private String lastName;
private int m,d,y;
private double balance;
private Date issueDate, maturityDate;
private final GregorianCalendar issue, mature;
private CertificateOfDeposit CertificateOfDeposit;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        GregorianCalendar now = new GregorianCalendar();
        CertificateOfDeposit customer = new CertificateOfDeposit(0,123,"Customer",33.22,now);
        //customer.run();
        customer.display();
        
    }


    
    public void run(){
        GregorianCalendar now = new GregorianCalendar();
        do{
            if(askYesNo("Would you like to set today as issue date?\nYES - Set custom issue Date\nNO - Set Today ")){
                this.m = askInt("Please enter the issue date\nEnter month ");
                this.d = askInt("Enter day ");
                this.y = askInt("Enter year ");
                //GregorianCalendar issueDate = new GregorianCalendar(this.y,this.m,this.d);
            }else{
                this.m = now.get(Calendar.MONTH);
                this.d = now.get(Calendar.DAY_OF_MONTH);
                this.y = now.get(Calendar.YEAR);
                //GregorianCalendar issueDate = new GregorianCalendar(this.y,this.m,this.d); 
            }
            setCertificate();
            setLastName();
            setBalance();

            CertificateOfDeposit customer = new CertificateOfDeposit(getCustNumber(),getCertificate(),getLastName(),getBalance(), now );
            display();
        }while(askYesNo("Do you wish to create another customer? "));
        
    
    }
    

    
    public CertificateOfDeposit(int cNumber, long c, String n, double b, GregorianCalendar iDate){

        //custNumber++;
        this.certificateNumber = c;
        this.lastName = n;
        this.balance = b;
        this.m = 1;
        this.d = 22;
        this.y = 2015;
                
        this.mature = new GregorianCalendar(iDate.get(Calendar.YEAR)+1,iDate.get(Calendar.MONTH),iDate.get(Calendar.DAY_OF_MONTH));
        this.issue = iDate;
        //this.issueDate = iDate.getTime();
        //this.maturityDate = this.mature.getTime();
        //this.Issue = sIssue.format(iDate);
        //this.Mature = sMature.format(this.mature);
    }

    public void setCertificate(){

        this.certificateNumber = askInt("Please enter certificate number: ");  
    }
    
    public int getCustNumber(){
        //custNumber += 1;
        return custNumber;
    }
    
    public void setLastName(){
        this.lastName = ask("Please enter last name: ");
    }
    
    public void setBalance(){
        this.balance = askDouble("Please enter balance: ");
    }
    
    public long getCertificate(){
        
        return this.certificateNumber;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public String getIssue(){
        int Lm,Ld,Ly;
        String text;
        Lm = m;
        Ld = d;
        Ly = y;
        text = Lm + "/" + Ld + "/" + Ly;
        return text;
    }
    
    public String getMature(){
        int Lm,Ld,Ly;
        String text;
        Lm = m;
        Ld = d;
        Ly = y+1;
        text = Lm + "/" + Ld + "/" + Ly;
        return text;
    }

    public int askInt(String text){
        text = JOptionPane.showInputDialog(null, text);
        int i = Integer.parseInt(text);
        return i;
    }
    
    public String ask(String text){
        text = JOptionPane.showInputDialog(null, text);
        return text;
    }
    
    public boolean askYesNo(String text){
        boolean flag = false;
        int ask = JOptionPane.showConfirmDialog(null, text, "", JOptionPane.YES_NO_OPTION);
        if(ask == JOptionPane.YES_OPTION){
            flag = true;
        }
        return flag;
    }
    
    public double askDouble(String text){
        double t;
        text = JOptionPane.showInputDialog(null, text);
        t = Double.parseDouble(text);
        return t;
    }
    
    public static void say(String text){
        JOptionPane.showMessageDialog(null, text);
    }
    
    public void display(){
        say(/*"Customer Number: " + getCustNumber() 
        + */"\nCertificate Number: " + getCertificate() 
        + "\nLast Name: " + getLastName()
        + "\nIssue Date: " + getIssue()
        + "\nMature Date: " + getMature()
        + "\nBalance: $" + getBalance());
    }
}
