/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUNG
 */
import java.util.Random;
public class MCP {
    static int[][] DistanceToOthers = new int[20][20];
    int id;
    String location;
    Route route;
    Janitor janitor;
    public MCP(int id,String location){
        this.id = id;
        this.location = location;
        this.route = null;
        this.janitor = null;
    }
    
    void setDistance(){
        Random random = new Random();
        for(int i = 0 ; i < 20 ; i++){
            for(int j = i ; j <20 ; j++){
                if(i == j) this.DistanceToOthers[i][j] = 0;
                else{
                    this.DistanceToOthers[i][j] = random.nextInt(100)+1;
                }
            }
        }
    }
}
