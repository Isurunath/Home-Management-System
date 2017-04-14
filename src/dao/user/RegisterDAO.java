/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.user;

import java.util.List;
import javax.swing.JOptionPane;
import model.user.Userregister;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

/**
 *
 * @author Nimanthika
 */
public class RegisterDAO {
    
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
    static Session session;
    
     /**
     * 
     * Add a user to the database using Register interface
     * @param user is a UserContact object
     * @return 
     * 
     */
    public static String addUser(Userregister user){   
        
        String status = null;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);

        int input = JOptionPane.showOptionDialog(null, "Successfully registered! Use your username &"
                + " password for login", "Successfull Message", JOptionPane.OK_CANCEL_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, null, null, null);

            if(input == JOptionPane.OK_OPTION || input == JOptionPane.CANCEL_OPTION ){
                status = "true";
            } 
        
        session.getTransaction().commit();
        session.close();

        return status;         
    }
    
    
    /**
     * 
     * Count username from database
     * @param username is the username of a specific user
     * @return 
     */
    public static Long countUsername(String username){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query q = session.getNamedQuery("USER_LoginCheckUsername").setString("username",username);
        
        Long count = (Long)q.uniqueResult();
           
        session.getTransaction().commit();
        session.close();
         
        return count;
    }
    
    
    /**
     * 
     * Get registered list from database
     * @param username is the username of a specific user
     * @return 
     */
    public static List<Userregister> GetRegisterList(String username){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query q = session.getNamedQuery("USER_Login").setString("username",username);
        
        List<Userregister> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
    }

    /**
     * Update register details of a specific user
     * in the database
     * @param user is a UserRegister object
     * @return 
     */    
    public static String updatePassword(Userregister user){
        
        String status = null;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.update(user);
        session.getTransaction().commit();
        session.close();
        
        int input = JOptionPane.showOptionDialog(null, "Succesfully reset your new password!",
                "Successfull Message", JOptionPane.OK_CANCEL_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, null, null, null);

            if(input == JOptionPane.OK_OPTION || input == JOptionPane.CANCEL_OPTION ){
                status = "true";
            } 
            
            return status;      
    }
    
}