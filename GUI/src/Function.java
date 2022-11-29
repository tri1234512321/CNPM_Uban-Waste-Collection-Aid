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
    //Nhận 1 model và 1 scrollpane sau đó show data lên scrollpane
    public static void showObjectonList(DefaultListModel model,JScrollPane scrollpane){
        JList list = new JList(model);
        scrollpane.setViewportView(list);
    }
    
    //đưa tất cả data của Object vào model
    public static void getData(DefaultListModel model,String Object){
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
                    if(get.contains(searchString)) model.addElement(get);
                }
                break;
            case "Vechicle":
            size = data.Vechicles_data.size();
                for(int i = 0 ; i < size ; i++){
                    String get = data.Vechicles_data.get(i).id + "";
                    if(get.contains(searchString)) model.addElement(get);
                }
                break;
        }
    }
}
