package model.event;
// Generated May 1, 2016 3:39:36 PM by Hibernate Tools 4.3.1



/**
 * Eventcontact generated by hbm2java
 */
public class Eventcontact  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String address;
     private String group;

    public Eventcontact() {
    }

    public Eventcontact(String name, String address, String group) {
       this.name = name;
       this.address = address;
       this.group = group;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
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
    public String getGroup() {
        return this.group;
    }
    
    public void setGroup(String group) {
        this.group = group;
    }




}


