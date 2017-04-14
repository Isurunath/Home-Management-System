package model.Inventory;
// Generated Apr 3, 2016 11:17:17 AM by Hibernate Tools 4.3.1



/**
 * Tool generated by hbm2java
 */
public class Tool  implements java.io.Serializable {


     private String itemCode;
     private String name;
     private String location;
     private int qty;
     private double price;
     private String user;
     private String date;
     private String nameOfTheSeller;
     private Integer warrantyPeriod;
     private String status;

    public Tool() {
    }

	
    public Tool(String itemCode, String name, String location, int qty, double price, String user, String date, String nameOfTheSeller) {
        this.itemCode = itemCode;
        this.name = name;
        this.location = location;
        this.qty = qty;
        this.price = price;
        this.user = user;
        this.date = date;
        this.nameOfTheSeller = nameOfTheSeller;
    }
    
    public Tool(String itemCode, String name, String location, int qty, double price, String user, String date, String nameOfTheSeller, Integer warrantyPeriod, String status) {
       this.itemCode = itemCode;
       this.name = name;
       this.location = location;
       this.qty = qty;
       this.price = price;
       this.user = user;
       this.date = date;
       this.nameOfTheSeller = nameOfTheSeller;
       this.warrantyPeriod = warrantyPeriod;
       this.status = status;
    }
    
        public Tool(String itemCode, String name, String location, int qty, double price, String user, String date, String nameOfTheSeller, int warrantyPeriod) {
       this.itemCode = itemCode;
       this.name = name;
       this.location = location;
       this.qty = qty;
       this.price = price;
       this.user = user;
       this.date = date;
       this.nameOfTheSeller = nameOfTheSeller;
       this.warrantyPeriod = warrantyPeriod;
    }

   
    public String getItemCode() {
        return this.itemCode;
    }
    
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    public int getQty() {
        return this.qty;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    public String getNameOfTheSeller() {
        return this.nameOfTheSeller;
    }
    
    public void setNameOfTheSeller(String nameOfTheSeller) {
        this.nameOfTheSeller = nameOfTheSeller;
    }
    public Integer getWarrantyPeriod() {
        return this.warrantyPeriod;
    }
    
    public void setWarrantyPeriod(Integer warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


