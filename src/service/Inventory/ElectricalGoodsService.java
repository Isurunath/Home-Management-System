/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.Inventory;

import dao.Inventory.ElectricGoodDAO;
import java.util.List;
import model.Inventory.ElectricalGoods;
import org.hibernate.HibernateException;
import utility.Validations;

/**
 *
 * @author Nipuni
 */
public class ElectricalGoodsService {
 
 /**
 * Add a electric item in the database
 * @param electricgood A ElectricGoods Object
 * @return result whether execution of the query is success or not
 */  
    public static boolean addElectricaItem(ElectricalGoods electricgood) throws HibernateException{

        boolean result=false;
        
        if(Validations.Validate(electricgood)){
            ElectricGoodDAO.addElectricaItem(electricgood);
            result=true;
        }else{
            result=false;
        }
        
        return result; 

    }
    
 /**
 * Update a electric item in the database
 * @param electricgood A ElectricGoods Object
 * @return result whether execution of the query is success or not
 */
    public static boolean updateElectricaItem(ElectricalGoods electricgood) throws HibernateException{

        boolean result=false;
        
        if(Validations.Validate(electricgood)){
           ElectricGoodDAO.updateElectricaItem(electricgood);
           result=true;
        }else{
            result=false;
        }
        
        return result;
    }

 /**
 * Delete a electric item in the database
 * @param itemCode
 * @return result whether execution of the query is success or not
 */ 
    public static int deleteElectricaItem(String itemCode) throws HibernateException{

             return ElectricGoodDAO.deleteElectricaItem(itemCode);
     }
    
 /**
 * Load Selected electric good details to the table in settings according to given item code
 * @param itemCode Electric Good 
 * @return  List of selected electric good
 */
    public static List<ElectricalGoods> searchElectricGoodByItemCode(String itemCode) throws HibernateException{

            return ElectricGoodDAO.searchElectricGoodByItemCode(itemCode);

    }

 /**
 * Load Selected electric good details to the table in settings according to given name
 * @param name Electric Good 
 * @return  List of selected electric good
 */
    public static List<ElectricalGoods> searchElectricGoodByName(String name) throws HibernateException{

            return ElectricGoodDAO.searchElectricGoodByName(name);
    }

 /**
 * Load Selected electric good details to the table in settings according to given name and location
 * @param name Electric Good 
 * @param location Electric Good 
 * @return  List of selected electric good
 */ 
    public static List<ElectricalGoods> searchElectricGoodByNameAndLocation(String name,String location) throws HibernateException{

            return ElectricGoodDAO.searchElectricGoodByNameAndLocation(name, location);

    }
    
 /**
 * Load Selected electric good details to the table in settings according to given name of the seller
 * @param nameOfSeller Electric Good  
 * @return  List of selected electric good
 */
    public static List<ElectricalGoods> searchElectricGoodByNameOfSeller(String nameOfSeller) throws HibernateException{

        return ElectricGoodDAO.searchElectricGoodByNameOfSeller(nameOfSeller);
        
    }

 /**
 * Load Selected electric good details to the table in settings according to given name and name of the seller
 * @param name Electric Good 
 * @param nameOfSeller Electric Good 
 * @return  List of selected electric good
 */
    public static List<ElectricalGoods> searchElectricGoodByNameAndNameOfSeller(String name,String nameOfSeller) throws HibernateException{
        
        return ElectricGoodDAO.searchElectricGoodByNameAndNameOfSeller(name, nameOfSeller);
        
    }
    
 /**
 * Load Selected electric good details to the table in settings according to given brand
 * @param brand Electric Good  
 * @return  List of selected electric good
 */
    public static List<ElectricalGoods> searchElectricGoodByBrand(String brand) throws HibernateException{

        return ElectricGoodDAO.searchElectricGoodByBrand(brand);
        
    }
    
     /**
     * Get electric good name according to given itemCode
     * @param itemCode Electric Good  
     * @return  List of selected electric good
     */
    public static String getElectricGoodNameByItemCode(String itemCode) throws HibernateException{

        return String.valueOf(ElectricGoodDAO.getElectricGoodNameByItemCode(itemCode));
        
    }

 /**
 * Load Electric Good details to the table in settings according to requirement
 * @return  electric good list
 */
    
    public static List<ElectricalGoods>  getElectricItemDetails_1() throws HibernateException{

            return ElectricGoodDAO.getElectricItemDetails_1();

        }

/**
* Load Electric Good details to the table in settings according to requirement
* @return  electric good list
*/
    public static List<ElectricalGoods>  getElectricItemDetails_2() {

            return ElectricGoodDAO.getElectricItemDetails_2();
    }
    
/**
* Load all Electric Good names in the database 
* @return  electric good name list
*/   
   public static List<ElectricalGoods>  getElectricItemName() throws HibernateException{

            return ElectricGoodDAO.getElectricItemName();
    }

/**
* Load all Location in the database 
* @return  location list
*/ 
  public static List<ElectricalGoods>  getElectricItemLocation() throws HibernateException{

            return ElectricGoodDAO.getElectricItemLocation();
    }
  
/**
 * Load item codes of electric goods in the database
 * @return  List of selected electric good
 */ 
  public static List<ElectricalGoods>  getElectricItemCode() throws HibernateException{

            return ElectricGoodDAO.getElectricGoodItemCode();
    }
  
    /**
     * Load sellers names of electric goods in the database
     * @return  List of electric good sellers
     */
    public static List<ElectricalGoods> getElectricGoodSellers() throws HibernateException{
          
          return ElectricGoodDAO.getElectricGoodSellers();
        
    }
 
     /**
     * Load brand names of electric goods in the database
     * @return  List of electric good brands
     */
    public static List<ElectricalGoods> getElectricGoodBrands() throws HibernateException{
  
          return ElectricGoodDAO.getElectricGoodBrands();
        
    }
    
     /**
     * Load Installment payment details of electric goods and details of electric goods
     * @return  List of electric goods
     */
    public static List<ElectricalGoods> getInstallmentPaymentNotificationOfElectricItem() throws HibernateException{
        
        return ElectricGoodDAO.getInstallmentPaymentNotificationOfElectricItem();
    }
    
     /**
     * count Installment payments of electric goods 
     * @return  List of electric goods
     */
    public static List<ElectricalGoods> getInstallmentPaymentNotificationCountOfElectricItem() throws HibernateException{
        
        return ElectricGoodDAO.getInstallmentPaymentNotificationCountOfElectricItem();
    }
}
