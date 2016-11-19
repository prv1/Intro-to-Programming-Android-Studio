/*
 * Phillip viau
 * 12/08/2015
 * displays exception 
 */
package testscore;

/**
 *
 * @author prv1
 */
public class ScoreException extends Exception {

    
    public ScoreException(){
        super("this is an error");
        System.out.print("Error You entered an invalid value\n");
    }
    

    

}
