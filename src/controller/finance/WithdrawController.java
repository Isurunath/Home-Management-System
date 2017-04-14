/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package controller.finance;

import model.finance.Withdrawal;
import service.finance.WithdrawService;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


/**
 * WithdrawController -- Withdraw Controller class
 * @author Saumya
 */
public class WithdrawController {
    
    public static void addWithdraw(Withdrawal withdraw) {
        
        WithdrawService.addWithdraw(withdraw);
    }
            
    public static List<Withdrawal> LoadcomboList(){
		
		return WithdrawService.LoadcomboList();
		
	}
    
    public static void updateWithdraw(Withdrawal w){
    	WithdrawService.updateWithdraw(w);
    }
     
    public static void DeleteWithdraw(String witID){
    	WithdrawService.DeleteWithdraw(witID);
    }
    
    
    /**
     * Display Withdraw Table in Withdrawal interface
     * 
     * @return Withdrawal Table
     */
    public static DefaultTableModel LoadWithdrawTable(){
        
        List l = WithdrawService.LoadWithdrawTable();
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        
        tableHeaders.add("Withdraw ID");
        tableHeaders.add("Account No");
        tableHeaders.add("Withdraw Amount");
        tableHeaders.add("Withdraw Date");

        for(Object t : l) {
            model.finance.Withdrawal Wit = (model.finance.Withdrawal)t;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(Wit.getWitId());
            oneRow.add(Wit.getAccNo());
            oneRow.add(Wit.getWithdrawAmount());
            oneRow.add(Wit.getWithdrawDate());
         
            
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));
    }
    
    
     /**
     * Display Search results in table in Withdraw interface
     * @param Withdraw account number that do withdrawal
     * @return Withdraw Table
     */
    public static DefaultTableModel displaySearchedWithdrawTable(String searchWit){        

        List l = WithdrawService.LoadSearchedWithdrawTable(searchWit);
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();

        tableHeaders.add("Withdraw ID");
        tableHeaders.add("Account No");
        tableHeaders.add("Withdraw Amount");
        tableHeaders.add("Withdraw Date");

        for(Object o : l) {
            model.finance.Withdrawal Wit = (model.finance.Withdrawal)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(Wit.getWitId());
            oneRow.add(Wit.getAccNo());
            oneRow.add(Wit.getWithdrawAmount());
            oneRow.add(Wit.getWithdrawDate());
            
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));         
    } 
      
}
