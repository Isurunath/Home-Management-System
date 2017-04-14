/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.Inventory;

import dao.Inventory.MedicineDAO;
import java.util.List;
import model.Inventory.Medicine;
import org.hibernate.HibernateException;
import utility.Validations;

/**
 *
 * @author Nipuni
 */
public class MedicineService {
 
    /**
     * Add a medicine in the database
     * @param medicine A Medicine Object
     * @return result whether execution of the query is success or not
     */
    public static boolean addMedicine(Medicine medicine) throws HibernateException{
          boolean result=false;
        
        if(Validations.Validate(medicine)){
           MedicineDAO.addMedicine(medicine);
           result=true;
        }else{
            result=false;
        }
        
        return result;

    }

     /**
     * Update a medicine in the database
     * @param medicine A Medicine Object
     * @return result whether execution of the query is success or not
     */
    public static boolean updateMedicine(Medicine medicine) throws HibernateException{
          boolean result=false;
        
        if(Validations.Validate(medicine)){
           MedicineDAO.updateMedicine(medicine);
           result=true;
        }else{
            result=false;
        }
        
        return result;

    }

      /**
     * Delete a medicine in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
    public static int deleteMedicine(String itemCode) throws HibernateException{

             return MedicineDAO.deleteMedicine(itemCode);
     }

    /**
     * Load Selected medicine details to the table in settings according to
     * given item code
     * @param itemCode Medicine
     * @return  List of selected medicine
     */
    public static List<Medicine> searchMedicineByItemCode(String itemCode) throws HibernateException{

            return MedicineDAO.searchMedicineByItemCode(itemCode);

    }

    /**
     * Load Selected medicine details to the table in settings according to
     * given name
     * @param name Medicine 
     * @return  List of selected medicine
     */
    public static List<Medicine> searchMedicineByName(String name) throws HibernateException{

            return MedicineDAO.searchMedicineByName(name);
    }
    
    /**
     * Load Selected medicine details to the table in settings according to given description
     * @param description Medicine 
     * @return  List of selected medicine
     */
    public static List<Medicine> searchMedicineByDescription(String description) throws HibernateException{
        
        return MedicineDAO.searchMedicineByDescription(description);
        
    }

    /**
     * Load Selected medicine details to the table in settings according to given seller
     * @param nameOfSeller Medicine
     * @return  List of selected medicine
     */
    public static List<Medicine> searchMedicineByNameOfSeller(String nameOfSeller) throws HibernateException{
        
        return MedicineDAO.searchMedicineByNameOfSeller(nameOfSeller);
        
    }
    
/**
     * Load Selected medicine details to the table in settings according to
     * given name and location
     * @param name Medicine 
     * @param location Medicine 
     * @return  List of selected medicine
     */
    public static List<Medicine> searchMedicineByNameAndLocation(String name,String location) throws HibernateException{

            return MedicineDAO.searchMedicineByNameAndLocation(name, location);

    }
    
/**
     * Load Selected medicine details to the table in settings according to given name and name of seller
     * @param name Medicine 
     * @param nameOfSeller Medicine 
     * @return  List of selected medicine
     */
    public static List<Medicine> searchMedicineByNameAndNameOfSeller(String name,String nameOfSeller) throws HibernateException{
        
        return MedicineDAO.searchMedicineByNameAndNameOfSeller(name, nameOfSeller);
    }


    /**
     * Load Medicine details to the table in settings according to requirement
     * @return  medicine list
     */
    public static List<Medicine>  getMedicineDetails_1() throws HibernateException{

            return MedicineDAO.getMedicineDetails_1();

        }


/**
* Load Medicine  details to the table in settings according to requirement
* @return medicine list
*/
    public static List<Medicine>  getMedicineDetails_2() throws HibernateException{

            return MedicineDAO.getMedicineDetails_2();
    }
 
/**
* Load all Medicine names in the database
* @return  medicine name list
*/
    public static List<Medicine>  getMedicineName() throws HibernateException{

            return MedicineDAO.getMedicineName();
    }
 
/**
* Load all Location in the database 
* @return  location list
*/
  public static List<Medicine>  getMedicineLocation() throws HibernateException{

            return MedicineDAO.getMedicineLocation();
    }
  
/**
* Load all sellers in the database 
* @return  sellers list
*/
public static List<Medicine>  getMedicineSellers() throws HibernateException{
    
    return MedicineDAO.getMedicineSellers();
}

/**
* Load all descriptions in the database 
* @return  descriptions list
*/
public static List<Medicine>  getMedicineDecription() throws HibernateException{
    
    return MedicineDAO.getMedicineDecription();
}

/**
* Load all expiring medicine in the database 
* @return  medicine list
*/
public static List<Medicine>  getExpiringMedicine() throws HibernateException{
    
    return MedicineDAO.getExpiringMedicine();
}

/**
* Count all expiring medicine in the database 
* @return  medicine list
*/
public static List<Medicine>  getExpiringMedicineCount() throws HibernateException{
    
    return MedicineDAO.getExpiringMedicineCount();
}
    
}
