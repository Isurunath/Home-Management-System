/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Inventory;

import java.util.List;
import model.Inventory.ElectricalGoods;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

/**
 *
 * @author Nipuni
 */
public class ElectricGoodDAO {
    static SessionFactory sessionFactory=SetSessionFactory.getSessionFactory();
    static Session session;
    
    /**
     * Add a electric item in the database
     * @param electricgood A ElectricGoods Object
     */
     public static void addElectricaItem(ElectricalGoods electricgood) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
           
            //Insert detail of the electric good to the database
            session.save(electricgood);
            session.getTransaction().commit();
            
            session.close();
    }

     /**
     * Update a electric item in the database
     * @param electricgood A ElectricGoods Object
     */
          public static void updateElectricaItem(ElectricalGoods electricgood) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
           
            //Update detail of the electric good to the database
            session.update(electricgood);
            session.getTransaction().commit();
            session.close();
    }
          
      /**
     * Delete a electric item in the database
     * @param itemCode
     */
     public static int deleteElectricaItem(String itemCode) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
            
            Query query=session.getNamedQuery("INVENTORY_deleteElectricItem").setString("itemCode", itemCode);
            
            //Execute the query which delete the detail of the electric good from the database
            int res=query.executeUpdate();
            
            //check whether tr
            session.getTransaction().commit();
            session.close();
                
                return res;
        
    }
     
    /**
     * Load Selected electric good details to the table in settings according to given item code
     * @param itemCode Electric Good 
     * @return  List of selected electric good
     */
    public static List<ElectricalGoods> searchElectricGoodByItemCode(String itemCode) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchElectricGoodByItemCode").setString("itemCode", itemCode);

         List<ElectricalGoods> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
          
          return resultList;
        
    }
    
    /**
     * Load Selected electric good details to the table in settings according to given name
     * @param name Electric Good 
     * @return  List of selected electric good
     */
    
    public static List<ElectricalGoods> searchElectricGoodByName(String name) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchElectricGoodByName").setString("name", name);

       List<ElectricalGoods> resultList = query.list();
       
            session.getTransaction().commit();
            session.close();
        
        return resultList;
        
    }

    /**
     * Load Selected electric good details to the table in settings according to given name and location
     * @param name Electric Good 
     * @param location Electric Good 
     * @return  List of selected electric good
     */
    public static List<ElectricalGoods> searchElectricGoodByNameAndLocation(String name,String location) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchElectricGoodByNameAndLocation").setString("name", name).setString("location", location);

       List<ElectricalGoods> resultList = query.list();
       
       session.getTransaction().commit();
       session.close();
        
        return resultList;
        
    }
    
    /**
     * Load Selected electric good details to the table in settings according to given name of the seller
     * @param nameOfSeller Electric Good  
     * @return  List of selected electric good
     */
    public static List<ElectricalGoods> searchElectricGoodByNameOfSeller(String nameOfSeller) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchElectricGoodByNameOfSeller").setString("nameOfSeller", nameOfSeller);

       List<ElectricalGoods> resultList = query.list();
       
       session.getTransaction().commit();
       session.close();
        
        return resultList;
        
    }
    
    /**
     * Load Selected electric good details to the table in settings according to given name and name of the seller
     * @param name Electric Good 
     * @param nameOfSeller Electric Good 
     * @return  List of selected electric good
     */
    public static List<ElectricalGoods> searchElectricGoodByNameAndNameOfSeller(String name,String nameOfSeller) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_earchElectricGoodByNameAndNameOfSeller").setString("name", name).setString("nameOfSeller", nameOfSeller);

       List<ElectricalGoods> resultList = query.list();
       
       session.getTransaction().commit();
       session.close();
        
        return resultList;
        
    }
    
     /**
     * Load Selected electric good details to the table in settings according to given brand
     * @param brand Electric Good  
     * @return  List of selected electric good
     */
    public static List<ElectricalGoods> searchElectricGoodByBrand(String brand) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchElectricGoodByBrand").setString("brand", brand);

       List<ElectricalGoods> resultList = query.list();
       
       session.getTransaction().commit();
       session.close();
        
        return resultList;
        
    }
 
     /**
     * Get electric good name according to given itemCode
     * @param itemCode Electric Good  
     * @return  List of selected electric good
     */
    public static List<ElectricalGoods> getElectricGoodNameByItemCode(String itemCode) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_getElectricItemNameByItemCode").setString("itemCode", itemCode);

       List<ElectricalGoods> resultList = query.list();
       
       session.getTransaction().commit();
       session.close();
        
        return resultList;
        
    }

    /**
     * Load Electric Good details to the table in settings according to requirement
     * @return  electric good list
     */
        public static List<ElectricalGoods>  getElectricItemDetails_1() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getAllElectricGoodList_1");
        List<ElectricalGoods> electricGoodList=query.list();
  
            session.getTransaction().commit();
            session.close();
        
        return electricGoodList;
        
    }

/**
* Load Electric Good details to the table in settings according to requirement
* @return  electric good list
*/
public static List<ElectricalGoods>  getElectricItemDetails_2() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getAllElectricGoodList_2");
        List<ElectricalGoods> electricList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return electricList;
          }

/**
* Load all Electric Good names in the database 
* @return  electric good name list
*/
public static List<ElectricalGoods>  getElectricItemName() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getElectricItemName");
        List<ElectricalGoods> electricGoodNameList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return electricGoodNameList;
          }

/**
* Load all Location in the database 
* @return  location list
*/
public static List<ElectricalGoods>  getElectricItemLocation() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getElectricItemLocation");
        List<ElectricalGoods> electricGoodLocationList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return electricGoodLocationList;
          }

    /**
     * Load item codes of electric goods in the database
     * @return  List of selected electric good
     */
    public static List<ElectricalGoods> getElectricGoodItemCode() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_getElectricItemCode");

         List<ElectricalGoods> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
          
          return resultList;
        
    }
    
    /**
     * Load sellers names of electric goods in the database
     * @return  List of electric good sellers
     */
    public static List<ElectricalGoods> getElectricGoodSellers() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_getElectricItemSellers");

         List<ElectricalGoods> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
          
          return resultList;
        
    }
 
     /**
     * Load brand names of electric goods in the database
     * @return  List of electric good brands
     */
    public static List<ElectricalGoods> getElectricGoodBrands() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_getElectricItemBrand");

         List<ElectricalGoods> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
          
          return resultList;
        
    }
    
     /**
     * Load Installment payment details of electric goods and details of electric goods
     * @return  List of electric good 
     */
    public static List<ElectricalGoods> getInstallmentPaymentNotificationOfElectricItem() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_getInstallmentPaymentNotificationOfElectricItem");

         List<ElectricalGoods> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
          
          return resultList;
        
    }
    
     /**
     * count Installment payments of electric goods 
     * @return  List of electric good 
     */
    public static List<ElectricalGoods> getInstallmentPaymentNotificationCountOfElectricItem() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_getInstallmentPaymentNotificationCountOfElectricItem");

         List<ElectricalGoods> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
          
          return resultList;
        
    }
    
}
