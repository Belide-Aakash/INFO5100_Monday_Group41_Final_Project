/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SupplierStockManagerRole;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class StockOrganization extends Organization {
    // TO-DO
    public StockOrganization() {
        super(Organization.Type.Stock.getOrgVal());
    }
    
    // Overriding the getSupportedRole abstract method from Organization parent class
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> allRoles = new ArrayList();
        allRoles.add(new SupplierStockManagerRole());
        return allRoles;
    }
}
