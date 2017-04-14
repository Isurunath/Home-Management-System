/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package controller.finance;

import model.finance.Incomedetails;
import service.finance.IncomeService;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class IncomeController {
    
    public static void addIncome(Incomedetails income) {
        
       IncomeService.addIncome(income);
    }
            
    public static List<Incomedetails> LoadcomboList(){
		
		return IncomeService.LoadcomboList();
		
	}
    
    public static void updateIncome(Incomedetails i){
    	IncomeService.updateIncome(i);
    }
     
    public static void DeleteIncome(String Iid){
    	IncomeService.DeleteIncome(Iid);
    }
    
    
     /**
     * Display IncomeDetails Table in Income details interface
     * 
     * @return Income details Table
     */
    public static DefaultTableModel LoadIncomeTable(){
        
        List l = IncomeService.LoadIncomeTable();
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        
        tableHeaders.add("Income ID");
        tableHeaders.add("Income Source");
        tableHeaders.add("Description");
        tableHeaders.add("Date");
        tableHeaders.add("Amount");
             
        for(Object t : l) {
            model.finance.Incomedetails incomedetails = (model.finance.Incomedetails)t;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(incomedetails.getIncomeId());
            oneRow.add(incomedetails.getIncomeSource());
            oneRow.add(incomedetails.getDescription());
            oneRow.add(incomedetails.getDate());
            oneRow.add(incomedetails.getAmount());
                                
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));
    }
    
    
    /**
     * Display Search results in table in Income interface
     * @param inc income id number
     * @return income details Table
     */
    public static DefaultTableModel displaySearchedIncomeTable(String inc){        

        List l = IncomeService.LoadSearchedIncomeTable(inc);
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();

        tableHeaders.add("Income ID");
        tableHeaders.add("Income Source");
        tableHeaders.add("Description");
        tableHeaders.add("Date");
        tableHeaders.add("Amount");
              
        for(Object o : l) {
           model.finance.Incomedetails incomedetails = (model.finance.Incomedetails)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(incomedetails.getIncomeId());
            oneRow.add(incomedetails.getIncomeSource());
            oneRow.add(incomedetails.getDescription());
            oneRow.add(incomedetails.getDate());
            oneRow.add(incomedetails.getAmount());
                            
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));         
    }  
}
