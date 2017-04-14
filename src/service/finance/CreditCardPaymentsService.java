/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.finance;

import dao.finance.CreditCardPaymentsDAO;
import model.finance.Creditcardpayments;
import utility.Validations;
import java.util.List;

/**
 *
 * @author user
 */
public class CreditCardPaymentsService {
    
    public static void addCreditCardPayment(Creditcardpayments credit) {
    	
    	if(Validations.Validate(credit)){
    		CreditCardPaymentsDAO.addCreditCardPayment(credit);
    	} 
    }
    
    public static List<Creditcardpayments> LoadCreditCardPaymentTable(){
		
		return CreditCardPaymentsDAO.LoadCreditCardPaymentTable();
	}
    
    public static List<Creditcardpayments> LoadcomboList() {
		
		return CreditCardPaymentsDAO.LoadcomboList();
		
	}
    
    public static void updateCreditCardPayment(Creditcardpayments cp){
		CreditCardPaymentsDAO.updateCreditCardPayment(cp);
	}
    
    public static void DeleteCreditCardPayment(String PaymentID){
		
		CreditCardPaymentsDAO.DeleteCreditCardPayment(PaymentID);
	}
    
    public static List<Creditcardpayments> LoadSearchedCreditCardPaymentTable(String PaymentId){        
        return CreditCardPaymentsDAO.LoadSearchedCreditCardPaymentTable(PaymentId);
    }
    
    public static List<Creditcardpayments> LoadCardPayment(String CardID){
		
	return CreditCardPaymentsDAO.LoadCardPayment(CardID);
    }
}
