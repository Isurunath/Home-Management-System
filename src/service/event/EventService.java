/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package service.event;

import dao.event.EventDAO;
import java.util.List;
import model.event.EventPlan;
import model.event.Eventnbev;
import model.event.Eventncontact;
import model.event.Eventnfood;
import model.event.Eventnitems;
import utility.Validations;

/**
 * EventService -- Event Service layer
 * @author Isurunath
 */
public class EventService {
	
    public static void addEvent(EventPlan e) {
        //validate new Event details
    	if(Validations.Validate(e)){
            EventDAO.addEvent(e);
    	}
    }
    
    public static void updateEvent(EventPlan e) {
    	//validate updated Event details
    	if(Validations.Validate(e)){
            EventDAO.updateEvent(e);
    	}
    }
    
    public static void addParticipantTable(Eventncontact c){
        EventDAO.addParticipantTable(c);
    }
    
    public static void updateParticipantTable(Eventncontact c){
        EventDAO.updateParticipantTable(c);
    }
    
    public static void deleteParticipantTable(int ID){
        EventDAO.deleteParticipantTable(ID);
    }
    
    public static void addItemTable(Eventnitems c){
        EventDAO.addItemTable(c);
    }
    
    public static void updateItemTable(Eventnitems c){
        EventDAO.updateItemTable(c);
    }
    
    public static void deleteItemTable(int ID){
        EventDAO.deleteItemTable(ID);
    }
    
     public static void addFoodTable(Eventnfood c){
        EventDAO.addFoodTable(c);
     }
     
     public static void updateFoodTable(Eventnfood c){
        EventDAO.updateFoodTable(c);
     }
     
     public static void deleteFoodTable(int ID){
        EventDAO.deleteFoodTable(ID);
    }
     
     public static void addBevTable(Eventnbev c){
        EventDAO.addBevTable(c);
    }
     
     public static void updateBevTable(Eventnbev c){
        EventDAO.updateBevTable(c);
    }
     
     public static void deleteBevTable(int ID){
        EventDAO.deleteBevTable(ID);
    }
    
    public static List<EventPlan> loadSearchTable(String D){
        return EventDAO.loadSearchTable(D);
    }
    
    public static void DeleteEvent(String ID){
        EventDAO.DeleteEvent(ID);
    }
    
    public static List<EventPlan> update_getEvent(String ID){
        return EventDAO.update_getEvent(ID);
    }
    
    public static List<Eventncontact> update_getContactTable(String ID){
        return EventDAO.update_getContactTable(ID);
    }
    
    public static List<Eventnitems> update_getItemTable(String ID){
        return EventDAO.update_getItemTable(ID);
    }
    
    public static List<Eventnfood> update_getFoodTable(String ID){
        return EventDAO.update_getFoodTable(ID);
    }
    
    public static List<Eventnbev> update_getbevTable(String ID){
        return EventDAO.update_getbevTable(ID);
    }
    
    public static List<EventPlan> loadEventNotification(){
        return EventDAO.loadEventNotification();
    }
}
