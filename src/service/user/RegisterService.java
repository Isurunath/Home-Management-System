/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.user;

import dao.user.RegisterDAO;
import java.util.List;
import model.user.Userregister;
import utility.Validations;

/**
 *
 * @author Nimanthika
 */
public class RegisterService {
    
    public static String addUser(Userregister ur){
        
        String status;
        
        if(Validations.Validate(ur)){       
            
            status = RegisterDAO.addUser(ur);     
        }   
        
        else{
            
            status = "false";
        }
        
        return status;
    }
    
    public static Long countUsername(String username){
        
        Long count = RegisterDAO.countUsername(username);
        return count;     
    }
    
    public static List<Userregister> GetRegisterList(String username){
        
         return RegisterDAO.GetRegisterList(username);
     }
    
    public static String updatePassword(Userregister u){
        
        String status;
        
        if(Validations.Validate(u)){       
            
            status = RegisterDAO.updatePassword(u);
        } 
        
        else{
            
            status = "false";
        }
        
        return status;
    }
}
