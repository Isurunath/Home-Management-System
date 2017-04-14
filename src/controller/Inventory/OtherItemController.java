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
import model.Inventory.Otheritem;
import org.hibernate.HibernateException;
import services.Inventory.OtherItemService;

/**
 *
 * @author Nipuni
 */
public class OtherItemController {
 
    /**
     * Add a otherItem in the database
     * @param otherItem A OtherItem Object
     * @return whether execution of the query is success or not
     */
     public static boolean addOtherItem(Otheritem otherItem) throws HibernateException{
        return OtherItemService.addOtherItem(otherItem);
    }
 
    /**
     * Load Selected otherItem details to the table in settings according to
     * given item code
     * @param itemCode OtherItem 
     * @return  List of selected otherItem
     */
    public static ArrayList<String> SearchOtherItem(String itemCode) throws HibernateException{
        
          List<Otheritem> itemList=OtherItemService.searchOtherItemByItemCode(itemCode);
          Iterator itr=itemList.iterator();
          
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
     * Update  otherItem details in the database
     * @param otheritem A Other Item Object
     * @return whether execution of the query is success or not
     */
    public static boolean EditOtherItemDetails(Otheritem otheritem) throws HibernateException{
        
        return OtherItemService.updateOtherItem(otheritem);
        
    }

      /**
     * Delete a otherItem in the database
     * @param itemCode
     * @return whether execution of the query is success or not 
     */
    public static int deleteOtherItem(String itemCode) throws HibernateException{
        
        return OtherItemService.deleteOtherItem(itemCode);
        
    }
 
    /**
     * Load Selected otherItem details to the table in settings according to
     * given name
     * @param name OtherItem 
     * @return  List of selected otherItem
     */
  public static DefaultTableModel searchOtherItemByName(String name)throws HibernateException{
      
      List<Otheritem> itemList=OtherItemService.searchOtherItemByName(name);
      Iterator itr=itemList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("Description");
      tableHeaders.add("Usage");
      
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
     * Load Selected otherItem details to the table in settings according to given usage
     * @param usage OtherItem 
     * @return  List of selected otherItem
     */
    public static DefaultTableModel searchOtherItemByUsage(String usage) throws HibernateException{
        
      List<Otheritem> itemList=OtherItemService.searchOtherItemByUsage(usage);
      Iterator itr=itemList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("Description");
      
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
     * Load Selected otherItem details to the table in settings according to
     * given name and location
     * @param name OtherItem 
     * @param location OtherItem 
     * @return  List of selected otherItem
     */
  public static DefaultTableModel searchOtherItemByNameAndLocation(String name,String location)throws HibernateException{
      
      List<Otheritem> itemList=OtherItemService.searchOtherItemByNameAndLocation(name, location);
       Iterator itr=itemList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("Description");
      tableHeaders.add("Usage");
      
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
* Load OtherItem details to the table in settings according to requirement
* @return  otherItem list
*/
  public static DefaultTableModel getOtherItemList_2() throws HibernateException{
      
      List<Otheritem> itemList=OtherItemService.getOtherItemDetails_2();
      Iterator itr=itemList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("Description");
      tableHeaders.add("Usage");
      
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
* Load all Other Item names in the database
* @return  otherItem name list
*/
   public static List<Otheritem> getOtherItemName(){
        return OtherItemService.getOtherItemName();
    }
 
/**
* Load all Location in the database
* @return  location list
*/
  public static List<Otheritem> getOtherItemLocation(){
        return OtherItemService.getOtherItemLocation();
    }

/**
* Load all usages in the database
* @return  usage list
*/
public static List<Otheritem>  getOtherItemUsage() throws HibernateException{
    
    return OtherItemService.getOtherItemUsage();
 }
    
}
