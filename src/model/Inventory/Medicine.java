package model.Inventory;
// Generated Apr 3, 2016 11:17:17 AM by Hibernate Tools 4.3.1



/**
 * Medicine generated by hbm2java
 */
public class Medicine  implements java.io.Serializable {


     private String itemCode;
     private String name;
     private String location;
     private int qty;
     private double price;
     private String user;
     private String date;
     private String nameOfDoctor;
     private String description;
     private String expDate;
     private String nameOfSeller;
     private String status;

    public Medicine() {
    }

	
    public Medicine(String itemCode, String location, int qty, double price, String user, String nameOfDoctor, String description, String expDate, String nameOfSeller) {
        this.itemCode = itemCode;
        this.location = location;
        this.qty = qty;
        this.price = price;
        this.user = user;
        this.nameOfDoctor = nameOfDoctor;
        this.description = description;
        this.expDate = expDate;
        this.nameOfSeller = nameOfSeller;
    }
    
    public Medicine(String itemCode, String name, String location, int qty, double price, String user, String date, String nameOfDoctor, String description, String expDate, String nameOfSeller, String status) {
       this.itemCode = itemCode;
       this.name = name;
       this.location = location;
       this.qty = qty;
       this.price = price;
       this.user = user;
       this.date = date;
       this.nameOfDoctor = nameOfDoctor;
       this.description = description;
       this.expDate = expDate;
       this.nameOfSeller = nameOfSeller;
       this.status = status;
    }
    
        public Medicine(String itemCode, String name, String location, int qty, double price, String user, String date, String nameOfDoctor, String description, String expDate, String nameOfSeller) {
       this.itemCode = itemCode;
       this.name = name;
       this.location = location;
       this.qty = qty;
       this.price = price;
       this.user = user;
       this.date = date;
       this.nameOfDoctor = nameOfDoctor;
       this.description = description;
       this.expDate = expDate;
       this.nameOfSeller = nameOfSeller;
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
    public String getNameOfDoctor() {
        return this.nameOfDoctor;
    }
    
    public void setNameOfDoctor(String nameOfDoctor) {
        this.nameOfDoctor = nameOfDoctor;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getExpDate() {
        return this.expDate;
    }
    
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    public String getNameOfSeller() {
        return this.nameOfSeller;
    }
    
    public void setNameOfSeller(String nameOfSeller) {
        this.nameOfSeller = nameOfSeller;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


