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
import model.Inventory.Furniture;
import org.hibernate.HibernateException;
import services.Inventory.FurnitureService;


/**
 *
 * @author Nipuni
 */
public class FurnitureController {

    /**
     * Add a furniture in the database
     * @param furniture A Furniture Object
     * @return result whether execution of the query is success or not
     */
   public static boolean addFurniture(Furniture furniture) throws HibernateException{
        return FurnitureService.addFurniture(furniture);
    }
   
    /**
     * Load Selected furniture details to the table in settings according to
     * given item code
     * @param itemCode Furniture 
     * @return  List of selected furniture
     */
    public static ArrayList<String> SearchItem(String itemCode) throws HibernateException{
        
          List<Furniture> furnitureList=FurnitureService.searchFurnitureByItemCode(itemCode);
          
          Iterator itr=furnitureList.iterator();
          
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
              searchlist.add(String.valueOf(obj[9]));
          }
          
          return searchlist;
    }

     /**
     * Update  furniture details in the database
     * @param furniture A Furniture Object
     * @return result whether execution of the query is success or not
     */   
    public static boolean EditFurnitureDetails(Furniture furniture) throws HibernateException{
        
        return FurnitureService.updateFurniture(furniture);
        
    }

     /**
     * Delete a furniture in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
    public static int deleteFurniture(String itemCode) throws HibernateException{
        
        return FurnitureService.deleteFurniture(itemCode);
        
    }
 
    /**
     * Load Selected furniture details to the table in settings according to
     * given name
     * @param name Furniture 
     * @return  List of selected furniture
     */
  public static DefaultTableModel searchFurnitureByName(String name)throws HibernateException{
      
      List<Furniture> furnitureList=FurnitureService.searchFurnitureByName(name);
       Iterator itr = furnitureList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("Payment Method");
      tableHeaders.add("Warranty Period");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("Payment Period");
      
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
     * Load Selected furniture details to the table in settings according to
     * given name and location
     * @param name Furniture 
     * @param location Furniture 
     * @return  List of selected furniture
     */      
  public static DefaultTableModel searchFurnitureByNameAndLocation(String name,String location)throws HibernateException{
      
      List<Furniture> furnitureList=FurnitureService.searchFurnitureByNameAndLocation(name, location);
       Iterator itr = furnitureList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("Payment Method");
      tableHeaders.add("Warranty Period");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("Payment Period");
      
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
     * Load Selected furniture details to the table in settings according to
     * given name and seller name
     * @param name Furniture 
     * @param nameOfSeller Furniture 
     * @return  List of selected furniture
     */
    public static DefaultTableModel searchFurnitureByNameAndNameOfSeller(String name,String nameOfSeller) throws HibernateException{

       List<Furniture> furnitureList=FurnitureService.searchFurnitureByNameAndNameOfSeller(name, nameOfSeller);
       Iterator itr = furnitureList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("Payment Method");
      tableHeaders.add("Warranty Period");
      tableHeaders.add("Payment Period");
      
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
     * Load Selected furniture details to the table in settings according to given seller name
     * @param nameOfSeller Furniture 
     * @return  List of selected furniture
     */
    public static DefaultTableModel searchFurnitureByNameOfSeller(String nameOfSeller) throws HibernateException{

          List<Furniture> furnitureList=FurnitureService.searchFurnitureByNameOfSeller(nameOfSeller); 
          Iterator itr = furnitureList.iterator();

          Vector<String> tableHeaders=new Vector<String>();
          Vector dataTable=new Vector();

              tableHeaders.add("Item Code");
              tableHeaders.add("Name");
              tableHeaders.add("Location");
              tableHeaders.add("Qty");
              tableHeaders.add("Price");
              tableHeaders.add("User");
              tableHeaders.add("Date");
              tableHeaders.add("Payment Method");
              tableHeaders.add("Warranty Period");
              tableHeaders.add("Payment Period");
      
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
     * Load Furniture details to the table in settings according to
     * requirement
     * @return  furniture list
     */
    public static DefaultTableModel getAllFurnitureList_1()throws HibernateException{
      
      List<Furniture> furnitureList=FurnitureService.getFurnitureDetails_1(); 
      Iterator itr = furnitureList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();

      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("Payment Method");
      tableHeaders.add("Warranty Period");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("Payment Period");
      
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
     * Load Furniture details to the table in settings according to
     * requirement
     * @return  furniture list
     */
  public static DefaultTableModel getAllFurnitureList_2()throws HibernateException{
      
      List<Furniture> furnitureList=FurnitureService.getFurnitureDetails_2(); 
      Iterator itr=furnitureList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("Payment Method");
      tableHeaders.add("Warranty Period");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("Payment Period");
      
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
            row.add(String.valueOf(obj[10]));
          
          dataTable.add(row);    
      }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
     
  }
  
     /**
     * Load Installment payment details of furnitures and details of furnitures
     * @return  List of furnitures
     */
    public static DefaultTableModel getInstallmentPaymentNotificationOfFurniture() throws HibernateException{
        
      List<Furniture> furnitureList=FurnitureService.getInstallmentPaymentNotificationOfFurniture();
      Iterator itr = furnitureList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Qty");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("Price");
      tableHeaders.add("Period Of Payment");
      
       while (itr.hasNext()) {
            Object[] obj = (Object[]) itr.next();
            
            Vector<Object> row = new Vector<Object>();
            
            row.add(String.valueOf(obj[0]));
            row.add(String.valueOf(obj[1]));
            row.add(String.valueOf(obj[2]));
            row.add(String.valueOf(obj[3]));
            row.add(String.valueOf(obj[4]));
            row.add(String.valueOf(obj[5]));
            
            dataTable.add(row); 
        }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
    }

/**
* Load all Furniture names in the database 
* @return  furniture name list
*/
   public static List<Furniture> getFurnitureName(){
        return FurnitureService.getFurnitureName();
    }
 
/**
* Load all Furniture location in the database 
* @return  furniture location list
*/
  public static List<Furniture> getFurnitureLocation(){
        return FurnitureService.getFurnitureLocation();
    }
  
  /**
* Load all Sellers in the database 
* @return  names of sellers list
*/
public static List<Furniture>  getFurnitureSellers() throws HibernateException{
 
          return FurnitureService.getFurnitureSellers();
 }
    
}
