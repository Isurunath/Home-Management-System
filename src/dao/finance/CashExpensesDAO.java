/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.finance;

import model.finance.Cashexpenses;
import utility.SetSessionFactory;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *CashExpensesDAO -- Control Database access for cash expense interface
 * @author Saumya
 */
public class CashExpensesDAO {
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
	
     /**
     * Add a cash expense to the database
     * @param cash A cash expense Object
     */
    public static void addCashExpense(Cashexpenses cash) {
       
        try{
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(cash);
            session.getTransaction().commit();
            session.close();
            JOptionPane.showMessageDialog(null, "Expense Details Added succesfully !");
        }
         catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
	
    }
    
    /**
     * Load cash expense details to the table 
     * 
     * @return  cash expense list
     * 
     */
    public static List<Cashexpenses> LoadCashExpenseTable(){
		
		
        Session session = sessionFactory.openSession();
        session.beginTransaction();
		
        Query q;
		
        q = session.getNamedQuery("CASHEXPENSE_LoadExpenseTable");
       
        
        List<Cashexpenses> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }
    
    
     /**
     * Update a cash expense in the database
     * @param ce A cash expense Object
     */
    public static void updateCashExpense(Cashexpenses ce) {
		
        Session session = sessionFactory.openSession();
	session.beginTransaction();
    	session.update(ce);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Cash Expense Deatails Updated succesfully !");	
    }
    
    /**
     * Delete a cash expense from the database
     * @param CashID A cash ID
     */
    public static void DeleteCashExpense(String CashID){
		 
	Session session = sessionFactory.openSession();
        session.beginTransaction();
        Cashexpenses ce = new Cashexpenses();
        Query q = session.getNamedQuery("CASHEXPENSE_deleteExpense").setString("CashID",CashID);
        q.executeUpdate();
        session.delete(ce);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Cash Expense Deatails Deleted succesfully !");
    }
    
    /**
     * Load cash expense table for a specific bill no
     * @param date is the date that cash expense happened
     * @return table data
     */    
    public static List<Cashexpenses> LoadSearchedCashExpensesTable(Date date){	
        Query query;
        List<Cashexpenses> resultList;
                
        Session session = sessionFactory.openSession();
        session.beginTransaction();
		
        query =  session.getNamedQuery("CASHEXPENSE_searchExpense").setDate("date",date);
 
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
    }
}
