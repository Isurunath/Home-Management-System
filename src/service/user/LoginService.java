/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.user;

import dao.user.LoginDAO;
import java.util.List;
import model.user.Userregister;

/**
 *
 * @author Nimanthika
 */
public class LoginService {
    
    public static List<Userregister> LoadPassword(String username){
        
         return LoginDAO.LoadPassword(username);
     }
    
    public static Long countUsername(String username){
        
        Long count = LoginDAO.countUsername(username);
        return count;     
    }
}
