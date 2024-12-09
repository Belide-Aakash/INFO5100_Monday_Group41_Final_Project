/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import static Business.Geolocation.GetLocation.getAddress;
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
    private LatLong marketLatLong;
    private ProductCatalog prodList;
    
    public SuperMarketEnterprise(String enterpriseName){
        super(enterpriseName, EnterpriseType.SuperMarket);
        this.prodList = new ProductCatalog();
        // Set default lat long to 42.3458, -71.0949
        this.marketLatLong = new LatLong(42.3458, -71.0949);
    }
    
    public ProductCatalog getProductCatalog() {
        return this.prodList;
    }
    
    // Getter to get the superMarketLocation
    public String getSuperMarketLocation() {
        return this.superMarketLocation;
    }
    
    public void setSuperMarketLatLongLocation() {
        this.superMarketLocation = getAddress(marketLatLong.getLatitude(), marketLatLong.getLongitude());
    }
    
    // Setter to set the superMarketLocation
    public void setSuperMarketLocation(String superMarketLocation) {
        this.superMarketLocation = superMarketLocation;
    }
    
    // Getter to get the advLatLong
    public LatLong getSuperMarketLatLong() {
        return this.marketLatLong;
    }
    
    // Setter to set the advLatLong
    public void setSuperMarketLatLong(double superMarketLatitude, double superMarketLongitude) {
        this.marketLatLong = new LatLong(superMarketLatitude, superMarketLongitude);
    }
    
    public double getDistance(LatLong other) {
        return this.marketLatLong.measureDistance(other);
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
    
    @Override
    public String toString() {
        return this.getOrgName() + " - " + this.superMarketLocation;
    }
}
