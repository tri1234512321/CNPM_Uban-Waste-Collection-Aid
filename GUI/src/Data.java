/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUNG
 */

import java.util.ArrayList;
public class Data {
    static ArrayList<Janitor> Janitors_data = new ArrayList();
    static  ArrayList<Collector> Collectors_data = new ArrayList();
    static ArrayList<Route> Routes_data = new ArrayList();
    static ArrayList<MCP> MCPs_data = new ArrayList();
    static ArrayList<Vechicle> Vechicles_data = new ArrayList();
    Data(){}
    public void add_Data(Route route,Collector collector, MCP mcp, Vechicle vechicle){
        this.Routes_data.add(route);
        this.Collectors_data.add(collector);
        this.MCPs_data.add(mcp);
        this.Vechicles_data.add(vechicle);
    }
}
