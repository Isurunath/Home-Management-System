package model.event;
// Generated May 1, 2016 3:39:36 PM by Hibernate Tools 4.3.1

import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;




/**
 * EventItems generated by hbm2java
 */
public class EventItems  implements java.io.Serializable {


     private Integer id;
     private String eventCatagory;
     private String itemName;
     private String price;
     private String address;
     private String contact;

    public EventItems() {
    }

	
    public EventItems(String eventCatagory, String itemName) {
        this.eventCatagory = eventCatagory;
        this.itemName = itemName;
    }
    public EventItems(String eventCatagory, String itemName, String price, String address, String contact) {
       this.eventCatagory = eventCatagory;
       this.itemName = itemName;
       this.price = price;
       this.address = address;
       this.contact = contact;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @NotEmpty
    public String getEventCatagory() {
        return this.eventCatagory;
    }
    
    public void setEventCatagory(String eventCatagory) {
        this.eventCatagory = eventCatagory;
    }
    
    @NotEmpty
    public String getItemName() {
        return this.itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    @Pattern(regexp = "[0-9]+",message = "Invaild Price")
    public String getPrice() {
        return this.price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Pattern(regexp="(^$|[0-9]{10})",message = "Invaild Contact Number")
    public String getContact() {
        return this.contact;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }




}


