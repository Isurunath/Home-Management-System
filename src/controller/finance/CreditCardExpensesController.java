/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package controller.finance;

import model.finance.Creditcardexpenses;
import service.finance.CreditCardExpensesService;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * CreditCardExpensesController -- CreditCard Expenses Controller class
 * @author Saumya
 */
public class CreditCardExpensesController {
    
    public static void addCreditCardExpense(Creditcardexpenses credit) {       
        CreditCardExpensesService.addCreditCardExpense(credit);
    }
       
    public static List<Creditcardexpenses> LoadcomboList(){
        return CreditCardExpensesService.LoadcomboList();
    }
    
    public static void updateCreditCardExpense(Creditcardexpenses ce){
    	CreditCardExpensesService.updateCreditCardExpense(ce);
    }
     
    public static void DeleteCreditCardExpense(String CreditID){
    	CreditCardExpensesService.DeleteCreditCardExpense(CreditID);
    }
    
    /**
     * Display CreditCard Expense Table in CreditCard Expense interface
     * 
     * @return CreditCard Expense Table
     */
    public static DefaultTableModel LoadCreditCardExpenseTable(){
        
        List l = CreditCardExpensesService.LoadCreditCardExpenseTable();
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        
        tableHeaders.add("CreditCard Expense ID");
        tableHeaders.add("CreditCard No");
        tableHeaders.add("Expense Category");
        tableHeaders.add("Reason");
        tableHeaders.add("Date"); 
        tableHeaders.add("Amount");
       
        for(Object t : l) {
            model.finance.Creditcardexpenses crdt = (model.finance.Creditcardexpenses)t;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(crdt.getCardExpenseId());
            oneRow.add(crdt.getCardNo());
            oneRow.add(crdt.getExpenseCategory());
            oneRow.add(crdt.getReason());
            oneRow.add(crdt.getDate());
            oneRow.add(crdt.getAmount());
                    
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));
    }
    
    /**
     * Display Search results in table in credit card expenses interface
     * @param CreditId credit card number
     * @return credit card expense Table
     */
    public static DefaultTableModel displaySearchedCreditCardExpenseTable(String CreditId){        

        List l = CreditCardExpensesService.LoadSearchedCreditCardExpensesTable(CreditId);
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();

        tableHeaders.add("CreditCard Expense ID");
        tableHeaders.add("CreditCard No");
        tableHeaders.add("Expense Category");
        tableHeaders.add("Reason");
        tableHeaders.add("Date"); 
        tableHeaders.add("Amount");
       
        for(Object o : l) {
            model.finance.Creditcardexpenses crdt = (model.finance.Creditcardexpenses)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(crdt.getCardExpenseId());
            oneRow.add(crdt.getCardNo());
            oneRow.add(crdt.getExpenseCategory());
            oneRow.add(crdt.getReason());
            oneRow.add(crdt.getDate());
            oneRow.add(crdt.getAmount());
            
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));         
    }  
    
    
}
