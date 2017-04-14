/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package controller.finance;

import model.finance.Salary;
import service.finance.SalaryService;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


/**
 * SalaryController -- Salary Controller class
 * @author Saumya
 */
public class SalaryController {
    
    public static void addSalary(Salary salary) {       
        SalaryService.addSalary(salary);
    }
       
      
    public static void updateSalary(Salary s){
    	SalaryService.updateSalary(s);
    }
     
    public static void DeleteSalary(String sal){
    	SalaryService.DeleteSalary(sal);
    }
    
    
    /**
     * Display Salary Table in Salary interface
     * 
     * @return Salary Table
     */
    public static DefaultTableModel LoadSalaryTable(){
        List l = SalaryService.LoadSalaryTable();
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Salary ID");        
        tableHeaders.add("Salary Holder Name"); 
        tableHeaders.add("Month");
        tableHeaders.add("salary Amount");
        tableHeaders.add("Basic Salary");
        tableHeaders.add("OT Salary");
        tableHeaders.add("Salary Received Date");

        for(Object t : l) {
            model.finance.Salary account = (model.finance.Salary)t;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(account.getSalaryId());
            oneRow.add(account.getSalaryHolderName());
            oneRow.add(account.getMonth());
            oneRow.add(account.getSalaryAmount());
            oneRow.add(account.getBasicSalary());
            oneRow.add(account.getOtsalary());
            oneRow.add(account.getSalaryReceivedDate());
            
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));
    }
    
    /**
     * Display Search results in table in salary interface
     * @param searchSalary salary id number
     * @return salary Table
     */
    public static DefaultTableModel displaySearchedSalaryTable(String searchSalary){        

        List l = SalaryService.LoadSearchedSalaryTable(searchSalary);
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();

        tableHeaders.add("Salary ID");        
        tableHeaders.add("Salary Holder Name"); 
        tableHeaders.add("Month");
        tableHeaders.add("salary Amount");
        tableHeaders.add("Basic Salary");
        tableHeaders.add("OT Salary");
        tableHeaders.add("Salary Received Date");

         for(Object o : l){

            model.finance.Salary account = (model.finance.Salary)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(account.getSalaryId());
            oneRow.add(account.getSalaryHolderName());
            oneRow.add(account.getMonth());
            oneRow.add(account.getSalaryAmount());
            oneRow.add(account.getBasicSalary());
            oneRow.add(account.getOtsalary());
            oneRow.add(account.getSalaryReceivedDate());
            
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));         
    } 
    
}
