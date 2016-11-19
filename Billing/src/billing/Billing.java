/*
 * Phillip Viau
 * 12/01/2015
 * computes an order with a coupon with overload()
 */
package billing;

/**
 *
 * @author prv1
 */
public class Billing {
private double price = 4.35d, couponValue = 2.34d, due = 0.0d;
private int quantity = 3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Billing start = new Billing();
        start.start();
    }
    
    public void start(){
        Billing first = new Billing();// TODO code application logic here
        Billing second = new Billing();
        Billing third = new Billing();
        first.computeBill(price);
        second.computeBill(price,quantity);
        third.computeBill(price,quantity,couponValue);
    }
    
    public void computeBill(double p){
        due = p * 0.08d + p;
        billDue(due);
    }
    
    public void computeBill(double p, int quantity){
        due = (p * quantity) * 0.08 + (p * quantity);
        billDue(due);
    }
    
    public void computeBill(double p, int quantity, double coupon){
        due = ((p * quantity) - coupon) * 0.08 + ((p * quantity) - coupon);
        billDue(due);
    }
    
    public void billDue(double d){
        System.out.println("Your total due is $" + d);
    }
    
}
