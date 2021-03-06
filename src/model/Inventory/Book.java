package model.Inventory;
// Generated Apr 3, 2016 11:17:17 AM by Hibernate Tools 4.3.1



/**
 * Book generated by hbm2java
 */
public class Book  implements java.io.Serializable {


     private String itemCode;
     private String name;
     private String location;
     private int qty;
     private String price;
     private String user;
     private String author;
     private String publisher;
     private String nameOfTheSeller;
     private String returnDate;
     private String category;
     private String stream;
     private String status;

    public Book() {
    }

	
    public Book(String itemCode, String name, String location, int qty, String price, String user, String author, String publisher, String nameOfTheSeller, String category) {
        this.itemCode = itemCode;
        this.name = name;
        this.location = location;
        this.qty = qty;
        this.price = price;
        this.user = user;
        this.author = author;
        this.publisher = publisher;
        this.nameOfTheSeller = nameOfTheSeller;
        this.category = category;
    }
    
    public Book(String itemCode, String name, String location, int qty, String price, String user, String author, String publisher, String nameOfTheSeller, String returnDate, String category, String stream, String status) {
       this.itemCode = itemCode;
       this.name = name;
       this.location = location;
       this.qty = qty;
       this.price = price;
       this.user = user;
       this.author = author;
       this.publisher = publisher;
       this.nameOfTheSeller = nameOfTheSeller;
       this.returnDate = returnDate;
       this.category = category;
       this.stream = stream;
       this.status = status;
    }
    
            public Book(String itemCode, String name, String location, int qty, String price, String user, String author, String publisher, String nameOfTheSeller, String returnDate, String category, String stream) {
       this.itemCode = itemCode;
       this.name = name;
       this.location = location;
       this.qty = qty;
       this.price = price;
       this.user = user;
       this.author = author;
       this.publisher = publisher;
       this.nameOfTheSeller = nameOfTheSeller;
       this.returnDate = returnDate;
       this.category = category;
       this.stream = stream;
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
    public String getPrice() {
        return this.price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return this.publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getNameOfTheSeller() {
        return this.nameOfTheSeller;
    }
    
    public void setNameOfTheSeller(String nameOfTheSeller) {
        this.nameOfTheSeller = nameOfTheSeller;
    }
    public String getReturnDate() {
        return this.returnDate;
    }
    
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    public String getStream() {
        return this.stream;
    }
    
    public void setStream(String stream) {
        this.stream = stream;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


