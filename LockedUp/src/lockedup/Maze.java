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
public class Maze {
    private final int x = 9, y = 9;
    private Room[][] room = new Room[x][y];
    private String roomName;
    
    public Maze(){
        for(int i = 0; i < room.length; ++i){
            for(int j = 0; i < room.length; ++j){
                room[i][j] = new Room(i, j);
            }
        }
    }
    
}
