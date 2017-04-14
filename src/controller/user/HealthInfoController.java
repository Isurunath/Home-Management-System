/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.user;

import dao.user.HealthInfoDAO;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.user.Userhealthinfo;
import service.user.HealthInfoService;

/**
 *
 * @author Nimanthika
 */
public class HealthInfoController {
    
    /**
     * Add new health info in UserHealth interface
     * @param healthInfo
     * @return 
     */
    public static String addHealthInfo(Userhealthinfo healthInfo){    
        
        String status;
         
        status = HealthInfoService.addHealthInfo(healthInfo);          
        
        return status;
    }
    

    /**
     * Update health info in UserHealth interface
     * @param healthInfo
     * @return 
     */
    public static String updateHealthInfo(Userhealthinfo healthInfo){
        
        String status;
        
        status = HealthInfoService.updateHealthInfo(healthInfo);
        
        return status;
    }
    
    /**
     * Delete health info in UserHealth interface
     * @param ID
     * 
     */
    public static void deleteHealthInfo(String ID){
        
        HealthInfoDAO.deleteHealthInfo(ID);
    } 
    
    
    /**
     * Display HealthInfo Table in UserHealth interface
     * @return HealthInfo Table
     */
     public static DefaultTableModel displayHealthInfoTable(){
        
        List l = HealthInfoService.LoadHealthInfoTable();
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("MemberID");
        tableHeaders.add("Memeber Name");
        tableHeaders.add("Blood Group");
        tableHeaders.add("Weight");    
        tableHeaders.add("Height");           
        tableHeaders.add("Allergies");

        for(Object o : l){
            
            model.user.Userhealthinfo healthInfo = (model.user.Userhealthinfo)o;
                
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(healthInfo.getMemberId());
            oneRow.add(healthInfo.getMemberName());
            oneRow.add(healthInfo.getBloodGroup());
            oneRow.add(healthInfo.getWeight());
            oneRow.add(healthInfo.getHeight());
            oneRow.add(healthInfo.getAllergies());     
                    
            tableData.add(oneRow);
        }
        
        return (new DefaultTableModel(tableData, tableHeaders));            
    }
     
     /**
     * Count existing member name in database
     * @param memberName
     * @return 
     */
     public static Long countMemberName(String memberName){
        
        Long count = HealthInfoService.countMemberName(memberName);
        return count;
    }
}
