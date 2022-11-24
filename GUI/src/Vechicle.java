/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUNG
 */
public class Vechicle {
    int id;
    String fuel_consumption;
    Route route;
    Collector collector;
    public Vechicle(int id, String fuel_consumption){
        this.id = id;
        this.fuel_consumption = fuel_consumption;
        this.route = null;
        this.collector = null;
    }
}
