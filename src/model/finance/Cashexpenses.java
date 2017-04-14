package model.finance;

import java.util.Date;
import javax.validation.constraints.Future;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;


public class Cashexpenses  implements java.io.Serializable {


     private Integer cashExpenseId;
     private String expenseCategory;
     private String reason;
     private Date date;
     private String amount;

    public Cashexpenses() {
    }

    public Cashexpenses(String expenseCategory, String reason, Date date, String amount) {
       this.expenseCategory = expenseCategory;
       this.reason = reason;
       this.date = date;
       this.amount = amount;
    }
   
    public Integer getCashExpenseId() {
        return this.cashExpenseId;
    }
    
    public void setCashExpenseId(Integer cashExpenseId) {
        this.cashExpenseId = cashExpenseId;
    }
    
    public String getExpenseCategory(){
        return this.expenseCategory;
    }
    
    public void setExpenseCategory(String expenseCategory){
        this.expenseCategory = expenseCategory;
    }
    
    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    
   @Future(message="Invalid Date")
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
   @Pattern(regexp = "[0-9]+",message = "Invaild Amount")
    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }




}


