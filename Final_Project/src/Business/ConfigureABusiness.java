/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.AdvertisementAdminRole;
import Business.Role.AdvertisementAnalystRole;
import Business.Role.AdvertisementManagerRole;
import Business.Role.ProductManagerRole;
import Business.Role.SuperMarketAdminRole;
import Business.Role.SuperMarketStockManagerRole;
import Business.Role.SupplierAdminRole;
import Business.Role.SupplierStockManagerRole;
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
        
        // Create new network
        Network bostonNetwork = ecosystem.createAndAddNetwork();
        bostonNetwork.setNetworkName("Boston");
        
        // Create Enterprises
        // Suppliers
        Enterprise ups1Supplier = bostonNetwork.getEnterpriseDirectory().createAndAddEnterprise("UPS1", Enterprise.EnterpriseType.Supplier);
        Enterprise ups2Supplier = bostonNetwork.getEnterpriseDirectory().createAndAddEnterprise("UPS2", Enterprise.EnterpriseType.Supplier);
        
        // Super markets
        Enterprise targetSuperMarket = bostonNetwork.getEnterpriseDirectory().createAndAddEnterprise("Target", Enterprise.EnterpriseType.SuperMarket);
        Enterprise starSuperMarket = bostonNetwork.getEnterpriseDirectory().createAndAddEnterprise("Star Market", Enterprise.EnterpriseType.SuperMarket);
        
        // Advertisements
        Enterprise adv1Advertisement = bostonNetwork.getEnterpriseDirectory().createAndAddEnterprise("Advertisers 1", Enterprise.EnterpriseType.Advertisement);
        
        // Create Enterprise admins
        // UPS1 - Supplier
        Person ups1Person = ups1Supplier.getPersonDir().createPerson("ups1");
        UserAccount ups1UA = ups1Supplier.getUserAccountDir().createUserAccount("ups1", "ups1", ups1Person, new SupplierAdminRole());
        
        // UPS2 - Supplier
        Person ups2Person = ups2Supplier.getPersonDir().createPerson("ups2");
        UserAccount ups2UA = ups2Supplier.getUserAccountDir().createUserAccount("ups2", "ups2", ups2Person, new SupplierAdminRole());
        
        // Target - Super market
        Person targetPerson = targetSuperMarket.getPersonDir().createPerson("target");
        UserAccount targetUA = targetSuperMarket.getUserAccountDir().createUserAccount("target", "target", targetPerson, new SuperMarketAdminRole());
        
        // Star - Super market
        Person starPerson = starSuperMarket.getPersonDir().createPerson("star");
        UserAccount starUA = starSuperMarket.getUserAccountDir().createUserAccount("star", "star", starPerson, new SuperMarketAdminRole());
        
        // Advertisers 1 - Advertisement
        Person adv1Person = adv1Advertisement.getPersonDir().createPerson("adv1");
        UserAccount adv1UA = adv1Advertisement.getUserAccountDir().createUserAccount("adv1", "adv1", adv1Person, new AdvertisementAdminRole());
        
        // Create Organizations
        // UPS1 - Supplier | Product Org
        Organization ups1ProdOrg = ups1Supplier.getOrgDir().createOrg(Organization.Type.Product);
        // UPS1 - Supplier | Stock Org
        Organization ups1StockOrg = ups1Supplier.getOrgDir().createOrg(Organization.Type.Stock);
        
        // UPS2 - Supplier | Product Org
        Organization ups2ProdOrg = ups2Supplier.getOrgDir().createOrg(Organization.Type.Product);
        // UPS2 - Supplier | Stock Org
        Organization ups2StockOrg = ups2Supplier.getOrgDir().createOrg(Organization.Type.Stock);
        
        // Target - Super Market | Super Market Stock Org
        Organization targetStockOrg = targetSuperMarket.getOrgDir().createOrg(Organization.Type.SuperMarketStock);
        
        // Star - Super Market | Super Market Stock Org
        Organization starStockOrg = starSuperMarket.getOrgDir().createOrg(Organization.Type.SuperMarketStock);
        
        // Advertisers 1 - Advertisement | Advertisement Org
        Organization adv1AdOrg = adv1Advertisement.getOrgDir().createOrg(Organization.Type.Advertisement);
        
        // Create Org users
        // UPS1 - Supplier | Product Org User
        Person ups1ProdPerson = ups1ProdOrg.getPersonDir().createPerson("ups1_prod");
        UserAccount ups1ProdUA = ups1ProdOrg.getUserAccountDir().createUserAccount("ups1_prod", "ups1_prod", ups1ProdPerson, new ProductManagerRole());
        
        // UPS1 - Supplier | Stock Org User
        Person ups1StockPerson = ups1StockOrg.getPersonDir().createPerson("ups1_stock");
        UserAccount ups1StockUA = ups1StockOrg.getUserAccountDir().createUserAccount("ups1_stock", "ups1_stock", ups1StockPerson, new SupplierStockManagerRole());
        
        // UPS2 - Supplier | Product Org User
        Person ups2ProdPerson = ups2ProdOrg.getPersonDir().createPerson("ups2_prod");
        UserAccount ups2ProdUA = ups2ProdOrg.getUserAccountDir().createUserAccount("ups2_prod", "ups2_prod", ups2ProdPerson, new ProductManagerRole());
        
        // UPS2 - Supplier | Stock Org User
        Person ups2StockPerson = ups2StockOrg.getPersonDir().createPerson("ups2_stock");
        UserAccount ups2StockUA = ups2StockOrg.getUserAccountDir().createUserAccount("ups2_stock", "ups2_stock", ups2StockPerson, new SupplierStockManagerRole());
        
        
        // Target - Super Market | Super Market Stock Org User
        Person targetStockPerson = targetStockOrg.getPersonDir().createPerson("target1_stock");
        UserAccount targetStockUA = targetStockOrg.getUserAccountDir().createUserAccount("target1_stock", "target1_stock", targetStockPerson, new SuperMarketStockManagerRole());
        
        // Star Market - Super Market | Super Market Stock Org User
        Person starStockPerson = starStockOrg.getPersonDir().createPerson("star1_stock");
        UserAccount starStockUA = starStockOrg.getUserAccountDir().createUserAccount("star1_stock", "star1_stock", starStockPerson, new SuperMarketStockManagerRole());
        
        // Advertisers 1 - Advertisement | Advertisement Manager User
        Person adv1ManagerPerson = adv1AdOrg.getPersonDir().createPerson("adv1_man");
        UserAccount adv1ManagerUA = adv1AdOrg.getUserAccountDir().createUserAccount("adv1_man", "adv1_man", adv1ManagerPerson, new AdvertisementManagerRole());
        
        // Advertisers 1 - Advertisement | Advertisement Analyst User
        Person adv1AnalystPerson1 = adv1AdOrg.getPersonDir().createPerson("adv1_anl1");
        UserAccount adv1AnalystUA1 = adv1AdOrg.getUserAccountDir().createUserAccount("adv1_anl1", "adv1_anl1", adv1AnalystPerson1, new AdvertisementAnalystRole());
        
        Person adv1AnalystPerson2 = adv1AdOrg.getPersonDir().createPerson("adv1_anl2");
        UserAccount adv1AnalystUA2 = adv1AdOrg.getUserAccountDir().createUserAccount("adv1_anl2", "adv1_anl2", adv1AnalystPerson2, new AdvertisementAnalystRole());
        
        return ecosystem;
    }
}
