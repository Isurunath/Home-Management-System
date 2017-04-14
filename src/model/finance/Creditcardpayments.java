package model.finance;

import javax.validation.constraints.Pattern;


public class Creditcardpayments  implements java.io.Serializable {


     private Integer paymentId;
     private String cardNo;
     private String remainingBalance;
     private String remainingPayments;
     private String settledPayments;
     private String status;

    public Creditcardpayments() {
    }

    public Creditcardpayments(String cardNo, String remainingBalance, String remainingPayments, String settledPayments, String status) {
       this.cardNo = cardNo;
       this.remainingBalance = remainingBalance;
       this.remainingPayments = remainingPayments;
       this.settledPayments = settledPayments;
       this.status = status;
    }
   
    public Integer getPaymentId() {
        return this.paymentId;
    }
    
    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }
    public String getCardNo() {
        return this.cardNo;
    }
    
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
    
    public String getRemainingBalance() {
        return this.remainingBalance;
    }
    
    public void setRemainingBalance(String remainingBalance) {
        this.remainingBalance = remainingBalance;
    }
    public String getRemainingPayments() {
        return this.remainingPayments;
    }
    
    public void setRemainingPayments(String remainingPayments) {
        this.remainingPayments = remainingPayments;
    }
    
    @Pattern(regexp = "[0-9]+",message = "Numbers Only")
    public String getSettledPayments() {
        return this.settledPayments;
    }
    
    public void setSettledPayments(String settledPayments) {
        this.settledPayments = settledPayments;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


