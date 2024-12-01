/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Role.AdvertisementAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class AdvertisementEnterprise extends Enterprise{
    //TO DO
    public AdvertisementEnterprise(String enterpriseName){
        super(enterpriseName, EnterpriseType.Advertisement);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> allRoles = new ArrayList();
        allRoles.add(new AdvertisementAdminRole());
        return allRoles;
    }
    
    @Override
    public ArrayList<Organization.Type> getSupportedOrganization() {
        ArrayList<Organization.Type> allOrgs = new ArrayList();
        allOrgs.add(Organization.Type.Advertisement);
        return allOrgs;
    }
}
