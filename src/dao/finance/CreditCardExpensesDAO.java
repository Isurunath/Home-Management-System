/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.finance;

import model.finance.Creditcardexpenses;
import utility.SetSessionFactory;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 * CreditCardExpensesDAO -- Control Database access for credit card expense interface
 * @author Saumya
 */
public class CreditCardExpensesDAO {
    
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
	
    /**
     * Add a credit card expense to the database
     * @param credit A credit card expense Object
     */
    public static void addCreditCardExpense(Creditcardexpenses credit) {
       
        try{
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(credit);
            session.getTransaction().commit();
            session.close();     
            //JOptionPane.showMessageDialog(null, "Expense Details Added succesfully !");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
	
    }
    
     /**
     * Load credit card expense details to the table 
     * 
     * @return  credit card expense list
     * 
     */
    public static List<Creditcardexpenses> LoadCreditCardExpenseTable(){
		
		
        Session session = sessionFactory.openSession();
	session.beginTransaction();
		
	Query q;
		
        q = session.getNamedQuery("CREDITCARDEXPENSE_LoadExpenseTable");
       
        
        List<Creditcardexpenses> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }
    
     /**
     * Load combo box with credit card numbers
     * @return credit card numbers list
     */
    public static List<Creditcardexpenses> LoadcomboList(){
			
                Session session = sessionFactory.openSession();
		session.beginTransaction();
	        Query q = session.getNamedQuery("CREDITCARDEXPENSE_loadCombolist");
	        List<Creditcardexpenses> resultList = q.list();
	        session.getTransaction().commit();
	        session.close();
	        return resultList;
		
	
	}
    
    /**
     * Update a credit card expense in the database
     * @param cce A credit card expense Object
     */
    public static void updateCreditCardExpense(Creditcardexpenses cce) {
		
        Session session = sessionFactory.openSession();
	session.beginTransaction();
    	session.update(cce);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Credit Card Expenses Updated succesfully !");	
    }
    
    
    /**
     * Delete a credit card expense from the database
     * @param CreditID A credit card ID
     */
    public static void DeleteCreditCardExpense(String CreditID){
		 
	Session session = sessionFactory.openSession();
        session.beginTransaction();
        Creditcardexpenses credit = new Creditcardexpenses();
        Query q = session.getNamedQuery("CREDITCARDEXPENSE_deleteExpense").setString("CreditID",CreditID);
        q.executeUpdate();
        session.delete(credit);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Credit Card Expenses Deleted succesfully !");
    }
    
    /**
     * Load credit card expense table for a specific card no
     * @param CreditId is credit card number
     * @return table data
     */        
    public static List<Creditcardexpenses> LoadSearchedCreditCardExpensesTable(String CreditId){	
        Query query;
        List<Creditcardexpenses> resultList;
                
        Session session = sessionFactory.openSession();
        session.beginTransaction();
		
        query =  session.getNamedQuery("CREDITCARDEXPENSE_searchExpense").setString("CreditId",CreditId);
 
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
    }
    
    
}
