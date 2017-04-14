/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Inventory;

import java.util.List;
import model.Inventory.Tool;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

/**
 *
 * @author Nipuni
 */
public class ToolDAO {
    static SessionFactory sessionFactory=SetSessionFactory.getSessionFactory();
    static Session session;
    
    /**
     * Add a tool in the database
     * @param tool A Tool Object
     */
     public static void addTool(Tool tool) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
           
            //Insert detail of the tool to the database
            session.save(tool);
            
          session.getTransaction().commit();
          session.close();
        
    }

     /**
     * Update a tool in the database
     * @param tool A Tool Object
     */
          public static void updateTool(Tool tool) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
           
            //Update detail of the tool to the database
            session.update(tool);
            
          session.getTransaction().commit();
          session.close();
        
    }
          
      /**
     * Delete a tool in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
     public static int deleteTool(String itemCode) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
            
            Query query=session.getNamedQuery("INVENTORY_deleteTool").setString("itemCode", itemCode);
            
            //Execute the query which delete the detail of the tool from the database
            int res=query.executeUpdate();
            
          session.getTransaction().commit();
          session.close();
                
                return res;
        
    }
     
    /**
     * Load Selected tool details to the table in settings according to
     * given item code
     * @param itemCode Tool 
     * @return  List of selected tool
     */
    public static List<Tool> searchToolByItemCode(String itemCode) throws HibernateException{
        
          session = sessionFactory.openSession();
          session.beginTransaction();

          Query query = session.getNamedQuery("INVENTORY_searchToolByItemCode").setString("itemCode", itemCode);

          List<Tool> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
          return resultList;
        
    }
    
    /**
     * Load Selected tool details to the table in settings according to
     * given name
     * @param name Tool 
     * @return  List of selected tool
     */
    public static List<Tool> searchToolByName(String name) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchToolByName").setString("name", name);

         List<Tool> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }
    
    /**
     * Load Selected tool details to the table in settings according to given seller
     * @param nameOfSeller Tool 
     * @return  List of selected tool
     */
    public static List<Tool> searchToolByNameOfSeller(String nameOfSeller) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchToolByNameOfSeller").setString("nameOfTheSeller", nameOfSeller);

         List<Tool> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }

/**
     * Load Selected tool details to the table in settings according to
     * given name and location
     * @param name Tool 
     * @param location Tool 
     * @return  List of selected tool
     */
    public static List<Tool> searchToolByNameAndLocation(String name,String location) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchToolByNameAndLocation").setString("name", name).setString("location", location);

         List<Tool> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }
    
/**
     * Load Selected tool details to the table in settings according to
     * given name and location
     * @param name Tool 
     * @param nameOfSeller Tool 
     * @return  List of selected tool
     */
    public static List<Tool> searchToolByNameAndNameOfSeller(String name,String nameOfSeller) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchToolByNameAndNameOfSeller").setString("name", name).setString("nameOfTheSeller", nameOfSeller);

         List<Tool> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }
    
    /**
     * Load Tool details to the table in settings according to requirement
     * @return  tool list
     */
        public static List<Tool>  getToolDetails_1() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getAllToolList_1");
        List<Tool> toolList=query.list();
        
          session.getTransaction().commit();
          session.close();
        
        return toolList;
        
    }

/**
* Load Tool details to the table in settings according to requirement
* @return  tool list
*/
public static List<Tool>  getToolDetails_2() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getAllToolList_2");
        List<Tool> toolList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return toolList;
          }

/**
* Load all Tool names in the database
* @return  book name list
*/
public static List<Tool>  getToolName() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getToolName");
        List<Tool> bookNameList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return bookNameList;
          }

/**
* Load all Location in the database
* @return  location list
*/
public static List<Tool>  getToolLocation() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getToolLocation");
        List<Tool> bookLocationList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return bookLocationList;
}

/**
* Load all sellers in the database
* @return  list of sellers
*/
public static List<Tool>  getToolSellers() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getToolSellers");
        List<Tool> bookLocationList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return bookLocationList;
}
    
}
