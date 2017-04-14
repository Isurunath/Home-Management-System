/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.user;

import java.util.Date;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import utility.GroupNameRequired;

/**
 *
 * @author Nimanthika
 */
public class Usercontact  implements java.io.Serializable {


     private Integer contactId;
     @GroupNameRequired
     private String groupName;
     private String name;
     private String companyName;
     private Date dob;
     private String telephone1;
     private String telephone2;
     private String mobile1;
     private String mobile2;
     private String email1;
     private String email2;
     private String address;

    public Usercontact() {
    }

	
    public Usercontact(String name) {
        this.name = name;
    }
    public Usercontact(String groupName, String name, String companyName, Date dob, String telephone1, String telephone2, String mobile1, String mobile2, String email1, String email2, String address) {
       this.groupName = groupName;
       this.name = name;
       this.companyName = companyName;
       this.dob = dob;
       this.telephone1 = telephone1;
       this.telephone2 = telephone2;
       this.mobile1 = mobile1;
       this.mobile2 = mobile2;
       this.email1 = email1;
       this.email2 = email2;
       this.address = address;
    }
   
    public Integer getContactId() {
        return this.contactId;
    }
    
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }
    public String getGroupName() {
        return this.groupName;
    }
    
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    @NotEmpty(message="Please enter the contact name!")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    @Past(message="Date of birth must be a past date!")
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    @Pattern(regexp = "^(?:[0-9]{10}|)$", message="Telephone No.1 should contain only 10 digits!")
    public String getTelephone1() {
        return this.telephone1;
    }
    
    public void setTelephone1(String telephone1) {
        this.telephone1 = telephone1;
    }
    
    @Pattern(regexp = "^(?:[0-9]{10}|)$", message="Telephone No.2 should contain only 10 digits!")
    public String getTelephone2() {
        return this.telephone2;
    }
    
    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }
    
    @Pattern(regexp = "^(?:[0-9]{10}|)$", message="Mobile No.1 should contain only 10 digits!")
    public String getMobile1() {
        return this.mobile1;
    }
    
    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }
    
    @Pattern(regexp = "^(?:[0-9]{10}|)$", message="Mobile No.2 should contain only 10 digits!")
    public String getMobile2() {
        return this.mobile2;
    }
    
    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }
    
    @Email(message="Email1 is not a well-formed email address!")
    public String getEmail1() {
        return this.email1;
    }
    
    public void setEmail1(String email1) {
        this.email1 = email1;
    }
    
    @Email(message="Email2 is not a well-formed email address!")
    public String getEmail2() {
        return this.email2;
    }
    
    public void setEmail2(String email2) {
        this.email2 = email2;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }




}


