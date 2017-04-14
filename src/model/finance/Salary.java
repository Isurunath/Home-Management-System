package model.finance;


import java.util.Date;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;

public class Salary  implements java.io.Serializable {


     private Integer salaryId;
     private String salaryHolderName;
     private String month;
     private String salaryAmount;
     private String basicSalary;
     private String otsalary;
     private Date salaryReceivedDate;

    public Salary() {
    }

    public Salary(String salaryHolderName, String month, String salaryAmount, String basicSalary, String otsalary, Date salaryReceivedDate) {
       this.salaryHolderName = salaryHolderName;
       this.month = month;
       this.salaryAmount = salaryAmount;
       this.basicSalary = basicSalary;
       this.otsalary = otsalary;
       this.salaryReceivedDate = salaryReceivedDate;
    }
   
    public Integer getSalaryId() {
        return this.salaryId;
    }
    
    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }
    
    @NotEmpty(message = "Please enter name")
    public String getSalaryHolderName() {
        return this.salaryHolderName;
    }
    
    public void setSalaryHolderName(String salaryHolderName) {
        this.salaryHolderName = salaryHolderName;
    }
    
    @NotNull
    public String getMonth() {
        return this.month;
    }
    
    public void setMonth(String month) {
        this.month = month;
    }
    
    @Pattern(regexp = "[0-9]+",message = "Invaild Amount")
    public String getSalaryAmount() {
        return this.salaryAmount;
    }
    
    public void setSalaryAmount(String salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
    
    @Pattern(regexp = "[0-9]+",message = "Invaild Amount")
    public String getBasicSalary() {
        return this.basicSalary;
    }
    
    public void setBasicSalary(String basicSalary) {
        this.basicSalary = basicSalary;
    }
    
    @Pattern(regexp = "[0-9]+",message = "Invaild Amount")
    public String getOtsalary() {
        return this.otsalary;
    }
    
    public void setOtsalary(String otsalary) {
        this.otsalary = otsalary;
    }
    
    @Future(message="Invalid Date")
    public Date getSalaryReceivedDate() {
        return this.salaryReceivedDate;
    }
    
    public void setSalaryReceivedDate(Date salaryReceivedDate) {
        this.salaryReceivedDate = salaryReceivedDate;
    }




}


