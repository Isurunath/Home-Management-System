/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.finance;


import model.finance.Incomedetails;
import utility.SetSessionFactory;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * IncomeDAO -- Control Database access for income interface
 * @author Saumya
 */
public class IncomeDAO {
    
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
	
    /**
     * Add a income to the database
     * @param income A income Object
     */
    public static void addIncome(Incomedetails income) {
       
        try{
	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(income);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "income Details Added succesfully !");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
	
    }
    
    /**
     * Load income details to the table 
     * 
     * @return  income list
     * 
     */
    public static List<Incomedetails> LoadIncomeTable(){
			
        Session session = sessionFactory.openSession();
	session.beginTransaction();
		
        Query q;
		
        q = session.getNamedQuery("INCOME_LoadIncomeTable");
               
        List<Incomedetails> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }
    
    /**
     * Load combo box with income source
     * @return income source list
     */
    public static List<Incomedetails> LoadcomboList(){
			
                Session session = sessionFactory.openSession();
		session.beginTransaction();
	        Query q = session.getNamedQuery("INCOME_loadCombolist");
	        List<Incomedetails> resultList = q.list();
	        session.getTransaction().commit();
	        session.close();
	        return resultList;
		
	
	}
    
    /**
     * Update a income in the database
     * @param i A income Object
     */
    public static void updateIncome(Incomedetails i) {
		
        Session session = sessionFactory.openSession();
	session.beginTransaction();
    	session.update(i);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Income Details Updated succesfully !");	
	}
    
     /**
     * Delete a income from the database
     * @param Iid A income ID
     */
    public static void DeleteIncome(String Iid){
		 
	Session session = sessionFactory.openSession();
        session.beginTransaction();
        Incomedetails income = new Incomedetails();
        Query q = session.getNamedQuery("INCOME_deleteIncome").setString("Iid",Iid);
        q.executeUpdate();
        session.delete(income);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Income Details Deleted succesfully !");
	 }
    
     /**
     * Load income table for a specific income source
     * @param iID is income ID number
     * @return table data
     */    
    public static List<Incomedetails> LoadSearchedIncomeTable(String iID){	
        Query query;
        List<Incomedetails> resultList;
                
        Session session = sessionFactory.openSession();
        session.beginTransaction();
		
        query =  session.getNamedQuery("INCOME_searchIncome").setString("iID",iID);
 
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
    }
}
