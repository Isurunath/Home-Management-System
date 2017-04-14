/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.food;

import java.util.List;
import javax.swing.JOptionPane;
import model.event.EventPlan;
import model.food.Homefood;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

public class FoodDAO {
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
    static Session session;
    
    public static void addFood(Homefood food) {
	session = sessionFactory.openSession();
    	session.beginTransaction();
     	session.save(food);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Food item Added succesfully !");
    }
    
    /**
     * Update specific event details in database
     * and display success message
     * @param e
     * @param event A EventPlan Object
     */
    public static void updateFood(Homefood e) {
	session = sessionFactory.openSession();
    	session.beginTransaction();
     	session.update(e);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Food item Updated succesfully !");
    }
    
    public static void deleteFood(String ID){
        Query query;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query= session.getNamedQuery("FOOD_delete").setString("ID",ID);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Food Item Deleted succesfully !");
    }
    
    /**
     * Load Event Table in search Tab
     * @param type Event catagory according 
     * to date
     * @return Event List
     */
    public static List<Homefood> loadFoodTable(String catagory){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = null;
        if(catagory.equals("ALL")){
            query = session.getNamedQuery("Food_LoadSearchTable_ALL");
        }
        else if(catagory.equals("Expire")){
            query = session.getNamedQuery("Food_LoadExpireTable");
        }
        else{
            query = session.getNamedQuery("Food_LoadItemTable").setString("catagory",catagory);
        }
        List<Homefood> resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }
   
    
}
