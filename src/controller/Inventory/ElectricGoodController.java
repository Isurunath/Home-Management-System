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
import model.Inventory.ElectricalGoods;
import org.hibernate.HibernateException;
import service.Inventory.ElectricalGoodsService;

/**
 *
 * @author Nipuni
 */
public class ElectricGoodController {
 
 /**
 * Add a electric item in the database
 * @param electricGoods A ElectricGoods Object
 * @return result whether execution of the query is success or not
 */
    public static boolean addElectricaItem(ElectricalGoods electricGoods) throws HibernateException{
        return ElectricalGoodsService.addElectricaItem(electricGoods);
    }
 
 /**
 * Load Selected electric good details to the table in settings according to given item code
 * @param itemCode Electric Good 
 * @return  List of selected electric good
 */
    public static ArrayList<String> SearchItem(String itemCode) throws HibernateException{
          List<ElectricalGoods> elecricItemList=ElectricalGoodsService.searchElectricGoodByItemCode(itemCode);
          Iterator itr=elecricItemList.iterator();
          
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
              searchlist.add(String.valueOf(obj[10]));
          }
          
          return  searchlist;
          
    }

 /**
 * Update a electric item in the database
 * @param electricGoods A ElectricGoods Object
 * @return result whether execution of the query is success or not
 */   
    public static boolean EditElectricGood(ElectricalGoods electricGoods) throws HibernateException{
        
        return ElectricalGoodsService.updateElectricaItem(electricGoods);
        
    }

 /**
 * Delete a electric item in the database
 * @param itemCode
 * @return result whether execution of the query is success or not
 */
    public static int deleteElectricGood(String itemCode) throws HibernateException{
        
        return ElectricalGoodsService.deleteElectricaItem(itemCode);
        
    }
    
 /**
 * Load Selected electric good details to the table in settings according to given name
 * @param name Electric Good 
 * @return  List of selected electric good
 */
  public static DefaultTableModel searchElectricItemByName(String name)throws HibernateException{
      
      List<ElectricalGoods> electricItemList=ElectricalGoodsService.searchElectricGoodByName(name);
      Iterator itr = electricItemList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("User");
      tableHeaders.add("Input Power");
      tableHeaders.add("Brand");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("Date");
      tableHeaders.add("Price");
      tableHeaders.add("Method Of Payment");
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
 * Load Selected electric good details to the table in settings according to given name and location
 * @param name Electric Good 
 * @param location Electric Good 
 * @return  List of selected electric good
 */       
  public static DefaultTableModel searchElectricItemByNameAndLocation(String name,String location)throws HibernateException{
      
      List<ElectricalGoods> electricItemList=ElectricalGoodsService.searchElectricGoodByNameAndLocation(name, location);
      Iterator itr = electricItemList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Qty");
      tableHeaders.add("User");
      tableHeaders.add("Input Power");
      tableHeaders.add("Brand");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("Date");
      tableHeaders.add("Price");
      tableHeaders.add("Method Of Payment");
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
            row.add(String.valueOf(obj[6]));
            row.add(String.valueOf(obj[7]));
            row.add(String.valueOf(obj[8]));
            row.add(String.valueOf(obj[9]));
          
          dataTable.add(row);    
      }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
      
  }
  
 /**
 * Load Selected electric good details to the table in settings according to given name of the seller
 * @param nameOfSeller Electric Good  
 * @return  List of selected electric good
 */
    public static DefaultTableModel searchElectricGoodByNameOfSeller(String nameOfSeller) throws HibernateException{
        
      List<ElectricalGoods> electricItemList=ElectricalGoodsService.searchElectricGoodByNameOfSeller(nameOfSeller);
      Iterator itr = electricItemList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("User");
      tableHeaders.add("Input Power");
      tableHeaders.add("Brand");
      tableHeaders.add("Date");
      tableHeaders.add("Price");
      tableHeaders.add("Method Of Payment");
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
 * Load Selected electric good details to the table in settings according to given name and name of the seller
 * @param name Electric Good 
 * @param nameOfSeller Electric Good 
 * @return  List of selected electric good
 */
    public static DefaultTableModel searchElectricGoodByNameAndNameOfSeller(String name,String nameOfSeller) throws HibernateException{

      List<ElectricalGoods> electricItemList=ElectricalGoodsService.searchElectricGoodByNameAndNameOfSeller(name, nameOfSeller);
      Iterator itr = electricItemList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("User");
      tableHeaders.add("Input Power");
      tableHeaders.add("Brand");
      tableHeaders.add("Date");
      tableHeaders.add("Price");
      tableHeaders.add("Method Of Payment");
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
            row.add(String.valueOf(obj[6]));
            row.add(String.valueOf(obj[7]));
            row.add(String.valueOf(obj[8]));
            row.add(String.valueOf(obj[9]));
          
          dataTable.add(row);    
      }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
        
    }

 /**
 * Load Selected electric good details to the table in settings according to given brand
 * @param brand Electric Good  
 * @return  List of selected electric good
 */
    public static DefaultTableModel searchElectricGoodByBrand(String brand) throws HibernateException{

      List<ElectricalGoods> electricItemList=ElectricalGoodsService.searchElectricGoodByBrand(brand);
      Iterator itr = electricItemList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("User");
      tableHeaders.add("Input Power");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("Date");
      tableHeaders.add("Price");
      tableHeaders.add("Method Of Payment");
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
 * Load Electric Good details to the table in settings according to requirement
 * @return  electric good list
 */
    public static DefaultTableModel getAllElectricGoodsList_2() throws HibernateException{
        
         List<ElectricalGoods> electricList =ElectricalGoodsService.getElectricItemDetails_2();
         Iterator itr = electricList.iterator();
         
        Vector<String> tableHeaders = new Vector<String>();
        Vector dataTable = new Vector();
        
            tableHeaders.add("Item Code");
            tableHeaders.add("Name");
            tableHeaders.add("Location");
            tableHeaders.add("Qty");
            tableHeaders.add("User");
            tableHeaders.add("Input Power");
            tableHeaders.add("Brand");
            tableHeaders.add("Name Of The Seller");
            tableHeaders.add("Date");
            tableHeaders.add("Price");
            tableHeaders.add("Method Of Payment");
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
            row.add(String.valueOf(obj[6]));
            row.add(String.valueOf(obj[7]));
            row.add(String.valueOf(obj[8]));
            row.add(String.valueOf(obj[9]));
            row.add(String.valueOf(obj[10]));
            System.out.println("THARAKA");
            row.add(String.valueOf(obj[11]));
            
            dataTable.add(row); 
        }
        
        return (new DefaultTableModel(dataTable, tableHeaders));
      
  }

 /**
 * Load Electric Good details to the table in settings according to requirement
 * @return  electric good list
 */
  public static DefaultTableModel getAllElectricGoodsList_1()throws ClassNotFoundException,HibernateException{
      
      List<ElectricalGoods> electricItemList=ElectricalGoodsService.getElectricItemDetails_1();
      Iterator itr = electricItemList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("User");
      tableHeaders.add("Input Power");
      tableHeaders.add("Brand");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("Date");
      tableHeaders.add("Price");
      tableHeaders.add("Method Of Payment");
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
     * Load Installment payment details of electric goods and details of electric goods
     * @return  List of electric goods
     */
    public static DefaultTableModel getInstallmentPaymentNotificationOfElectricItem() throws HibernateException{
        
      List<ElectricalGoods> electricItemList=ElectricalGoodsService.getInstallmentPaymentNotificationOfElectricItem();
      Iterator itr = electricItemList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Qty");
      tableHeaders.add("Brand");
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
            row.add(String.valueOf(obj[6]));
            
            dataTable.add(row); 
        }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
    }

/**
* Load all Electric Good names in the database 
* @return  electric good name list
*/ 
    public static List<ElectricalGoods> getElectrcItemName(){
        return ElectricalGoodsService.getElectricItemName();
    }

/**
* Load all Location in the database 
* @return  location list
*/ 
    public static List<ElectricalGoods> getElectrcItemLocation(){
        return ElectricalGoodsService.getElectricItemLocation();
    }
    
/**
 * Load item codes of electric goods in the database
 * @return  List of selected electric good
 */ 
    
    public static List<ElectricalGoods> getElectrcItemCode(){
        return ElectricalGoodsService.getElectricItemCode();
    }
    
    /**
     * Load sellers names of electric goods in the database
     * @return  List of electric good sellers
     */
    public static List<ElectricalGoods> getElectricGoodSellers() throws HibernateException{
          return ElectricalGoodsService.getElectricGoodSellers(); 
    }
 
     /**
     * Load brand names of electric goods in the database
     * @return  List of electric good brands
     */
    public static List<ElectricalGoods> getElectricGoodBrands() throws HibernateException{
          return ElectricalGoodsService.getElectricGoodBrands();  
    }
    
         /**
     * Get electric good name according to given itemCode
     * @param itemCode Electric Good  
     * @return  List of selected electric good
     */
    public static String getElectricGoodNameByItemCode(String itemCode) throws HibernateException{

        return String.valueOf(ElectricalGoodsService.getElectricGoodNameByItemCode(itemCode));
        
    }
}
