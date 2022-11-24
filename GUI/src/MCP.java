/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUNG
 */
public class MCP {
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
    
}
