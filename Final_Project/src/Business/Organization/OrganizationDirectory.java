/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class OrganizationDirectory {
    // Initializing the org directory variables
    private ArrayList<Organization> orgList;
    
    // Automatically initialize with an empty ArrayList
    public OrganizationDirectory() {
        this.orgList = new ArrayList();
    }
    
    // Getter to get the orgList
    public ArrayList<Organization> getOrgList() {
        return this.orgList;
    }
    
    // Setter to create an organization and then add to the orgList then returns the created organization
    public Organization createOrg(Type type) {
        Organization org = null;
        
        if (type.getOrgVal().equals(Type.Support.getOrgVal())) {
            org = new SupportOrganization();
            this.orgList.add(org);
        } else if (type.getOrgVal().equals(Type.Product.getOrgVal())) {
            org = new ProductOrganization();
            this.orgList.add(org);
        } else if (type.getOrgVal().equals(Type.Stock.getOrgVal())) {
            org = new StockOrganization();
            this.orgList.add(org);
        } else if (type.getOrgVal().equals(Type.SuperMarketStock.getOrgVal())) {
            org = new SuperMarketStockOrganization();
            this.orgList.add(org);
        } else if (type.getOrgVal().equals(Type.Advertisement.getOrgVal())) {
            org = new AdvertisementOrganization();
            this.orgList.add(org);
        } else if (type.getOrgVal().equals(Type.Payment.getOrgVal())) {
            org = new PaymentOrganization();
            this.orgList.add(org);
        }
        
        return org;
    }
}
