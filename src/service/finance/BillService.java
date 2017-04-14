/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.finance;

import dao.finance.BillDAO;
import model.finance.Bills;
import utility.Validations;
import java.util.List;

/**
 *
 * @author user
 */
public class BillService {
    public static void addBill(Bills bills) {
    	
    	if(Validations.Validate(bills)){
    		BillDAO.addBill(bills);
    	} 
    }
    
    public static List<Bills> LoadBillTable(){
		
		return BillDAO.LoadBillTable();
	}
    
    public static List<Bills> LoadcomboList() {
		
		return BillDAO.LoadcomboList();
		
	}
    
    public static void updateBill(Bills b){
		BillDAO.updateBill(b);
	}
    
    public static void DeleteBill(String BillNo){
		
		BillDAO.DeleteBill(BillNo);
	}
    
    public static List<Bills> LoadSearchedBillsTable(String billNo){        
        return BillDAO.LoadSearchedBillsTable(billNo);
    }
    
    public static Long CountBillNo(String Billid){
		
        Long count = BillDAO.CountBillNo(Billid);
        return count;
    }
            
    public static List<Bills> loadBillNotification(){
        return BillDAO.loadBillNotification();
    }
}
