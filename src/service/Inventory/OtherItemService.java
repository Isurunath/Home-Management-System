/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.Inventory;

import dao.Inventory.OtherItemDAO;
import java.util.List;
import model.Inventory.Otheritem;
import org.hibernate.HibernateException;
import utility.Validations;

/**
 *
 * @author Nipuni
 */
public class OtherItemService {
    
    /**
     * Add a otherItem in the database
     * @param otherItem A OtherItem Object
     * @return whether execution of the query is success or not
     */
    public static boolean addOtherItem(Otheritem otherItem) throws HibernateException{
        boolean result=false;
        
        if(Validations.Validate(otherItem)){
            OtherItemDAO.addOtherItem(otherItem);
            result=true;
        }else{
            result=false;
        }
        
        return result;

    }
    
     /**
     * Update  otherItem details in the database
     * @param otheritem A Other Item Object
     * @return whether execution of the query is success or not
     */
    public static boolean updateOtherItem(Otheritem otheritem) throws HibernateException{
        boolean result=false;
        
        if(Validations.Validate(otheritem)){
            OtherItemDAO.updateOtherItem(otheritem);
            result=true;
        }else{
            result=false;
        }
        
        return result;

    }

      /**
     * Delete a otherItem in the database
     * @param itemCode
     * @return whether execution of the query is success or not 
     */
    public static int deleteOtherItem(String itemCode) throws HibernateException{

             return OtherItemDAO.deleteOtherItem(itemCode);
     }
    
    /**
     * Load Selected otherItem details to the table in settings according to
     * given item code
     * @param itemCode OtherItem 
     * @return  List of selected otherItem
     */
    public static List<Otheritem> searchOtherItemByItemCode(String itemCode) throws HibernateException{

            return OtherItemDAO.searchOtherItemByItemCode(itemCode);

    }

    /**
     * Load Selected otherItem details to the table in settings according to
     * given name
     * @param name OtherItem 
     * @return  List of selected otherItem
     */
    public static List<Otheritem> searchOtherItemByName(String name) throws HibernateException{

            return OtherItemDAO.searchEOtherItemByName(name);
    }
    
    /**
     * Load Selected otherItem details to the table in settings according to given usage
     * @param usage OtherItem 
     * @return  List of selected otherItem
     */
    public static List<Otheritem> searchOtherItemByUsage(String usage) throws HibernateException{
        
        return OtherItemDAO.searchOtherItemByUsage(usage);
        
    }

     /**
     * Load Selected otherItem details to the table in settings according to
     * given name and location
     * @param name OtherItem 
     * @param location OtherItem 
     * @return  List of selected otherItem
     */
    public static List<Otheritem> searchOtherItemByNameAndLocation(String name,String location) throws HibernateException{

            return OtherItemDAO.searchOtherItemByNameAndLocation(name, location);

    }

    /**
     * Load OtherItem details to the table in settings according to requirement
     * @return  otherItem list
     */
    public static List<Otheritem>  getOtherItemDetails_1() throws HibernateException{

            return OtherItemDAO.getOtherItemDetails_1();

        }

/**
* Load OtherItem details to the table in settings according to requirement
* @return  otherItem list
*/
    public static List<Otheritem>  getOtherItemDetails_2() throws HibernateException{

            return OtherItemDAO.getOtherItemDetails_2();
    }
 
/**
* Load all Other Item names in the database
* @return  otherItem name list
*/
   public static List<Otheritem>  getOtherItemName() throws HibernateException{

            return OtherItemDAO.getOtherItemName();
    }
  
/**
* Load all Location in the database
* @return  location list
*/
  public static List<Otheritem>  getOtherItemLocation() throws HibernateException{

            return OtherItemDAO.getOtherItemLocation();
    }
  
/**
* Load all usages in the database
* @return  usage list
*/
public static List<Otheritem>  getOtherItemUsage() throws HibernateException{
    
    return OtherItemDAO.getOtherItemUsage();
 }
    
}
