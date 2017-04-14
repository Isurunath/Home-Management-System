/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package controller.finance;


import model.finance.Deposit;
import service.finance.DepositService;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


/**
 * DepositController -- Deposit Controller class
 * @author Saumya
 */
public class DepositController {
    
    public static void addDeposit(Deposit deposits) {
        
       DepositService.addDeposit(deposits);
    }
            
    public static List<Deposit> LoadcomboList(){
		
		return DepositService.LoadcomboList();
		
	}
    
    public static void updateDeposit(Deposit d){
    	DepositService.updateDeposit(d);
    }
     
    public static void DeleteDeposit(String depID){
    	DepositService.DeleteDeposit(depID);
    }
    
    /**
     * Display Deposit Table in Deposit interface
     * 
     * @return Deposit Table
     */
    public static DefaultTableModel LoadDepositTable(){
        
        List l = DepositService.LoadDepositTable();
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        
        tableHeaders.add("Deposit ID");
        tableHeaders.add("Account No");
        tableHeaders.add("Deposit Amount");
        tableHeaders.add("Depositd Date");
             
        for(Object t : l) {
            model.finance.Deposit dep = (model.finance.Deposit)t;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(dep.getDepId());
            oneRow.add(dep.getAccNo());
            oneRow.add(dep.getDepositAmount());
            oneRow.add(dep.getDepositDate());
                                
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));
    }
    
    
     /**
     * Display Search results in table in Deposit interface
     * @param depId account number that do deposit
     * @return Deposit Table
     */
    public static DefaultTableModel displaySearchedDepositTable(String depId){        

        List l = DepositService.LoadSearchedDepositTable(depId);
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();

        tableHeaders.add("Deposit ID");
        tableHeaders.add("Account No");
        tableHeaders.add("Deposit Amount");
        tableHeaders.add("Depositd Date");
              
        for(Object o : l) {
            model.finance.Deposit dep = (model.finance.Deposit)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(dep.getDepId());
            oneRow.add(dep.getAccNo());
            oneRow.add(dep.getDepositAmount());
            oneRow.add(dep.getDepositDate());
                            
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));         
    } 
    
}
