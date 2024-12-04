/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AdvManagement;

import Business.Geolocation.LatLong;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author aakashbelide
 */
public class AdvertisementCatalog {
    private int advCounter = 0;
    ArrayList<Advertisement> advertisementList;
    
    public AdvertisementCatalog() {
        this.advertisementList = new ArrayList<Advertisement>();
    }
    
    public void addAdvertisement(String name, LocalDateTime expDatetime, ImageIcon advImg, float lat, float longi) {
        Advertisement newAdv = new Advertisement(advCounter, name, expDatetime, advImg, lat, longi);
        this.advCounter = this.advCounter + 1;
        this.advertisementList.add(newAdv);
    }
    
    public ArrayList<Advertisement> getAdvertisementList() {
        return this.advertisementList;
    }
    
    public ArrayList<Advertisement> getActiveAdverList() {
        ArrayList<Advertisement> activeAdvList = new ArrayList<Advertisement>();
        for (Advertisement adv : this.advertisementList) {
            if (adv.getAdvExpiryDateTime().isBefore(LocalDateTime.now())) {
                activeAdvList.add(adv);
            }
        }
        return activeAdvList;
    }
    
    public ArrayList<Advertisement> getActiveRadiusAdverList(LatLong custLatLong, double radius) {
        ArrayList<Advertisement> activeAdvList = new ArrayList<Advertisement>();
        for (Advertisement adv : this.advertisementList) {
            if ((adv.getAdvExpiryDateTime().isBefore(LocalDateTime.now())) && (adv.getDistance(custLatLong) <= radius)) {
                activeAdvList.add(adv);
            }
        }
        return activeAdvList;
    }
}
