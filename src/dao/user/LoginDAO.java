/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.user;

import static dao.user.UserContactDAO.session;
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
public class LoginDAO {
    
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
    static Session session;
    
    /**
     * 
     * Load password from database
     * @param username is the username of a specific user
     */
    public static List<Userregister> LoadPassword(String username){
                
        session = sessionFactory.openSession();
        session.beginTransaction();
		
        Query q =  session.getNamedQuery("USER_Login").setString("username",username);
 
        List<Userregister> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
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
}
