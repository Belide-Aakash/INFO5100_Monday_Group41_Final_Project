/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SuperMarketStockManagerRole;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class SuperMarketStockOrganization extends Organization {
    // TO-DO
    public SuperMarketStockOrganization() {
        super(Organization.Type.SuperMarketStock.getOrgVal());
    }
    
    // Overriding the getSupportedRole abstract method from Organization parent class
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> allRoles = new ArrayList();
        allRoles.add(new SuperMarketStockManagerRole());
        return allRoles;
    }
}
