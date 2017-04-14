/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Inventory;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.Inventory.Repair;
import org.hibernate.HibernateException;
import services.Inventory.RepairService;

/**
 *
 * @author Nipuni
 */
public class RepairController {

    /**
     * Add a repair in the database
     * @param repair A Repair Object
     * @return result whether execution of the query is success or not
     */
   public static boolean addRepair(Repair repair) throws HibernateException{
        return RepairService.addRepair(repair);
    }
 
    /**
     * Load Selected repair details to the table in settings according to
     * given item code
     * @param itemCode Repair 
     * @return  List of selected repair
     */
    public static DefaultTableModel SearchItem(String itemCode) throws HibernateException{
        
          List<Repair> repairList=RepairService.searchRepairByItemCode(itemCode);
          Iterator itr=repairList.iterator();

      
          Vector<String> tableHeaders=new Vector<String>();
          Vector dataTable=new Vector();

          tableHeaders.add("Name");
          tableHeaders.add("Technician ID");
          tableHeaders.add("Technician Name");
          tableHeaders.add("Date Of Repairing");
          tableHeaders.add("Payment");
          tableHeaders.add("Description");
          tableHeaders.add("Category");
          tableHeaders.add("Return Date");

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
     * Update  repair details in the database
     * @param repair A Repair Object
     * @return result whether execution of the query is success or not
     */
    public static boolean EditRepairDetails(Repair repair) throws HibernateException{
        
        return RepairService.updateRepair(repair);
        
    }

      /**
     * Delete a repair in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
    public static int deleteRepair(String itemCode) throws HibernateException{
        
        return RepairService.deleteRepair(itemCode);
        
    }
 
    /**
     * Load Selected repair details to the table in settings according to
     * given name
     * @param name Repair 
     * @return  List of selected repair
     */
  public static DefaultTableModel searchRepairByName(String name)throws HibernateException{
      
      List<Repair> repairList=RepairService.searchRepairByName(name);
      Iterator itr=repairList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Technician Name");
      tableHeaders.add("Date Of Repairing");
      tableHeaders.add("Payment");
      tableHeaders.add("Description");
      tableHeaders.add("Category");
      tableHeaders.add("Return Date");
      
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
     * Load Selected repair details to the table in settings according to
     * given name and technician
     * @param name Repair 
     * @param technicianName Repair 
     * @return  List of selected repair
     */      
  public static DefaultTableModel searchRepairByNameAndTechnician(String name,String technicianName)throws HibernateException{
      
      List<Repair> repairList=RepairService.searchRepairByNameAndTechnician(name, technicianName);
      Iterator itr=repairList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Date of Repairing");
      tableHeaders.add("Payment");
      tableHeaders.add("Description");
      tableHeaders.add("Category");
      tableHeaders.add("Return Date");
      
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
     * Load Selected repair details to the table in settings according to
     * given name
     * @param technicianName  Repair 
     * @return  List of selected repair
     */
  public static DefaultTableModel searchRepairByTechnician(String technicianName)throws HibernateException{
      
      List<Repair> repairList=RepairService.searchRepairByTechnician(technicianName);
      Iterator itr=repairList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Date of Repairing");
      tableHeaders.add("Payment");
      tableHeaders.add("Description");
      tableHeaders.add("Category");
      tableHeaders.add("Return Date");
      
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
 * Load Selected repair details to the table in settings according to
 * given date
 * @param date Repair 
 * @return  List of selected repair
 */
  public static DefaultTableModel searchRepairByDate(String date)throws HibernateException{
      
      List<Repair> repairList=RepairService.getRepairByDate(date);
      Iterator itr=repairList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Technician Name");
      tableHeaders.add("Date of Repairing");
      tableHeaders.add("Payment");
      tableHeaders.add("Description");
      tableHeaders.add("Category");
      tableHeaders.add("Return Date");
      
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
     * Load Repair details to the table in settings according to
     * requirement
     * @return  repair list
     */
    public static DefaultTableModel getAllRepairList_1()throws HibernateException{
      
      List<Repair> repairList=RepairService.getRepairDetails_1(); 
      Iterator itr=repairList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();

      tableHeaders.add("Name");
      tableHeaders.add("Technician ID");
      tableHeaders.add("Technician Name");
      tableHeaders.add("Date Of Repairing");
      tableHeaders.add("Payment");
      tableHeaders.add("Description");
      tableHeaders.add("Category");
      tableHeaders.add("Return Date");
      
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
* Load Repair details to the table in settings according to
* requirement
* @return  repair list
*/
  public static DefaultTableModel getAllRepairList_2()throws HibernateException{
      
      List<Repair> repairList=RepairService.getRepairDetails_2();
      Iterator itr=repairList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Repair ID");
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Technician ID");
      tableHeaders.add("Technician Name");
      tableHeaders.add("Date Of Repairing");
      tableHeaders.add("Payment");
      tableHeaders.add("Description");
      tableHeaders.add("Category");
      tableHeaders.add("Return Date");
      
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
     * Load Item codes of Repairing items to the table in settings according to
     * selected category
     * @param category 
     * @return  repair list
     */
    public static List<Repair> loadItemCodesOfRepairs(String category) throws  HibernateException{
        return RepairService.getSelectedCategoryRepairItemCode(category);
    }

    /**
     * Load Item codes of Repairing items to the table in settings according to
     * selected category
     * @param category
     *  @param name
     * @return  repair item name list
     */
    public static DefaultTableModel loadRepairsAccordingToCategoryAndName(String category,String name) throws HibernateException{
      
      List<Repair> repairList=RepairService.getSelectedCategoryRepairItemNames(category, name);
      Iterator itr=repairList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();

      tableHeaders.add("Item Code");
      tableHeaders.add("Technician ID");
      tableHeaders.add("Technician Name");
      tableHeaders.add("Date Of Repairing");
      tableHeaders.add("Payment");
      tableHeaders.add("Description");
      tableHeaders.add("Return Date");
      
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
     * Load Repairing items to the table according to current month
     * @return  repair item list
     */
    public static DefaultTableModel  getMonthlyRepair() throws HibernateException{
      
      List<Repair> repairList=RepairService.getMonthlyRepair();
      Iterator itr=repairList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();

          tableHeaders.add("Repair ID");
          tableHeaders.add("Item Code");
          tableHeaders.add("Name");
          tableHeaders.add("Technician Name");
          tableHeaders.add("Date Of Repairing");
          tableHeaders.add("Payment");
          tableHeaders.add("Description");
          tableHeaders.add("Category");
          tableHeaders.add("Return Date");
      
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
     * Load Returning Repairing items to the table according to current date
     * @return  repair item list
     */
    public static DefaultTableModel  getReturnRepair() throws HibernateException{
      
      List<Repair> repairList=RepairService.getReturnRepair();
      Iterator itr=repairList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();

      tableHeaders.add("Repair ID");
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Technician Name");
      tableHeaders.add("Date Of Repairing");
      tableHeaders.add("Payment");
      tableHeaders.add("Description");
      tableHeaders.add("Category");
      tableHeaders.add("Return Date");
      
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
     * Load Item codes of Repairing item names to the combo box in settings according to
     * @param category
     * @return  repair item name list
     */
  public static List<Repair> loadItemNamesOfRepairs(String category) throws  HibernateException{
        return RepairService.getRepairItemNames(category);
    }
  
     /**
     * Count Returning Repairing items according to current date
     * @return  repair item list
     */
        public static List<Repair>  getReturnRepairCount() throws HibernateException{
            
            return RepairService.getReturnRepairCount();
    }
        
     /**
     * Count Repairing items according to current month
     * @return  repair item list
     */
       
    
}
