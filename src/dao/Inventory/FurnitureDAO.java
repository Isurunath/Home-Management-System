/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Inventory;

import java.util.List;
import model.Inventory.Furniture;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

/**
 *
 * @author Nipuni
 */
public class FurnitureDAO {
    static SessionFactory sessionFactory=SetSessionFactory.getSessionFactory();
    static Session session;
    
    /**
     * Add a furniture in the database
     * @param furniture A Furniture Object
     */
     public static void addFurniture(Furniture furniture) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
           
            //Insert detail of the furniture to the database
            session.save(furniture);
            session.getTransaction().commit();
            
            session.close();
 
    }

     /**
     * Update  furniture details in the database
     * @param furniture A Furniture Object
     */
          public static void updateFurniture(Furniture furniture) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
           
            //Update detail of the furniture to the database
            session.update(furniture);
            session.getTransaction().commit();
            session.close();
        
    }
          
      /**
     * Delete a furniture in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
     public static int deleteFurniture(String itemCode) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
            
            Query query=session.getNamedQuery("INVENTORY_deleteFurniture").setString("itemCode", itemCode);
            
            //Execute the query which delete the detail of the furniture from the database
            int res=query.executeUpdate();
            session.getTransaction().commit();
            session.close();
                
            return res;
        
    }
     
    /**
     * Load Selected furniture details to the table in settings according to
     * given item code
     * @param itemCode Furniture 
     * @return  List of selected furniture
     */
    public static List<Furniture> searchFurnitureByItemCode(String itemCode) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchFurnitureByItemCode").setString("itemCode", itemCode);

       List<Furniture> resultList = query.list();
       
       session.getTransaction().commit();
       session.close();
        
       return resultList;
        
    }
    
    /**
     * Load Selected furniture details to the table in settings according to
     * given name
     * @param name Furniture 
     * @return  List of selected furniture
     */
    public static List<Furniture> searchEFurnitureByName(String name) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchFurnitureByName").setString("name", name);

       List<Furniture> resultList = query.list();
       
       session.getTransaction().commit();
       session.close();
        
        return resultList;
        
    }

     /**
     * Load Selected furniture details to the table in settings according to
     * given name and location
     * @param name Furniture 
     * @param location Furniture 
     * @return  List of selected furniture
     */
    public static List<Furniture> searchFurnitureByNameAndLocation(String name,String location) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchFurnitureByNameAndLocation").setString("name", name).setString("location", location);

         List<Furniture> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
      
          return resultList;
        
    }
    
     /**
     * Load Selected furniture details to the table in settings according to
     * given name and seller name
     * @param name Furniture 
     * @param nameOfSeller Furniture 
     * @return  List of selected furniture
     */
    public static List<Furniture> searchFurnitureByNameAndNameOfSeller(String name,String nameOfSeller) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchFurnitureByNameAndNameOfTheSeller").setString("name", name).setString("nameOfSeller",nameOfSeller);

         List<Furniture> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
      
          return resultList;
        
    }
    
    /**
     * Load Selected furniture details to the table in settings according to given seller name
     * @param nameOfSeller Furniture 
     * @return  List of selected furniture
     */
    public static List<Furniture> searchFurnitureByNameOfSeller(String nameOfSeller) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchFurnitureByNameOfTheSeller").setString("nameOfSeller", nameOfSeller);

       List<Furniture> resultList = query.list();
       
       session.getTransaction().commit();
       session.close();
        
        return resultList;
        
    }
    
    /**
     * Load Furniture details to the table in settings according to
     * requirement
     * @return  furniture list
     */
        public static List<Furniture>  getFurnitureDetails_1() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getAllFurnitureList_1");
        List<Furniture> furnitureList=query.list();
        
          session.getTransaction().commit();
          session.close();
        
        return furnitureList;
        
    }

/**
* Load Furniture details to the table in settings according to
* requirement
* @return  furniture list
*/
public static List<Furniture>  getFurnitureDetails_2() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getAllFurnitureList_2");
        List<Furniture> furnitureList=query.list();
        
        session.getTransaction().commit();
        session.close();
          
          return furnitureList;
}

/**
* Load all Furniture names in the database 
* @return  furniture name list
*/
public static List<Furniture>  getFurnitureName() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getFurnitureName");
        List<Furniture> furnitureNameList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return furnitureNameList;
}

/**
* Load all Location in the database 
* @return  location list
*/
public static List<Furniture>  getFurnitureLocation() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getFurnitureLocation");
        List<Furniture> furnitureLocationList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return furnitureLocationList;
 }

/**
* Load all Sellers in the database 
* @return  names of sellers list
*/
public static List<Furniture>  getFurnitureSellers() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getFurnitureSellers");
        List<Furniture> furnitureLocationList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return furnitureLocationList;
 }

     /**
     * Load Installment payment details of furniture and details of furniture
     * @return  List of furnitures
     */
    public static List<Furniture> getInstallmentPaymentNotificationOfFurniture() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_getInstallmentPaymentNotificationOfFurniture");

         List<Furniture> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
          
          return resultList;
        
    }
    
     /**
     * count Installment payments of furnitures 
     * @return  List of furnitures
     */
    public static List<Furniture> getInstallmentPaymentNotificationCountOfFurniture() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_getInstallmentPaymentNotificationCountOfFurniture");

         List<Furniture> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
          
          return resultList;
        
    }
    
}
