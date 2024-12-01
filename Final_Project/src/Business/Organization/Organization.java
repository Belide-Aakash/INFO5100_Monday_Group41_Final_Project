/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public abstract class Organization {
    // Initializing the org variables
    private int orgID;
    private UserAccountDirectory userAccountDir;
    private PersonDirectory personDir;
    private WorkQueue workQueue;
    private String orgName;
    
    // Initialize count variable which will be used to auto-increment the orgID
    private static int count = 0;
    
    // This initiates the respective variables with empty directory/IDs
    public Organization(String organizationName) {
        this.orgName = organizationName;
        
        this.userAccountDir = new UserAccountDirectory();
        this.personDir = new PersonDirectory();
        this.workQueue = new WorkQueue();
        
        this.orgID = count;
        this.count = count + 1;
    }
    
    // enum Type which has the different types of organizations initialized and mentioned
    public enum Type {
        Support("Support Organization"),
        Product("Product Organization"),
        Stock("Stock Organization"),
        SuperMarketStock("Super Market Stock Organization"),
        Advertisement("Advertisement Organization"),
        Payment("Payment Organization");
        
        private String orgVal;
        
        // Automatically assigns the Organization Value
        private Type(String orgValue) {
            this.orgVal = orgValue;
        }
        
        // Getter to get the orgVal
        public String getOrgVal() {
            return this.orgVal;
        }
    }
    
    // Getter to get the orgID
    public int getOrgID() {
        return this.orgID;
    }
    
    // Getter to get the orgName
    public String getOrgName() {
        return this.orgName;
    }
    
    // Setter to set the orgName
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    
    // Getter to get the userAccountDir
    public UserAccountDirectory getUserAccountDir() {
        return this.userAccountDir;
    }
    
    // Getter to get the personDir
    public PersonDirectory getPersonDir() {
        return personDir;
    }
    
    // Getter to get the workQueue
    public WorkQueue getWorkQueue() {
        return this.workQueue;
    }
    
    // Setter to set the workQueue
    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    //Abstract method to get the supported role which has to be implemented the child classes
    public abstract ArrayList<Role> getSupportedRole();
    
    @Override
    public String toString() {
        return this.orgName;
    }
    
}