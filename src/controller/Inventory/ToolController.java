  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Inventory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.Inventory.Tool;
import org.hibernate.HibernateException;
import services.Inventory.ToolService;

/**
 *
 * @author Nipuni
 */
public class ToolController {
    
    /**
     * Add a tool in the database
     * @param tool A Tool Object
     * @return result whether execution of the query is success or not
     */
    public static boolean addTool(Tool tool) throws ClassNotFoundException,HibernateException{
        return ToolService.addTool(tool);
    }
    
    /**
     * Load Selected tool details to the table in settings according to
     * given item code
     * @param itemCode Tool 
     * @return  List of selected tool
     */
    public static ArrayList<String> SearchItem(String itemCode) throws ClassNotFoundException,HibernateException{
        
          List<Tool> toolList=ToolService.searchToolByItemCode(itemCode);
          Iterator itr=toolList.iterator();
          
          ArrayList<String> searchlist=new ArrayList<String>();
          
          while(itr.hasNext()){
              Object[] obj = (Object[]) itr.next();
              
              searchlist.add(String.valueOf(obj[0]));
              searchlist.add(String.valueOf(obj[1]));
              searchlist.add(String.valueOf(obj[2]));
              searchlist.add(String.valueOf(obj[3]));
              searchlist.add(String.valueOf(obj[4]));
              searchlist.add(String.valueOf(obj[5]));
              searchlist.add(String.valueOf(obj[6]));
              searchlist.add(String.valueOf(obj[7]));
          }
          
          return searchlist;
    }

 
     /**
     * Update a tool in the database
     * @param tool A Tool Object
     * @return result whether execution of the query is success or not
     */
    public static boolean EditToolDetails(Tool tool) throws ClassNotFoundException,HibernateException{
        
        return ToolService.updateTool(tool);
        
    }

      /**
     * Delete a tool in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
    public static int deleteTool(String itemCode) throws ClassNotFoundException,HibernateException{
        
        return ToolService.deleteTool(itemCode);
        
    }
 
    /**
     * Load Selected tool details to the table in settings according to
     * given name
     * @param name Tool 
     * @return  List of selected tool
     */
  public static DefaultTableModel searchToolByName(String name)throws ClassNotFoundException,HibernateException{
      
      List<Tool> toolList=ToolService.searchToolByName(name);
      Iterator itr=toolList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("WarrantyPeriod");
      
      while (itr.hasNext()) {
            Object[] obj = (Object[]) itr.next();
            
            Vector<Object> row = new Vector<Object>();
          
            row.add(String.valueOf(obj[0]));
            row.add(String.valueOf(obj[1]));
            row.add(String.valueOf(obj[2]));
            row.add(String.valueOf(obj[3]));
            row.add(String.valueOf(obj[4]));
            row.add(String.valueOf(obj[5]));
            row.add(String.valueOf(obj[6]));
            row.add(String.valueOf(obj[7]));
          
          dataTable.add(row);    
      }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
      
  }
  
    /**
     * Load Selected tool details to the table in settings according to given seller
     * @param nameOfSeller Tool 
     * @return  List of selected tool
     */
    public static DefaultTableModel searchToolByNameOfSeller(String nameOfSeller) throws HibernateException{
        
      List<Tool> toolList=ToolService.searchToolByNameOfSeller(nameOfSeller);
      Iterator itr=toolList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("WarrantyPeriod");
      
      while (itr.hasNext()) {
            Object[] obj = (Object[]) itr.next();
            
            Vector<Object> row = new Vector<Object>();
          
            row.add(String.valueOf(obj[0]));
            row.add(String.valueOf(obj[1]));
            row.add(String.valueOf(obj[2]));
            row.add(String.valueOf(obj[3]));
            row.add(String.valueOf(obj[4]));
            row.add(String.valueOf(obj[5]));
            row.add(String.valueOf(obj[6]));
            row.add(String.valueOf(obj[7]));
          
          dataTable.add(row);    
      }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
    }
  
  
    /**
     * Load Selected tool details to the table in settings according to
     * given name and location
     * @param name Tool 
     * @param location Tool 
     * @return  List of selected tool
     */
  public static DefaultTableModel searchToolByNameAndLocation(String name,String location)throws HibernateException{
      
      List<Tool> toolList=ToolService.searchToolByNameAndLocation(name, location);
      Iterator itr=toolList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("WarrantyPeriod");
      
      while (itr.hasNext()) {
            Object[] obj = (Object[]) itr.next();
            
            Vector<Object> row = new Vector<Object>();
          
            row.add(String.valueOf(obj[0]));
            row.add(String.valueOf(obj[1]));
            row.add(String.valueOf(obj[2]));
            row.add(String.valueOf(obj[3]));
            row.add(String.valueOf(obj[4]));
            row.add(String.valueOf(obj[5]));
            row.add(String.valueOf(obj[6]));
          
          dataTable.add(row);    
      }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
      
  }
  
/**
     * Load Selected tool details to the table in settings according to
     * given name and location
     * @param name Tool 
     * @param nameOfSeller Tool 
     * @return  List of selected tool
     */
    public static DefaultTableModel searchToolByNameAndNameOfSeller(String name,String nameOfSeller) throws HibernateException{
        
      List<Tool> toolList=ToolService.searchToolByNameAndNameOfSeller(name, nameOfSeller);
      Iterator itr=toolList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("WarrantyPeriod");
      
      while (itr.hasNext()) {
            Object[] obj = (Object[]) itr.next();
            
            Vector<Object> row = new Vector<Object>();
          
            row.add(String.valueOf(obj[0]));
            row.add(String.valueOf(obj[1]));
            row.add(String.valueOf(obj[2]));
            row.add(String.valueOf(obj[3]));
            row.add(String.valueOf(obj[4]));
            row.add(String.valueOf(obj[5]));
            row.add(String.valueOf(obj[6]));
          
          dataTable.add(row);    
      }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
    }
    
    /**
     * Load Tool details to the table in settings according to requirement
     * @return  tool list
     */ 
    public static DefaultTableModel getAllToolList_1()throws ClassNotFoundException,HibernateException{
      
      List<Tool> toolList=ToolService.getToolDetails_1(); 
      Iterator itr=toolList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();

      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("WarrantyPeriod");
      
      while (itr.hasNext()) {
            Object[] obj = (Object[]) itr.next();
            
            Vector<Object> row = new Vector<Object>();
          
            row.add(String.valueOf(obj[0]));
            row.add(String.valueOf(obj[1]));
            row.add(String.valueOf(obj[2]));
            row.add(String.valueOf(obj[3]));
            row.add(String.valueOf(obj[4]));
            row.add(String.valueOf(obj[5]));
            row.add(String.valueOf(obj[6]));
            row.add(String.valueOf(obj[7]));
          
          dataTable.add(row);    
      }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
     
  }
  
    /**
     * Load Tool details to the table in settings according to requirement
     * @return  tool list
     */
  public static DefaultTableModel getAllToolList_2()throws ClassNotFoundException,HibernateException{
      
      List<Tool> toolList=ToolService.getToolDetails_2(); 
      Iterator itr=toolList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("WarrantyPeriod");
      
      while (itr.hasNext()) {
            Object[] obj = (Object[]) itr.next();
            
            Vector<Object> row = new Vector<Object>();
          
            row.add(String.valueOf(obj[0]));
            row.add(String.valueOf(obj[1]));
            row.add(String.valueOf(obj[2]));
            row.add(String.valueOf(obj[3]));
            row.add(String.valueOf(obj[4]));
            row.add(String.valueOf(obj[5]));
            row.add(String.valueOf(obj[6]));
            row.add(String.valueOf(obj[7]));
            row.add(String.valueOf(obj[8]));
            
          dataTable.add(row);    
      }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
     
  }

/**
* Load all Tool names in the database
* @return  book name list
*/
    public static List<Tool> getToolName(){
        return ToolService.getToolName();
    }
  
/**
* Load all Location in the database
* @return  location list
*/
    public static List<Tool> getToolLocation(){
        return ToolService.getToolLocation();
    }
    
/**
* Load all sellers in the database
* @return  list of sellers
*/
public static List<Tool>  getToolSellers() throws HibernateException{
    
    return ToolService.getToolSellers();
}
    
}
