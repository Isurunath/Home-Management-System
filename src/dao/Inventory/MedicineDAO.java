/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Inventory;

import java.util.List;
import model.Inventory.Medicine;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

/**
 *
 * @author Nipuni
 */
public class MedicineDAO {
    static SessionFactory sessionFactory=SetSessionFactory.getSessionFactory();
    static Session session;
    
    /**
     * Add a medicine in the database
     * @param medicine A Medicine Object
     */
     public static void addMedicine(Medicine medicine) throws HibernateException{
          session=sessionFactory.openSession();
          session.beginTransaction();
           
            //Insert detail of the medicine to the database
          session.save(medicine);
            
          session.getTransaction().commit();
          session.close();
        
    }

     /**
     * Update a medicine in the database
     * @param medicine A Medicine Object
     */
    public static void updateMedicine(Medicine medicine) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
           
            //Update detail of the medicine to the database
          session.update(medicine);
            
          session.getTransaction().commit();
          session.close();
        
    }
          
      /**
     * Delete a medicine in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
     public static int deleteMedicine(String itemCode) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
            
            Query query=session.getNamedQuery("INVENTORY_deleteMedicine").setString("itemCode", itemCode);
            
            //Execute the query which delete the detail of the medicine from the database
          int res=query.executeUpdate();
          
          session.getTransaction().commit();
          session.close();
                
          return res;
        
    }
     
    /**
     * Load Selected medicine details to the table in settings according to
     * given item code
     * @param itemCode Medicine
     * @return  List of selected medicine
     */
    public static List<Medicine> searchMedicineByItemCode(String itemCode) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchMedicineByItemCode").setString("itemCode", itemCode);

        List<Medicine> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }
    
    
    /**
     * Load Selected medicine details to the table in settings according to
     * given name
     * @param name Medicine 
     * @return  List of selected medicine
     */
    public static List<Medicine> searchMedicineByName(String name) throws HibernateException{
        
          session = sessionFactory.openSession();
          session.beginTransaction();

          Query query = session.getNamedQuery("INVENTORY_searchMedicineByName").setString("name", name);

          List<Medicine> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();;
        
          return resultList;
        
    }
    
    /**
     * Load Selected medicine details to the table in settings according to given description
     * @param description Medicine 
     * @return  List of selected medicine
     */
    public static List<Medicine> searchMedicineByDescription(String description) throws HibernateException{
        
          session = sessionFactory.openSession();
          session.beginTransaction();

          Query query = session.getNamedQuery("INVENTORY_searchMedicineByDescription").setString("description", description);

          List<Medicine> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();;
        
          return resultList;
        
    }
    
    /**
     * Load Selected medicine details to the table in settings according to given seller
     * @param nameOfSeller Medicine
     * @return  List of selected medicine
     */
    public static List<Medicine> searchMedicineByNameOfSeller(String nameOfSeller) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchMedicineByNameOfSeller").setString("nameOfSeller", nameOfSeller);

        List<Medicine> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }

/**
     * Load Selected medicine details to the table in settings according to
     * given name and location
     * @param name Medicine 
     * @param location Medicine 
     * @return  List of selected medicine
     */
    public static List<Medicine> searchMedicineByNameAndLocation(String name,String location) throws HibernateException{
        
          session = sessionFactory.openSession();
          session.beginTransaction();

          Query query = session.getNamedQuery("INVENTORY_searchMedicineByNameAndLocation").setString("name", name).setString("location", location);

          List<Medicine> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
          return resultList;
        
    }
    
/**
     * Load Selected medicine details to the table in settings according to given name and name of seller
     * @param name Medicine 
     * @param nameOfSeller Medicine 
     * @return  List of selected medicine
     */
    public static List<Medicine> searchMedicineByNameAndNameOfSeller(String name,String nameOfSeller) throws HibernateException{
        
          session = sessionFactory.openSession();
          session.beginTransaction();

          Query query = session.getNamedQuery("INVENTORY_searchMedicineByNameAndNameOfSeller").setString("name", name).setString("nameOfSeller", nameOfSeller);

          List<Medicine> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
          return resultList;
        
    }
    
    /**
     * Load Medicine details to the table in settings according to requirement
     * @return  medicine list
     */
    public static List<Medicine>  getMedicineDetails_1() throws HibernateException{
        
          session = sessionFactory.openSession();
          session.beginTransaction();
        
          Query query=session.getNamedQuery("INVENTORY_getAllMedicineList_1");
          List<Medicine> medicineList=query.list();
          
          session.getTransaction().commit();
          session.close();
        
          return medicineList;
        
    }

/**
* Load Medicine  details to the table in settings according to requirement
* @return medicine list
*/
public static List<Medicine>  getMedicineDetails_2() throws HibernateException{
        
          session = sessionFactory.openSession();
          session.beginTransaction();
        
          Query query=session.getNamedQuery("INVENTORY_getAllMedicineList_2");
          List<Medicine> medicineList=query.list();
          session.getTransaction().commit();
          session.close();
          
          return medicineList;
}

/**
* Load all Medicine names in the database
* @return  medicine name list
*/
public static List<Medicine>  getMedicineName() throws HibernateException{
        
          session = sessionFactory.openSession();
          session.beginTransaction();
        
          Query query=session.getNamedQuery("INVENTORY_getMedicineName");
          List<Medicine> medicineNameList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return medicineNameList;
}

/**
* Load all Location in the database 
* @return  location list
*/
public static List<Medicine>  getMedicineLocation() throws HibernateException{
        
          session = sessionFactory.openSession();
          session.beginTransaction();
        
          Query query=session.getNamedQuery("INVENTORY_getMedicineLocation");
          List<Medicine> medicineLocationList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return medicineLocationList;
}

/**
* Load all sellers in the database 
* @return  sellers list
*/
public static List<Medicine>  getMedicineSellers() throws HibernateException{
        
          session = sessionFactory.openSession();
          session.beginTransaction();
        
          Query query=session.getNamedQuery("INVENTORY_getMedicineSellers");
          List<Medicine> medicineSellerList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return medicineSellerList;
}

/**
* Load all descriptions in the database 
* @return  descriptions list
*/
public static List<Medicine>  getMedicineDecription() throws HibernateException{
        
          session = sessionFactory.openSession();
          session.beginTransaction();
        
          Query query=session.getNamedQuery("INVENTORY_getMedicineDescription");
          List<Medicine> medicineLocationList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return medicineLocationList;
}

/**
* Load all expiring medicine in the database 
* @return  medicine list
*/
public static List<Medicine>  getExpiringMedicine() throws HibernateException{
        
          session = sessionFactory.openSession();
          session.beginTransaction();
        
          Query query=session.getNamedQuery("INVENTORY_getExpiringMedicine");
          List<Medicine> medicineList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return medicineList;
}

/**
* Count all expiring medicine in the database 
* @return  medicine list
*/
public static List<Medicine>  getExpiringMedicineCount() throws HibernateException{
        
          session = sessionFactory.openSession();
          session.beginTransaction();
        
          Query query=session.getNamedQuery("INVENTORY_getExpiringMedicineCount");
          List<Medicine> medicineList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return medicineList;
}
    
}
