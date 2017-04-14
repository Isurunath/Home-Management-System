/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.user;

import java.util.List;
import javax.swing.JOptionPane;
import model.user.Userdoctorapp;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

/**
 *
 * @author Nimanthika
 */
public class DoctorAppointmentDAO {
    
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
    static Session session;
    
    /**
     * 
     * Add a new Appointment to the database
     * @param appointment is a UserDoctorAppointment object
     * @return 
     * 
     */
    public static String addAppointment(Userdoctorapp appointment){   
        
        String status = null;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(appointment);
        
        session.getTransaction().commit();
        session.close();
        
        int input = JOptionPane.showOptionDialog(null, "Appointment Added succesfully!", "Successfull Message",
                 JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

            if(input == JOptionPane.OK_OPTION || input == JOptionPane.CANCEL_OPTION ){
                status = "true";
            } 
            
            return status;  
    }
    
    
     /**
     * Update appointment details
     * in the database
     * @param appointment 
     * @return 
     */    
    public static String updateAppointment(Userdoctorapp appointment){
        
        String status = null;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.update(appointment);
        session.getTransaction().commit();
        session.close();
        
        int input = JOptionPane.showOptionDialog(null, "Appointment Updated succesfully!", "Successfull Message",
                 JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

            if(input == JOptionPane.OK_OPTION || input == JOptionPane.CANCEL_OPTION ){
                status = "true";
            } 
            
            return status;   
    }
    
    
    /**
     * Delete appointment details
     * in the database
     * @param ID is the appID of a specific appointment
     */
    public static void deleteAppointment(String ID){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query q = session.getNamedQuery("USER_DeleteDocAppointmentTable").setString("ID",ID);
        q.executeUpdate();
        
        session.getTransaction().commit();
        session.close();
         
        JOptionPane.showMessageDialog(null, "Appointment Deleted succesfully!");
    }
    
    
    /**
     * Load Appointment table
     * @return table data
     */
    public static List<Userdoctorapp> LoadAppointmentTable(){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
		
        Query q = session.getNamedQuery("USER_LoadDocAppointmentTable");
          
        List<Userdoctorapp> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;	
    }
    
    
    /**
     * 
     * Load Appointment notification
     * @return
     */
    public static List<Userdoctorapp> GetAppNotifications(){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query = session.getNamedQuery("USER_LoadTodayAppointments");
              
        List<Userdoctorapp> resultList = query.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
    }
    
}
