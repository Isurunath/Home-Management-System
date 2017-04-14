/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Technicians | Templates
 * and open the template in the editor.
 */
package dao.Inventory;

import java.util.List;
import model.Inventory.Technician;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

/**
 *
 * @author Nipuni
 */
public class TechnicianDAO {
    
    static SessionFactory sessionFactory=SetSessionFactory.getSessionFactory();
    static Session session;
    
    /**
     * Add technician details to the database
     * @param technician A Technician Object
     */
     public static void addTechnician(Technician technician) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
           
            //Insert detail of the technician to the database
            session.save(technician);
            
          session.getTransaction().commit();
          session.close();
        
    }

     /**
     * Update  technician's details in the database
     * @param technician A Technician Object
     */
          public static void updateTechnician(Technician technician) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
           
            //Update detail of the technician in the database
            session.update(technician);
            
          session.getTransaction().commit();
          session.close();
        
    }
          
      /**
     * Delete a technician from the database
     * @param id
     */
     public static int deleteTechnician(String id) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
            
            Query query=session.getNamedQuery("INVENTORY_deleteTechnician").setString("technicianID", id);
            
            //Execute the query which delete the detail of the technician from the database
            int res=query.executeUpdate();
            
          session.getTransaction().commit();
          session.close();
                
                return res;
        
    }
    
    /**
     * Load Selected technician details to the table in settings according to
     * given name
     * @param name Technician 
     * @return  Details of selected technician
     */
    public static List<Technician> getTechnicianDetailsByName(String name) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_getTechnicianDetails").setString("name", name);

         List<Technician> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }
 
    /**
     * Load Technician details to the table in settings according to
     * requirement
     * @return  technician's details
     */
     public static List<String>  getTechnicianName() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getTechnicianName");
        List<String> technicianList=query.list();
        
          session.getTransaction().commit();
          session.close();
        
        return technicianList;
        
    }
    
}
