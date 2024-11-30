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
public class SuperMarketEnterprise extends Enterprise{
    // TO-DO
    public SuperMarketEnterprise(String enterpriseName){
        super(enterpriseName, EnterpriseType.SuperMarket);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
