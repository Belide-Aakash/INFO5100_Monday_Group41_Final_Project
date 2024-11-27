/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.CustomerSupportManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class SupportOrganization extends Organization {
    
    public SupportOrganization() {
        super(Type.Support.getOrgVal());
    }
    
    // Overriding the getSupportedRole abstract method from Organization parent class
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> allRoles = new ArrayList();
        allRoles.add(new CustomerSupportManagerRole());
        return allRoles;
    }
}
