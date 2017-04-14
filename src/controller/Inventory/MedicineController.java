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
import model.Inventory.Medicine;
import org.hibernate.HibernateException;
import services.Inventory.MedicineService;


/**
 *
 * @author Nipuni
 */
public class MedicineController {
   
    /**
     * Add a medicine in the database
     * @param medicine A Medicine Object
     * @return result whether execution of the query is success or not
     */
    public static boolean addMedicine(Medicine medicine) throws HibernateException{
        return MedicineService.addMedicine(medicine);
    }

    /**
     * Load Selected medicine details to the table in settings according to
     * given item code
     * @param itemCode Medicine
     * @return  List of selected medicine
     */
    public static ArrayList<String> searchMedicineByItemCode(String itemCode) throws HibernateException{
          List<Medicine> medicineItemList=MedicineService.searchMedicineByItemCode(itemCode);
          Iterator itr=medicineItemList.iterator();
          
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
     * Update a medicine in the database
     * @param medicine A Medicine Object
     * @return result whether execution of the query is success or not
     */    
    public static boolean EditMedicine(Medicine medicine) throws HibernateException{
        
        return MedicineService.updateMedicine(medicine);
        
    }

      /**
     * Delete a medicine in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
    public static int deleteMedicine(String itemCode) throws HibernateException{
        
        return MedicineService.deleteMedicine(itemCode);
        
    }

    /**
     * Load Selected medicine details to the table in settings according to
     * given name
     * @param name Medicine 
     * @return  List of selected medicine
     */
  public static DefaultTableModel searchMedicineByName(String name)throws HibernateException{
      
      List<Medicine> medicineList=MedicineService.searchMedicineByName(name);
      Iterator itr=medicineList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("NameOfDoctor");
      tableHeaders.add("Description");
      tableHeaders.add("ExpDate");
      tableHeaders.add("Name Of The Seller");
      
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
     * Load Selected medicine details to the table in settings according to given description
     * @param description Medicine 
     * @return  List of selected medicine
     */
    public static DefaultTableModel searchMedicineByDescription(String description) throws HibernateException{

      List<Medicine> medicineList=MedicineService.searchMedicineByDescription(description);
      Iterator itr=medicineList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("NameOfDoctor");
      tableHeaders.add("ExpDate");
      tableHeaders.add("Name Of The Seller");
      
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
     * Load Selected medicine details to the table in settings according to given seller
     * @param nameOfSeller Medicine
     * @return  List of selected medicine
     */
    public static DefaultTableModel searchMedicineByNameOfSeller(String nameOfSeller) throws HibernateException{

      List<Medicine> medicineList=MedicineService.searchMedicineByNameOfSeller(nameOfSeller);
      Iterator itr=medicineList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("NameOfDoctor");
      tableHeaders.add("Description");
      tableHeaders.add("ExpDate");
      
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
     * Load Selected medicine details to the table in settings according to
     * given name and location
     * @param name Medicine 
     * @param location Medicine 
     * @return  List of selected medicine
     */
  public static DefaultTableModel searchMedicineByNameAndLocation(String name,String location)throws HibernateException{
      
      List<Medicine> medicineList=MedicineService.searchMedicineByNameAndLocation(name, location);
      Iterator itr=medicineList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("NameOfDoctor");
      tableHeaders.add("Description");
      tableHeaders.add("ExpDate");
      tableHeaders.add("Name Of The Seller");
      
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
     * Load Selected medicine details to the table in settings according to given name and name of seller
     * @param name Medicine 
     * @param nameOfSeller Medicine 
     * @return  List of selected medicine
     */
    public static DefaultTableModel searchMedicineByNameAndNameOfSeller(String name,String nameOfSeller) throws HibernateException{
        
      List<Medicine> medicineList=MedicineService.searchMedicineByNameAndNameOfSeller(name, nameOfSeller);
      Iterator itr=medicineList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("NameOfDoctor");
      tableHeaders.add("Description");
      tableHeaders.add("ExpDate");
      
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
     * Load Medicine details to the table in settings according to requirement
     * @return  medicine list
     */
    public static DefaultTableModel getAllMedicineList_2()throws ClassNotFoundException,HibernateException{
      
      List<Medicine> medicineList=MedicineService.getMedicineDetails_2();
      Iterator itr=medicineList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("Name Of Doctor");
      tableHeaders.add("Description");
      tableHeaders.add("ExpDate");
      tableHeaders.add("Name Of The Seller");
      
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
     * Load Medicine details to the table in settings according to requirement
     * @return  medicine list
     */
  public static DefaultTableModel getAllMedicineList_1()throws ClassNotFoundException,HibernateException{
      
      List<Medicine> medicineList=MedicineService.getMedicineDetails_1();
      Iterator itr=medicineList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();

      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Date");
      tableHeaders.add("NameOfDoctor");
      tableHeaders.add("Description");
      tableHeaders.add("ExpDate");
      tableHeaders.add("Name Of The Seller");
      
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
* Load all expiring medicine in the database 
* @return  medicine list
*/
public static DefaultTableModel  getExpiringMedicine() throws HibernateException{
    
      List<Medicine> medicineList=MedicineService.getExpiringMedicine();
      Iterator itr=medicineList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();

      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("NameOfDoctor");
      tableHeaders.add("Description");
      tableHeaders.add("ExpDate");
      tableHeaders.add("Name Of The Seller");
      
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
* Load all Medicine names in the database
* @return  medicine name list
*/
    public static List<Medicine> getMedicineName(){
        return MedicineService.getMedicineName();
    }
 
/**
* Load all Location in the database 
* @return  location list
*/
    public static List<Medicine> getMedicineLocation(){
        return MedicineService.getMedicineLocation();
    }
    
/**
* Load all sellers in the database 
* @return  sellers list
*/
public static List<Medicine>  getMedicineSellers() throws HibernateException{
    
    return MedicineService.getMedicineSellers();
}

/**
* Load all descriptions in the database 
* @return  descriptions list
*/
public static List<Medicine>  getMedicineDecription() throws HibernateException{
    
    return MedicineService.getMedicineDecription();
}
}
