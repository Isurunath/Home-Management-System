/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Inventory;

import java.util.List;
import model.Inventory.Garmentandaccesory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

/**
 *
 * @author Nipuni
 */
public class GarmentAndAccessoryDAO {
    static SessionFactory sessionFactory=SetSessionFactory.getSessionFactory();
    static Session session;

    /**
     * Add a garments and accessory in the database
     * @param gaa A Garmentandaccessory Object
     */
    public static void addGarmentAndAccessoryItem(Garmentandaccesory gaa) throws HibernateException{
         
            session=sessionFactory.openSession();
            session.beginTransaction();
           
            //Insert detail of the garment and accessory to the database
            session.save(gaa);
            
          session.getTransaction().commit();
          session.close();
        
    }

     /**
     * Update  garments and accessory details in the database
     * @param gaa A Garmentandaccessory Object
     */
    public static void updateGarmentAndAccessory(Garmentandaccesory gaa) throws HibernateException{
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(gaa);
        
          session.getTransaction().commit();
          session.close();

    }
 
      /**
     * Delete a garments and accessory in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
    public static int DeleteGarmentAndAccessory(String itemCode) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query= session.getNamedQuery("INVENTORY_deleteGarmentAndAccessories").setString("itemCode",itemCode);
         
        int res=query.executeUpdate();

          session.getTransaction().commit();
          session.close();
            
            return res;
    }
    
     /**
     * Load Selected garment and accessory details to the table in settings according to given item code
     * @param itemCode Garment And Accessory 
     * @return  List of selected garment and accessory
     */
    
    public static List<Garmentandaccesory> searchGarmentAndAccessoryByItemCode(String itemCode) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchGarmentAndAccessoriesByItemCode").setString("itemCode", itemCode);

       List<Garmentandaccesory> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }
 
        /**
     * Load Selected garment and accessory details to the table in settings according to given name
     * @param name Garment And Accessory 
     * @return  List of selected garment and accessory
     */
    public static List<Garmentandaccesory> searchGarmentAndAccessoryByName(String name) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchGarmentAndAccessoriesByName").setString("name", name);

       List<Garmentandaccesory> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }
    
     /**
     * Load Selected garment and accessory details to the table in settings according to given seller
     * @param nameOfSeller Garment And Accessory 
     * @return  List of selected garment and accessory
     */
    public static List<Garmentandaccesory> searchGarmentAndAccessoryByNameOfSeller(String nameOfSeller) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchGarmentAndAccessoriesByNameOfSeller").setString("nameOfTheSeller", nameOfSeller);

       List<Garmentandaccesory> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }
    
    /**
     * Load Selected garment and accessory details to the table in settings according to given name and location
     * @param name Garment And Accessory 
     * @param location Garment And Accessory 
     * @return  List of selected garment and accessory
     */
    public static List<Garmentandaccesory> searchGarmentAndAccessoryByNameAndLocation(String name,String location) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchGarmentAndAccessoriesByNameAndLocation").setString("name", name).setString("location", location);

       List<Garmentandaccesory> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();;
        
        return resultList;
        
    }
    
    /**
     * Load Selected garment and accessory details to the table in settings according to given name and seller
     * @param name Garment And Accessory 
     * @param nameOfSeller Garment And Accessory 
     * @return  List of selected garment and accessory
     */
    public static List<Garmentandaccesory> searchGarmentAndAccessoryByNameAndNameOfSeller(String name,String nameOfSeller) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchGarmentAndAccessoriesByNameAndNameOfSeller").setString("name", name).setString("nameOfTheSeller", nameOfSeller);

       List<Garmentandaccesory> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();;
        
        return resultList;
        
    }

    /**
     * Load Furniture details to the table in settings according to requirement
     * @return  furniture list
     */
 public static List<Garmentandaccesory>  getGarmentAndAccesorysDetails_1() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getAllGarmentAndAccessoriesList_1");
        List<Garmentandaccesory> gaaList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return gaaList;
}
 
    /**
     * Load Furniture details to the table in settings according to requirement
     * @return  furniture list
     */
  public static List<Garmentandaccesory>  getGarmentAndAccesorysDetails_2() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getAllGarmentAndAccessoriesList_2");
        List<Garmentandaccesory> gaaList=query.list();
            
          session.getTransaction().commit();
          session.close();
          
          return gaaList;
}
 
 /**
* Load all GarmentAndAccesory names in the database
* @return  book name list
*/
public static List<Garmentandaccesory>  getGarmentAndAccesoryName() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getGarmentAndAccessoryName");
        List<Garmentandaccesory> gaaNameList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return gaaNameList;
          }

/**
* Load all Location in the database 
* @return  location list
*/
public static List<Garmentandaccesory>  getGarmentAndAccesoryLocation() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getGarmentAndAccessoryLocation");
        List<Garmentandaccesory> gaaLocationList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return gaaLocationList;
}

/**
* Load all sellers in the database 
* @return  list of sellers
*/
public static List<Garmentandaccesory>  getGarmentAndAccesorySellers() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getGarmentAndAccessorySellers");
        List<Garmentandaccesory> gaaLocationList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return gaaLocationList;
}
    
}
