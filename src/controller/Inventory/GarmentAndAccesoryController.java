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
import model.Inventory.Garmentandaccesory;
import org.hibernate.HibernateException;
import services.Inventory.GarmentAndAccessoryService;
/**
 *
 * @author Nipuni
 */
public class GarmentAndAccesoryController {
  
    /**
     * Add a garments and accessory in the database
     * @param gaa A Garmentandaccessory Object
     * @return result whether execution of the query is success or not
     */
   public static boolean addGarmentandaccesory(Garmentandaccesory gaa) throws HibernateException{
        return GarmentAndAccessoryService.addGarmentAndAccesory(gaa);
    }
  
     /**
     * Load Selected garment and accessory details to the table in settings according to given item code
     * @param itemCode Garment And Accessory 
     * @return  List of selected garment and accessory
     */
    public static ArrayList<String> SearchItem(String itemCode) throws HibernateException{
        
          List<Garmentandaccesory> gaaList=GarmentAndAccessoryService.searchGarmentAndAccesoryByItemCode(itemCode);
          Iterator itr=gaaList.iterator();
          
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
              searchlist.add(String.valueOf(obj[8]));

          }
            return searchlist;
    }

   
     /**
     * Update  garments and accessory details in the database
     * @param gaa A Garmentandaccessory Object
     * @return result whether execution of the query is success or not
     */
    public static boolean EditGarmentandaccesoryDetails(Garmentandaccesory gaa) throws HibernateException{
        
        return GarmentAndAccessoryService.updateGarmentAndAccesory(gaa);
        
    }

      /**
     * Delete a garments and accessory in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
    public static int deleteGarmentandaccesory(String itemCode) throws HibernateException{
        
        return GarmentAndAccessoryService.deleteGarmentAndAccesory(itemCode);
        
    }
 
     /**
     * Load Selected garment and accessory details to the table in settings according to given name
     * @param name Garment And Accessory 
     * @return  List of selected garment and accessory
     */
  public static DefaultTableModel searchGarmentandaccesoryByName(String name)throws HibernateException{
      
      List<Garmentandaccesory> gaaList=GarmentAndAccessoryService.searchGarmentAndAccesoryByName(name);
      Iterator itr=gaaList.iterator();
              
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("Brand");
      tableHeaders.add("Category");
      
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
     * Load Selected garment and accessory details to the table in settings according to given seller
     * @param nameOfSeller Garment And Accessory 
     * @return  List of selected garment and accessory
     */
    public static DefaultTableModel searchGarmentAndAccessoryByNameOfSeller(String nameOfSeller) throws HibernateException{
        
      List<Garmentandaccesory> gaaList=GarmentAndAccessoryService.searchGarmentAndAccessoryByNameOfSeller(nameOfSeller);
      Iterator itr=gaaList.iterator();


      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();

              tableHeaders.add("Item Code");
              tableHeaders.add("Name");
              tableHeaders.add("Location");
              tableHeaders.add("Qty");
              tableHeaders.add("Price");
              tableHeaders.add("User");
              tableHeaders.add("Date");
              tableHeaders.add("Brand");
              tableHeaders.add("Category");
      
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
     * Load Selected garment and accessory details to the table in settings according to given name and location
     * @param name Garment And Accessory 
     * @param location Garment And Accessory 
     * @return  List of selected garment and accessory
     */      
  public static DefaultTableModel searchGarmentandaccesoryByNameAndLocation(String name,String location)throws HibernateException{
      
      List<Garmentandaccesory> gaaList=GarmentAndAccessoryService.searchGarmentAndAccesoryByNameAndLocation(name, location);
      Iterator itr=gaaList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("Brand");
      tableHeaders.add("Category");
      
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
     * Load Selected garment and accessory details to the table in settings according to given name and seller
     * @param name Garment And Accessory 
     * @param nameOfSeller Garment And Accessory 
     * @return  List of selected garment and accessory
     */
    public static DefaultTableModel searchGarmentAndAccessoryByNameAndNameOfSeller(String name,String nameOfSeller) throws HibernateException{
        
          List<Garmentandaccesory> gaaList=GarmentAndAccessoryService.searchGarmentAndAccessoryByNameAndNameOfSeller(name, nameOfSeller);
          Iterator itr=gaaList.iterator();

          Vector<String> tableHeaders=new Vector<String>();
          Vector dataTable=new Vector();
      
              tableHeaders.add("Item Code");
              tableHeaders.add("Location");
              tableHeaders.add("Qty");
              tableHeaders.add("Price");
              tableHeaders.add("User");
              tableHeaders.add("Date");
              tableHeaders.add("Brand");
              tableHeaders.add("Category");
      
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
     * Load Furniture details to the table in settings according to requirement
     * @return  furniture list
     */
   public static DefaultTableModel getAllGarmentandaccesoryList_2()throws ClassNotFoundException,HibernateException{
      
      List<Garmentandaccesory> gaaList=GarmentAndAccessoryService.getGarmentAndAccesoryDetails_2();
      Iterator itr=gaaList.iterator();
      
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
      tableHeaders.add("Brand");
      tableHeaders.add("Category");
      
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
            row.add(String.valueOf(obj[9]));
          
          dataTable.add(row);    
       }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
     
  }
  
    /**
     * Load Furniture details to the table in settings according to requirement
     * @return  furniture list
     */
  public static DefaultTableModel getAllGarmentandaccesoryList_1()throws ClassNotFoundException,HibernateException{
      
      List<Garmentandaccesory> gaaList=GarmentAndAccessoryService.getGarmentAndAccesoryDetails_2();
      Iterator itr=gaaList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("Brand");
      tableHeaders.add("Category");
      
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
            row.add(String.valueOf(obj[9]));
          
          dataTable.add(row);    
       }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
     
  }
 
 /**
* Load all GarmentAndAccesory names in the database
* @return  book name list
*/
      public static List<Garmentandaccesory> getGarmentAndAccesoryName(){
        return GarmentAndAccessoryService.getGarmentAndAccesoryName();
    }
    
 /**
* Load all Location in the database 
* @return  location list
*/
    public static List<Garmentandaccesory> getGarmentAndAccesoryLocation(){
        return GarmentAndAccessoryService.getGarmentAndAccesoryLocation();
    }
    
/**
* Load all sellers in the database 
* @return  list of sellers
*/
public static List<Garmentandaccesory>  getGarmentAndAccesorySellers() throws HibernateException{
    
    return GarmentAndAccessoryService.getGarmentAndAccesorySellers();
}
    
}
