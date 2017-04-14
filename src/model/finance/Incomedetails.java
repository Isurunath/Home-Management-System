package model.finance;


import java.util.Date;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


public class Incomedetails  implements java.io.Serializable {


     private Integer incomeId;
     private String incomeSource;
     private String description;
     private Date date;
     private String amount;

    public Incomedetails() {
    }

    public Incomedetails(String incomeSource, String description, Date date, String amount) {
       this.incomeSource = incomeSource;
       this.description = description;
       this.date = date;
       this.amount = amount;
    }
   
    public Integer getIncomeId() {
        return this.incomeId;
    }
    
    public void setIncomeId(Integer incomeId) {
        this.incomeId = incomeId;
    }
    
    @NotNull
    public String getIncomeSource() {
        return this.incomeSource;
    }
    
    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
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


