/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Network;
import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author aakashbelide
 */
public class Network {
    // Initializing the network variables
    private String networkName;
    private EnterpriseDirectory enterpriseDirectory;
    
    // This initiates the respective variables with empty directory
    public Network() {
        this.enterpriseDirectory = new EnterpriseDirectory();
    }
    
    // Getter to get the networkName
    public String getNetworkName() {
        return this.networkName;
    }
    
    // Setter to set the networkName
    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
    
    // Getter to get the enterpriseDirectory
    public EnterpriseDirectory getEnterpriseDirectory() {
        return this.enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return this.networkName;
    }
}
