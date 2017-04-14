/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.user;

import dao.user.UserVehicleDAO;
import java.util.List;
import model.user.Uservehicle;
import utility.Validations;

/**
 *
 * @author Nimanthika
 */
public class UserVehicleService {
    
    
    public static String addVehicleService(Uservehicle vehicleService){

        String status;

        if(Validations.Validate(vehicleService)){       

            status = UserVehicleDAO.addVehicleService(vehicleService);
        }   

        else{

            status = "false";
        }

        return status;
    }
    
    
    public static String updateVehicleService(Uservehicle vehicleService){

        String status;

        if(Validations.Validate(vehicleService)){       

            status = UserVehicleDAO.updateVehicleService(vehicleService);
        } 

        else{

            status = "false";
        }
        
        return status;
    }
    
    
    public static void deleteVehicleService(String ID){

        UserVehicleDAO.deleteVehicleService(ID);
    }
    
        
    public static List<Uservehicle> LoadVehicleServiceTable(){

        return UserVehicleDAO.LoadVehicleServiceTable();
    }
}
