/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.SuperMarketStockManagerRole.SuperMarketStockManagerWorkAreaJPanel;


/**
 *
 * @author aakashbelide
 */
public class SuperMarketStockManagerRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Ecosystem ecosystemBusiness, Enterprise enterprise, Organization org, UserAccount userAccount) {
        return new SuperMarketStockManagerWorkAreaJPanel(userProcessContainer, ecosystemBusiness, enterprise, org, userAccount);
    }
    
    @Override
    public String toString() {
        return "Super Market Stock Manager Role";
    }
}
