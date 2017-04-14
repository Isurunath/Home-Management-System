/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.finance;

import dao.finance.CashExpensesDAO;
import model.finance.Cashexpenses;
import utility.Validations;
import java.util.Date;
import java.util.List;



/**
 *
 * @author user
 */
public class CashExpensesService {
    
    public static void addCashExpense(Cashexpenses cash) {
    	
    	if(Validations.Validate(cash)){
    		CashExpensesDAO.addCashExpense(cash);
    	} 
    }
    
    public static List<Cashexpenses> LoadCashExpenseTable(){
		
		return CashExpensesDAO.LoadCashExpenseTable();
	}
    
   /* public static List<Cashexpenses> LoadcomboList() {
		
		return CashExpensesDAO.LoadcomboList();
		
	}*/
    
    public static void updateCashExpense(Cashexpenses ce){
		CashExpensesDAO.updateCashExpense(ce);
	}
    
    public static void DeleteCashExpense(String CashID){
		
		CashExpensesDAO.DeleteCashExpense(CashID);
	}
    
    public static List<Cashexpenses> LoadSearchedCashExpensesTable(Date date){        
        return CashExpensesDAO.LoadSearchedCashExpensesTable(date);
    }
}
