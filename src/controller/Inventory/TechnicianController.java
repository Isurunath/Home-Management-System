/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Inventory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.Inventory.Technician;
import org.hibernate.HibernateException;
import services.Inventory.TechnicianService;

/**
 *
 * @author Nipuni
 */
public class TechnicianController {
    
   public static boolean addTechnician(Technician technician) throws ClassNotFoundException,HibernateException{
        return TechnicianService.addTechnician(technician);
    }
    
    public static ArrayList<String> SearchTechnician(String name) throws ClassNotFoundException,HibernateException{
        
          List<Technician> technicianList=TechnicianService.getTechnicianDetailsByName(name);
          Iterator itr=technicianList.iterator();
          
          ArrayList<String> detaillist=new ArrayList<String>();
          
          while(itr.hasNext()){
              Object[] obj = (Object[]) itr.next();
              
              detaillist.add(String.valueOf(obj[0]));
              detaillist.add(String.valueOf(obj[1]));
              detaillist.add(String.valueOf(obj[2]));
              detaillist.add(String.valueOf(obj[3]));
          }
          
          return detaillist;
      
    }

    
    public static boolean EditTechnicianDetails(Technician technician) throws ClassNotFoundException,HibernateException{
        
        return TechnicianService.updateTechnician(technician);
        
    }

    public static int deleteTechnician(String itemCode) throws ClassNotFoundException,HibernateException{
        
        return TechnicianService.deleteTechnician(itemCode);
        
    }
    
   public static List<String> getTechnicianName(){
        return TechnicianService.getTechnicianName();
    }
  
}
