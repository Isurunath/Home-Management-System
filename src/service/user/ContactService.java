/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package service.user;

import dao.user.UserContactDAO;
import model.user.Usercontact;
import utility.Validations;
import java.util.List;

/**
 * ContactService -- Contact Service layer
 * @author Nimanthika
 */
public class ContactService {	
    
     public static List<Usercontact> LoadContactTable(){
         
        return UserContactDAO.LoadContactTable();
    }
     
     
     public static List<Usercontact> LoadSearchedContactTable(String name){
         
         return UserContactDAO.LoadSearchedContactTable(name);
     }
     
    
    public static String addContact(Usercontact u){
        
        String status;
        
        if(Validations.Validate(u)){       
            
            status = UserContactDAO.addContact(u);
        }   
        
        else{
            
            status = "false";
        }
        
        return status;
    }
    
    
    public static String updateContact(Usercontact u){
        
        String status;
        
        if(Validations.Validate(u)){       
            
            status = UserContactDAO.updateContact(u);
        } 
        
        else{
            
            status = "false";
        }
        
        return status;
    }
    
   
    public static void deleteContact(String ID){
        
        UserContactDAO.deleteContact(ID);
    }

    
    public static List<Usercontact> SearchContactTable(String name){
        
         return UserContactDAO.SearchContactTable(name);
     }
    
    
    public static List<Usercontact> SearchInGroup(String name, String group){
        
         return UserContactDAO.SearchInGroup(name, group);
     }
    
    
    public static List<Usercontact> SearchContactTableByGroup(String group){
        
         return UserContactDAO.SearchContactTableByGroup(group);
     }
    
    
    
}
