/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.user;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.user.Uservehicle;
import service.user.UserVehicleService;

/**
 *
 * @author Nimanthika
 */
public class UserVehicleController {
    
    /**
     * Add new vehicle service  in VehicleService interface
     * @param vehicleService
     * @return 
     */
    public static String addVehicleService(Uservehicle vehicleService){    

        String status;

        status = UserVehicleService.addVehicleService(vehicleService);          

        return status;
    }
    
    
    /**
     * Update vehicle service  in VehicleService interface
     * @param vehicleService
     * @return 
     */
    public static String updateVehicleService(Uservehicle vehicleService){
        
        String status;
        
        status = UserVehicleService.updateVehicleService(vehicleService);
        
        return status;
    }
    
    
    /**
     * Delete a vehicle service  in VehicleService interface
     * @param ID
     * 
     */
    public static void deleteVehicleService(String ID){
        
        UserVehicleService.deleteVehicleService(ID);
    }
    
    
    /**
    * Display VehicleService Table in UserVehicle interface
    * @return VehicleService Table
    */
    public static DefaultTableModel displayVehicleServiceTable(){
        
        List l = UserVehicleService.LoadVehicleServiceTable();
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("serviceID");
        tableHeaders.add("Date");
        tableHeaders.add("Time");
        tableHeaders.add("Vehicle No.");    
        tableHeaders.add("Service Station Name");           
        tableHeaders.add("Service Station Address");
        tableHeaders.add("Other Details");

        for(Object o : l){
            
            model.user.Uservehicle vehicleService = (model.user.Uservehicle)o;
                
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(vehicleService.getServiceId());
            oneRow.add(vehicleService.getDate());
            oneRow.add(vehicleService.getTime());
            oneRow.add(vehicleService.getVehicleNo());
            oneRow.add(vehicleService.getStationName());
            oneRow.add(vehicleService.getStationAddress());
            oneRow.add(vehicleService.getOther());      
                    
            tableData.add(oneRow);
        }
        
        return (new DefaultTableModel(tableData, tableHeaders));            
    }
    
    
}
