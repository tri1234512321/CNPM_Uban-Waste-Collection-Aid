/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUNG
 */
import java.util.ArrayList;
public class Vechicle {
    int id;
    double fuel_consumption;
    Route route;
    Collector collector;
    boolean optimzed;
    static ArrayList<Vechicle> Not_Optimized = new ArrayList();
    
    public Vechicle(int id, double fuel_consumption){
        this.id = id;
        this.fuel_consumption = fuel_consumption;
        this.route = null;
        this.collector = null;
        this.optimzed = false;
    }
}
