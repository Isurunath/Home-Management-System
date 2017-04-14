package model.finance;


import java.util.Date;
import javax.validation.constraints.Future;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;


public class Deposit  implements java.io.Serializable {


     private Integer depId;
     private String accNo;
     private String depositAmount;
     private Date depositDate;

    public Deposit() {
    }

    public Deposit(String accNo, String depositAmount, Date depositDate) {
       this.accNo = accNo;
       this.depositAmount = depositAmount;
       this.depositDate = depositDate;
    }
   
    public Integer getDepId() {
        return this.depId;
    }
    
    public void setDepId(Integer depId) {
        this.depId = depId;
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
    public String getDepositAmount() {
        return this.depositAmount;
    }
    
    public void setDepositAmount(String depositAmount) {
        this.depositAmount = depositAmount;
    }
    
    @Future(message="Invalid Date")
    public Date getDepositDate() {
        return this.depositDate;
    }
    
    public void setDepositDate(Date depositDate) {
        this.depositDate = depositDate;
    }




}


