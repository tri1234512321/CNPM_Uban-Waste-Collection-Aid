/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUNG
 */

import java.util.ArrayList;
public class Route {
    int id;
    String name;
    ArrayList<MCP> ListMCPs;
    Vechicle vechicle;
    int distance;
    public Route(int id,String name){
        this.id = id;
        this.name = name;
        this.distance = 0;
        this.ListMCPs = new ArrayList();
    }
    
    public void setDistance(){
        this.distance = 0;
        int size = ListMCPs.size();
        if(size == 0) return;
        int[][] DistanceToOthers = this.ListMCPs.get(0).DistanceToOthers;
        int[] id = new int[size];
        for(int i = 0 ; i < size ; i++){
            id[i] = this.ListMCPs.get(i).id;
        }
        for(int i = 1 ; i < size ; i++){
            this.distance += DistanceToOthers[id[i-1]][id[i]];
        }
    }
}
