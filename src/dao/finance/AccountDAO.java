/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.finance;

import model.finance.Account;
import utility.SetSessionFactory;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 * AccountDAO -- Control Database access for account interface
 * @author Saumya
 */
public class AccountDAO {
    
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
    static Session session;
    
    
    /**
     * Add a account to the database
     * @param accounts A Account Object
     */
    public static void addAccount(Account accounts) {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(accounts);
            session.getTransaction().commit();
            session.close();   
            JOptionPane.showMessageDialog(null, "Account Added succesfully !");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
	
    }
     
    /**
     * Load account details to the table 
     * 
     * @return  account list
     * 
     */
    public static List<Account> LoadAccountTable(){
	Query query;
        List<Account> resultList;
        
        session = sessionFactory.openSession();
        session.beginTransaction();  
        
        query = session.getNamedQuery("ACCOUNT_LoadAccountTable");             
        resultList = query.list();
        
        session.getTransaction().commit();
        session.close();
        return resultList;
    }
    
     /**
     * Load combo box with account numbers
     * @return account numbers
     */
    public static List<Account> LoadcomboList(){
	Query query;
        List<Account> resultList;
       
        session = sessionFactory.openSession();
	session.beginTransaction();
        
	query = session.getNamedQuery("ACCOUNT_loadCombolist");
	resultList = query.list();
        
	session.getTransaction().commit();
	session.close();
	return resultList;
    }
    
    /**
     * Update a account in the database
     * @param a A Account Object
     */
    public static void updateAccount(Account a) {
		
        session = sessionFactory.openSession();
	session.beginTransaction();
    	session.update(a);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Account Updated succesfully !");	
    }
    
    /**
     * Delete a account from the database
     * @param aNo A Account number
     */
    public static void DeleteAccount(String aNo){
	Query query;	 
        
	session = sessionFactory.openSession();
        session.beginTransaction();
        
        Account account = new Account();
        query = session.getNamedQuery("ACCOUNT_deleteAccount").setString("aNo",aNo);
        query.executeUpdate();
        
        session.delete(account);
        session.getTransaction().commit();
        session.close();
        
        JOptionPane.showMessageDialog(null, "Account Deleted succesfully !");
    }
            
    /**
     * Load account table for a specific account no
     * @param searchAccount is the account no
     * @return table data
     */
    public static List<Account> LoadSearchedAccountTable(String searchAccount){	
        Query query;
        List<Account> resultList;
                
        session = sessionFactory.openSession();
        session.beginTransaction();
		
        query =  session.getNamedQuery("ACCOUNT_searchAccount").setString("searchAccount",searchAccount);
 
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
    }
    
     /**
     * Count account number
     * @param Accid is the account no
     * @return count of account number
     */
    public static Long CountAccountNo(String Accid) {
		
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query q = session.getNamedQuery("ACCOUNT_countAccountNo").setString("Accid",Accid);
        
        Long count = (Long)q.uniqueResult();
       
        session.getTransaction().commit();
        session.close();
        
        return count;
       	
    }
    
    /**
     * List account details for given account number
     * @param Accid is the account no
     * @return list of account details
     */
    public static List<Account> LoadAccountNo(String Accid) {
		
        Session session = sessionFactory.openSession();
        session.beginTransaction();
      
        Query q = session.getNamedQuery("ACCOUNT_loadAccountNo").setString("Accid",Accid);
        
        List<Account> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
       	
    }
}
