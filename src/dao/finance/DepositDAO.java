/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.finance;

import model.finance.Deposit;
import utility.SetSessionFactory;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * DepositDAO -- Control Database access for deposit interface
 * @author Saumya
 */
public class DepositDAO {
    
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
	
    /**
     * Add a deposit to the database
     * @param deposits A deposit Object
     */
    public static void addDeposit(Deposit deposits) {
       
        try{
	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(deposits);
        session.getTransaction().commit();
        session.close();
        //JOptionPane.showMessageDialog(null, "Deposit Data Added succesfully !");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
	
    }
    
    /**
     * Load deposit details to the table 
     * 
     * @return deposit list
     * 
     */
    public static List<Deposit> LoadDepositTable(){
			
        Session session = sessionFactory.openSession();
	session.beginTransaction();
		
	Query q;
		
        q = session.getNamedQuery("DEPOSIT_LoadDepositTable");
              
        List<Deposit> resultList = q.list();
        session.getTransaction().commit();
        session.close();
	return resultList;
    }
    
    /**
     * Load combo box with account numbers
     * @return account numbers list
     */
    public static List<Deposit> LoadcomboList(){
			
        Session session = sessionFactory.openSession();
        session.beginTransaction();
	Query q = session.getNamedQuery("DEPOSIT_loadCombolist");
	List<Deposit> resultList = q.list();
	session.getTransaction().commit();
	session.close();
	return resultList;
		
    }
    
    /**
     * Update a deposit in the database
     * @param d A deposit Object
     */
    public static void updateDeposit(Deposit d) {
		
        Session session = sessionFactory.openSession();
	session.beginTransaction();
    	session.update(d);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Deposit Data Updated succesfully !");	
    }
    
     /**
     * Delete a deposit from the database
     * @param depID A account number
     */
    public static void DeleteDeposit(String depID){
		 
	Session session = sessionFactory.openSession();
        session.beginTransaction();
        Deposit deposit = new Deposit();
        Query q = session.getNamedQuery("DEPOSIT_deleteDeposit").setString("depID",depID);
        q.executeUpdate();
        session.delete(deposit);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Deposit Data Deleted succesfully !");
    }
    
     /**
     * Load deposit table for a specific account no
     * @param depId is account number
     * @return table data
     */    
    public static List<Deposit> LoadSearchedDepositTable(String depId){	
        Query query;
        List<Deposit> resultList;
                
        Session session = sessionFactory.openSession();
        session.beginTransaction();
		
        query =  session.getNamedQuery("DEPOSIT_searchDeposit").setString("depId",depId);
 
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
    }
    
}
