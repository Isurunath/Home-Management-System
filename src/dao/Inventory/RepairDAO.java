/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Inventory;

import java.util.List;
import model.Inventory.Repair;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

/**
 *
 * @author Nipuni
 */
public class RepairDAO {
    static SessionFactory sessionFactory=SetSessionFactory.getSessionFactory();
    static Session session;
    
    /**
     * Add a repair in the database
     * @param repair A Repair Object
     */
     public static void addRepair(Repair repair) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
           
            //Insert detail of the repair to the database
          session.save(repair);
          
          session.getTransaction().commit();
          session.close();
        
    }

     /**
     * Update  repair details in the database
     * @param repair A Repair Object
     */
          public static void updateRepair(Repair repair) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
           
            //Update detail of the repair to the database
            session.update(repair);
            
          session.getTransaction().commit();
          session.close();
        
    }
          
      /**
     * Delete a repair in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
     public static int deleteRepair(String itemCode) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
            
            Query query=session.getNamedQuery("INVENTORY_deleteRepair").setString("itemCode", itemCode);
            
            //Execute the query which delete the detail of the repair from the database
            int res=query.executeUpdate();
            
            //check whether transaction is correctly done
          session.getTransaction().commit();
          session.close();
                
                return res;
        
    }
     
    /**
     * Load Selected repair details to the table in settings according to
     * given item code
     * @param itemCode Repair 
     * @return  List of selected repair
     */
    public static List<Repair> searchRepairByItemCode(String itemCode) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchRepairByItemCode").setString("itemCode", itemCode);

       List<Repair> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }
    
    /**
     * Load Selected repair details to the table in settings according to
     * given name
     * @param name Repair 
     * @return  List of selected repair
     */
    public static List<Repair> searchRepairByName(String name) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchRepairByName").setString("name", name);

       List<Repair> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }
    
        /**
     * Load Selected repair details to the table in settings according to
     * given name
     * @param technician  Repair 
     * @return  List of selected repair
     */
    public static List<Repair> searchRepairByTechnician(String technician) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchRepairByTechnician").setString("name", technician);

       List<Repair> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }

/**
     * Load Selected repair details to the table in settings according to
     * given name and technician
     * @param name Repair 
     * @param technicianName Repair 
     * @return  List of selected repair
     */
    public static List<Repair> searchRepairByNameAndTechnician(String name,String technicianName) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchRepairByNameAndTechnician").setString("name", name).setString("technicianName", technicianName);

       List<Repair> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }
    
    /**
     * Load Repair details to the table in settings according to
     * requirement
     * @return  repair list
     */
        public static List<Repair>  getRepairDetails_1() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getAllRepairList_1");
        List<Repair> repairList=query.list();
        
          session.getTransaction().commit();
          session.close();
        
        return repairList;
        
    }

/**
* Load Repair details to the table in settings according to
* requirement
* @return  repair list
*/
public static List<Repair>  getRepairDetails_2() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getAllRepairList_2");
        List<Repair> repairList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return repairList;
}

/**
 * Load Selected repair details to the table in settings according to
 * given date
 * @param date Repair 
 * @return  List of selected repair
 */
public static List<Repair>  getRepairByDate(String date) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getRepairByDate").setString("repairDate", date);
        List<Repair> repairLocationList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return repairLocationList;
}

    /**
     * Load Item codes of Repairing items to the table in settings according to
     * selected category
     * @param category 
     * @return  repair list
     */
        public static List<Repair>  getSelectedCategoryRepairItemCodes(String category) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getRepairingItemList").setString("category", category);
        List<Repair> repairList=query.list();
        
          session.getTransaction().commit();
          session.close();
        
        return repairList;
        
    }
        
    /**
     * Load Item codes of Repairing items to the table in settings according to
     * selected category
     * @param category
     *  @param name
     * @return  repair item name list
     */
        public static List<Repair>  getRepairsByNamesAndCategory(String category,String name) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_searchRepairByNameAndCategory").setString("category", category).setString("name", name);
        List<Repair> repairList=query.list();
        
          session.getTransaction().commit();
          session.close();
        
        return repairList;
        
    }
        
     /**
     * Load Item codes of Repairing item names to the combo box in settings according to
     * selected category
     * @param category
     * @return  repair item name list
     */
        public static List<Repair>  getSelectedCategoryRepairNames(String category) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getRepairingNameList").setString("category", category);
        List<Repair> repairList=query.list();
        
          session.getTransaction().commit();
          session.close();
        
        return repairList;
        
    }
    
        
        /**
     * Load Item codes of Repairing items to the table in settings according to
     * selected category
     * @param category
     * @return  repair item list
     */
        public static List<Repair>  getRepairsByCategory(String category) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_searchRepairByCategory").setString("category", category);
        List<Repair> repairList=query.list();
        
          session.getTransaction().commit();
          session.close();
        
        return repairList;
        
    }
        
     /**
     * Count Repairing items according to current month
     * @return  repair item list
     */
        public static List<Repair>  getMonthlyRepairCount() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getMonthlyRepairCount");
        List<Repair> repairList=query.list();
        
          session.getTransaction().commit();
          session.close();
        
        return repairList;
        
    }
        
     /**
     * Load Repairing items to the table according to current month
     * @return  repair item list
     */
        public static List<Repair>  getMonthlyRepair() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getMonthlyRepair");
        List<Repair> repairList=query.list();
        
          session.getTransaction().commit();
          session.close();
        
        return repairList;
        
    }
        
     /**
     * Count Returning Repairing items according to current date
     * @return  repair item list
     */
        public static List<Repair>  getReturnRepairCount() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getReturnRepairCount");
        List<Repair> repairList=query.list();
        
          session.getTransaction().commit();
          session.close();
        
        return repairList;
        
    }
        
     /**
     * Load Returning Repairing items to the table according to current date
     * @return  repair item list
     */
        public static List<Repair>  getReturnRepair() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getReturnRepair");
        List<Repair> repairList=query.list();
        
          session.getTransaction().commit();
          session.close();
        
        return repairList;
        
    }
}
