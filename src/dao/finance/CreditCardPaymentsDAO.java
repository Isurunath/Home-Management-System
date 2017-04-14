/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.finance;

import model.finance.Creditcardpayments;
import utility.SetSessionFactory;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * CreditCardPaymentsDAO -- Control Database access for credit card payment interface
 * @author Saumya
 */
public class CreditCardPaymentsDAO {
    
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
	
    /**
     * Add a credit card payment to the database
     * @param credit A credit card payment Object
     */
    public static void addCreditCardPayment(Creditcardpayments credit) {
       
        try{
	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(credit);
        session.getTransaction().commit();
        session.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
	
    }
    
    /**
     * Load credit card payment details to the table 
     * 
     * @return  credit card payment list
     * 
     */
    public static List<Creditcardpayments> LoadCreditCardPaymentTable(){
		
        Session session = sessionFactory.openSession();
	session.beginTransaction();
		
	Query q;
		
        q = session.getNamedQuery("CREDITCARDPAYMENT_LoadPaymentTable");
       
        
        List<Creditcardpayments> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }
    
     /**
     * Load combo box with credit card numbers
     * @return credit card numbers list
     */
    public static List<Creditcardpayments> LoadcomboList(){
			
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
	Query q = session.getNamedQuery("CREDITCARDPAYMENT_loadCombolist");
        
	List<Creditcardpayments> resultList = q.list();
	session.getTransaction().commit();
	session.close();
	return resultList;
		
    }
    
     /**
     * Update a credit card payment in the database
     * @param ccp A credit card payment Object
     */
    public static void updateCreditCardPayment(Creditcardpayments ccp) {
		
        Session session = sessionFactory.openSession();
	session.beginTransaction();
    	session.update(ccp);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Credit Card Payments Updated succesfully !");	
    }
    
    /**
     * Delete a credit card payment from the database
     * @param PaymentID A credit card payment ID
     */
    public static void DeleteCreditCardPayment(String PaymentID){
		 
	Session session = sessionFactory.openSession();
        session.beginTransaction();
        Creditcardpayments credit = new Creditcardpayments();
        
        Query q = session.getNamedQuery("CREDITCARDPAYMENT_deletePayment").setString("PaymentID",PaymentID);
        
        q.executeUpdate();
        session.delete(credit);
        session.getTransaction().commit();
        session.close();
        
        JOptionPane.showMessageDialog(null, "Credit Card Payments Deleted succesfully !");
    }
            
    /**
     * Load credit card payment table for a specific card no
     * @param PaymentId is payment ID number
     * @return table data
     */      
    public static List<Creditcardpayments> LoadSearchedCreditCardPaymentTable(String PaymentId){	
        Query query;
        List<Creditcardpayments> resultList;
                
        Session session = sessionFactory.openSession();
        session.beginTransaction();
		
        query =  session.getNamedQuery("CREDITCARDPAYMENT_searchPayment").setString("PaymentId",PaymentId);
 
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
    }
    
    /**
     * List credit card payment details for given card number
     * @param CardID is the card number
     * @return list of card details
     */
    public static List<Creditcardpayments> LoadCardPayment(String CardID) {
		
        Session session = sessionFactory.openSession();
        session.beginTransaction();
      
        Query q = session.getNamedQuery("CREDITCARDPAYMENT_loadCardPayment").setString("CardID",CardID);
        
        List<Creditcardpayments> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
       	
    }
}
