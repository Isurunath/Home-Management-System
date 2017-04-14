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
public class Uservehicle  implements java.io.Serializable {


     private Integer serviceId;
     private Date date;
     private String time;
     private String vehicleNo;
     private String stationName;
     private String stationAddress;
     private String other;

    public Uservehicle() {
    }

	
    public Uservehicle(Date date, String time, String vehicleNo, String stationName, String stationAddress) {
        this.date = date;
        this.time = time;
        this.vehicleNo = vehicleNo;
        this.stationName = stationName;
        this.stationAddress = stationAddress;
    }
    public Uservehicle(Date date, String time, String vehicleNo, String stationName, String stationAddress, String other) {
       this.date = date;
       this.time = time;
       this.vehicleNo = vehicleNo;
       this.stationName = stationName;
       this.stationAddress = stationAddress;
       this.other = other;
    }
   
    public Integer getServiceId() {
        return this.serviceId;
    }
    
    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }
    
    @Future(message="Date must be a future date!")
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
    
    @NotEmpty(message="Please enter the Vehicle No.!")
    public String getVehicleNo() {
        return this.vehicleNo;
    }
    
    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }
    
    @NotEmpty(message="Please enter the Service Station name!")
    public String getStationName() {
        return this.stationName;
    }
    
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
    public String getStationAddress() {
        return this.stationAddress;
    }
    
    public void setStationAddress(String stationAddress) {
        this.stationAddress = stationAddress;
    }
    public String getOther() {
        return this.other;
    }
    
    public void setOther(String other) {
        this.other = other;
    }




}


