/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package controller.finance;

import model.finance.Account;
import service.finance.AccountService;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * AccountController -- Account Controller class
 * @author Saumya
 */
public class AccountController {
    
    public static void addAccount(Account accounts) {       
        AccountService.addAccount(accounts);
    }
       
    public static List<Account> LoadcomboList(){
        return AccountService.LoadcomboList();
    }
    
    public static void updateAccount(Account a){
    	AccountService.updateAccount(a);
    }
     
    public static void DeleteAccount(String aNo){
    	AccountService.DeleteAccount(aNo);
    }
    
    /**
     * Display Account Table in account interface
     * 
     * @return Account Table
     */
    public static DefaultTableModel LoadAccountTable(){
        List l = AccountService.LoadAccountTable();
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Acc ID");
        tableHeaders.add("Acc No");
        tableHeaders.add("Acc Holder Name"); 
        tableHeaders.add("Acc Type");
        tableHeaders.add("Acc Balance");
        tableHeaders.add("Acc Holding Bank");
        tableHeaders.add("Acc Holding Branch");

        for(Object t : l) {
            model.finance.Account account = (model.finance.Account)t;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(account.getAccId());
            oneRow.add(account.getAccNo());
            oneRow.add(account.getAccHolderName());
            oneRow.add(account.getAccType());
            oneRow.add(account.getAccBalance());
            oneRow.add(account.getAccHoldingBank());
            oneRow.add(account.getAccHoldingBranch());
            
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));
    }
    
    
    /**
     * Display Search results in table in account interface
     * @param searchAccount account number
     * @return Account Table
     */
    public static DefaultTableModel displaySearchedAccountTable(String searchAccount){        

        List l = AccountService.LoadSearchedAccountTable(searchAccount);
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();

        tableHeaders.add("Acc ID");
        tableHeaders.add("Acc No");
        tableHeaders.add("Acc Holder Name"); 
        tableHeaders.add("Acc Type");
        tableHeaders.add("Acc Balance");
        tableHeaders.add("Acc Holding Bank");
        tableHeaders.add("Acc Holding Branch");

         for(Object o : l){

            model.finance.Account account = (model.finance.Account)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(account.getAccId());
            oneRow.add(account.getAccNo());
            oneRow.add(account.getAccHolderName());
            oneRow.add(account.getAccType());
            oneRow.add(account.getAccBalance());
            oneRow.add(account.getAccHoldingBank());
            oneRow.add(account.getAccHoldingBranch());
            
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));         
    }  
    
    /**
     * Count account number
     * @param Accid account number
     * @return count of account number
     */
    public static Long CountAccountNo(String Accid){
    	Long count = AccountService.CountAccountNo(Accid);
        return count;
    }
    
     /**
     * List account details for given account number
     * @param Accid account number
     * @return list of account details
     */
    public static List<Account> LoadAccountNo(String Accid){
    	return AccountService.LoadAccountNo(Accid);
    } 
}
