/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;
import Business.Geolocation.LatLong;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class EnterpriseDirectory {
    // Initializing the enterprise directory variable
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }
    
    // Getter to get the enterpriseList
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    // Setter to set the enterpriseList
    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    // Start to create the required enterprises
    public Enterprise createAndAddEnterprise(String enterpriseName, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        
        if (null != type) switch (type) {
            case Supplier:
                // Creating Supplier type enterprise and adding it to the enterpriseList
                enterprise = new SupplierEnterprise(enterpriseName);
                enterpriseList.add(enterprise);
                break;
            case SuperMarket:
                // Creating SuperMarket type enterprise and adding it to the enterpriseList
                enterprise = new SuperMarketEnterprise(enterpriseName);
                enterpriseList.add(enterprise);
                break;
            case Advertisement:
                // Creating Advertisement type enterprise and adding it to the enterpriseList
                enterprise = new AdvertisementEnterprise(enterpriseName);
                enterpriseList.add(enterprise);
                break;
            case Payment:
                // Creating Payment type enterprise and adding it to the enterpriseList
                enterprise = new PaymentEnterprise(enterpriseName);
                enterpriseList.add(enterprise);
                break;
            case CustomerSupport:
                // Creating Customer Support type enterprise and adding it to the enterpriseList
                enterprise = new CustomerSupportEnterprise(enterpriseName);
                enterpriseList.add(enterprise);
                break;
            default:
                break;
        }
        return enterprise;
    }
    
    // Java method to get the nearest Super Market within the radius from customer location
    public ArrayList<SuperMarketEnterprise> getNearestMarkets(LatLong custLatLong, double radius) {
        ArrayList<SuperMarketEnterprise> marketsNearCust = new ArrayList<SuperMarketEnterprise>();
        for (Enterprise enterprise : this.enterpriseList) {
            SuperMarketEnterprise superMarketEnt = (SuperMarketEnterprise) enterprise;
            if (superMarketEnt.getDistance(custLatLong) < radius) {
                marketsNearCust.add(superMarketEnt);
            }
        }
        return marketsNearCust;
    }
}
