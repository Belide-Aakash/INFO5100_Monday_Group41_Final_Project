/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AdvManagement;

import Business.Geolocation.LatLong;
import java.time.LocalDateTime;
import javax.swing.ImageIcon;
/**
 *
 * @author aakashbelide
 */
public class Advertisement {
    private int advID;
    private String advName;
    private LocalDateTime advDateTime;
    private LocalDateTime advExpiryDateTime;
    private int advClickCount;
    private ImageIcon advImage;
    private LatLong advLatLong;
    
    public Advertisement() {
        this.advDateTime = LocalDateTime.now();
        this.advClickCount = 0;
    }
    
    public Advertisement(int id, String name, LocalDateTime expDatetime, ImageIcon advImg, double lat, double longi) {
        this.advID = id;
        this.advName = name;
        this.advDateTime = LocalDateTime.now();
        this.advExpiryDateTime = expDatetime;
        this.advClickCount = 0;
        this.advImage = advImg;
        advLatLong = new LatLong(lat, longi);
    }
    
    public void updateAdvertisement(String name, LocalDateTime expDatetime, ImageIcon advImg, double lat, double longi) {
        this.advName = name;
        this.advExpiryDateTime = expDatetime;
        this.advImage = advImg;
        advLatLong = new LatLong(lat, longi);
    }
    
    public int getAdvID() {
        return advID;
    }

    public void setAdvID(int advID) {
        this.advID = advID;
    }

    public String getAdvName() {
        return advName;
    }

    public void setAdvName(String advName) {
        this.advName = advName;
    }

    public LocalDateTime getAdvDateTime() {
        return advDateTime;
    }

    public void setAdvDateTime(LocalDateTime advDateTime) {
        this.advDateTime = advDateTime;
    }

    public LocalDateTime getAdvExpiryDateTime() {
        return advExpiryDateTime;
    }

    public void setAdvExpiryDateTime(LocalDateTime advExpiryDateTime) {
        this.advExpiryDateTime = advExpiryDateTime;
    }

    public int getAdvClickCount() {
        return advClickCount;
    }

    public void setAdvClickCount(int advClickCount) {
        this.advClickCount = advClickCount;
    }
    
    public void addClickCount() {
        this.advClickCount = this.advClickCount + 1;
    }

    public ImageIcon getAdvImage() {
        return advImage;
    }

    public void setAdvImage(ImageIcon advImage) {
        this.advImage = advImage;
    }

    public LatLong getAdvLatLong() {
        return advLatLong;
    }

    public void setAdvLatLong(double advLatitude, double advLongitude) {
        this.advLatLong = new LatLong(advLatitude, advLongitude);
    }
    
    public double getDistance(LatLong other) {
        return this.advLatLong.measureDistance(other);
    }
    
    @Override
    public String toString() {
        return this.advName;
    }
}
