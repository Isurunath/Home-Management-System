package model.finance;


import java.util.Date;
import javax.validation.constraints.Future;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

public class Withdrawal  implements java.io.Serializable {


     private Integer witId;
     private String accNo;
     private String withdrawAmount;
     private Date withdrawDate;

    public Withdrawal() {
    }

    public Withdrawal(String accNo, String withdrawAmount, Date withdrawDate) {
       this.accNo = accNo;
       this.withdrawAmount = withdrawAmount;
       this.withdrawDate = withdrawDate;
    }
   
    public Integer getWitId() {
        return this.witId;
    }
    
    public void setWitId(Integer witId) {
        this.witId = witId;
    }
    
    @NotEmpty(message = "Please enter account number")
    @Pattern(regexp = "[0-9]+",message = "Numbers Only")
    @Size(max = 16,message = "Please enter 16 digits for account number")
    public String getAccNo() {
        return this.accNo;
    }
    
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }
    
    @Pattern(regexp = "[0-9]+",message = "Invaild Amount")
    public String getWithdrawAmount() {
        return this.withdrawAmount;
    }
    
    public void setWithdrawAmount(String withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    
    @Future(message="Invalid Date")
    public Date getWithdrawDate() {
        return this.withdrawDate;
    }
    
    public void setWithdrawDate(Date withdrawDate) {
        this.withdrawDate = withdrawDate;
    }




}


