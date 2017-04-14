/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.finance;

import model.finance.Creditcards;
import utility.SetSessionFactory;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * CreditCardsDAO -- Control Database access for credit card payment interface
 * @author Saumya
 */
public class CreditCardsDAO {
    
     static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
	
    /**
     * Add a credit card to the database
     * @param credit A credit card Object
     */
    public static void addCreditCards(Creditcards credit) {
       
        try{
	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(credit);
        session.getTransaction().commit();
        session.close();   
        JOptionPane.showMessageDialog(null, "Credit Card Added succesfully !");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
	
    }
    
    /**
     * Load credit card details to the table 
     * 
     * @return  credit card list
     * 
     */
    public static List<Creditcards> LoadCreditCardTable(){
		
        Session session = sessionFactory.openSession();
        session.beginTransaction();
		
	Query q;
		
        q = session.getNamedQuery("CREDITCARDS_LoadCreditCardsTable");
       
        
        List<Creditcards> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }
    
    /**
     * Load combo box with credit card numbers
     * @return credit card numbers list
     */
    public static List<Creditcards> LoadcomboList(){
			
        Session session = sessionFactory.openSession();
	session.beginTransaction();
	Query q = session.getNamedQuery("CREDITCARDS_loadCombolist");
	List<Creditcards> resultList = q.list();
	session.getTransaction().commit();
	session.close();
	return resultList;
		
	
    }
    
    /**
     * Update a credit card in the database
     * @param ccp A credit card Object
     */
    public static void updateCreditCards(Creditcards cc) {
		
        Session session = sessionFactory.openSession();
	session.beginTransaction();
    	session.update(cc);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Credit Card Details Updated succesfully !");	
    }
    
    /**
     * Count credit card number
     * @param Cardid is the credit card no
     * @return count of credit card number
     */
    public static Long CountCardNo(String Cardid) {
		
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query q = session.getNamedQuery("CREDITCARDS_countCardNo").setString("Cardid",Cardid);
        
        Long count = (Long)q.uniqueResult();
       
        session.getTransaction().commit();
        session.close();
        
        return count;
       	
    }
    
    /**
     * List credit card details for given card number
     * @param Cardid is the card number
     * @return list of card details
     */
    public static List<Creditcards> LoadCardNo(String Cardid) {
		
        Session session = sessionFactory.openSession();
        session.beginTransaction();
      
        Query q = session.getNamedQuery("CREDITCARDS_loadCardNo").setString("Cardid",Cardid);
        
        List<Creditcards> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
       	
    }
    
     /**
     * Delete a credit card from the database
     * @param CardID A credit card number
     */
    public static void DeleteCreditCards(String CardID){
		 
	Session session = sessionFactory.openSession();
        session.beginTransaction();
        Creditcards credit = new Creditcards();
        
        Query q = session.getNamedQuery("CREDITCARDS_deleteCreditcard").setString("CardID",CardID);
        
        q.executeUpdate();
        session.delete(credit);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Credit Card Details Deleted succesfully !");
    }
    
     /**
     * Load credit card table for a specific card no
     * @param CardId is Card number
     * @return table data
     */        
    public static List<Creditcards> LoadSearchedCreditCardsTable(String CardId){	
        Query query;
        List<Creditcards> resultList;
                
        Session session = sessionFactory.openSession();
        session.beginTransaction();
		
        query =  session.getNamedQuery("CREDITCARDS_searchCreditcard").setString("CardId",CardId);
 
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
    }
      
    
}
