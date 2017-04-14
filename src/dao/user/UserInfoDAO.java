/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.user;

import java.util.List;
import javax.swing.JOptionPane;
import model.user.Userinfo;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

/**
 *
 * @author Nimanthika
 */
public class UserInfoDAO {
    
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
    static Session session;
    
    /**
     * 
     * Add user details to the database
     * @param user is a User info object
     * @return 
     * 
     */
    public static String addUserInfo(Userinfo user){   
        
        String status = null;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        
        session.getTransaction().commit();
        session.close();
        
        int input = JOptionPane.showOptionDialog(null, "Your details added succesfully!", "Successfull Message",
                 JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

            if(input == JOptionPane.OK_OPTION || input == JOptionPane.CANCEL_OPTION ){
                status = "true";
            } 
            
            return status;  
    }
    
    
    /**
     * Update user details
     * in the database 
     * @param user
     * @return 
     */    
    public static String updateUserInfo(Userinfo user){
        
        String status = null;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.update(user);
        session.getTransaction().commit();
        session.close();
        
        int input = JOptionPane.showOptionDialog(null, "Your details Updated succesfully!", "Successfull Message",
                 JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

            if(input == JOptionPane.OK_OPTION || input == JOptionPane.CANCEL_OPTION ){
                status = "true";
            } 
            
            return status;   
    }
    
    
     /**
     * Count username in the database 
     * @param username
     * @return 
     */
    public static Long countUsername(String username){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query q = session.getNamedQuery("USER_CountUsername").setString("username",username);
        
        Long count = (Long)q.uniqueResult();
           
        session.getTransaction().commit();
        session.close();
         
        return count;
    }
    
    
    /**
     * Load HealthInfo table
     * @param username
     * @return
     */
    public static List<Userinfo> LoadUserInfo(String username){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
		
        Query q = session.getNamedQuery("USER_LoadUserInfo").setString("username",username);
          
        List<Userinfo> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;	
    }
    
}
