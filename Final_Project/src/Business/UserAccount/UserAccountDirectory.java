/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;
import Business.Person.Person;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class UserAccountDirectory {
    // Initializing the user account directory variable
    private ArrayList<UserAccount> userAccountList;
    
    // This initiates the respective variables with empty directory
    public UserAccountDirectory() {
        userAccountList = new ArrayList<UserAccount>();
    }
    
    // Getter to get userAccountList
    public ArrayList<UserAccount> getUserAccountList() {
        return this.userAccountList;
    }
    
    // Method to create a user account
    //      This method takes username, password, the person and the user role as input. Then we create
    //      a new user account, use the setters to set the respective values, then append it to the
    //      user account directory and then return the user account
    public UserAccount createUserAccount(String username, String password, Person person, Role userRole) {
        UserAccount userAccount = new UserAccount();
        
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setUserRole(userRole);
        
        this.userAccountList.add(userAccount);
        
        return userAccount;
    }
    
    // Method to check if a username is unique in the user account directory
    //      This method takes in username as input, iterates over all the user accounts in the user account
    //      directory, it checks it the provided username and each user account username are same, if same
    //      then it returns false or else it returns true
    public boolean checkIsUsernameUnique(String username) {
        for (UserAccount userAccount : this.userAccountList) {
            if (username.equals(userAccount.getUsername())) {
                return false;
            }
        }
        return true;
    }
    
    // Method to autheticate the username and password
    //      In this method, we take username and password as input, iterate through all the user accounts
    //      in the user directory, check if the username and password matches. If they match, then we
    //      return the user account or else null value
    public UserAccount userAthentication(String username, String password) {
        for (UserAccount userAccount: this.userAccountList) {
            if (username.equals(userAccount.getUsername()) && password.equals(userAccount.getPassword())) {
                return userAccount;
            }
        }
        return null;
    }
    
    
}
