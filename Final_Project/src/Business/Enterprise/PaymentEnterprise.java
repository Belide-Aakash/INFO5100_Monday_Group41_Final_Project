/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class PaymentEnterprise extends Enterprise {
    // TO-DO
    public PaymentEnterprise(String enterpriseName){
        super(enterpriseName, EnterpriseType.Payment);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
