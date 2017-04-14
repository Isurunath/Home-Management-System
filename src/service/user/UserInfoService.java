/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.user;

import dao.user.UserInfoDAO;
import java.util.List;
import model.user.Userhealthinfo;
import model.user.Userinfo;
import utility.Validations;

/**
 *
 * @author Nimanthika
 * 
 */
public class UserInfoService {
    
    public static String addUserInfo(Userinfo user){
        
        String status;
        
        if(Validations.Validate(user)){       
            
            status = UserInfoDAO.addUserInfo(user);
        }   
        
        else{
            
            status = "false";
        }
        
        return status;
    }
    
    
    public static String updateUserInfo(Userinfo user){
        
        String status;
        
        if(Validations.Validate(user)){       
            
            status = UserInfoDAO.updateUserInfo(user);
        } 
        
        else{
            
            status = "false";
        }
        
        return status;
    }
    
    
    public static Long countUsername(String username){
        
        Long count = UserInfoDAO.countUsername(username);
        return count;     
    }
    
    public static List<Userinfo> LoadUserInfo(String username){
         
        return UserInfoDAO.LoadUserInfo(username);
    }
}
