/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Geolocation.LatLong;
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
    private LatLong advLatLong;
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
    
    // Getter to get the advLatLong
    public LatLong getSuperMarketLatLong() {
        return this.advLatLong;
    }
    
    // Setter to set the advLatLong
    public void setSuperMarketLatLong(double superMarketLatitude, double superMarketLongitude) {
        this.advLatLong = new LatLong(superMarketLatitude, superMarketLongitude);
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
