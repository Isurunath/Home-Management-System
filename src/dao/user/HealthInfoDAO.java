/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.user;

import java.util.List;
import javax.swing.JOptionPane;
import model.user.Userhealthinfo;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

/**
 *
 * @author Nimanthika
 */
public class HealthInfoDAO {
  
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
    static Session session;
    
    /**
     * 
     * Add a new Health info to the database
     * @param healthInfo
     * @return 
     * 
     */
    public static String addHealthInfo(Userhealthinfo healthInfo){   
        
        String status = null;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(healthInfo);
        
        session.getTransaction().commit();
        session.close();
        
        int input = JOptionPane.showOptionDialog(null, "Health infomation Added succesfully!", "Successfull Message",
                 JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

            if(input == JOptionPane.OK_OPTION || input == JOptionPane.CANCEL_OPTION ){
                status = "true";
            } 
            
            return status;  
    }
    

    /**
     * Update appointment details of a specific member
     * in the database 
     * @param healthInfo
     * @return 
     */    
    public static String updateHealthInfo(Userhealthinfo healthInfo){
        
        String status = null;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.update(healthInfo);
        session.getTransaction().commit();
        session.close();
        
        int input = JOptionPane.showOptionDialog(null, "Health infomation Updated succesfully!", "Successfull Message",
                 JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

            if(input == JOptionPane.OK_OPTION || input == JOptionPane.CANCEL_OPTION ){
                status = "true";
            } 
            
            return status;   
    }
    
    
        
    /**
     * Delete health info details
     * in the database
     * @param ID is the memberID of a specific appointment
     */
    public static void deleteHealthInfo(String ID){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query q = session.getNamedQuery("USER_DeleteHealthInfoTable").setString("ID",ID);
        q.executeUpdate();
        
        session.getTransaction().commit();
        session.close();
         
        JOptionPane.showMessageDialog(null, "Health infomation Deleted succesfully!");
    }
    
    
    /**
     * Load HealthInfo table
     * @return table data
     */
    public static List<Userhealthinfo> LoadHealthInfoTable(){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
		
        Query q = session.getNamedQuery("USER_LoadHealthInfoTable");
          
        List<Userhealthinfo> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;	
    }
    
    /**
     * Count member name in database
     * @param memberName
     * @return table data
     */
        public static Long countMemberName(String memberName){
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query q = session.getNamedQuery("USER_CountMembername").setString("memberName",memberName);
        
        Long count = (Long)q.uniqueResult();
           
        session.getTransaction().commit();
        session.close();
         
        return count;
    }
}
