/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.SupplierStockManagerRole.SupplierStockManagerWorkAreaJPanel;


/**
 *
 * @author aakashbelide
 */
public class SupplierStockManagerRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Ecosystem ecosystemBusiness, Network network, Enterprise enterprise, Organization org, UserAccount userAccount) {
        return new SupplierStockManagerWorkAreaJPanel(userProcessContainer, ecosystemBusiness, network, (SupplierEnterprise) enterprise, org, userAccount);
    }
    
    @Override
    public String toString() {
        return "Supplier Stock Manager Role";
    }
}
