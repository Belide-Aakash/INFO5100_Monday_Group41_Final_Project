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
public class AdvertisementEnterprise extends Enterprise{
    //TO DO
    public AdvertisementEnterprise(String enterpriseName){
        super(enterpriseName, EnterpriseType.Advertisement);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
