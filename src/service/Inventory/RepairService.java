/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.Inventory;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import dao.Inventory.RepairDAO;
import java.util.List;
import model.Inventory.Repair;
import org.hibernate.HibernateException;
import utility.Validations;

/**
 *
 * @author Nipuni
 */
public class RepairService {

    /**
     * Add a repair in the database
     * @param repair A Repair Object
     * @return result whether execution of the query is success or not
     */
    public static boolean addRepair(Repair repair) throws HibernateException{
        boolean result=false;
        
        if(Validations.Validate(repair)){
           RepairDAO.addRepair(repair);
                    result=true;
        }else{
            result=false;
        }
        
        return result;

    }

     /**
     * Update  repair details in the database
     * @param repair A Repair Object
     * @return result whether execution of the query is success or not
     */
    public static boolean updateRepair(Repair repair) throws HibernateException{
        
        boolean result=false;
        
       if(Validations.Validate(repair)){
           RepairDAO.updateRepair(repair);
            result=true;
        }else{
            result=false;
        }
        
        return result;
     }

      /**
     * Delete a repair in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
    public static int deleteRepair(String itemCode) throws HibernateException{

             return RepairDAO.deleteRepair(itemCode);
     }

    /**
     * Load Selected repair details to the table in settings according to
     * given item code
     * @param itemCode Repair 
     * @return  List of selected repair
     */
    public static List<Repair> searchRepairByItemCode(String itemCode) throws HibernateException{

            return RepairDAO.searchRepairByItemCode(itemCode);

    }

    /**
     * Load Selected repair details to the table in settings according to
     * given name
     * @param name Repair 
     * @return  List of selected repair
     */
    public static List<Repair> searchRepairByName(String name) throws HibernateException{

            return RepairDAO.searchRepairByName(name);
    }

    /**
     * Load Selected repair details to the table in settings according to
     * given name and technician
     * @param name Repair 
     * @param techName Repair 
     * @return  List of selected repair
     */
    public static List<Repair> searchRepairByNameAndTechnician(String name,String techName) throws HibernateException{

            return RepairDAO.searchRepairByNameAndTechnician(name, techName);

    }
 
     /**
     * Load Selected repair details to the table in settings according to
     * given name
     * @param techName  Repair 
     * @return  List of selected repair
     */
    public static List<Repair> searchRepairByTechnician(String techName) throws HibernateException{

            return RepairDAO.searchRepairByTechnician(techName);

    }

    /**
     * Load Repair details to the table in settings according to
     * requirement
     * @return  repair list
     */
    public static List<Repair>  getRepairDetails_1() throws HibernateException{

            return RepairDAO.getRepairDetails_1();

        }

/**
* Load Repair details to the table in settings according to
* requirement
* @return  repair list
*/
    public static List<Repair>  getRepairDetails_2() throws HibernateException{

            return RepairDAO.getRepairDetails_2();
    }

/**
 * Load Selected repair details to the table in settings according to
 * given date
 * @param date Repair 
 * @return  List of selected repair
 */
  public static List<Repair>  getRepairByDate(String date) throws HibernateException{

            return RepairDAO.getRepairByDate(date);
  }
 
    /**
     * Load Item codes of Repairing items to the table in settings according to
     * selected category
     * @param category 
     * @return  repair list
     */
  public static List<Repair>  getSelectedCategoryRepairItemCode(String category) throws HibernateException{

            return RepairDAO.getSelectedCategoryRepairItemCodes(category);
  }
 
    /**
     * Load Item codes of Repairing items to the table in settings according to
     * selected category
     * @param category
     *  @param name
     * @return  repair item name list
     */
  public static List<Repair>  getSelectedCategoryRepairItemNames(String category,String name) throws HibernateException{

            return RepairDAO.getRepairsByNamesAndCategory(category, name);
  }
  
     /**
     * Load Item codes of Repairing item names to the combo box in settings according to
     * @param category
     * @return  repair item name list
     */
 public static List<Repair>  getRepairItemNames(String category) throws HibernateException{

            return RepairDAO.getSelectedCategoryRepairNames(category);
  }
 
     /**
     * Load Item codes of Repairing item names to the combo box in settings according to
     * selected category
     * @param category
     * @return  repair item name list
     */
  public static List<Repair>  getSelectedCategoryRepairItemName(String category) throws HibernateException{

            return RepairDAO.getSelectedCategoryRepairNames(category);
  }
  
     /**
     * Count Repairing items according to current month
     * @return  repair item list
     */
        public static String  getMonthlyRepairCount() throws HibernateException{
            
            return String.valueOf(RepairDAO.getMonthlyRepairCount());
    }
        
     /**
     * Load Repairing items to the table according to current month
     * @return  repair item list
     */
        public static List<Repair>  getMonthlyRepair() throws HibernateException{
            
            return RepairDAO.getMonthlyRepair();
    }
        
     /**
     * Count Returning Repairing items according to current date
     * @return  repair item list
     */
        public static List<Repair>  getReturnRepairCount() throws HibernateException{
            
            return RepairDAO.getReturnRepairCount();
    }
        
     /**
     * Load Returning Repairing items to the table according to current date
     * @return  repair item list
     */
        public static List<Repair>  getReturnRepair() throws HibernateException{
            
            return RepairDAO.getReturnRepair();
        
    }
}
