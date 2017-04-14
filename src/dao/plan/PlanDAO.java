/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.plan;

import model.plan.Homeplan;
import java.util.List;
import javax.swing.JOptionPane;
import model.event.EventPlan;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

/**
 * PlanDAO -- Control Database access for main Plan interface
 * @author Isurunath
 */
public class PlanDAO {
    
    
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
    static Session session;
    
    public static void addPlan(Homeplan plan) {
	session = sessionFactory.openSession();
    	session.beginTransaction();
     	session.save(plan);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Home Details Added succesfully !");
    }
    
    /**
     * Update specific plan details in database
     * and display success message
     * @param [plan A EventPlan Object
     */
    public static void updatePlan(Homeplan plan) {
	session = sessionFactory.openSession();
    	session.beginTransaction();
     	session.update(plan);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Home Details updated succesfully !");
    }
    
    public static List<Homeplan> loadPlan(){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = null ;
        
        query = session.getNamedQuery("load_plan");
        List<Homeplan> resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
        
    }
    
}
