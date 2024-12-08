/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author aakashbelide
 */
public abstract class Role {
    
    // enum Type which has the different types of roles initialized and mentioned
    public enum RoleType {
        SupportManager("Customer Support Manager"),
        ProductManager("Product Manager"),
        SupplierStockManager("Supplier Stock Manager"),
        SuperMarketStockManager("Super Market Stock Manager"),
        AdvertisementManager("Advertisement Manager"),
        AdvertisementAnalyst("Advertisement Analyst"),
        PaymentFraudAnalyst("Payment Fraud Analyst"),
        Customer("Customer"),
        SupplierAdmin("Supplier Admin"),
        SuperMarketAdmin("Super Market Admin"),
        AdvertisementAdmin("Advertisement Admin"),
        PaymentAdmin("Payment Admin"),
        SystemAdmin("SystemAdmin");
        
        private String roleVal;
        
        // Automatically assigns the Role Value
        private RoleType(String roleValue) {
           this.roleVal = roleValue;
        }
        
        // Getter to get the role type
        public String getOrgVal() {
            return this.roleVal;
        }
        
        @Override
        public String toString() {
            return this.roleVal;
        }
    }
    
    // Abstract method which creates the work area JPanel which has to be implemented the child classes
    public abstract JPanel createWorkArea(JPanel userProcessContainer, Ecosystem ecosystemBusiness, Network network, Enterprise enterprise, Organization org, UserAccount userAccount);
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
