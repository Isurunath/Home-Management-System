/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.Inventory;

import dao.Inventory.FurnitureDAO;
import java.util.List;
import model.Inventory.Furniture;
import org.hibernate.HibernateException;
import utility.Validations;

/**
 *
 * @author Nipuni
 */
public class FurnitureService {

    /**
     * Add a furniture in the database
     * @param furniture A Furniture Object
     * @return result whether execution of the query is success or not
     */
    public static boolean addFurniture(Furniture furniture) throws HibernateException{
       boolean result=false;
        
        if(Validations.Validate(furniture)){
            FurnitureDAO.addFurniture(furniture);
            result=true;
        }else{
            result=false;
        }
        
        return result;

    }

     /**
     * Update  furniture details in the database
     * @param furniture A Furniture Object
     * @return result whether execution of the query is success or not
     */
    public static boolean updateFurniture(Furniture furniture) throws HibernateException{
        boolean result=false;
        
         if(Validations.Validate(furniture)){
                    FurnitureDAO.updateFurniture(furniture);
                    result=true;
                }else{
                    result=false;
                }

                return result;

    }

     /**
     * Delete a furniture in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
    public static int deleteFurniture(String itemCode) throws HibernateException{

             return FurnitureDAO.deleteFurniture(itemCode);
     }

    /**
     * Load Selected furniture details to the table in settings according to
     * given item code
     * @param itemCode Furniture 
     * @return  List of selected furniture
     */
    public static List<Furniture> searchFurnitureByItemCode(String itemCode) throws HibernateException{

            return FurnitureDAO.searchFurnitureByItemCode(itemCode);

    }

    /**
     * Load Selected furniture details to the table in settings according to
     * given name
     * @param name Furniture 
     * @return  List of selected furniture
     */
    public static List<Furniture> searchFurnitureByName(String name) throws HibernateException{

            return FurnitureDAO.searchEFurnitureByName(name);
    }

     /**
     * Load Selected furniture details to the table in settings according to
     * given name and location
     * @param name Furniture 
     * @param location Furniture 
     * @return  List of selected furniture
     */
    public static List<Furniture> searchFurnitureByNameAndLocation(String name,String location) throws HibernateException{

            return FurnitureDAO.searchFurnitureByNameAndLocation(name, location);

    }
    
     /**
     * Load Selected furniture details to the table in settings according to
     * given name and seller name
     * @param name Furniture 
     * @param nameOfSeller Furniture 
     * @return  List of selected furniture
     */
    public static List<Furniture> searchFurnitureByNameAndNameOfSeller(String name,String nameOfSeller) throws HibernateException{
        
        return FurnitureDAO.searchFurnitureByNameAndNameOfSeller(name, nameOfSeller);    
    }
    
    /**
     * Load Selected furniture details to the table in settings according to given seller name
     * @param nameOfSeller Furniture 
     * @return  List of selected furniture
     */
    public static List<Furniture> searchFurnitureByNameOfSeller(String nameOfSeller) throws HibernateException{
        
        return FurnitureDAO.searchFurnitureByNameOfSeller(nameOfSeller);
    }

    /**
     * Load Furniture details to the table in settings according to
     * requirement
     * @return  furniture list
     */
    public static List<Furniture>  getFurnitureDetails_1() throws HibernateException{

            return FurnitureDAO.getFurnitureDetails_1();

        }

    /**
     * Load Furniture details to the table in settings according to
     * requirement
     * @return  furniture list
     */
    public static List<Furniture>  getFurnitureDetails_2() throws HibernateException{

            return FurnitureDAO.getFurnitureDetails_2();
    }

/**
* Load all Furniture names in the database 
* @return  furniture name list
*/
   public static List<Furniture>  getFurnitureName() throws HibernateException{

            return FurnitureDAO.getFurnitureName();
    }

/**
* Load all Furniture location in the database 
* @return  furniture location list
*/
  public static List<Furniture>  getFurnitureLocation() throws HibernateException{

            return FurnitureDAO.getFurnitureLocation();
    }
  
/**
* Load all Sellers in the database 
* @return  names of sellers list
*/
public static List<Furniture>  getFurnitureSellers() throws HibernateException{
 
          return FurnitureDAO.getFurnitureSellers();
 }

     /**
     * Load Installment payment details of furnitures and details of furnitures
     * @return  List of furnitures
     */
    public static List<Furniture> getInstallmentPaymentNotificationOfFurniture() throws HibernateException{
        
        return FurnitureDAO.getInstallmentPaymentNotificationOfFurniture();
    }
    
     /**
     * count Installment payments of furnitures 
     * @return  List of furnitures
     */
    public static List<Furniture> getInstallmentPaymentNotificationCountOfElectricItem() throws HibernateException{
        
        return FurnitureDAO.getInstallmentPaymentNotificationCountOfFurniture();
    }
    
}
