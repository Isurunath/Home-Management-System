package model.finance;


import java.util.Date;
import javax.validation.constraints.Future;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

public class Bills  implements java.io.Serializable {


     private Integer billId;
     private String billNo;
     private String billType;
     private String description;     
     private String amount;
     private Date date;

    public Bills() {
    }

    public Bills(String billNo, String billType, String description, int phoneNumber, String amount, Date date) {
       this.billNo = billNo;
       this.billType = billType;
       this.description = description;     
       this.amount = amount;
       this.date = date;
    }
   
    public Integer getBillId() {
        return this.billId;
    }
    
    public void setBillId(Integer billId) {
        this.billId = billId;
    }
    
    @NotEmpty (message = "Please enter bill number")
    @Pattern(regexp = "[0-9]+",message = "Numbers Only")
    @Size(max = 16,message = "Please enter 16 digits for bill number")
    public String getBillNo() {
        return this.billNo;
    }
    
    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }
    public String getBillType() {
        return this.billType;
    }
    
    public void setBillType(String billType) {
        this.billType = billType;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
     
    @Pattern(regexp = "[0-9]+",message = "Invaild Amount")
    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    @Future(message="Invalid Date")
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }




}


