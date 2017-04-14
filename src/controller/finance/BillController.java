/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package controller.finance;

import model.finance.Bills;
import service.finance.BillService;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * BillController -- Bill Controller class
 * @author Saumya
 */
public class BillController {
    
    public static void addBill(Bills bills) {
        BillService.addBill(bills);
    }
        
    public static List<Bills> LoadcomboList(){
        return BillService.LoadcomboList();	
    }
    
    public static void updateBill(Bills b){
    	BillService.updateBill(b);
    }
     
    public static void DeleteBill(String BillNo){
    	BillService.DeleteBill(BillNo);
    }
    
    
     /**
     * Display Bills Table in bills interface
     * 
     * @return Bills Table
     */
    public static DefaultTableModel LoadBillsTable(){
        List l = BillService.LoadBillTable();
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Bill ID");
        tableHeaders.add("Bill No");
        tableHeaders.add("Billt Type"); 
        tableHeaders.add("Description");
        tableHeaders.add("Amount");
        tableHeaders.add("Date");
       
        for(Object t : l) {
            model.finance.Bills bill = (model.finance.Bills)t;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(bill.getBillId());
            oneRow.add(bill.getBillNo());
            oneRow.add(bill.getBillType());
            oneRow.add(bill.getDescription());
            oneRow.add(bill.getAmount());
            oneRow.add(bill.getDate());
                     
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));
    }
    
    
    /**
     * Display Search results in table in bill interface
     * @param billNo bill no
     * @return bill Table
     */
    public static DefaultTableModel displaySearchedBillsTable(String billNo){        

        List l = BillService.LoadSearchedBillsTable(billNo);
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();

        tableHeaders.add("Bill ID");
        tableHeaders.add("Bill No");
        tableHeaders.add("Billt Type"); 
        tableHeaders.add("Description");
        tableHeaders.add("Amount");
        tableHeaders.add("Date");

         for(Object o : l){

            model.finance.Bills bill = (model.finance.Bills)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(bill.getBillId());
            oneRow.add(bill.getBillNo());
            oneRow.add(bill.getBillType());
            oneRow.add(bill.getDescription());
            oneRow.add(bill.getAmount());
            oneRow.add(bill.getDate());
                     
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));         
    }  
    
    /**
     * Count bill number
     * @param Billid bill number
     * @return count of bill number
     */
    public static Long CountBillNo(String Billid){
    	Long count = BillService.CountBillNo(Billid);
        return count;
    }
    
   
}
