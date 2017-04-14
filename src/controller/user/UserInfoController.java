/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.user;

import java.util.List;
import model.user.Userinfo;
import service.user.UserInfoService;

/**
 *
 * @author Nimanthika
 */
public class UserInfoController {
    
    /**
     * Add new user info in UserInfo interface
     * @param user
     * @return 
     */
    public static String addUserInfo(Userinfo user){    
        
        String status;
         
        status = UserInfoService.addUserInfo(user);          
        
        return status;
    }
    
    
    /**
     * Update user info in UserInfo interface
     * @param user
     * @return 
     */
    public static String updateUserInfo(Userinfo user){
        
        String status;
        
        status = UserInfoService.updateUserInfo(user);
        
        return status;
    }
    
    /**
     * Count username in UserInfo interface
     * @param username
     * @return 
     */
    public static Long countUsername(String username){
        
        Long count = UserInfoService.countUsername(username);
        return count;
    }
    
    /**
     * Load user info in UserInfo interface
     * @param username
     * @return 
     */
    public static List<Userinfo> LoadUserInfo(String username){
         
        return UserInfoService.LoadUserInfo(username);
    }
}
