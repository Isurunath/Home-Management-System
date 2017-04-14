/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package controller.event;


import service.event.EventService;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.event.EventPlan;
import model.event.Eventnbev;
import model.event.Eventncontact;
import model.event.Eventnfood;
import model.event.Eventnitems;


/**
 * EventController -- Event Details Controller class
 * @author Isurunath
 */
public class EventController {
    
    public static void AddEvent(EventPlan e){
    	EventService.addEvent(e);
    }
    
    public static void updateEvent(EventPlan e){
    	EventService.updateEvent(e);
    }
    
    public static void addParticipantTable(Eventncontact c){
    	EventService.addParticipantTable(c);
    }
    
    public static void updateParticipantTable(Eventncontact c){
    	EventService.updateParticipantTable(c);
    }
    
    public static void deleteParticipantTable(int ID){
        EventService.deleteParticipantTable(ID);
    }
    
    public static void addItemTable(Eventnitems c){
        EventService.addItemTable(c);
    }
    
    public static void updateItemTable(Eventnitems c){
        EventService.updateItemTable(c);
    }
    
    public static void deleteItemTable(int ID){
        EventService.deleteItemTable(ID);
    }
    
    public static void addFoodTable(Eventnfood c){
        EventService.addFoodTable(c);
    }
    
    public static void updateFoodTable(Eventnfood c){
        EventService.updateFoodTable(c);
    }
    
    public static void deleteFoodTable(int ID){
        EventService.deleteFoodTable(ID);
    }
    
    public static void addBevTable(Eventnbev c){
        EventService.addBevTable(c);
    }
    
    public static void updateBevTable(Eventnbev c){
        EventService.updateBevTable(c);
    }
    
    public static void deleteBevTable(int ID){
        EventService.deleteBevTable(ID);
    }
    
    /**
     * Display Event Table in search interface
     * @param D event catagory
     * @return Event Table
     */
    public static DefaultTableModel displayTable(String D){
        List l = EventService.loadSearchTable(D);
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Event ID");
        tableHeaders.add("Name");
        tableHeaders.add("Date"); 
        tableHeaders.add("Start Time");
        tableHeaders.add("End Time");
        tableHeaders.add("Loaction");
        tableHeaders.add("Number Of Participants");

        for(Object o : l) {
            EventPlan items = (EventPlan)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(items.getEventId());
            oneRow.add(items.getName());
            oneRow.add(items.getDate());
            oneRow.add(items.getStartTime());
            oneRow.add(items.getEndTime());
            oneRow.add(items.getLocation());
            oneRow.add(items.getNop());
            tableData.add(oneRow);
        }
        
        return (new DefaultTableModel(tableData, tableHeaders));
    }
    
    /**
     * Delete selected Event
     * @param ID event ID
     */
    public static void DeleteEvent(String ID){
        EventService.DeleteEvent(ID);
    }
    
    /**
     * load event details in update
     * @param ID Event ID
     * @return Event Details
     */
    public static List<EventPlan> update_getEvent(String ID){
        return EventService.update_getEvent(ID);
    }
    
    /**
     * Load event contacts in update
     * @param ID Event ID
     * @return Event contacts
     */
    public static DefaultTableModel update_getContactTable(String ID){
        List l = EventService.update_getContactTable(ID);
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("ID");
        tableHeaders.add("Name");
        tableHeaders.add("Address");

        for(Object o : l) {
            Eventncontact items = (Eventncontact)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(items.getId());
            oneRow.add(items.getName());
            oneRow.add(items.getAddress());
            tableData.add(oneRow);
        }
        
        return (new DefaultTableModel(tableData, tableHeaders));
         
    }
    
    /**
     * Load event Item in update
     * @param ID Event ID
     * @return Event items
     */
    public static DefaultTableModel update_getItemTable(String ID){
        List l = EventService.update_getItemTable(ID);
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Name");
        tableHeaders.add("Quantity");

        for(Object o : l) {
            Eventnitems items = (Eventnitems)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(items.getItemName());
            oneRow.add(items.getQuantity());
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));
    }
    
    /**
     * Load event food in update
     * @param ID Event ID
     * @return Event food
     */
    public static DefaultTableModel update_getFoodTable(String ID){
        List l = EventService.update_getFoodTable(ID);
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Plate");

        for(Object o : l) {
            Eventnfood items = (Eventnfood)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(items.getPlate());
            tableData.add(oneRow);
        }
        
        return (new DefaultTableModel(tableData, tableHeaders));
    }
    
    /**
     * Load event beverage in update
     * @param ID Event ID
     * @return Event beverage
     */
    public static DefaultTableModel update_getBevTable(String ID){
        List l = EventService.update_getbevTable(ID);
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Name");
        tableHeaders.add("Quantity");

        for(Object o : l) {
            Eventnbev items = (Eventnbev)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(items.getName());
            oneRow.add(items.getQuantity());
            tableData.add(oneRow);
        }
        
        return (new DefaultTableModel(tableData, tableHeaders));
         
    }
}
