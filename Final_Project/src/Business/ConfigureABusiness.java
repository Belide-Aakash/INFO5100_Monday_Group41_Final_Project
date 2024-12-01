/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Person.Person;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import static java.time.InstantSource.system;

/**
 *
 * @author aakashbelide
 */
public class ConfigureABusiness {
    
    public static Ecosystem configureBusiness(){
        Ecosystem ecosystem = Ecosystem.getEcosystem();

        Person person = ecosystem.getPersonDir().createPerson("SystemAdmin");

        UserAccount userAccount = ecosystem.getUserAccountDir().createUserAccount("SystemAdmin", "SystemAdmin", person, new SystemAdminRole());

        return ecosystem;
    }
}
