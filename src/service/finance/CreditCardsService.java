/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.finance;

import dao.finance.CreditCardsDAO;
import model.finance.Creditcards;
import utility.Validations;
import java.util.List;

/**
 *
 * @author user
 */
public class CreditCardsService {
    
     public static void addCreditCards(Creditcards credit) {
    	
    	if(Validations.Validate(credit)){
    		CreditCardsDAO.addCreditCards(credit);
    	} 
    }
    
    public static List<Creditcards> LoadCreditCardTable(){
		
		return CreditCardsDAO.LoadCreditCardTable();
    }
    
    public static List<Creditcards> LoadcomboList() {
		
		return CreditCardsDAO.LoadcomboList();
		
	}
    
    public static void updateCreditCards(Creditcards cc){
		CreditCardsDAO.updateCreditCards(cc);
	}
    
    public static void DeleteCreditCards(String CardID){
		
	CreditCardsDAO.DeleteCreditCards(CardID);
    }
    
    public static Long CountCardNo(String Cardid){
		
        Long count = CreditCardsDAO.CountCardNo(Cardid);
        return count;
    }
    
    public static List<Creditcards> LoadCardNo(String Cardid){
		
	return CreditCardsDAO.LoadCardNo(Cardid);
    }
    
       
    public static List<Creditcards> LoadSearchedCreditCardsTable(String CardId){        
        return CreditCardsDAO.LoadSearchedCreditCardsTable(CardId);
    }
     
}
