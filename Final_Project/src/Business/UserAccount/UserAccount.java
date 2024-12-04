/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;
import Business.OrderManagement.MasterOrderCatalog;
import Business.Person.Person;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author aakashbelide
 */
public class UserAccount {
    // Initializing the user account variables
    private String username;
    private String password;
    private Person person;
    private Role userRole;
    private WorkQueue workQueue;
    private MasterOrderCatalog customerOrders;
    
    // This initiates the respective variables with empty queue
    public UserAccount() {
        this.workQueue = new WorkQueue();
        this.customerOrders = new MasterOrderCatalog();
    }
    
    // Getter to get username
    public String getUsername() {
        return this.username;
    }
    
    // Setter to set username
    public void setUsername(String username) {
        this.username = username;
    }
    
    // Getter to get password
    public String getPassword() {
        return this.password;
    }
    
    // Setter to set password
    public void setPassword(String password) {
        this.password = password;
    }
    
    // Getter to get userRole
    public Role getUserRole() {
        return this.userRole;
    }
    
    // Setter to set userRole
    public void setUserRole(Role role) {
        this.userRole = role;
    }
    
    // Getter to get person
    public Person getPerson() {
        return this.person;
    }
    
    // Setter to set person
    public void setPerson(Person person) {
        this.person = person;
    }
    
    // Getter to get workQueue
    public WorkQueue getWorkQueue() {
        return this.workQueue;
    }
    
    public MasterOrderCatalog custOrders() {
        return this.customerOrders;
    }
    
    @Override
    public String toString() {
        return this.username;
    }
}
