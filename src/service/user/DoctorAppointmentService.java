/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.user;

import dao.user.DoctorAppointmentDAO;
import java.util.List;
import model.user.Userdoctorapp;
import utility.Validations;

/**
 *
 * @author Nimanthika
 */
public class DoctorAppointmentService {
    
    public static String addAppointment(Userdoctorapp uda){
        
        String status;
        
        if(Validations.Validate(uda)){       
            
            status = DoctorAppointmentDAO.addAppointment(uda);
        }   
        
        else{
            
            status = "false";
        }
        
        return status;
    }
    
    
    public static String updateAppointment(Userdoctorapp u){
        
        String status;
        
        if(Validations.Validate(u)){       
            
            status = DoctorAppointmentDAO.updateAppointment(u);
        } 
        
        else{
            
            status = "false";
        }
        
        return status;
    }
    
    
    public static void deleteAppointment(String ID){
        
        DoctorAppointmentDAO.deleteAppointment(ID);
    }
    
    public static List<Userdoctorapp> LoadAppointmentTable(){

        return DoctorAppointmentDAO.LoadAppointmentTable();
    }
    
    
    public static List<Userdoctorapp> GetAppNotifications(){
        
         return DoctorAppointmentDAO.GetAppNotifications();
     }
}
