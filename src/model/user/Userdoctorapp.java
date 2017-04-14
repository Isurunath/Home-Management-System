/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.user;

import java.util.Date;
import javax.validation.constraints.Future;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Nimanthika
 */
public class Userdoctorapp  implements java.io.Serializable {


     private Integer appId;
     private String memberName;
     private Date date;
     private String time;
     private String docName;
     private String venue;
     private String otherDetails;

    public Userdoctorapp() {
    }

	
    public Userdoctorapp(String memberName) {
        this.memberName = memberName;
    }
    public Userdoctorapp(String memberName, Date date, String time, String docName, String venue, String otherDetails) {
       this.memberName = memberName;
       this.date = date;
       this.time = time;
       this.docName = docName;
       this.venue = venue;
       this.otherDetails = otherDetails;
    }
   
    public Integer getAppId() {
        return this.appId;
    }
    
    public void setAppId(Integer appId) {
        this.appId = appId;
    }
    
    @NotEmpty(message="Please enter the member name!")
    public String getMemberName() {
        return this.memberName;
    }
    
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    
    @Future(message="Appointment date must be a future date!")
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getTime() {
        return this.time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    public String getDocName() {
        return this.docName;
    }
    
    public void setDocName(String docName) {
        this.docName = docName;
    }
    
    @NotEmpty(message="Please enter the venue!")
    public String getVenue() {
        return this.venue;
    }
    
    public void setVenue(String venue) {
        this.venue = venue;
    }
    public String getOtherDetails() {
        return this.otherDetails;
    }
    
    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }




}


