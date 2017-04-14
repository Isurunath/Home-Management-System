/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.Inventory;

import dao.Inventory.GarmentAndAccessoryDAO;
import java.util.List;
import model.Inventory.Garmentandaccesory;
import org.hibernate.HibernateException;
import utility.Validations;

/**
 *
 * @author Nipuni
 */
public class GarmentAndAccessoryService {
    
    /**
     * Add a garments and accessory in the database
     * @param gaa A Garmentandaccessory Object
     * @return result whether execution of the query is success or not
     */
    public static boolean addGarmentAndAccesory(Garmentandaccesory gaa) throws HibernateException{
        boolean result=false;
        
        if(Validations.Validate(gaa)){
           GarmentAndAccessoryDAO.addGarmentAndAccessoryItem(gaa);
           result=true;
        }else{
            result=false;
        }
        
        return result;

    }

     /**
     * Update  garments and accessory details in the database
     * @param gaa A Garmentandaccessory Object
     * @return result whether execution of the query is success or not
     */
    public static boolean updateGarmentAndAccesory(Garmentandaccesory gaa) throws HibernateException{
        boolean result=false;
        
        if(Validations.Validate(gaa)){
           GarmentAndAccessoryDAO.updateGarmentAndAccessory(gaa);
           result=true;
        }else{
            result=false;
        }
        
        return result;

    }

      /**
     * Delete a garments and accessory in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
    public static int deleteGarmentAndAccesory(String itemCode) throws HibernateException{

             return GarmentAndAccessoryDAO.DeleteGarmentAndAccessory(itemCode);
                     
     }

     /**
     * Load Selected garment and accessory details to the table in settings according to given item code
     * @param itemCode Garment And Accessory 
     * @return  List of selected garment and accessory
     */
    public static List<Garmentandaccesory> searchGarmentAndAccesoryByItemCode(String itemCode) throws HibernateException{

            return GarmentAndAccessoryDAO.searchGarmentAndAccessoryByItemCode(itemCode);

    }

        /**
     * Load Selected garment and accessory details to the table in settings according to given name
     * @param name Garment And Accessory 
     * @return  List of selected garment and accessory
     */
    public static List<Garmentandaccesory> searchGarmentAndAccesoryByName(String name) throws HibernateException{

            return GarmentAndAccessoryDAO.searchGarmentAndAccessoryByName(name);
    }
    
     /**
     * Load Selected garment and accessory details to the table in settings according to given seller
     * @param nameOfSeller Garment And Accessory 
     * @return  List of selected garment and accessory
     */
    public static List<Garmentandaccesory> searchGarmentAndAccessoryByNameOfSeller(String nameOfSeller) throws HibernateException{
        
        return GarmentAndAccessoryDAO.searchGarmentAndAccessoryByNameOfSeller(nameOfSeller);
        
    }

    /**
     * Load Selected garment and accessory details to the table in settings according to given name and location
     * @param name Garment And Accessory 
     * @param location Garment And Accessory 
     * @return  List of selected garment and accessory
     */
    public static List<Garmentandaccesory> searchGarmentAndAccesoryByNameAndLocation(String name,String location) throws HibernateException{

            return GarmentAndAccessoryDAO.searchGarmentAndAccessoryByNameAndLocation(name, location);

    }
    
    /**
     * Load Selected garment and accessory details to the table in settings according to given name and seller
     * @param name Garment And Accessory 
     * @param nameOfSeller Garment And Accessory 
     * @return  List of selected garment and accessory
     */
    public static List<Garmentandaccesory> searchGarmentAndAccessoryByNameAndNameOfSeller(String name,String nameOfSeller) throws HibernateException{
        
        return GarmentAndAccessoryDAO.searchGarmentAndAccessoryByNameAndNameOfSeller(name, nameOfSeller);
        
    }

    /**
     * Load Furniture details to the table in settings according to requirement
     * @return  furniture list
     */
    public static List<Garmentandaccesory>  getGarmentAndAccesoryDetails_1() throws HibernateException{

            return GarmentAndAccessoryDAO.getGarmentAndAccesorysDetails_1();

        }

    /**
     * Load Furniture details to the table in settings according to requirement
     * @return  furniture list
     */
    public static List<Garmentandaccesory>  getGarmentAndAccesoryDetails_2() throws HibernateException{

            return GarmentAndAccessoryDAO. getGarmentAndAccesorysDetails_2();
    }

 /**
* Load all GarmentAndAccesory names in the database
* @return  book name list
*/
      public static List<Garmentandaccesory>  getGarmentAndAccesoryName() throws HibernateException{

            return GarmentAndAccessoryDAO.getGarmentAndAccesoryName();
    }
 
/**
* Load all Location in the database 
* @return  location list
*/
  public static List<Garmentandaccesory>  getGarmentAndAccesoryLocation() throws HibernateException{

            return GarmentAndAccessoryDAO.getGarmentAndAccesoryLocation();
  }
  
/**
* Load all sellers in the database 
* @return  list of sellers
*/
public static List<Garmentandaccesory>  getGarmentAndAccesorySellers() throws HibernateException{
    
    return GarmentAndAccessoryDAO.getGarmentAndAccesorySellers();
}
}
