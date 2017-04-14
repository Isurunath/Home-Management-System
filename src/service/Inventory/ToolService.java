/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.Inventory;

import dao.Inventory.ToolDAO;
import java.util.List;
import model.Inventory.Tool;
import org.hibernate.HibernateException;
import utility.Validations;

/**
 *
 * @author Nipuni
 */
public class ToolService {

    /**
     * Add a tool in the database
     * @param tool A Tool Object
     * @return result whether execution of the query is success or not
     */
      public static boolean addTool(Tool tool) throws HibernateException{
          boolean result=false;
        
          if(Validations.Validate(tool)){
           ToolDAO.addTool(tool);
                    result=true;
          }else{
            result=false;
          }
        
          return result;

    }

     /**
     * Update a tool in the database
     * @param tool A Tool Object
     * @return result whether execution of the query is success or not
     */
    public static boolean updateTool(Tool tool) throws HibernateException{
          boolean result=false;
        
          if(Validations.Validate(tool)){
           ToolDAO.updateTool(tool);
                    result=true;
          }else{
            result=false;
          }
        
          return result;

    }

      /**
     * Delete a tool in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
    public static int deleteTool(String itemCode) throws HibernateException{

             return ToolDAO.deleteTool(itemCode);
     }

    /**
     * Load Selected tool details to the table in settings according to
     * given item code
     * @param itemCode Tool 
     * @return  List of selected tool
     */
    public static List<Tool> searchToolByItemCode(String itemCode) throws HibernateException{

            return ToolDAO.searchToolByItemCode(itemCode);

    }

    /**
     * Load Selected tool details to the table in settings according to given name
     * @param name Tool 
     * @return  List of selected tool
     */
    public static List<Tool> searchToolByName(String name) throws HibernateException{

            return ToolDAO.searchToolByName(name);
    }
    
    /**
     * Load Selected tool details to the table in settings according to given seller
     * @param nameOfSeller Tool 
     * @return  List of selected tool
     */
    public static List<Tool> searchToolByNameOfSeller(String nameOfSeller) throws HibernateException{
        
        return ToolDAO.searchToolByNameOfSeller(nameOfSeller);
    }

/**
     * Load Selected tool details to the table in settings according to
     * given name and location
     * @param name Tool 
     * @param location Tool 
     * @return  List of selected tool
     */
    public static List<Tool> searchToolByNameAndLocation(String name,String location) throws HibernateException{

            return ToolDAO.searchToolByNameAndLocation(name, location);

    }
    
/**
     * Load Selected tool details to the table in settings according to
     * given name and location
     * @param name Tool 
     * @param nameOfSeller Tool 
     * @return  List of selected tool
     */
    public static List<Tool> searchToolByNameAndNameOfSeller(String name,String nameOfSeller) throws HibernateException{
        
        return ToolDAO.searchToolByNameAndNameOfSeller(name, nameOfSeller);
    }

    /**
     * Load Tool details to the table in settings according to requirement
     * @return  tool list
     */
    public static List<Tool>  getToolDetails_1() throws HibernateException{

            return ToolDAO.getToolDetails_1();

        }

    /**
     * Load Tool details to the table in settings according to requirement
     * @return  tool list
     */
    public static List<Tool>  getToolDetails_2() throws HibernateException{

            return ToolDAO.getToolDetails_2();
    }
 
/**
* Load all Tool names in the database
* @return  book name list
*/
  public static List<Tool>  getToolName() throws HibernateException{

            return ToolDAO.getToolName();
    }
  
/**
* Load all Location in the database
* @return  location list
*/
  public static List<Tool>  getToolLocation() throws HibernateException{

            return ToolDAO.getToolLocation();
  }
  
/**
* Load all sellers in the database
* @return  list of sellers
*/
public static List<Tool>  getToolSellers() throws HibernateException{
    
    return ToolDAO.getToolSellers();
}
    
}
