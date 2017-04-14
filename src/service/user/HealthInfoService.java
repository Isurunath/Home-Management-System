/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.user;

import dao.user.DoctorAppointmentDAO;
import dao.user.HealthInfoDAO;
import java.util.List;
import model.user.Userhealthinfo;
import utility.Validations;

/**
 *
 * @author Nimanthika
 */
public class HealthInfoService {
    
    public static String addHealthInfo(Userhealthinfo healthInfo){
        
        String status;
        
        if(Validations.Validate(healthInfo)){       
            
            status = HealthInfoDAO.addHealthInfo(healthInfo);
        }   
        
        else{
            
            status = "false";
        }
        
        return status;
    }
    
    
    public static String updateHealthInfo(Userhealthinfo healthInfo){
        
        String status;
        
        if(Validations.Validate(healthInfo)){       
            
            status = HealthInfoDAO.updateHealthInfo(healthInfo);
        } 
        
        else{
            
            status = "false";
        }
        
        return status;
    }
    
    
    public static void deleteHealthInfo(String ID){
        
        HealthInfoDAO.deleteHealthInfo(ID);
    }
    
    
    public static List<Userhealthinfo> LoadHealthInfoTable(){
         
        return HealthInfoDAO.LoadHealthInfoTable();
    }
    
    
        public static Long countMemberName(String memberName){
        
        Long count = HealthInfoDAO.countMemberName(memberName);
        return count;     
    }
}
