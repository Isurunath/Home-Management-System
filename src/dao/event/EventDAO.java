/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.event;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import model.event.EventPlan;
import model.event.Eventnbev;
import model.event.Eventncontact;
import model.event.Eventnfood;
import model.event.Eventnitems;
import org.hibernate.Query;
import utility.SetSessionFactory;

/**
 * EventDAO -- Control Database access for main Event interface
 * @author Isurunath
 */
public class EventDAO {
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
    static Session session;
    
    /**
     * Add new event details to database
     * and display success message
     * @param event A EventPlan Object
     */
    public static void addEvent(EventPlan event) {
	session = sessionFactory.openSession();
    	session.beginTransaction();
     	session.save(event);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Event Added succesfully !");
    }
    
    /**
     * Update specific event details in database
     * and display success message
     * @param event A EventPlan Object
     */
    public static void updateEvent(EventPlan event) {
	session = sessionFactory.openSession();
    	session.beginTransaction();
     	session.update(event);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Event Updated succesfully !");
    }
    
    /**
     * Add participant of specific event
     * to the database
     * @param contact A EventnContact Object
     */
    public static void addParticipantTable(Eventncontact contact){
        session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(contact);
        session.getTransaction().commit();
        session.close();
    }
    
    /**
     * Update participant of specific event
     * in the database
     * @param contact A EventnContact Object
     */
    public static void updateParticipantTable(Eventncontact contact){
        session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.update(contact);
        session.getTransaction().commit();
        session.close();
    }
    
    /**
     * Delete participant list of specific event
     * in the database
     * @param ID a ID of a specific event
     */
    public static void deleteParticipantTable(int ID){
        Query query; 
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query = session.getNamedQuery("EVENT_ParticipantTable_delete").setInteger("ID",ID);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
    
    /**
     * Add Item of specific event
     * to the database
     * @param item A EventnItems Object
     */
    public static void addItemTable(Eventnitems item){
        session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(item);
        session.getTransaction().commit();
        session.close();
    }
    
    /**
     * Update Item of specific event
     * in the database
     * @param item A EventnItems Object
     */
    public static void updateItemTable(Eventnitems item){
        session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.update(item);
        session.getTransaction().commit();
        session.close();
    }
    
    /**
     * Delete Item list of specific event
     * in the database
     * @param ID A ID of a specific event
     */
    public static void deleteItemTable(int ID){
	Query query;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query= session.getNamedQuery("EVENT_ItemTable_delete").setInteger("ID",ID);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
    
    /**
     * Add Food of specific event
     * to the database
     * @param food A EventnItems Object
     */
    public static void addFoodTable(Eventnfood food){
        session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(food);
        session.getTransaction().commit();
        session.close();
    }
    
    /**
     * Update Food of specific event
     * in the database
     * @param food A EventnFood Object
     */
    public static void updateFoodTable(Eventnfood food){
        session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.update(food);
        session.getTransaction().commit();
        session.close();
    }
    
    /**
     * Delete Food list of specific event
     * in the database
     * @param ID A ID of a specific event
     */
    public static void deleteFoodTable(int ID){
	Query query;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query = session.getNamedQuery("EVENT_FoodTable_delete").setInteger("ID",ID);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
    
    /**
     * Add Beverages of specific event
     * to the database
     * @param bev A EventnBev Object
     */
    public static void addBevTable(Eventnbev bev){
        session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(bev);
        session.getTransaction().commit();
        session.close();
    }
    
    /**
     * Update Beverages of specific event
     * in the database
     * @param bev A EventnBev Object
     */
    public static void updateBevTable(Eventnbev bev){
        session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.update(bev);
        session.getTransaction().commit();
        session.close();
    }
    
    /**
     * Delete Beverage list of specific event
     * in the database
     * @param ID A ID of a specific event
     */
    public static void deleteBevTable(int ID){
	Query query;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query = session.getNamedQuery("EVENT_BevTable_delete").setInteger("ID",ID);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
    
    /**
     * Load Event Table in search Tab
     * @param type Event catagory according 
     * to date
     * @return Event List
     */
    public static List<EventPlan> loadSearchTable(String type){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = null ;
        
        switch (type) {
            case "ALL":
                {
                    query = session.getNamedQuery("Event_LoadSearchTable_ALL");
                    break;
                }
            case "UPCOMING":
                {
                    query = session.getNamedQuery("Event_LoadSearchTable_UPCOMING");
                    break;
                }
            case "PAST":
                {
                    query = session.getNamedQuery("Event_LoadSearchTable_LATE");
                    break;
                }
            case "TODAY":
                {
                    query = session.getNamedQuery("Event_LoadSearchTable_TODAY");
                    break;
                }
        }
            
        List<EventPlan> resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }
    
    /**
     * Delete Event from database and
     * display success message
     * @param ID Event ID
     */
    public static void DeleteEvent(String ID){
        Query query;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query= session.getNamedQuery("EVENT_delete").setString("ID",ID);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Item Deleted succesfully !");
    }
    
    /**
     * get Event Details for updating a
     * specific event
     * @param ID Event ID
     * @return Event Details
     */
    public static List<EventPlan> update_getEvent(String ID){
        Query query;
        List<EventPlan> resultList;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query = session.getNamedQuery("update_getEvent").setString("ID",ID);
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
        
    }
    
    /**
     * get Contact Details for updating a
     * specific event
     * @param ID Event ID
     * @return contact Details
     */
    public static List<Eventncontact> update_getContactTable(String ID){
        Query query;
        List<Eventncontact> resultList;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query = session.getNamedQuery("update_getContactTable").setString("ID",ID);
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
        
    }
    
    /**
     * get Item Details for updating a
     * specific event
     * @param ID Event ID
     * @return Item Details
     */
    public static List<Eventnitems> update_getItemTable(String ID){
        Query query;
        List<Eventnitems> resultList;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query = session.getNamedQuery("update_getItemTable").setString("ID",ID);
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList; 
    }
    
    /**
     * get Food Details for updating a
     * specific event
     * @param ID Event ID
     * @return Food Details
     */
    public static List<Eventnfood> update_getFoodTable(String ID){
        Query query;
        List<Eventnfood> resultList;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query = session.getNamedQuery("update_getFoodTable").setString("ID",ID);
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }
    
    /**
     * get beverage Details for updating a
     * specific event
     * @param ID Event ID
     * @return beverage Details
     */
    public static List<Eventnbev> update_getbevTable(String ID){
        Query query;
        List<Eventnbev> resultList;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query = session.getNamedQuery("update_getBevTable").setString("ID",ID);
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }
    
    public static List<EventPlan> loadEventNotification(){
        
        Query query;
        List<EventPlan> resultList;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query = session.getNamedQuery("event_notification");
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
        
    }
}
