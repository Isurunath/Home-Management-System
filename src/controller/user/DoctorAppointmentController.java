/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.user;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.user.Userdoctorapp;
import service.user.DoctorAppointmentService;

/**
 *
 * @author Nimanthika
 */
public class DoctorAppointmentController {
    
    
     /**
     * Add new appointment in UserHealth interface
     * @param appointment
     * @return 
     */
     public static String addAppointment(Userdoctorapp appointment){    
        
        String status;
         
        status = DoctorAppointmentService.addAppointment(appointment);          
        
        return status;
    }
     
     
      /**
     * Update appointment in UserHealth interface
     * @param appointment
     * @return 
     */
      public static String updateAppointment(Userdoctorapp appointment){
        
        String status;
        
        status = DoctorAppointmentService.updateAppointment(appointment);
        
        return status;
    }
     
     
      /**
     * Delete appointment in UserHealth interface
     * @param ID
     *  
     */
      public static void deleteAppointment(String ID){
        
        DoctorAppointmentService.deleteAppointment(ID);
    } 
      
     /**
     * Display Appointment Table in UserHealth interface
     * @return Appointment Table
     */
     public static DefaultTableModel displayAppointmentTable(){
        
        List l = DoctorAppointmentService.LoadAppointmentTable();
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("AppID");
        tableHeaders.add("Memeber Name");
        tableHeaders.add("Date");
        tableHeaders.add("Time");    
        tableHeaders.add("Doctor's Name");           
        tableHeaders.add("Venue");
        tableHeaders.add("Other Details");

        for(Object o : l){
            
            model.user.Userdoctorapp app = (model.user.Userdoctorapp)o;
                
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(app.getAppId());
            oneRow.add(app.getMemberName());
            oneRow.add(app.getDate());
            oneRow.add(app.getTime());
            oneRow.add(app.getDocName());
            oneRow.add(app.getVenue());
            oneRow.add(app.getOtherDetails());      
                    
            tableData.add(oneRow);
        }
        
        return (new DefaultTableModel(tableData, tableHeaders));            
    }
}
