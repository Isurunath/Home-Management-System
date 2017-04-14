/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Technicians | Templates
 * and open the template in the editor.
 */
package services.Inventory;

import dao.Inventory.TechnicianDAO;
import java.util.List;
import model.Inventory.Technician;
import org.hibernate.HibernateException;
import utility.Validations;

/**
 *
 * @author Nipuni
 */
public class TechnicianService {
      public static boolean addTechnician(Technician technician) throws HibernateException{
          boolean result=false;
        
          if(Validations.Validate(technician)){
           TechnicianDAO.addTechnician(technician);
                    result=true;
          }else{
            result=false;
          }
        
          return result;

    }

    public static boolean updateTechnician(Technician technician) throws HibernateException{
          boolean result=false;
        
          if(Validations.Validate(technician)){
           TechnicianDAO.updateTechnician(technician);
                    result=true;
          }else{
            result=false;
          }
        
          return result;

    }

    public static int deleteTechnician(String itemCode) throws HibernateException{

             return TechnicianDAO.deleteTechnician(itemCode);
     }

    public static List<Technician> getTechnicianDetailsByName(String name) throws HibernateException{

            return TechnicianDAO.getTechnicianDetailsByName(name);
    }

    public static List<String>  getTechnicianName() throws HibernateException{

            return TechnicianDAO.getTechnicianName();
    }
    
}
