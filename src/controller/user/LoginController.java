/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.user;

import java.util.List;
import static javax.swing.JOptionPane.showMessageDialog;
import service.user.LoginService;

/**
 *
 * @author Nimanthika
 */
public class LoginController {
    
    /**
     * Display SearchContact Table in SearchContacts interface
     * when user selects a specific group in group ComboBox
     * @param username Contact group
     * @param enteredPassword
     * @return Contact Table
     */
     public static String LoadPassword(String username, String enteredPassword){        

         String password = null;
         String CheckUsername = null;
         String state = null;
         
         List l = LoginService.LoadPassword(username);
        
         for(Object o : l){

            model.user.Userregister user = (model.user.Userregister)o;

            password = user.getPassword();
            CheckUsername = user.getUsername();
        }
         
         
         if(CheckUsername.equals("")){
         
             state = "username not found";
             return state;
         }
         
         else{
         
             if(password.equals(enteredPassword)){
             
             state = "true";
             return state;
            }

             else if(!password.equals(enteredPassword)){  

                showMessageDialog(null, "Invalid password, try again!");

                state = "false";
                 return state;
            }
             }
        
         return null;
    
    }
     
     
     /**
     * Count existing  username in database
     * @param username
     * @return 
     */
     public static Long countUsername(String username){
        
        Long count = LoginService.countUsername(username);
        return count;
    }

}
