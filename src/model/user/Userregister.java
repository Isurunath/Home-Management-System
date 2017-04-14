/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.user;

import org.hibernate.validator.constraints.NotEmpty;
import utility.SecQuestionRequired;

/**
 *
 * @author Nimanthika
 */
public class Userregister  implements java.io.Serializable {


     private String username;
     private String password;
     @SecQuestionRequired
     private String seqQue;
     private String answer;

    public Userregister() {
    }

	
    public Userregister(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public Userregister(String username, String password, String seqQue, String answer) {
       this.username = username;
       this.password = password;
       this.seqQue = seqQue;
       this.answer = answer;
    }
   
    @NotEmpty(message="Please fill the username field!")
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    @NotEmpty(message="Please fill the password field!")
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSeqQue() {
        return this.seqQue;
    }
    
    public void setSeqQue(String seqQue) {
        this.seqQue = seqQue;
    }
    
    @NotEmpty(message="Please enter the answer for your security question!")
    public String getAnswer() {
        return this.answer;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }

}


