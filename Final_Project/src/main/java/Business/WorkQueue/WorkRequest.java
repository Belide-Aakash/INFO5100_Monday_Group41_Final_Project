/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.time.LocalDateTime;

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
    private String result;
    private LocalDateTime requestedDate;
    private LocalDateTime resolutionDate;
    
    // This initiates the requestedDate with a Date
    public WorkRequest() {
        requestedDate = LocalDateTime.now();
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
    public LocalDateTime getRequestedDate() {
        return this.requestedDate;
    }
    
    // Setter to set the requestedDate
    public void setRequestedDate(LocalDateTime requestedDate) {
        this.requestedDate = requestedDate;
    }
    
    // Getter to get the resolutionDate
    public LocalDateTime getResolutionDate() {
        return this.resolutionDate;
    }
    
    // Setter to set the resolutionDate
    public void setResolutionDate(LocalDateTime resolutionDate) {
        this.resolutionDate = resolutionDate;
    }
    
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    @Override
    public String toString() {
        return this.message;
    }
}
