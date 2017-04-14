/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.event;

import view.event.EventFood;
import java.util.List;
import javax.swing.JOptionPane;
import model.event.Eventbeverages;
import model.event.Eventfood;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

/**
 * EventFoodDAO -- Control Database access for Food and Beverage interfaces
 * @author Isurunath
 */
public class EventFoodDAO {
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
    static Session session;
    
    /**
     * Load combo box with food groups
     * @return food groups
     */
    public static List<EventFood> LoadFoodcombo(){
        Query query;
        List<EventFood> resultList;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query = session.getNamedQuery("EVENT_load_Food_Combo");
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }

    /**
     * Load combo box with beverage groups
     * @return beverage groups
     */
    public static List<Eventbeverages> LoadBevcombo(){
        Query query;
        List<Eventbeverages> resultList;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query = session.getNamedQuery("EVENT_load_Bev_Combo");
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }
    
    /**
     * Load Food to the list according to
     * selected food group
     * @param catagory food group 
     * @return  food list
     */
    public static List<EventFood> loadFoodList(String catagory){
        Query query;
        List<EventFood> resultList;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        //if catagory is equal to all catagories
        if(catagory.equals("All catagories")){
            query = session.getNamedQuery("EVENT_loadFoodList_1");
        }
        //if catagory is not equal to all catagories
        else{
            query = session.getNamedQuery("EVENT_loadFoodList_2").setString("catagory",catagory);
        }

        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }

    /**
     * Load beverage to the list according to
     * selected beverage group
     * @param catagory beverage group 
     * @return  beverage list
     */
    public static List<Eventbeverages> loadBevList(String catagory){
        Query query;
        List<Eventbeverages> resultList;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        //if catagory is equal to all catagories
        if(catagory.equals("All catagories")){
                query = session.getNamedQuery("EVENT_loadBevList_1");
        }
        //if catagory is not equal to all catagories
        else{
                query = session.getNamedQuery("EVENT_loadBevList_2").setString("catagory",catagory);
        }

        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }

    /**
     * Load Food details to the table in settings according to
     * selected food group
     * @param catagory food group 
     * @return  food list
     */
    public static List<EventFood> LoadFoodTable(String catagory){
        session = sessionFactory.openSession();
        Query query;
        List<EventFood> resultList;
            
        session.beginTransaction();
        
        //if catagory equal all menus
        if(catagory.equals("All Menus")){
            query = session.getNamedQuery("EVENT_LoadFoodTable_1");
        }
        //if catagory is not equal to all menus
        else{
            query = session.getNamedQuery("EVENT_LoadFoodTable_2").setString("catagory",catagory);
        }   

        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }

    /**
     * Load Beverages details to the table in settings according to
     * selected Beverages group
     * @param catagory Beverages group 
     * @return  Beverages list
     */
    public static List<Eventbeverages> LoadBevTable(String catagory){
        Query query;
        List<Eventbeverages> resultList;

        session = sessionFactory.openSession();
        session.beginTransaction();
        
        //if catagory is equal to all catagories
        if(catagory.equals("All catagories")){
            query = session.getNamedQuery("EVENT_LoadBevTable_1");
        }
        //if catagory is not equal to all catagories
        else{
            query = session.getNamedQuery("EVENT_LoadBevTable_2").setString("catagory",catagory);
        }   

        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }

    /**
     * Add a food item to the database
     * @param food A EventFood Object
     */
    public static void addFood(Eventfood food) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(food);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Food item Added succesfully !");
    }
    
    /**
     * Update a food item in the database
     * @param food A EventFood Object
     */
    public static void updateFood(Eventfood food) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(food);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Food Item Updated succesfully !");	
    }

    /**
     * Delete a event item in the database
     * @param ID A ItemID
     */
    public static void DeleteFood(String ID){
        Query query;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query = session.getNamedQuery("EVENT_Food_delete").setString("ID",ID);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Food Item Deleted succesfully !");
    }
    
    /**
     * Add a Beverage to the database
     * @param bev A EventBeverages Object
     */
    public static void addBev(Eventbeverages bev) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(bev);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Beverage Added succesfully !");
    }

    /**
     * Update a beverage in the database
     * @param bev A EventBeverages Object
     */
    public static void updateBev(Eventbeverages bev) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(bev);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Beverage Updated succesfully !");	
    }

    /**
     * Delete a Beverage in the database
     * @param ID A bevID
     */
    public static void DeleteBev(String ID){
        Query query;   
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query = session.getNamedQuery("EVENT_Bev_delete").setString("ID",ID);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Beverage Deleted succesfully !");
    }
}
