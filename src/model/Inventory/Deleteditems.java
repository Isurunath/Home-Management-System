package model.Inventory;
// Generated Apr 3, 2016 11:17:17 AM by Hibernate Tools 4.3.1



/**
 * Deleteditems generated by hbm2java
 */
public class Deleteditems  implements java.io.Serializable {


     private String itemCode;
     private String name;
     private String category;
     private int qty;
     private String dateOfRemoval;

    public Deleteditems() {
    }

    public Deleteditems(String itemCode, String name, String category, int qty, String dateOfRemoval) {
       this.itemCode = itemCode;
       this.name = name;
       this.category = category;
       this.qty = qty;
       this.dateOfRemoval = dateOfRemoval;
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
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    public int getQty() {
        return this.qty;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getDateOfRemoval() {
        return this.dateOfRemoval;
    }
    
    public void setDateOfRemoval(String dateOfRemoval) {
        this.dateOfRemoval = dateOfRemoval;
    }




}


