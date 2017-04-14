/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package controller.finance;

import model.finance.Creditcardpayments;
import service.finance.CreditCardPaymentsService;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * CreditCardPaymentsController -- CreditCard Payments Controller class
 * @author Saumya
 */
public class CreditCardPaymentsController {
    
    public static void addCreditCardPayment(Creditcardpayments credit) {       
        CreditCardPaymentsService.addCreditCardPayment(credit);
    }
       
    public static List<Creditcardpayments> LoadcomboList(){
        return CreditCardPaymentsService.LoadcomboList();
    }
    
    public static void updateCreditCardPayment(Creditcardpayments cp){
    	CreditCardPaymentsService.updateCreditCardPayment(cp);
    }
     
    public static void DeleteCreditCardPayment(String PaymentID){
    	CreditCardPaymentsService.DeleteCreditCardPayment(PaymentID);
    }
    
    public static DefaultTableModel LoadCreditCardPaymentTable(){
        
        List l = CreditCardPaymentsService.LoadCreditCardPaymentTable();
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        
        tableHeaders.add("CreditCard ID");
        tableHeaders.add("CreditCard No");
        tableHeaders.add("Remaining Balance");
        tableHeaders.add("Remaining Payments");
        tableHeaders.add("Settled payments"); 
        tableHeaders.add("Status");
       
        for(Object t : l) {
            model.finance.Creditcardpayments crdtpayment = (model.finance.Creditcardpayments)t;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(crdtpayment.getPaymentId());
            oneRow.add(crdtpayment.getCardNo());
            oneRow.add(crdtpayment.getRemainingBalance());
            oneRow.add(crdtpayment.getRemainingPayments());
            oneRow.add(crdtpayment.getSettledPayments());
            oneRow.add(crdtpayment.getStatus());
                    
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));
    }
    
    public static DefaultTableModel displaySearchedCreditCardPaymentsTable(String PaymentId){        

        List l = CreditCardPaymentsService.LoadSearchedCreditCardPaymentTable(PaymentId);
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();

        tableHeaders.add("CreditCard Payment ID");
        tableHeaders.add("CreditCard No");
        tableHeaders.add("Remaining Balance");
        tableHeaders.add("Remaining Payments");
        tableHeaders.add("Settled payments"); 
        tableHeaders.add("Status");
       
        for(Object o : l) {
            model.finance.Creditcardpayments crdtpayment = (model.finance.Creditcardpayments)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(crdtpayment.getPaymentId());
            oneRow.add(crdtpayment.getCardNo());
            oneRow.add(crdtpayment.getRemainingBalance());
            oneRow.add(crdtpayment.getRemainingPayments());
            oneRow.add(crdtpayment.getSettledPayments());
            oneRow.add(crdtpayment.getStatus());
                            
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));         
    }
    
     public static List<Creditcardpayments> LoadCardPayment(String CardID){
    	return CreditCardPaymentsService.LoadCardPayment(CardID);
    }
}
