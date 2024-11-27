/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class Ecosystem extends Organization {
    // Initializing the user ecosystems variable
    private static Ecosystem business;
    private ArrayList<Network> networkList;
    
    // This initiates the business if it is null
    public static Ecosystem getEcosystem() {
        if (business == null) {
            business = new Ecosystem();
        }
        return business;
    }
    
    // This initiates the respective variables with empty directory
    private Ecosystem() {
        super(null);
        this.networkList = new ArrayList<Network>();
    }
    
    // This method creates a network, adds it to the network list and then return the created network
    public Network createAndAddNetwork() {
        Network network = new Network();
        this.networkList.add(network);
        return network;
    }
    
    // Getter to get networkList
    public ArrayList<Network> getNetworkList() {
        return this.networkList;
    }
    
    // Setter to set networkList
    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    // Method to check if a username is unique in the user account directory
    //      This method takes in username as input, iterates over all the user accounts in the user account
    //      directory, it checks it the provided username and each user account username are same, if same
    //      then it returns false or else it returns true
    public boolean checkIsUserNameUnique(String username) {
        if (!this.getUserAccountDir().checkIsUsernameUnique(username)) {
            return false;
        }
        // TO-CHECK
        return true;
    }
    
    // Override the organization getSupprotedRole method
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolesList = new ArrayList<Role>();
        rolesList.add(new SystemAdminRole());
        return rolesList;
    }
}
