/*
 * Phillip Viau
 * 12/02/2015
 * Takes radius and displays area and diameter of radius to user
 */
package testcircle;

/**
 *
 * @author phillipviau
 */
public class TestCircle {
double radius;

    public static void main(String[] args) {
        // TODO code application logic here
        
        double radius = 1;
        final double small = 1.32, large = 34.3;
        
        TestCircle[] fcircle = new TestCircle[3];
        
        for(int i = 0; i < fcircle.length; ++i)
            fcircle[i] = new TestCircle(i+1); // instantiates objects to be used for array method
            
        
        fcircle[0].setRadius(small); // sets radius by small variable
        fcircle[1].setRadius(large); // sets radius by large variable
        fcircle[2].setRadius(); // sets default radius
            
        
        
        for(int i = 0; i < fcircle.length; ++i ){ // loops through all objects in array
        
        System.out.println("The radius is " + fcircle[i].getRadius());
        System.out.println("The area of the radius is " + fcircle[i].getArea());
        System.out.println("The area of the radius is " + fcircle[i].getDiameter());
        }
    }
    
    public TestCircle(){
        radius = 1;
        
    }
    public TestCircle(double r){
        radius = r;
    }
    
    public void setRadius(double r){
        radius = r;
        
    }
    
    public void setRadius(){
        radius = 1;
        
    }

    public double getRadius(){
        return radius;
    }
    
    public double getArea(){
        return java.lang.Math.PI * radius * radius;
    }
    
    public double getDiameter(){
        return radius * 2;
        
    }
    
}
