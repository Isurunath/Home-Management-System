/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.event;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import model.event.EventItems;
import utility.SetSessionFactory;

/**
 * EventItemsDAO -- Control Database access for Event Item interfaces
 * @author Isurunath
 */
public class EventItemsDAO {
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
    static Session session;

    /**
     * Load combo box with Item groups
     * @return Item groups
     */
    public static List<EventItems> LoadcomboList(){
        Query query;
        List<EventItems> resultList;
                
        session = sessionFactory.openSession();
        session.beginTransaction();
        query = session.getNamedQuery("EVENT_loadCombolist");
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }
    
    /**
     * Load Items to the list according to
     * selected item group
     * @param catagory item group 
     * @return  item list
     */
    public static List<EventItems> loadItemList(String catagory){
        Query query;
        List<EventItems> resultList;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        //if catagory is equal to all catagories
        if(catagory.equals("All catagories")){
            query = session.getNamedQuery("EVENT_loadItemList_1");
        }
        //if catagory is not equal to all catagories
        else{
            query = session.getNamedQuery("EVENT_loadItemList_2").setString("catagory",catagory);
        }

        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }

    /**
     * Load Item details to the table in settings according to
     * selected item group
     * @param catagory item group 
     * @return  item list
     */
    public static List<EventItems> LoadItemTable(String catagory){
        Query query;
        List<EventItems> resultList;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        //if catagory is equal to all catagories
        if(catagory.equals("All catagories")){
            query = session.getNamedQuery("EVENT_LoadItemTable_1");
        }
        //if catagory is not equal to all catagories
        else{
            query = session.getNamedQuery("EVENT_LoadItemTable_2").setString("catagory",catagory);
        }   

        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }
    
    
    /**
     * Add a event item to the database
     * @param item A Item Object
     */
    public static void addItem(EventItems item) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(item);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Item Added succesfully !");
    }
    
    /**
     * Update a event item in the database
     * @param item A Item Object
     */
    public static void updateItem(EventItems item) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(item);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Event Item Updated succesfully !");	
    }

    /**
     * Delete a event item in the database
     * @param ID A ItemID
     */
    public static void DeleteItems(String ID){
        Query query;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query = session.getNamedQuery("EVENT_deleteItems").setString("ID",ID);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Item Deleted succesfully !");
     }
}
