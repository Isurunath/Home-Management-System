package model.finance;



import java.util.Date;
import javax.validation.constraints.Future;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;


public class Creditcardexpenses  implements java.io.Serializable {


     private Integer cardExpenseId;
     private String cardNo;
     private String expenseCategory;
     private String reason;
     private Date date;
     private String amount;

    public Creditcardexpenses() {
    }

    public Creditcardexpenses(String cardNo, String expenseCategory, String reason, Date date, String amount) {
       this.cardNo = cardNo;
       this.expenseCategory = expenseCategory;
       this.reason = reason;
       this.date = date;
       this.amount = amount;
    }
   
    public Integer getCardExpenseId() {
        return this.cardExpenseId;
    }
    
    public void setCardExpenseId(Integer cardExpenseId) {
        this.cardExpenseId = cardExpenseId;
    }
    
    @NotEmpty(message = "Please enter credit card number")
    @Pattern(regexp = "[0-9]+",message = "Numbers Only")
    @Size(max = 16,message = "Please enter 16 digits for card number")
    public String getCardNo() {
        return this.cardNo;
    }
    
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
    
    public String getExpenseCategory() {
        return this.expenseCategory;
    }
    
    public void setExpenseCategory(String expenseCategory) {
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
    
    @Pattern(regexp = "[0-9.0-9]+",message = "Invaild Amount")
    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }




}


