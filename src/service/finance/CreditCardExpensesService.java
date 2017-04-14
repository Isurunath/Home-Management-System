/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.finance;

import dao.finance.CreditCardExpensesDAO;
import model.finance.Creditcardexpenses;
import utility.Validations;
import java.util.List;

/**
 *
 * @author user
 */
public class CreditCardExpensesService {
    
    public static void addCreditCardExpense(Creditcardexpenses credit) {
    	
    	if(Validations.Validate(credit)){
    		CreditCardExpensesDAO.addCreditCardExpense(credit);
    	} 
    }
    
    public static List<Creditcardexpenses> LoadCreditCardExpenseTable(){
		
		return CreditCardExpensesDAO.LoadCreditCardExpenseTable();
	}
    
    public static List<Creditcardexpenses> LoadcomboList() {
		
		return CreditCardExpensesDAO.LoadcomboList();
		
	}
    
    public static void updateCreditCardExpense(Creditcardexpenses ce){
		CreditCardExpensesDAO.updateCreditCardExpense(ce);
	}
    
    public static void DeleteCreditCardExpense(String CreditID){
		
		CreditCardExpensesDAO.DeleteCreditCardExpense(CreditID);
	}
    
    public static List<Creditcardexpenses> LoadSearchedCreditCardExpensesTable(String CreditId){        
        return CreditCardExpensesDAO.LoadSearchedCreditCardExpensesTable(CreditId);
    }
    
}
