package model.finance;



import java.util.Date;
import javax.validation.constraints.Future;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;


public class Creditcards  implements java.io.Serializable {


     private Integer cardId;
     private String cardNo;
     private String cardHolderName;
     private String cardType;
     private Date issuedDate;
     private Date expiryDate;
     private String cardHoldingBank;
    

    public Creditcards() {
    }

    public Creditcards(String cardNo, String cardHolderName, String cardType, Date issuedDate, Date expiryDate, String cardHoldingBank) {
       this.cardNo = cardNo;
       this.cardHolderName = cardHolderName;
       this.cardType = cardType;
       this.issuedDate = issuedDate;
       this.expiryDate = expiryDate;
       this.cardHoldingBank = cardHoldingBank;
    }
   
    public Integer getCardId() {
        return this.cardId;
    }
    
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
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
    public String getCardHolderName() {
        return this.cardHolderName;
    }
    
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }
    public String getCardType() {
        return this.cardType;
    }
    
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    
    @Future(message="Invalid Date")
    public Date getIssuedDate() {
        return this.issuedDate;
    }
    
    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }
    
    @Future(message="Invalid Date")
    public Date getExpiryDate() {
        return this.expiryDate;
    }
    
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    public String getCardHoldingBank() {
        return this.cardHoldingBank;
    }
    
    public void setCardHoldingBank(String cardHoldingBank) {
        this.cardHoldingBank = cardHoldingBank;
    }
    
    
}


