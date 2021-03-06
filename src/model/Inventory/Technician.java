package model.Inventory;
// Generated Apr 3, 2016 11:17:17 AM by Hibernate Tools 4.3.1



/**
 * Technician generated by hbm2java
 */
public class Technician  implements java.io.Serializable {


     private String technicianId;
     private String name;
     private String address;
     private Long mobileNo;
     private Long officeNo;

    public Technician() {
    }

	
    public Technician(String technicianId, String name, String address) {
        this.technicianId = technicianId;
        this.name = name;
        this.address = address;
    }
    public Technician(String technicianId, String name, String address, Long mobileNo, Long officeNo) {
       this.technicianId = technicianId;
       this.name = name;
       this.address = address;
       this.mobileNo = mobileNo;
       this.officeNo = officeNo;
    }
   
    public String getTechnicianId() {
        return this.technicianId;
    }
    
    public void setTechnicianId(String technicianId) {
        this.technicianId = technicianId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public Long getMobileNo() {
        return this.mobileNo;
    }
    
    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }
    public Long getOfficeNo() {
        return this.officeNo;
    }
    
    public void setOfficeNo(Long officeNo) {
        this.officeNo = officeNo;
    }




}


