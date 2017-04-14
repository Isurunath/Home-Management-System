/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.finance;

import model.finance.Bills;
import utility.SetSessionFactory;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * BillDAO -- Control Database access for bill interface
 * @author Saumya
 */
public class BillDAO {
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
    static Session session;
    
    
    /**
     * Add a bill to the database
     * @param bills A Bill Object
     */
    public static void addBill(Bills bills) {
       
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(bills);
            session.getTransaction().commit();
            session.close();
            JOptionPane.showMessageDialog(null, "Bills Added succesfully !");
        }
        catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
	
    }
    
    /**
     * Load bill details to the table 
     * 
     * @return  bill list
     * 
     */
    public static List<Bills> LoadBillTable(){
	 Query q;
         
        session = sessionFactory.openSession();
        session.beginTransaction();
        q = session.getNamedQuery("BILLS_LoadBillsTable");
              
        List<Bills> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
	}
    
     /**
     * Load combo box with bill numbers
     * @return bill numbers list
     */
    public static List<Bills> LoadcomboList(){
			
        session = sessionFactory.openSession();
	session.beginTransaction();
        
	Query q = session.getNamedQuery("BILLS_loadCombolist");
        
	List<Bills> resultList = q.list();
	session.getTransaction().commit();
	session.close();
	return resultList;
    }
    
    /**
     * Update a bill in the database
     * @param b A bill Object
     */
    public static void updateBill(Bills b) {
		
        session = sessionFactory.openSession();
	session.beginTransaction();
    	session.update(b);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Bill Details Updated succesfully !");	
    }
    
    /**
     * Delete a account from the database
     * @param billNo A bill number
     */
    public static void DeleteBill(String BillNo){
		 
	session = sessionFactory.openSession();
        session.beginTransaction();
        Bills bill = new Bills();
        
        Query q = session.getNamedQuery("BILLS_deleteBlls").setString("BillNo",BillNo);
        q.executeUpdate();
        session.delete(bill);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Bill Details Deleted succesfully !");
    }
     
    /**
     * Load bill table for a specific bill no
     * @param billNo is the bill no
     * @return table data
     */
    public static List<Bills> LoadSearchedBillsTable(String billNo){	
        Query query;
        List<Bills> resultList;
                
        session = sessionFactory.openSession();
        session.beginTransaction();
		
        query =  session.getNamedQuery("BILLS_searchBills").setString("billNo",billNo);
 
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
    }
    
    /**
     * Count bill number
     * @param Billid is the bill no
     * @return count of bill number
     */
    public static Long CountBillNo(String Billid) {
		
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query q = session.getNamedQuery("BILLS_countBillNo").setString("Billid",Billid);
        
        Long count = (Long)q.uniqueResult();
       
        session.getTransaction().commit();
        session.close();
        
        return count;
       	
    }
    
    /**
     * Load notifications
     *
     * @return notification list
     */
    public static List<Bills> loadBillNotification(){
        
        Query query;
        List<Bills> resultList;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query = session.getNamedQuery("bill_notification");
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
        
    }
}
