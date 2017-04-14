/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.event;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import model.event.Eventcontact;
import utility.SetSessionFactory;

/**
 * EventContactDAO -- Control Database access for Event Contact interface
 * @author Isurunath
 */
public class EventContactDAO {
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
    static Session session;

    /**
     * Load combo box with contact groups
     * @return contact groups
     */
    public static List<Eventcontact> LoadcomboList(){
        Query query;
        List<Eventcontact> resultList;
        
        session = sessionFactory.openSession();
        session = sessionFactory.openSession();
        session.beginTransaction();
        query = session.getNamedQuery("EVENT_Contact_loadCombolist");
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }

    /**
     * Load names to the table according to
     * selected contact group
     * @param catagory contact group 
     * @return  contact list
     */
    public static List<Eventcontact> LoadItemTable(String catagory){
        Query query;
        List<Eventcontact> resultList;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        //If catagory equals All Catagories
        if(catagory.equals("All catagories")){
            query = session.getNamedQuery("EVENT_Contact_LoadItemTable_1");
        }
        //If catagory is not equals for All Catagories
        else{
            query = session.getNamedQuery("EVENT_Contact_LoadItemTable_2").setString("catagory",catagory);
        }   

        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }
}