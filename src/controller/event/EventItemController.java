/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package controller.event;

import model.event.EventItems;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import service.event.EventItemService;

/**
 * EventItemController -- Event Item Controller class
 * @author Isurunath
 */
public class EventItemController {
    
    public static List<EventItems> LoadcomboList(){
        return EventItemService.LoadcomboList();
    }
    
    public static List<EventItems> loadItemList(String catagory){
        return EventItemService.loadItemList(catagory);  
    }
    
    public static DefaultTableModel LoadItemTable(String catagory){
        List l = EventItemService.LoadItemTable(catagory);
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Item Name");
        tableHeaders.add("Catagory");
        tableHeaders.add("Price");
        tableHeaders.add("Address");
        tableHeaders.add("Contact");
        tableHeaders.add("ID");

        for(Object o : l) {
            model.event.EventItems items = (model.event.EventItems)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(items.getItemName());
            oneRow.add(items.getEventCatagory());
            oneRow.add(items.getPrice());
            oneRow.add(items.getAddress());
            oneRow.add(items.getContact());
            oneRow.add(items.getId());
            
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders)); 
    }
    
    public static void addEventItem(DefaultTableModel table,EventItems items){
        EventItemService.addItem(table,items);
    }
    
    public static void DeleteItems(String ID){
        EventItemService.DeleteItems(ID);
    }
    
    public static void updateItem(EventItems i){
    	EventItemService.updateItem(i);
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
