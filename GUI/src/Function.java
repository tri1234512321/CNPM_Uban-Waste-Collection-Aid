/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUNG
 */
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class Function {
    static Data data = new Data();
    //Nhận 1 model 1 list, đưa dữ liệu từ model vào list sau đó show data lên scrollpane
    public static void showObjectonList(DefaultListModel model,JList list,JScrollPane scrollpane){
        list.setModel(model);
        scrollpane.setViewportView(list);
    }
    
    //đưa tất cả data của Object vào model và list
    public static void getData(DefaultListModel model, String Object){
        int size;
        switch(Object){
            case "Route":
                size = data.Routes_data.size();
                for(int i = 0 ; i < size ; i++){
                    model.addElement(data.Routes_data.get(i).name);
                }
                break;
            case "MCP":
                size = data.MCPs_data.size();
                ArrayList MCP_id = new ArrayList();
                for(int i = 0 ; i < size ; i++){
                    model.addElement("MCP "+ data.MCPs_data.get(i).id);
                }
                break;
            case "Collector":
                size = data.Collectors_data.size();
                for(int i = 0; i < size ; i++){
                    model.addElement(data.Collectors_data.get(i).name);
                }
                break;
            case "Janitor":
                size = data.Janitors_data.size();
                for(int i = 0 ; i < size ; i++){
                    model.addElement(data.Janitors_data.get(i).name);
                }
                break;               
            case "Vechicle":
                size = data.Vechicles_data.size();
                ArrayList Vechicle_id = new ArrayList();
                for(int i = 0 ; i < size ; i++){
                    model.addElement("Vechicle " + data.Vechicles_data.get(i).id);
                }
                break;
        }
    }
    
    //search tên object có chuỗi searchString và loại object là searchObject và đưa kết quả vào model
    //vd search(model,"ABC",data.Collector_data) đưa vào model các Collector có tên chứa chuỗi "ABC);
    public static void search(DefaultListModel model,String searchString,String searchObject){
        int size;
        switch(searchObject){
            case "Route":
                size = data.Routes_data.size();
                for(int i = 0 ; i < size ; i++){
                    String get = data.Routes_data.get(i).name;
                    if(get.contains(searchString)) model.addElement(get);
                }
                break;
            case "Collector":
                size = data.Collectors_data.size();
                for(int i = 0 ; i < size ; i++){
                    String get = data.Collectors_data.get(i).name;
                    if(get.contains(searchString)) model.addElement(get);
                }
                break;
            case "Janitor":
                size = data.Janitors_data.size();
                for(int i = 0 ; i < size ; i++){
                    String get = data.Janitors_data.get(i).name;
                    if(get.contains(searchString)) model.addElement(get);
                }
                break;
            case "MCP":
                size = data.MCPs_data.size();
                for(int i = 0 ; i < size ; i++){
                    String get = data.MCPs_data.get(i).id + "";
                    if(get.contains(searchString)) model.addElement("MCP " + get);
                }
                break;
            case "Vechicle":
            size = data.Vechicles_data.size();
                for(int i = 0 ; i < size ; i++){
                    String get = data.Vechicles_data.get(i).id + "";
                    if(get.contains(searchString)) model.addElement("Vechicle +"+get);
                }
                break;
        }
    }
    
    public static Route getRouteByName(String name){
        int size = data.Routes_data.size();
            for(int i = 0 ; i < size ; i++){
                if(data.Routes_data.get(i).name.equals(name)) 
                    return data.Routes_data.get(i) ;
            }
        return null;
    }
    
    public static Vechicle getVecByID(int id){
        int size = data.Vechicles_data.size();
            for(int i = 0 ; i < size ; i++){
                if(data.Vechicles_data.get(i).id == id) 
                    return data.Vechicles_data.get(i) ;
            }
        return null;
    }
    
    public static Janitor getJanitorByName(String name){
        int size = data.Janitors_data.size();
        for(int i = 0 ; i < size ; i++){
            if(data.Janitors_data.get(i).name.equals(name)) 
               return data.Janitors_data.get(i) ;
            }
        return null;
    }
    
    public static Collector getCollectorByname(String name){
        int size = data.Collectors_data.size();
        for(int i = 0 ; i < size ; i++){
            if(data.Collectors_data.get(i).name.equals(name)) 
               return data.Collectors_data.get(i) ;
            }
        return null;
    }
    
    public static MCP getMcpByID(int id){
        int size = data.MCPs_data.size();
        for(int i = 0 ; i < size ; i++){
            if(data.MCPs_data.get(i).id == id)
                  return data.MCPs_data.get(i);
        }
        return null;
    }
    
    public static Route getMinRouteNotOptimized(){
        int size = Data.Routes_data.get(0).Not_Optimized.size();
        if(size == 0) return null;
        Route route1 = Data.Routes_data.get(0).Not_Optimized.get(0);
        for(int i = 1 ; i < size ; i++ ){
            Route route2 = Data.Routes_data.get(i).Not_Optimized.get(i);
            if(route2.distance < route1.distance) route1 = route2;
        }
        return route1;
    }
    
    public static Vechicle getMaxConsumptionVec(){
        int size = Data.Vechicles_data.get(0).Not_Optimized.size();
        if(size == 0) return null;
        Vechicle Vec1 = Data.Vechicles_data.get(0).Not_Optimized.get(0);
        for(int i = 1 ; i < size ; i++ ){
            Vechicle Vec2 = Data.Vechicles_data.get(i).Not_Optimized.get(i);
            if(Vec2.fuel_consumption > Vec1.fuel_consumption ) Vec1 = Vec2;
        }
        return Vec1;
    }
}
