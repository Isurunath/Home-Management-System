/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.user;

import java.util.List;
import javax.swing.JOptionPane;
import model.user.Uservehicle;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

/**
 *
 * @author Nimanthika
 */
public class UserVehicleDAO {
    
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
    static Session session;
    
    
    /**
     * 
     * Add a new Vehicle Service detail to the database
     * @param vehicleService is a User vehicle object
     * @return 
     * 
     */
    public static String addVehicleService(Uservehicle vehicleService){   
        
        String status = null;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(vehicleService);
        
        session.getTransaction().commit();
        session.close();
        
        int input = JOptionPane.showOptionDialog(null, "Service Details Added succesfully!", "Successfull Message",
                 JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

        if(input == JOptionPane.OK_OPTION || input == JOptionPane.CANCEL_OPTION ){
            status = "true";
        } 

        return status;  
    }
    
    
    /**
     * Update Vehicle Service details
     * in the database
     * @param vehicleService
     * @return 
     */    
    public static String updateVehicleService(Uservehicle vehicleService){
        
        String status = null;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.update(vehicleService);
        session.getTransaction().commit();
        session.close();
        
        int input = JOptionPane.showOptionDialog(null, "Vehicle Service Updated succesfully!", "Successfull Message",
                 JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

            if(input == JOptionPane.OK_OPTION || input == JOptionPane.CANCEL_OPTION ){
                status = "true";
            } 
            
            return status;   
    }
    
    
    /**
     * Delete Vehicle Service details
     * in the database
     * @param ID is the serviceID of a specific Vehicle Service
     */
    public static void deleteVehicleService(String ID){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query q = session.getNamedQuery("USER_DeleteVehicleServiceTable").setString("ID",ID);
        q.executeUpdate();
        
        session.getTransaction().commit();
        session.close();
         
        JOptionPane.showMessageDialog(null, "Vehicle Service Deleted succesfully!");
    }
    
    
    /**
     * Load VehicleService table
     * @return table data
     */
    public static List<Uservehicle> LoadVehicleServiceTable(){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
		
        Query q = session.getNamedQuery("USER_LoadVehicleServiceTable");
          
        List<Uservehicle> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;	
    }
    
}
