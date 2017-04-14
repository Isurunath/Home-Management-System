package model.event;
// Generated May 1, 2016 3:39:36 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * EventPlan generated by hbm2java
 */
public class EventPlan  implements java.io.Serializable {


     private Integer eventId;
     private String name;
     private Date date;
     private String startTime;
     private String endTime;
     private String location;
     private int nop;

    public EventPlan() {
    }

    public EventPlan(String name, Date date, String startTime, String endTime, String location, int nop) {
       this.name = name;
       this.date = date;
       this.startTime = startTime;
       this.endTime = endTime;
       this.location = location;
       this.nop = nop;
    }
   
    public Integer getEventId() {
        return this.eventId;
    }
    
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }
    
    @NotEmpty
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @NotNull
    //@Future(message="Invalid Date")
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public String getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    
    @NotEmpty
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    public int getNop() {
        return this.nop;
    }
    
    public void setNop(int nop) {
        this.nop = nop;
    }




}


