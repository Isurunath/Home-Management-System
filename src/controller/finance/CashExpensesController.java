/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package controller.finance;

import model.finance.Cashexpenses;
import service.finance.CashExpensesService;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * CashExpensesController -- Cash Expenses Controller class
 * @author Saumya
 */
public class CashExpensesController {
    
    public static void addCashExpense(Cashexpenses cash) {       
        CashExpensesService.addCashExpense(cash);
    }
           
    public static void updateCashExpense(Cashexpenses c){
    	CashExpensesService.updateCashExpense(c);
    }
     
    public static void DeleteCashExpense(String CashID){
    	CashExpensesService.DeleteCashExpense(CashID);
    }
    
    
    /**
     * Display Cash Expense Table in Cash Expense interface
     * 
     * @return Cash Expense Table
     */
    public static DefaultTableModel LoadCashExpenseTable(){
        List l = CashExpensesService.LoadCashExpenseTable();
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Cash Expense ID");
        tableHeaders.add("Expense Category");
        tableHeaders.add("Reason");
        tableHeaders.add("Date"); 
        tableHeaders.add("Amount");
       
        for(Object t : l) {
            model.finance.Cashexpenses cashexp = (model.finance.Cashexpenses)t;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(cashexp.getCashExpenseId());
            oneRow.add(cashexp.getExpenseCategory());
            oneRow.add(cashexp.getReason());
            oneRow.add(cashexp.getDate());
            oneRow.add(cashexp.getAmount());
                    
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));
    }
    
    
    /**
     * Display Search results in table in cash expenses interface
     * @param date date
     * @return cash expense Table
     */
    public static DefaultTableModel displaySearchedCashExpenseTable(Date date){        

        List l = CashExpensesService.LoadSearchedCashExpensesTable(date);
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();

        tableHeaders.add("Cash Expense ID");
        tableHeaders.add("Expense Category");
        tableHeaders.add("Reason");
        tableHeaders.add("Date"); 
        tableHeaders.add("Amount");
       
        for(Object o : l) {
            model.finance.Cashexpenses cash = (model.finance.Cashexpenses)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(cash.getCashExpenseId());
            oneRow.add(cash.getExpenseCategory());
            oneRow.add(cash.getReason());
            oneRow.add(cash.getDate());
            oneRow.add(cash.getAmount());
            
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));         
    }  
    
}
