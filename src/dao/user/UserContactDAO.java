/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.user;

import model.user.Usercontact;
import utility.SetSessionFactory;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * UserContactDAO -- Control Database access for User Contact interface
 * @author Nimanthika
 * 
 */
public class UserContactDAO {
    
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
    static Session session;
    
    /**
     * Load contact table
     * @return table data
     */
    public static List<Usercontact> LoadContactTable(){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
		
        Query q = session.getNamedQuery("CONTACT_LoadContactTable");
          
        List<Usercontact> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;	
    }
    
    /**
     * Load contact table for searched name
     * @param name is the name of the contact
     * @return table data
     */
    public static List<Usercontact> LoadSearchedContactTable(String name){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
		
        Query q =  session.getNamedQuery("CONTACT_LoadSearchedContactTable").setString("name",name);
        
        List<Usercontact> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
    }
    
    /**
     * 
     * Add a contact to the database
     * @param uc is a UserContact object
     * @return 
     * 
     */
    public static String addContact(Usercontact uc){   
        
        String status = null;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(uc);
        
        session.getTransaction().commit();
        session.close();
        
        int input = JOptionPane.showOptionDialog(null, "Contact Added succesfully!", "Successfull Message",
                 JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

            if(input == JOptionPane.OK_OPTION || input == JOptionPane.CANCEL_OPTION ){
                status = "true";
            } 
            
            return status;         
    }
    
    /**
     * Update contact details of a specific contact
     * in the database
     * @param u is a UserContact object
     * @return 
     */    
    public static String updateContact(Usercontact u){
        
        String status = null;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.update(u);
        session.getTransaction().commit();
        session.close();
        
        int input = JOptionPane.showOptionDialog(null, "Contact Updated succesfully!", "Successfull Message",
                 JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

            if(input == JOptionPane.OK_OPTION || input == JOptionPane.CANCEL_OPTION ){
                status = "true";
            } 
            
            return status;   
    }
    
    /**
     * Delete contact details of a specific contact
     * in the database
     * @param ID is the ContatcID of a specific contact
     */
    public static void deleteContact(String ID){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query q = session.getNamedQuery("Contact_DeleteContactTable").setString("ID",ID);
        q.executeUpdate();
        
        session.getTransaction().commit();
        session.close();
         
        JOptionPane.showMessageDialog(null, "Contact Deleted succesfully!");
    }
    
    /**
     * Load contact table for searched name like
     * @param name is the name of the contact
     * @return table data
     */
    public static List<Usercontact> SearchContactTable(String name){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
		
        Query q =  session.getNamedQuery("CONTACT_SearchContactTable").setString("name",name+"%");      
        
        List<Usercontact> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
    }
    
    /**
     * Load contact table for searched name like in a specific group
     * @param name is the name of the contact
     * @param group is the Contact Group of the contact
     * @return table data
     */
    public static List<Usercontact> SearchInGroup(String name, String group){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
		
        Query q =  session.getNamedQuery("CONTACT_SearchInGroup").setString("name",name+"%").setString("group", group);    
        
        List<Usercontact> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
    }
    
    /**
     * Load contact table for a specific group
     * @param group is the Contact Group of the contact
     * @return table data
     */
    public static List<Usercontact> SearchContactTableByGroup(String group){	
        
        session = sessionFactory.openSession();
        session.beginTransaction();
		
        Query q =  session.getNamedQuery("CONTACT_SearchContactTableByGroup").setString("group",group);
 
        List<Usercontact> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
    }
  
}
