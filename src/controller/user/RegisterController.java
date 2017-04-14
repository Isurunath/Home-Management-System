/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.user;

import java.util.List;
import model.user.Userregister;
import service.user.RegisterService;

/**
 *
 * @author Nimanthika
 */
public class RegisterController {
    
    /**
     * Add new user in Register interface
     * @param user
     * @return 
     */
     public static String addUser(Userregister user){    
        
         String status;
         
         status = RegisterService.addUser(user);
        
         return status;
    }
     
     /**
     * Count username in Register interface
     * @param username
     * @return 
     */
     public static Long countUsername(String username){
        
        Long count = RegisterService.countUsername(username);
        return count;
    }
     
     /**
     * Get Security question for a specific username in Register interface
     * @param username
     * @return 
     */
     public static String GetSecQuestion(String username){        
 
         String secQuestion = null;
         
         List l = RegisterService.GetRegisterList(username);
        
         for(Object o : l){

            model.user.Userregister user = (model.user.Userregister)o;

            secQuestion = user.getSeqQue();
         }

         return secQuestion;
    
    }
     
     /**
     * Get answer for a specific security question in Register interface
     * @param username
     * @return 
     */
     public static String GetAnswer(String username){        
 
         String answer = null;
         
         List l = RegisterService.GetRegisterList(username);
        
         for(Object o : l){

            model.user.Userregister user = (model.user.Userregister)o;

            answer = user.getAnswer();
         }

         return answer;
    
    }
     
     /**
     * Update new user in Register interface
     * @param user
     * @return 
     */
     public static String updatePassword(Userregister user){
        
        String status;
         
        status = RegisterService.updatePassword(user);
        
        return status;
    }
}
