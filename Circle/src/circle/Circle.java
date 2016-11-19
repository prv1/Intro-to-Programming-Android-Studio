/*
 * Phillip Viau
 * 12/02/2015
 * Displays one radius, area, and diameter to user
 */
package circle;

/**
 *
 * @author phillipviau
 */
public class Circle {
double radius;
//double areaOfCircle = java.lang.Math.PI * radius * radius;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double radius = 1; // default variable
        
        Circle circle = new Circle(radius); // instantiates new object
        System.out.println("The radius is " + circle.getRadius()); // displays radius
        System.out.println("The area of the radius is " + circle.getArea());  // displays area and calculates from return method
        System.out.println("The area of the radius is " + circle.getDiameter()); // displays diameter and calculates from return method
        
    }
    public Circle(){
        radius = 1;
        
    }
    public Circle(double r){
        radius = r;
    }
    
    public void setRadius(double r){
        radius = r;
        
    }


    public double getRadius(){
        return radius; // returns radius to call
    }
    
    public double getArea(){
        return java.lang.Math.PI * radius * radius; // calculates area and returns in one line
    }
    
    public double getDiameter(){
        return radius * 2; // calculates diameter and returns in one line
        
    }
    
    
    
}
