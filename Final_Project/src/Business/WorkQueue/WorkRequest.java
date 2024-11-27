/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author aakashbelide
 */
public abstract class WorkRequest {
    // Initializing the work request variables
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String workStatus;
    private Date requestedDate;
    private Date resolutionDate;
    
    // This initiates the requestedDate with a Date
    public WorkRequest() {
        requestedDate = new Date();
    }
    
    // Getter to get the message
    public String getMessage() {
        return this.message;
    }
    
    // Setter to set the message
    public void setMessage(String message) {
        this.message = message;
    }
    
    // Getter to get the sender
    public UserAccount getSender() {
        return this.sender;
    }
    
    // Setter to set the sender
    public void setSender(UserAccount sender) {
        this.sender = sender;
    }
    
    // Getter to get the receiver
    public UserAccount getReceiver() {
        return this.receiver;
    }
    
    // Setter to set the receiver
    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }
    
    // Getter to get the workStatus
    public String getWorkStatus() {
        return this.workStatus;
    }
    
    // Setter to set the workStatus
    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }
    
    // Getter to get the requestedDate
    public Date getRequestedDate() {
        return this.requestedDate;
    }
    
    // Setter to set the requestedDate
    public void setRequestedDate(Date requestedDate) {
        this.requestedDate = requestedDate;
    }
    
    // Getter to get the resolutionDate
    public Date getResolutionDate() {
        return this.resolutionDate;
    }
    
    // Setter to set the resolutionDate
    public void setResolutionDate(Date resolutionDate) {
        this.resolutionDate = resolutionDate;
    }
}
