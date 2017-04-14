/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.user;

import org.hibernate.validator.constraints.NotEmpty;
import utility.BloodGroupRequired;


/**
 *
 * @author Nimanthika
 */
public class Userhealthinfo  implements java.io.Serializable {


     private Integer memberId;
     private String memberName;
     @BloodGroupRequired
     private String bloodGroup;
     private String weight;
     private String height;
     private String allergies;

    public Userhealthinfo() {
    }

	
    public Userhealthinfo(String memberName, String bloodGroup, String weight, String height) {
        this.memberName = memberName;
        this.bloodGroup = bloodGroup;
        this.weight = weight;
        this.height = height;
    }
    public Userhealthinfo(String memberName, String bloodGroup, String weight, String height, String allergies) {
       this.memberName = memberName;
       this.bloodGroup = bloodGroup;
       this.weight = weight;
       this.height = height;
       this.allergies = allergies;
    }
   
    public Integer getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }
    
    @NotEmpty(message="Please enter the member name!")
    public String getMemberName() {
        return this.memberName;
    }
    
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public String getBloodGroup() {
        return this.bloodGroup;
    }
    
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    
    @NotEmpty(message="Please enter the weight!")
    public String getWeight() {
        return this.weight;
    }
    
    public void setWeight(String weight) {
        this.weight = weight;
    }
    
    @NotEmpty(message="Please enter the height!")
    public String getHeight() {
        return this.height;
    }
    
    public void setHeight(String height) {
        this.height = height;
    }
    public String getAllergies() {
        return this.allergies;
    }
    
    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

}


