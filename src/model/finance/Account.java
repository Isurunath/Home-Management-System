package model.finance;


import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;


public class Account  implements java.io.Serializable {


     private Integer accId;
     private String accNo;
     private String accHolderName;
     private String accType;
     private String accBalance;
     private String accHoldingBank;
     private String accHoldingBranch;

    public Account() {
    }

    public Account(String accNo, String accHolderName, String accType, String accBalance, String accHoldingBank, String accHoldingBranch) {
       this.accNo = accNo;
       this.accHolderName = accHolderName;
       this.accType = accType;
       this.accBalance = accBalance;
       this.accHoldingBank = accHoldingBank;
       this.accHoldingBranch = accHoldingBranch;
    }
   
    public Integer getAccId() {
        return this.accId;
    }
    
    public void setAccId(Integer accId) {
        this.accId = accId;
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
    
    @NotEmpty(message = "Please enter all the fields")
    public String getAccHolderName() {
        return this.accHolderName;
    }
        
    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }
    public String getAccType() {
        return this.accType;
    }
    
    public void setAccType(String accType) {
        this.accType = accType;
    }
    
    @Pattern(regexp = "[0-9]+",message = "Invaild Balance")
    public String getAccBalance() {
        return this.accBalance;
    }
    
    public void setAccBalance(String accBalance) {
        this.accBalance = accBalance;
    }
    
     public String getAccHoldingBank() {
        return this.accHoldingBank;
    }
    
    public void setAccHoldingBank(String accHoldingBank) {
        this.accHoldingBank = accHoldingBank;
    }
    public String getAccHoldingBranch() {
        return this.accHoldingBranch;
    }
    
    public void setAccHoldingBranch(String accHoldingBranch) {
        this.accHoldingBranch = accHoldingBranch;
    }




}


