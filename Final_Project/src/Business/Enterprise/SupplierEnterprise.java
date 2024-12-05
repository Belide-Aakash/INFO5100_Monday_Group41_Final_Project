/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SupplierAdminRole;
import Business.StockManagement.StockCatalog;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class SupplierEnterprise extends Enterprise {
    private StockCatalog stockList;
    
    public SupplierEnterprise(String enterpriseName){
        super(enterpriseName, EnterpriseType.Supplier);
        this.stockList = new StockCatalog();
    }
    
    public StockCatalog getStockCatalog() {
        return this.stockList;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> allRoles = new ArrayList();
        allRoles.add(new SupplierAdminRole());
        return allRoles;
    }
    
    @Override
    public ArrayList<Organization.Type> getSupportedOrganization() {
        ArrayList<Organization.Type> allOrgs = new ArrayList();
        allOrgs.add(Organization.Type.Support);
        allOrgs.add(Organization.Type.Product);
        allOrgs.add(Organization.Type.Stock);
        return allOrgs;
    }
}
