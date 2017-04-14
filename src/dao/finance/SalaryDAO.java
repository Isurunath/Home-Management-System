/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.finance;

import model.finance.Salary;
import utility.SetSessionFactory;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * SalaryDAO -- Control Database access for salary interface
 * @author Saumya
 */
public class SalaryDAO {
    
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
    static Session session;
    
    /**
     * Add a salary to the database
     * @param salary A salary Object
     */
    public static void addSalary(Salary salary) {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(salary);
            session.getTransaction().commit();
            session.close();    
            JOptionPane.showMessageDialog(null, "Salary Added succesfully !");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
	
    }
    
    /**
     * Load salary details to the table 
     * 
     * @return salary list
     * 
     */
    public static List<Salary> LoadSalaryTable(){
	Query query;
        List<Salary> resultList;
        
        session = sessionFactory.openSession();
        session.beginTransaction();  
        
        query = session.getNamedQuery("SALARY_LoadSalaryTable");             
        resultList = query.list();
        
        session.getTransaction().commit();
        session.close();
        return resultList;
    }
    
    /**
     * Update a salary in the database
     * @param s A salary Object
     */   
    public static void updateSalary(Salary s) {
		
        session = sessionFactory.openSession();
	session.beginTransaction();
    	session.update(s);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Salary Updated succesfully !");	
    }
    
     /**
     * Delete a salary from the database
     * @param sal A credit salary ID
     */
    public static void DeleteSalary(String sal){
	Query query;	 
        
	session = sessionFactory.openSession();
        session.beginTransaction();
        
        Salary salary = new Salary();
        query = session.getNamedQuery("SALARY_deleteSalary").setString("sal",sal);
        query.executeUpdate();
        
        session.delete(salary);
        session.getTransaction().commit();
        session.close();
        
        JOptionPane.showMessageDialog(null, "Salary Deleted succesfully !");
    }
            
    /**
     * Load salary table for a specific group
     * @param searchSalary is the salary Group of the salary
     * @return table data
     */
    public static List<Salary> LoadSearchedSalaryTable(String searchSalary){	
        Query query;
        List<Salary> resultList;
                
        session = sessionFactory.openSession();
        session.beginTransaction();
		
        query =  session.getNamedQuery("SALARY_searchSalary").setString("searchSalary",searchSalary);
 
        resultList = query.list();
        session.getTransaction().commit();
        session.close();
        
        return resultList;
    }
    
}
