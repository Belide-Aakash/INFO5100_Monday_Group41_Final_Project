/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.ProductManagement.ProductCatalog;
import Business.Role.SuperMarketAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class SuperMarketEnterprise extends Enterprise{
    private String superMarketLocation;
    private float superMarketLatitude;
    private float superMarketLongitude;
    private ProductCatalog prodList;
    
    public SuperMarketEnterprise(String enterpriseName){
        super(enterpriseName, EnterpriseType.SuperMarket);
        this.prodList = new ProductCatalog();
    }
    
    public ProductCatalog getProductCatalog() {
        return this.prodList;
    }
    
    // Getter to get the superMarketLocation
    public String getSuperMarketLocation() {
        return this.superMarketLocation;
    }
    
    // Setter to set the superMarketLocation
    public void setSuperMarketLocation(String superMarketLocation) {
        this.superMarketLocation = superMarketLocation;
    }
    
    // Getter to get the superMarketLatitude
    public float getSuperMarketLatitude() {
        return this.superMarketLatitude;
    }
    
    // Setter to set the superMarketLatitude
    public void setSuperMarketLatitude(float superMarketLatitude) {
        this.superMarketLatitude = superMarketLatitude;
    }
    
    // Getter to get the superMarketLongitude
    public float getSuperMarketLongitude() {
        return this.superMarketLongitude;
    }
    
    // Setter to set the superMarketLongitude
    public void setSuperMarketLongitude(float superMarketLongitude) {
        this.superMarketLongitude = superMarketLongitude;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> allRoles = new ArrayList();
        allRoles.add(new SuperMarketAdminRole());
        return allRoles;
    }
    
    
    @Override
    public ArrayList<Organization.Type> getSupportedOrganization() {
        ArrayList<Organization.Type> allOrgs = new ArrayList();
        allOrgs.add(Organization.Type.SuperMarketStock);
        return allOrgs;
    }
}
