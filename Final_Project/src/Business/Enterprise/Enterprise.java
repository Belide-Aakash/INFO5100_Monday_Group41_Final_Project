/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public abstract class Enterprise extends Organization{
    // Initializing the enterprise variables
    private EnterpriseType enterpriseType;
    private OrganizationDirectory orgDir;
    
    // This initiates the respective variables with empty directory and type
    public Enterprise(String enterpriseName, EnterpriseType enterpriseType) {
        super(enterpriseName);
        
        this.enterpriseType = enterpriseType;
        this.orgDir = new OrganizationDirectory();
    }
    
    // enum Type which has the different types of enterprises initialized and mentioned
    public enum EnterpriseType {
        Supplier("Supplier"),
        SuperMarket("Super Market"),
        Advertisement("Advertisement"),
        Payment("Payment");
        
        private String enterpriseVal;
        
        // Automatically assigns the Enterprise Value
        private EnterpriseType(String enterpriseValue) {
            this.enterpriseVal = enterpriseValue;
        }
        
        // Getter to get the enterpriseVal
        public String getEnterpriseValue() {
            return this.enterpriseVal;
        }
        
        @Override
        public String toString() {
            return this.enterpriseVal;
        }
    }
    
    //Abstract method to get the supported organizations which has to be implemented the child classes
    public abstract ArrayList<Organization.Type> getSupportedOrganization();
    
    // Getter to get the enterpriseType
    public EnterpriseType getEnterpriseType() {
        return this.enterpriseType;
    }
    
    // Setter to set the enterpriseType
    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    // Getter to get the orgDir
    public OrganizationDirectory getOrgDir() {
        return this.orgDir;
    }
}
