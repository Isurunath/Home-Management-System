/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.user;

import java.util.Date;
import javax.validation.constraints.Future;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Nimanthika
 */
public class Userinfo  implements java.io.Serializable {


     private Integer userId;
     private String username;
     private String initials;
     private String firstName;
     private String middleName;
     private String lastName;
     private String nic;
     private Date dob;
     private String telephone1;
     private String telephone2;
     private String mobile1;
     private String mobile2;
     private String email1;
     private String email2;
     private String companyName;
     private String companyAddress;
     private String companyTelephone;
     private String companyFax;
     private String companyEmail;
     private String companyWebsite;
     private String vehicleNo1;
     private String vehicleNo2;
     private String licenceNo;
     private String passportNo;
     private Date passportIssuedOn;
     private Date passportRenewedOn;

    public Userinfo() {
    }

	
    public Userinfo(String username, String initials, String firstName, String lastName, String nic, Date dob){
        this.username = username;
        this.initials = initials;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic = nic;
        this.dob = dob;
    }
    public Userinfo(String username, String initials, String firstName, String middleName, String lastName, 
            String nic, Date dob, String telephone1, String telephone2, String mobile1, String mobile2, 
            String email1, String email2, String companyName, String companyAddress, String companyTelephone,
            String companyFax, String companyEmail, String companyWebsite, String vehicleNo1, String vehicleNo2,
            String licenceNo, String passportNo, Date passportIssuedOn, Date passportRenewedOn) {
       this.username = username;
       this.initials = initials;
       this.firstName = firstName;
       this.middleName = middleName;
       this.lastName = lastName;
       this.nic = nic;
       this.dob = dob;
       this.telephone1 = telephone1;
       this.telephone2 = telephone2;
       this.mobile1 = mobile1;
       this.mobile2 = mobile2;
       this.email1 = email1;
       this.email2 = email2;
       this.companyName = companyName;
       this.companyAddress = companyAddress;
       this.companyTelephone = companyTelephone;
       this.companyFax = companyFax;
       this.companyEmail = companyEmail;
       this.companyWebsite = companyWebsite;
       this.vehicleNo1 = vehicleNo1;
       this.vehicleNo2 = vehicleNo2;
       this.licenceNo = licenceNo;
       this.passportNo = passportNo;
       this.passportIssuedOn = passportIssuedOn;
       this.passportRenewedOn = passportRenewedOn;
    }
   
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    @NotEmpty(message="Please enter your initials!")
    public String getInitials() {
        return this.initials;
    }
    
    public void setInitials(String initials) {
        this.initials = initials;
    }
    
    @NotEmpty(message="Please enter your first name!")
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return this.middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    
    @NotEmpty(message="Please enter your last name!")
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @NotEmpty(message="Please enter your NIC No.!")
    @Pattern(regexp = "\\d{9}[vV]{1}", message="NIC No. should have nine digits ending with V letter!")
    public String getNic() {
        return this.nic;
    }
    
    public void setNic(String nic) {
        this.nic = nic;
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
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getCompanyAddress() {
        return this.companyAddress;
    }
    
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
    
    @Pattern(regexp = "^(?:[0-9]{10}|)$", message="Company Telephone No. should contain only 10 digits!")
    public String getCompanyTelephone() {
        return this.companyTelephone;
    }
    
    public void setCompanyTelephone(String companyTelephone) {
        this.companyTelephone = companyTelephone;
    }
    
    @Pattern(regexp = "^(?:[0-9]{10}|)$", message="Company Fax No. should contain only 10 digits!")
    public String getCompanyFax() {
        return this.companyFax;
    }
    
    public void setCompanyFax(String companyFax) {
        this.companyFax = companyFax;
    }
    
    @Email(message="Company Email is not a well-formed email address!")
    public String getCompanyEmail() {
        return this.companyEmail;
    }
    
    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }
    public String getCompanyWebsite() {
        return this.companyWebsite;
    }
    
    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }
    public String getVehicleNo1() {
        return this.vehicleNo1;
    }
    
    public void setVehicleNo1(String vehicleNo1) {
        this.vehicleNo1 = vehicleNo1;
    }
    public String getVehicleNo2() {
        return this.vehicleNo2;
    }
    
    public void setVehicleNo2(String vehicleNo2) {
        this.vehicleNo2 = vehicleNo2;
    }
    public String getLicenceNo() {
        return this.licenceNo;
    }
    
    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }
    public String getPassportNo() {
        return this.passportNo;
    }
    
    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }
    
    @Past(message="Passport Issued On Date must be a past date!")
    public Date getPassportIssuedOn() {
        return this.passportIssuedOn;
    }
    
    public void setPassportIssuedOn(Date passportIssuedOn) {
        this.passportIssuedOn = passportIssuedOn;
    }
    
    @Future(message="Passport To Be Renewed On Date must be a future date!")
    public Date getPassportRenewedOn() {
        return this.passportRenewedOn;
    }
    
    public void setPassportRenewedOn(Date passportRenewedOn) {
        this.passportRenewedOn = passportRenewedOn;
    }




}


