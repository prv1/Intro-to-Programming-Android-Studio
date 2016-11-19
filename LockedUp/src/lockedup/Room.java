/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockedup;

/**
 *
 * @author phillipviau
 */
public class Room {
    private Door[][] doorLocation = new Door[4][2];
    
    public Room(int number, Door[][] door, int flag){
        this.doorLocation[0][0] = flag;
    }
    
    
}
