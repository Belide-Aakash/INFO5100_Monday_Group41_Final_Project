/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PaymentFraudAnalystRole.PaymentFraudAnalystWorkAreaJPanel;


/**
 *
 * @author aakashbelide
 */
public class PaymentFraudAnalyst extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Ecosystem ecosystemBusiness, Network network, Enterprise enterprise, Organization org, UserAccount userAccount) {
        return new PaymentFraudAnalystWorkAreaJPanel(userProcessContainer, network, enterprise, userAccount);
    }
    
    @Override
    public String toString() {
        return "Payment Fraud Analyst Role";
    }
}
