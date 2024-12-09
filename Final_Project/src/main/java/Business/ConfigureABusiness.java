/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.AdvManagement.Advertisement;
import Business.Enterprise.AdvertisementEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SuperMarketEnterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.Network;
import Business.OrderManagement.Order;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.ProductManagement.Product;
import Business.Role.AdvertisementAdminRole;
import Business.Role.AdvertisementAnalystRole;
import Business.Role.AdvertisementManagerRole;
import Business.Role.CustomerRole;
import Business.Role.CustomerSupportAdminRole;
import Business.Role.CustomerSupportManagerRole;
import Business.Role.PaymentAdminRole;
import Business.Role.PaymentFraudAnalyst;
import Business.Role.ProductManagerRole;
import Business.Role.SuperMarketAdminRole;
import Business.Role.SuperMarketStockManagerRole;
import Business.Role.SupplierAdminRole;
import Business.Role.SupplierStockManagerRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.awt.Image;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.time.InstantSource.system;
import java.time.LocalDateTime;
import javax.swing.ImageIcon;

/**
 *
 * @author aakashbelide
 */
public class ConfigureABusiness {
    
    public static Ecosystem configureBusiness() throws CsvValidationException{
        Ecosystem ecosystem = Ecosystem.getEcosystem();
        Faker faker = new Faker();

        Person person = ecosystem.getPersonDir().createPerson("SystemAdmin");

        UserAccount userAccount = ecosystem.getUserAccountDir().createUserAccount("SystemAdmin", "SystemAdmin", person, new SystemAdminRole());
        // Add the userAccount at the ecosystem level to have unique useraccounts
        ecosystem.getUserAccountDir().addUserAccount(userAccount);
        
        // Create new network
        Network bostonNetwork = ecosystem.createAndAddNetwork();
        bostonNetwork.setNetworkName("Boston");
        
        // Creating Super Markets and the products in it
        String csvSuppliersInputFile = "/Users/aakashbelide/Aakash/Higher Studies/Course/Sem-1/INFO5100/Project/Final Project/INFO5100_Monday_Group41_Final_Project/Final_Project/src/main/resources/Data/Suppliers.csv";
        String csvSupplierOutputFile = "/Users/aakashbelide/Aakash/Higher Studies/Course/Sem-1/INFO5100/Project/Final Project/INFO5100_Monday_Group41_Final_Project/Final_Project/src/main/resources/Data/Suppliers_Users.csv";
        
        String[] suppliersheaders = {"Person Name", "Username", "Password", "User Role", "Enterprise Name", "Enterprise Type", "Org Type"};
        
        try (CSVWriter writer = new CSVWriter(new FileWriter(csvSupplierOutputFile))) {
            // Writing the header
            writer.writeNext(suppliersheaders);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (CSVReader reader = new CSVReader(new FileReader(csvSuppliersInputFile))) {
            reader.readNext();
            
            String[] line; // Each line is each market detail along with it's product and prices
            while ((line = reader.readNext()) != null) {
                String supName = line[1];
                
                // Create new Super Market Enterprise
                Enterprise newSupplier = bostonNetwork.getEnterpriseDirectory().createAndAddEnterprise(supName, Enterprise.EnterpriseType.Supplier);
                
                
                // Admin - Super market
                Name fakerName = faker.name();
                String personName = fakerName.fullName();
                String username = fakerName.username();
                
                // Admin
                Person newSuplierPerson = newSupplier.getPersonDir().createPerson(personName);
                UserAccount newSuplierUA = newSupplier.getUserAccountDir().createUserAccount(username, username, newSuplierPerson, new SupplierAdminRole());
                // Add the userAccount at the ecosystem level to have unique useraccounts
                ecosystem.getUserAccountDir().addUserAccount(newSuplierUA);
                
                SupplierEnterprise newSupplierEnt = (SupplierEnterprise) newSupplier;
                
                String[] row1 = {personName, username, username, "SupplierAdminRole", supName, "Supplier", "-"};
                
                //Organization
                // Supplier | Product Org
                Organization newSupplierProdOrg = newSupplier.getOrgDir().createOrg(Organization.Type.Product);
                // Supplier | Stock Org
                Organization newSupplierStockOrg = newSupplier.getOrgDir().createOrg(Organization.Type.Stock);
                
                // Product Manager
                Name fakerName2 = faker.name();
                String personName2 = fakerName2.fullName();
                String username2 = fakerName2.username();
                
                // Supplier | Product Org User
                Person newSupplierProdOrgPerson = newSupplierProdOrg.getPersonDir().createPerson(personName2);
                UserAccount newSupplierProdOrgUA = newSupplierProdOrg.getUserAccountDir().createUserAccount(username2, username2, newSupplierProdOrgPerson, new ProductManagerRole());
                // Add the userAccount at the ecosystem level to have unique useraccounts
                ecosystem.getUserAccountDir().addUserAccount(newSupplierProdOrgUA);
                
                String[] row2 = {personName2, username2, username2, "ProductManagerRole", supName, "Supplier", "Product"};
                
                // Stock Manager
                Name fakerName3 = faker.name();
                String personName3 = fakerName3.fullName();
                String username3 = fakerName3.username();

                // Supplier | Stock Org User
                Person newSupplierStockOrgPerson = newSupplierStockOrg.getPersonDir().createPerson(personName3);
                UserAccount newSupplierStockOrgUA = newSupplierStockOrg.getUserAccountDir().createUserAccount(username3, username3, newSupplierStockOrgPerson, new SupplierStockManagerRole());
                // Add the userAccount at the ecosystem level to have unique useraccounts
                ecosystem.getUserAccountDir().addUserAccount(newSupplierStockOrgUA);
                
                String[] row3 = {personName3, username3, username3, "SupplierStockManagerRole", supName, "Supplier", "Stock"};
                
                try (CSVWriter writer = new CSVWriter(new FileWriter(csvSupplierOutputFile, true))) {
                    // Writing the header
                    writer.writeNext(row1);
                    writer.writeNext(row2);
                    writer.writeNext(row3);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                
                // Add Products to super market catalogs
                newSupplierEnt.getStockCatalog().addStockAndQuant("Whole Milk", Float.parseFloat(line[5]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Wheat Bread", Float.parseFloat(line[6]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Bananas", Float.parseFloat(line[7]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Ground Beef", Float.parseFloat(line[8]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Eggs", Float.parseFloat(line[9]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Chicken Breast", Float.parseFloat(line[10]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Russet Potatoes", Float.parseFloat(line[11]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Tomatoes", Float.parseFloat(line[12]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Cheddar Cheese", Float.parseFloat(line[13]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Pasta", Float.parseFloat(line[14]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Cereal", Float.parseFloat(line[15]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Apples", Float.parseFloat(line[16]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Orange Juice", Float.parseFloat(line[17]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Yogurt", Float.parseFloat(line[18]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Carrots", Float.parseFloat(line[19]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Peanut Butter", Float.parseFloat(line[20]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Salad Mix", Float.parseFloat(line[21]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Frozen Pizza", Float.parseFloat(line[22]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Olive Oil", Float.parseFloat(line[23]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Salmon", Float.parseFloat(line[24]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Broccoli", Float.parseFloat(line[25]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Coffee", Float.parseFloat(line[26]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Tortilla Chips", Float.parseFloat(line[27]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Avocado", Float.parseFloat(line[28]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Bacon", Float.parseFloat(line[29]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Strawberries", Float.parseFloat(line[30]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Onions", Float.parseFloat(line[31]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Butter", Float.parseFloat(line[32]), 1000);
                newSupplierEnt.getStockCatalog().addStockAndQuant("Ketchup", Float.parseFloat(line[33]), 1000);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Create Enterprises
        // Customer Support
        Enterprise support1Cust = bostonNetwork.getEnterpriseDirectory().createAndAddEnterprise("Support1", Enterprise.EnterpriseType.CustomerSupport);
        
        // Advertisements
        Enterprise adv1Advertisement = bostonNetwork.getEnterpriseDirectory().createAndAddEnterprise("AD Vantage", Enterprise.EnterpriseType.Advertisement);
        
        // Payments
        Enterprise chasePayment = bostonNetwork.getEnterpriseDirectory().createAndAddEnterprise("Chase", Enterprise.EnterpriseType.Payment);
        
        // Support1 - Customer Support
        Person support1Person = support1Cust.getPersonDir().createPerson("support1");
        UserAccount support1UA = support1Cust.getUserAccountDir().createUserAccount("support1", "support1", support1Person, new CustomerSupportAdminRole());
        // Add the userAccount at the ecosystem level to have unique useraccounts
        ecosystem.getUserAccountDir().addUserAccount(support1UA);
        
        // AD Vantage - Advertisement
        Person adv1Person = adv1Advertisement.getPersonDir().createPerson("adv1");
        UserAccount adv1UA = adv1Advertisement.getUserAccountDir().createUserAccount("adv1", "adv1", adv1Person, new AdvertisementAdminRole());
        // Add the userAccount at the ecosystem level to have unique useraccounts
        ecosystem.getUserAccountDir().addUserAccount(adv1UA);
        
        // Chase - Payment
        Person pay1Person = chasePayment.getPersonDir().createPerson("pay1");
        UserAccount pay1UA = chasePayment.getUserAccountDir().createUserAccount("pay1", "pay1", pay1Person, new PaymentAdminRole());
        // Add the userAccount at the ecosystem level to have unique useraccounts
        ecosystem.getUserAccountDir().addUserAccount(pay1UA);
        
        // Support 1 - Customer Support | Support Org
        Organization support1SupOrg = support1Cust.getOrgDir().createOrg(Organization.Type.Support);
        
        // AD Vantage - Advertisement | Advertisement Org
        Organization adv1AdOrg = adv1Advertisement.getOrgDir().createOrg(Organization.Type.Advertisement);
        
        // Chase - Payment | Payment Org
        Organization pay1AdOrg = chasePayment.getOrgDir().createOrg(Organization.Type.Payment);
        
        // Create customer support person
        Person custSupport1 = support1SupOrg.getPersonDir().createPerson(faker.name().fullName());
        UserAccount custSupUA1 = support1SupOrg.getUserAccountDir().createUserAccount("custSup_man", "custSup_man", custSupport1, new CustomerSupportManagerRole());
        // Add the userAccount at the ecosystem level to have unique useraccounts
        ecosystem.getUserAccountDir().addUserAccount(custSupUA1);
        
        // Create customer
        Person customer1 = support1SupOrg.getPersonDir().createPerson(faker.name().fullName());
        UserAccount custUA1 = support1SupOrg.getUserAccountDir().createUserAccount("customer1", "customer1", customer1, new CustomerRole());
        custUA1.setCustLatLong(42.3458, -71.0949);
        // Add the userAccount at the ecosystem level to have unique useraccounts
        ecosystem.getUserAccountDir().addUserAccount(custUA1);
        
        Person customer2 = support1SupOrg.getPersonDir().createPerson(faker.name().fullName());
        UserAccount custUA2 = support1SupOrg.getUserAccountDir().createUserAccount("customer2", "customer2", customer2, new CustomerRole());
        custUA2.setCustLatLong(42.340068, -71.088370);
        // Add the userAccount at the ecosystem level to have unique useraccounts
        ecosystem.getUserAccountDir().addUserAccount(custUA2);
        
        Person customer3 = support1SupOrg.getPersonDir().createPerson("Aakash");
        UserAccount custUA3 = support1SupOrg.getUserAccountDir().createUserAccount("aakash.belide@gmail.com", "aakash", customer3, new CustomerRole());
        custUA3.setCustLatLong(42.340068, -71.088370);
        // Add the userAccount at the ecosystem level to have unique useraccounts
        ecosystem.getUserAccountDir().addUserAccount(custUA3);
        
        Person customer4 = support1SupOrg.getPersonDir().createPerson("Aishwarya");
        UserAccount custUA4 = support1SupOrg.getUserAccountDir().createUserAccount("aishwaryaadusumelli07@gmail.com", "aishwarya", customer4, new CustomerRole());
        custUA4.setCustLatLong(42.340068, -71.088370);
        // Add the userAccount at the ecosystem level to have unique useraccounts
        ecosystem.getUserAccountDir().addUserAccount(custUA4);
        
        Person customer5 = support1SupOrg.getPersonDir().createPerson("Nimisha");
        UserAccount custUA5 = support1SupOrg.getUserAccountDir().createUserAccount("kotagirinimisha@gmail.com", "nimisha", customer5, new CustomerRole());
        custUA5.setCustLatLong(42.340068, -71.088370);
        // Add the userAccount at the ecosystem level to have unique useraccounts
        ecosystem.getUserAccountDir().addUserAccount(custUA5);
        
        // Create Advertisements
        AdvertisementEnterprise adv1AdvertisementEnt = (AdvertisementEnterprise) adv1Advertisement;
        
        // Define expiration dates for advertisements
        LocalDateTime expDate1 = LocalDateTime.now().plusDays(7); // 7 days from now
        LocalDateTime expDate2 = LocalDateTime.now().plusDays(14); // 14 days from now
        LocalDateTime expDate3 = LocalDateTime.now().plusSeconds(5); // 1 minute from now
        LocalDateTime expDate4 = LocalDateTime.now().plusDays(1); // 1 day from now
        LocalDateTime expDate5 = LocalDateTime.now().plusMinutes(5); // 5 minutes from now
        LocalDateTime expDate6 = LocalDateTime.now().plusDays(2); // 2 day from now

        // Create image icons for advertisements (replace with actual paths)
        ImageIcon image1 = new ImageIcon("/Users/aakashbelide/Aakash/Higher Studies/Course/Sem-1/INFO5100/Project/Final Project/INFO5100_Monday_Group41_Final_Project/Final_Project/src/main/resources/Images/Adv1_Final.png");
        image1 = new ImageIcon(image1.getImage().getScaledInstance(150, 350, Image.SCALE_SMOOTH));
        
        ImageIcon image2 = new ImageIcon("/Users/aakashbelide/Aakash/Higher Studies/Course/Sem-1/INFO5100/Project/Final Project/INFO5100_Monday_Group41_Final_Project/Final_Project/src/main/resources/Images/Adv2_Final.png");
        image2 = new ImageIcon(image2.getImage().getScaledInstance(150, 350, Image.SCALE_SMOOTH));
        
        ImageIcon image3 = new ImageIcon("/Users/aakashbelide/Aakash/Higher Studies/Course/Sem-1/INFO5100/Project/Final Project/INFO5100_Monday_Group41_Final_Project/Final_Project/src/main/resources/Images/Adv3_Final.png");
        image3 = new ImageIcon(image3.getImage().getScaledInstance(150, 350, Image.SCALE_SMOOTH));
        
        ImageIcon image4 = new ImageIcon("/Users/aakashbelide/Aakash/Higher Studies/Course/Sem-1/INFO5100/Project/Final Project/INFO5100_Monday_Group41_Final_Project/Final_Project/src/main/resources/Images/Adv4_Final.png");
        image4 = new ImageIcon(image4.getImage().getScaledInstance(150, 350, Image.SCALE_SMOOTH));
        
        ImageIcon image5 = new ImageIcon("/Users/aakashbelide/Aakash/Higher Studies/Course/Sem-1/INFO5100/Project/Final Project/INFO5100_Monday_Group41_Final_Project/Final_Project/src/main/resources/Images/Adv5_Final.png");
        image5 = new ImageIcon(image5.getImage().getScaledInstance(150, 350, Image.SCALE_SMOOTH));
        
        ImageIcon image6 = new ImageIcon("/Users/aakashbelide/Aakash/Higher Studies/Course/Sem-1/INFO5100/Project/Final Project/INFO5100_Monday_Group41_Final_Project/Final_Project/src/main/resources/Images/Adv6_Final.png");
        image6 = new ImageIcon(image6.getImage().getScaledInstance(150, 350, Image.SCALE_SMOOTH));

        // Add advertisements to the catalog
        Advertisement ad1 = adv1AdvertisementEnt.getAdvertisementCatalog().addAdvertisement("Ad 1", expDate1, image1, 42.3458, -71.0949);
        Advertisement ad2 = adv1AdvertisementEnt.getAdvertisementCatalog().addAdvertisement("Ad 2", expDate2, image2, 42.3458, -71.0949);
        Advertisement ad3 = adv1AdvertisementEnt.getAdvertisementCatalog().addAdvertisement("Ad 3", expDate3, image3, 42.3458, -71.0949);
        Advertisement ad4 = adv1AdvertisementEnt.getAdvertisementCatalog().addAdvertisement("Ad 4", expDate4, image4, 44.3458, -74.0949);
        Advertisement ad5 = adv1AdvertisementEnt.getAdvertisementCatalog().addAdvertisement("Ad 5", expDate5, image5, 42.340068, -71.088370);
        Advertisement ad6 = adv1AdvertisementEnt.getAdvertisementCatalog().addAdvertisement("Ad 6", expDate6, image6, 42.340068, -71.088370);
        
        
        // Populating clickstream data
        for (int i=1; i<=100; i++) {
            ad1.addClickStream(custUA3.getUsername());
            ad1.addClickStream(custUA4.getUsername());
            ad1.addClickStream(custUA5.getUsername());
            
            ad2.addClickStream(custUA1.getUsername());
            ad2.addClickStream(custUA2.getUsername());
            ad2.addClickStream(custUA3.getUsername());
            
            ad4.addClickStream(custUA2.getUsername());
            ad4.addClickStream(custUA3.getUsername());
            ad4.addClickStream(custUA4.getUsername());
            ad4.addClickStream(custUA5.getUsername());
            
            ad5.addClickStream(custUA1.getUsername());
            ad5.addClickStream(custUA2.getUsername());
            
            ad6.addClickStream(custUA1.getUsername());
            ad6.addClickStream(custUA2.getUsername());
            ad6.addClickStream(custUA4.getUsername());
            ad6.addClickStream(custUA5.getUsername());
        }
        
        // AD Vantage - Advertisement | Advertisement Manager User
        Person adv1ManagerPerson = adv1AdOrg.getPersonDir().createPerson(faker.name().fullName());
        UserAccount adv1ManagerUA = adv1AdOrg.getUserAccountDir().createUserAccount("adv1_man", "adv1_man", adv1ManagerPerson, new AdvertisementManagerRole());
        // Add the userAccount at the ecosystem level to have unique useraccounts
        ecosystem.getUserAccountDir().addUserAccount(adv1ManagerUA);
        
        // AD Vantage - Advertisement | Advertisement Analyst User
        Person adv1AnalystPerson1 = adv1AdOrg.getPersonDir().createPerson(faker.name().fullName());
        UserAccount adv1AnalystUA1 = adv1AdOrg.getUserAccountDir().createUserAccount("adv1_anl1", "adv1_anl1", adv1AnalystPerson1, new AdvertisementAnalystRole());
        // Add the userAccount at the ecosystem level to have unique useraccounts
        ecosystem.getUserAccountDir().addUserAccount(adv1AnalystUA1);
        
        Person adv1AnalystPerson2 = adv1AdOrg.getPersonDir().createPerson(faker.name().fullName());
        UserAccount adv1AnalystUA2 = adv1AdOrg.getUserAccountDir().createUserAccount("adv1_anl2", "adv1_anl2", adv1AnalystPerson2, new AdvertisementAnalystRole());
        // Add the userAccount at the ecosystem level to have unique useraccounts
        ecosystem.getUserAccountDir().addUserAccount(adv1AnalystUA2);
        
        // Chase - Payment | Payment FraudAnalyst User
        Person pay1AnalystPerson = pay1AdOrg.getPersonDir().createPerson(faker.name().fullName());
        UserAccount pay1AnalystUA = pay1AdOrg.getUserAccountDir().createUserAccount("pay1_anl", "pay1_anl", pay1AnalystPerson, new PaymentFraudAnalyst());
        // Add the userAccount at the ecosystem level to have unique useraccounts
        ecosystem.getUserAccountDir().addUserAccount(pay1AnalystUA);
        
        // Creating Super Markets and the products in it
        String csvSuperMarketInputFile = "/Users/aakashbelide/Aakash/Higher Studies/Course/Sem-1/INFO5100/Project/Final Project/INFO5100_Monday_Group41_Final_Project/Final_Project/src/main/resources/Data/Markets.csv";
        String csvSuperMarketOutputFile = "/Users/aakashbelide/Aakash/Higher Studies/Course/Sem-1/INFO5100/Project/Final Project/INFO5100_Monday_Group41_Final_Project/Final_Project/src/main/resources/Data/Markets_Users.csv";
        
        String[] superMarketheaders = {"Person Name", "Username", "Password", "User Role", "Enterprise Name", "Location", "Enterprise Type"};
        
        try (CSVWriter writer = new CSVWriter(new FileWriter(csvSuperMarketOutputFile))) {
            // Writing the header
            writer.writeNext(superMarketheaders);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (CSVReader reader = new CSVReader(new FileReader(csvSuperMarketInputFile))) {
            reader.readNext();
            
            String[] line; // Each line is each market detail along with it's product and prices
            while ((line = reader.readNext()) != null) {
                String storeName = line[1];
                String storeLoc = line[2];
                String latitude = line[3];
                String longitude = line[4];
                //System.out.println(storeName);
                //System.out.println(latitude);
                //System.out.println(longitude);
                //System.out.println("--------------------");
                
                // Create new Super Market Enterprise
                Enterprise newSuperMarket = bostonNetwork.getEnterpriseDirectory().createAndAddEnterprise(storeName, Enterprise.EnterpriseType.SuperMarket);
                // Super Market Enterprise
                SuperMarketEnterprise newSuperMarketEnt = (SuperMarketEnterprise) newSuperMarket;
                // Set store location
                newSuperMarketEnt.setSuperMarketLocation(storeLoc);
                
                // Set the lat long
                newSuperMarketEnt.setSuperMarketLatLong(Double.parseDouble(latitude), Double.parseDouble(longitude));
                
                // Admin - Super market
                Name fakerName = faker.name();
                String personName = fakerName.fullName();
                String username = fakerName.username();
                
                // Admin
                Person newSuperMarketPerson = newSuperMarket.getPersonDir().createPerson(personName);
                UserAccount newSuperMarketUA = newSuperMarket.getUserAccountDir().createUserAccount(username, username, newSuperMarketPerson, new SuperMarketAdminRole());
                // Add the userAccount at the ecosystem level to have unique useraccounts
                ecosystem.getUserAccountDir().addUserAccount(newSuperMarketUA);
                
                String[] row1 = {personName, username, username, "SuperMarketAdminRole", storeName, storeLoc, "SuperMarket"};
                
                //Organization
                // Super Market | Super Market Stock Org
                Organization newSuperMarketStockOrg = newSuperMarket.getOrgDir().createOrg(Organization.Type.SuperMarketStock);
                
                // Stock Manager - Super market
                Name fakerName2 = faker.name();
                String personName2 = fakerName2.fullName();
                String username2 = fakerName2.username();
                Person newSuperMarketStockPerson = newSuperMarketStockOrg.getPersonDir().createPerson(personName2);
                UserAccount newSuperMarketStockUA = newSuperMarketStockOrg.getUserAccountDir().createUserAccount(username2, username2, newSuperMarketStockPerson, new SuperMarketStockManagerRole());
                // Add the userAccount at the ecosystem level to have unique useraccounts
                ecosystem.getUserAccountDir().addUserAccount(newSuperMarketStockUA);	
                
                String[] row2 = {personName2, username2, username2, "SuperMarketStockManagerRole", storeName, storeLoc, "SuperMarket"};
                
                try (CSVWriter writer = new CSVWriter(new FileWriter(csvSuperMarketOutputFile, true))) {
                    // Writing the header
                    writer.writeNext(row1);
                    writer.writeNext(row2);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                
                // Add Products to super market catalogs
                newSuperMarketEnt.getProductCatalog().addProduct("Whole Milk", 1000, Float.parseFloat(line[5]));
                newSuperMarketEnt.getProductCatalog().addProduct("Wheat Bread", 1000, Float.parseFloat(line[6]));
                newSuperMarketEnt.getProductCatalog().addProduct("Bananas", 1000, Float.parseFloat(line[7]));
                newSuperMarketEnt.getProductCatalog().addProduct("Ground Beef", 1000, Float.parseFloat(line[8]));
                newSuperMarketEnt.getProductCatalog().addProduct("Eggs", 1000, Float.parseFloat(line[9]));
                newSuperMarketEnt.getProductCatalog().addProduct("Chicken Breast", 1000, Float.parseFloat(line[10]));
                newSuperMarketEnt.getProductCatalog().addProduct("Russet Potatoes", 1000, Float.parseFloat(line[11]));
                newSuperMarketEnt.getProductCatalog().addProduct("Tomatoes", 1000, Float.parseFloat(line[12]));
                newSuperMarketEnt.getProductCatalog().addProduct("Cheddar Cheese", 1000, Float.parseFloat(line[13]));
                newSuperMarketEnt.getProductCatalog().addProduct("Pasta", 1000, Float.parseFloat(line[14]));
                newSuperMarketEnt.getProductCatalog().addProduct("Cereal", 1000, Float.parseFloat(line[15]));
                newSuperMarketEnt.getProductCatalog().addProduct("Apples", 1000, Float.parseFloat(line[16]));
                newSuperMarketEnt.getProductCatalog().addProduct("Orange Juice", 1000, Float.parseFloat(line[17]));
                newSuperMarketEnt.getProductCatalog().addProduct("Yogurt", 1000, Float.parseFloat(line[18]));
                newSuperMarketEnt.getProductCatalog().addProduct("Carrots", 1000, Float.parseFloat(line[19]));
                newSuperMarketEnt.getProductCatalog().addProduct("Peanut Butter", 1000, Float.parseFloat(line[20]));
                newSuperMarketEnt.getProductCatalog().addProduct("Salad Mix", 1000, Float.parseFloat(line[21]));
                newSuperMarketEnt.getProductCatalog().addProduct("Frozen Pizza", 1000, Float.parseFloat(line[22]));
                newSuperMarketEnt.getProductCatalog().addProduct("Olive Oil", 1000, Float.parseFloat(line[23]));
                newSuperMarketEnt.getProductCatalog().addProduct("Salmon", 1000, Float.parseFloat(line[24]));
                newSuperMarketEnt.getProductCatalog().addProduct("Broccoli", 1000, Float.parseFloat(line[25]));
                newSuperMarketEnt.getProductCatalog().addProduct("Coffee", 1000, Float.parseFloat(line[26]));
                newSuperMarketEnt.getProductCatalog().addProduct("Tortilla Chips", 1000, Float.parseFloat(line[27]));
                newSuperMarketEnt.getProductCatalog().addProduct("Avocado", 1000, Float.parseFloat(line[28]));
                newSuperMarketEnt.getProductCatalog().addProduct("Bacon", 1000, Float.parseFloat(line[29]));
                newSuperMarketEnt.getProductCatalog().addProduct("Strawberries", 1000, Float.parseFloat(line[30]));
                newSuperMarketEnt.getProductCatalog().addProduct("Onions", 1000, Float.parseFloat(line[31]));
                newSuperMarketEnt.getProductCatalog().addProduct("Butter", 1000, Float.parseFloat(line[32]));
                newSuperMarketEnt.getProductCatalog().addProduct("Ketchup", 1000, Float.parseFloat(line[33]));
                
                // Populating customer orders data
                Product eggs = newSuperMarketEnt.getProductCatalog().checkProdInList("Eggs");
                Product apples = newSuperMarketEnt.getProductCatalog().checkProdInList("Apples");
                Product bananas = newSuperMarketEnt.getProductCatalog().checkProdInList("Bananas");
                Product bread = newSuperMarketEnt.getProductCatalog().checkProdInList("Wheat Bread");

                Order newOrder = new Order();
                newOrder.addOrderItem(eggs, 36, newSuperMarketEnt);
                newOrder.addOrderItem(apples, 15, newSuperMarketEnt);
                newOrder.addOrderItem(bananas, 15, newSuperMarketEnt);

                Order newOrder1_2 = new Order();
                newOrder1_2.addOrderItem(bread, 36, newSuperMarketEnt);
                newOrder1_2.addOrderItem(apples, 15, newSuperMarketEnt);

                Order newOrder2 = new Order();
                newOrder2.addOrderItem(apples, 10, newSuperMarketEnt);
                newOrder2.addOrderItem(bananas, 20, newSuperMarketEnt);
                newOrder2.addOrderItem(bread, 13, newSuperMarketEnt);

                Order newOrder2_2 = new Order();
                newOrder2_2.addOrderItem(apples, 10, newSuperMarketEnt);
                newOrder2_2.addOrderItem(eggs, 20, newSuperMarketEnt);

                Order newOrder3 = new Order();
                newOrder3.addOrderItem(apples, 15, newSuperMarketEnt);
                newOrder3.addOrderItem(bananas, 6, newSuperMarketEnt);
                newOrder3.addOrderItem(bread, 3, newSuperMarketEnt);

                Order newOrder3_2 = new Order();
                newOrder3_2.addOrderItem(apples, 15, newSuperMarketEnt);
                newOrder3_2.addOrderItem(eggs, 45, newSuperMarketEnt);

                custUA3.getCustOrders().addSmartOrder(newOrder);
                custUA3.getCustOrders().addSmartOrder(newOrder1_2);

                custUA4.getCustOrders().addSmartOrder(newOrder2);
                custUA4.getCustOrders().addSmartOrder(newOrder2_2);

                custUA5.getCustOrders().addSmartOrder(newOrder3);
                custUA5.getCustOrders().addSmartOrder(newOrder3_2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return ecosystem;
    }
}
