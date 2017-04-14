/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Inventory;

import java.util.List;
import model.Inventory.Otheritem;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

/**
 *
 * @author Nipuni
 */
public class OtherItemDAO {
    
    static SessionFactory sessionFactory=SetSessionFactory.getSessionFactory();
    static Session session;
    
    /**
     * Add a otherItem in the database
     * @param otherItem A OtherItem Object
     */
     public static void addOtherItem(Otheritem otherItem) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
           
            //Insert detail of the otherItem to the database
            session.save(otherItem);
            session.getTransaction().commit();
            
            session.close();
        
    }

     /**
     * Update  otherItem details in the database
     * @param otheritem A Other Item Object
     */
          public static void updateOtherItem(Otheritem otheritem) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
           
            //Update detail of the otherItem to the database
            session.update(otheritem);
            
            session.getTransaction().commit();
            session.close();
        
    }
          
      /**
     * Delete a otherItem in the database
     * @param itemCode
     * @return whether execution of the query is success or not 
     */
     public static int deleteOtherItem(String itemCode) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
            
            Query query=session.getNamedQuery("INVENTORY_deleteOtherItem").setString("itemCode", itemCode);
            
            //Execute the query which delete the detail of the otherItem from the database
            int res=query.executeUpdate();
            
            session.getTransaction().commit();
            session.close();
                
                return res;
        
    }
     
    /**
     * Load Selected otherItem details to the table in settings according to
     * given item code
     * @param itemCode OtherItem 
     * @return  List of selected otherItem
     */
    public static List<Otheritem> searchOtherItemByItemCode(String itemCode) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchOtherItemByItemCode").setString("itemCode", itemCode);

       List<Otheritem> resultList = query.list();
       
       session.getTransaction().commit();
       session.close();
        
        return resultList;
        
    }
    
    /**
     * Load Selected otherItem details to the table in settings according to
     * given name
     * @param name OtherItem 
     * @return  List of selected otherItem
     */
    public static List<Otheritem> searchEOtherItemByName(String name) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchOtherItemByName").setString("name", name);

       List<Otheritem> resultList = query.list();
       
        session.getTransaction().commit();
        session.close();
        
        return resultList;
        
    }
    
    /**
     * Load Selected otherItem details to the table in settings according to given usage
     * @param usage OtherItem 
     * @return  List of selected otherItem
     */
    public static List<Otheritem> searchOtherItemByUsage(String usage) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchOtherItemByUsage").setString("usage", usage);

       List<Otheritem> resultList = query.list();
       
       session.getTransaction().commit();
       session.close();
        
        return resultList;
        
    }

/**
     * Load Selected otherItem details to the table in settings according to
     * given name and location
     * @param name OtherItem 
     * @param location OtherItem 
     * @return  List of selected otherItem
     */
    public static List<Otheritem> searchOtherItemByNameAndLocation(String name,String location) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchOtherItemByNameAndLocation").setString("name", name).setString("location", location);

       List<Otheritem> resultList = query.list();
       
       session.getTransaction().commit();
       session.close();
        
        return resultList;
        
    }
    
    /**
     * Load OtherItem details to the table in settings according to requirement
     * @return  otherItem list
     */
        public static List<Otheritem>  getOtherItemDetails_1() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getAllOtherItemList_1");
        List<Otheritem> otherItemList=query.list();
        
         session.getTransaction().commit();
         session.close();
        
        return otherItemList;
        
    }

/**
* Load OtherItem details to the table in settings according to requirement
* @return  otherItem list
*/
public static List<Otheritem>  getOtherItemDetails_2() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getAllOtherItemList_2");
        List<Otheritem> otherItemList=query.list();
        
        session.getTransaction().commit();
        session.close();
          
          return otherItemList;
}

/**
* Load all Other Item names in the database
* @return  otherItem name list
*/
public static List<Otheritem>  getOtherItemName() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getOtherItemName");
        List<Otheritem> otherItemNameList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return otherItemNameList;
}

/**
* Load all Location in the database
* @return  location list
*/
public static List<Otheritem>  getOtherItemLocation() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getOtherItemLocation");
        List<Otheritem> otherItemLocationList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return otherItemLocationList;
 }

/**
* Load all usages in the database
* @return  usage list
*/
public static List<Otheritem>  getOtherItemUsage() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getOtherItemUsage");
        List<Otheritem> otherItemLocationList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return otherItemLocationList;
 }
    
}
