/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package controller.finance;

import model.finance.Creditcards;
import service.finance.CreditCardsService;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * CreditCardsController -- CreditCard Controller class
 * @author Saumya
 */
public class CreditCardsController {
    
     public static void addCreditCards(Creditcards credit) {       
        CreditCardsService.addCreditCards(credit);
    }
       
    public static List<Creditcards> LoadcomboList(){
        return CreditCardsService.LoadcomboList();
    }
    
    public static void updateCreditCards(Creditcards cc){
    	CreditCardsService.updateCreditCards(cc);
    }
     
    public static void DeleteCreditCards(String CardID){
    	CreditCardsService.DeleteCreditCards(CardID);
    }
    
    public static Long CountCardNo(String Cardid){
    	Long count = CreditCardsService.CountCardNo(Cardid);
        return count;
    }
    
    public static List<Creditcards> LoadCardNo(String Cardid){
    	return CreditCardsService.LoadCardNo(Cardid);
    }
    
         
       
    /**
     * Display CreditCard Table in CreditCard interface
     * 
     * @return CreditCard Table
     */
    public static DefaultTableModel LoadCreditCardTable(){
        
        List l = CreditCardsService.LoadCreditCardTable();
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        
        tableHeaders.add("CreditCard ID");
        tableHeaders.add("CreditCard No");
        tableHeaders.add("Card Holder Name");
        tableHeaders.add("Card Type"); 
        tableHeaders.add("Issued Date");
        tableHeaders.add("Expiry Date"); 
        tableHeaders.add("Card Holding Bank");
                    
        for(Object t : l) {
            model.finance.Creditcards crdtcard = (model.finance.Creditcards)t;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(crdtcard.getCardId());
            oneRow.add(crdtcard.getCardNo());
            oneRow.add(crdtcard.getCardHolderName());
            oneRow.add(crdtcard.getCardType());
            oneRow.add(crdtcard.getIssuedDate());
            oneRow.add(crdtcard.getExpiryDate());
            oneRow.add(crdtcard.getCardHoldingBank());
                                    
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));
    }
    
    /**
     * Display Search results in table in credit card interface
     * @param CardId credit card number
     * @return credit card Table
     */
    public static DefaultTableModel displaySearchedCreditCardsTable(String CardId){        

        List l = CreditCardsService.LoadSearchedCreditCardsTable(CardId);
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();

        tableHeaders.add("CreditCard ID");
        tableHeaders.add("CreditCard No");
        tableHeaders.add("Card Holder Name");
        tableHeaders.add("Card Type"); 
        tableHeaders.add("Issued Date");
        tableHeaders.add("Expiry Date"); 
        tableHeaders.add("Card Holding Bank");
                     
        for(Object o : l) {
            model.finance.Creditcards crdtcard = (model.finance.Creditcards)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(crdtcard.getCardId());
            oneRow.add(crdtcard.getCardNo());
            oneRow.add(crdtcard.getCardHolderName());
            oneRow.add(crdtcard.getCardType());
            oneRow.add(crdtcard.getIssuedDate());
            oneRow.add(crdtcard.getExpiryDate());
            oneRow.add(crdtcard.getCardHoldingBank());
                                        
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));         
    }  
    
    
}
