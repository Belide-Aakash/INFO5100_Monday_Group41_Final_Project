/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.ProductManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class PaymentOrganization extends Organization {
    // TO-DO
    public PaymentOrganization() {
        super(Organization.Type.Payment.getOrgVal());
    }
    
    // Overriding the getSupportedRole abstract method from Organization parent class
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> allRoles = new ArrayList();
        allRoles.add(new ProductManagerRole());
        return allRoles;
    }   
}
