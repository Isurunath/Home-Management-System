/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package controller.event;

import service.event.EventFoodService;
import view.event.EventFood;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.event.Eventbeverages;
import model.event.Eventfood;

/**
 * EventFoodController -- Event Food Controller class
 * @author Isurunath
 */
public class EventFoodController {
    
    public static List<EventFood> LoadFoodcombo(){
        return EventFoodService.LoadFoodcombo();
    }
    
    public static List<Eventbeverages> LoadBevcombo(){
        return EventFoodService.LoadBevcombo();
    }
    
    public static List<EventFood> loadFoodList(String catagory){
        return EventFoodService.LoadFoodList(catagory);  
    }
    
    public static List<Eventbeverages> loadBevList(String catagory){
        return EventFoodService.LoadBevList(catagory);  
    }
    
    public static DefaultTableModel LoadFoodTable(String catagory){
        List l = EventFoodService.LoadFoodTable(catagory);
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Food ID");
        tableHeaders.add("Menu Name");
        tableHeaders.add("Item Name"); 
        tableHeaders.add("Price");

        for(Object o : l) {
            Eventfood items = (Eventfood)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(items.getId());
            oneRow.add(items.getMenuName());
            oneRow.add(items.getItemName());
            oneRow.add(items.getPrice());;
            tableData.add(oneRow);
        }
        
        return (new DefaultTableModel(tableData, tableHeaders)); 
    }
    
    public static DefaultTableModel LoadBevTable(String catagory){
        List l = EventFoodService.LoadBevTable(catagory);
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Name"); 
        tableHeaders.add("Catagory");
        tableHeaders.add("Price");
        tableHeaders.add("Address");
        tableHeaders.add("Contact");
        tableHeaders.add("ID");
       
        for(Object o : l) {
            Eventbeverages items = (Eventbeverages)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(items.getName());
            oneRow.add(items.getCatagory());
            oneRow.add(items.getPrice());
            oneRow.add(items.getAddress());
            oneRow.add(items.getContact());
            oneRow.add(items.getId());
            tableData.add(oneRow);
        }
        
        return (new DefaultTableModel(tableData, tableHeaders));
    }
    
    public static void addBev(DefaultTableModel d,Eventbeverages e) {
	EventFoodService.addBev(d,e);     
    }
	
    public static void updateBev(Eventbeverages i){
        EventFoodService.updateBev(i);
    }
    
    public static void DeleteBev(String ID){
        EventFoodService.DeleteBev(ID);
    }

    public static void addFood(Eventfood e) {
        EventFoodService.addFood(e);
    }

    public static void updateFood(Eventfood i){
        EventFoodService.updateFood(i);
    }
    
    public static void DeleteFood(String ID){
        EventFoodService.DeleteFood(ID);
    }
    
    /**
     * Adding items to the selecting table check and managing quantity
     * @param table
     * @param quantity
     * @param newitem
     * @return changed table
     */
    public static DefaultTableModel addtotable(DefaultTableModel table,Object quantity,Object newitem){
        
        Object finalqty ;       //final quantity
        String item;            //current item in table
        Object q;               //current quantity
        boolean found = false;  //item already exist or not
        
        for(int i=0;i<table.getRowCount();i++){
            
            item = table.getValueAt(i, 0).toString();
            q =  table.getValueAt(i, 1);
            if(newitem.toString().equalsIgnoreCase(item)){
                
                finalqty = ((Number)quantity).intValue() + ((Number)q).intValue(); 
                table.setValueAt(finalqty,i, 1);
                found = true;
                break;
            }
        }
        
        if(!found){
            table.addRow(new Object[] { newitem, quantity});
        }
        return table; 
    }
}
