/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.finance;

import model.finance.Withdrawal;
import utility.SetSessionFactory;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * WithdrawDAO -- Control Database access for withdraw interface
 * @author Saumya
 */
public class WithdrawDAO {
    
     static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
	
    /**
     * Add a withdraw to the database
     * @param withdraw A withdraw Object
     */
    public static void addWithdraw(Withdrawal withdraw) {
       
        try{
	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(withdraw);
        session.getTransaction().commit();
        session.close();
       // JOptionPane.showMessageDialog(null, "Withdrawal Added succesfully !");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
	
    }
    
    /**
     * Load withdraw details to the table 
     * 
     * @return withdraw list
     * 
     */
    public static List<Withdrawal> LoadWithdrawTable(){
				
        Session session = sessionFactory.openSession();
	session.beginTransaction();
		
	Query q;
		
        q = session.getNamedQuery("WITHDRAW_LoadWithdrawTable");
               
        List<Withdrawal> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }
    
    /**
     * Load combo box with account numbers
     * @return account numbers list
     */
    public static List<Withdrawal> LoadcomboList(){
			
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query q = session.getNamedQuery("WITHDRAW_loadCombolist");
	List<Withdrawal> resultList = q.list();
	session.getTransaction().commit();
	session.close();
	return resultList;
		
    }
    
    /**
     * Update a withdraw in the database
     * @param w A withdraw Object
     */
    public static void updateWithdraw(Withdrawal w) {
		
        Session session = sessionFactory.openSession();
	session.beginTransaction();
    	session.update(w);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Withdrawal Details Updated succesfully !");	
    }
    
     /**
     * Delete a withdraw from the database
     * @param witID A account number
     */
    public static void DeleteWithdraw(String witID){
		 
	Session session = sessionFactory.openSession();
        session.beginTransaction();
        Withdrawal withdraw = new Withdrawal();
        Query q = session.getNamedQuery("WITHDRAW_deleteWithdraw").setString("witID",witID);
        q.executeUpdate();
        session.delete(withdraw);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Withdrawal Details Deleted succesfully !");
    }
    
     /**
     * Load withdraw table for a specific account no
     * @param WitId is account number
     * @return table data
     */    
    public static List<Withdrawal> LoadSearchedWithdrawTable(String WitId){	
        Query query;
        List<Withdrawal> resultList;
                
        Session session = sessionFactory.openSession();
        session.beginTransaction();
		
        query =  session.getNamedQuery("WITHDRAW_searchWithdraw").setString("WitId",WitId);
 
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
    }
    
}
