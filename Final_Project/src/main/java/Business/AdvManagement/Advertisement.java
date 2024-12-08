/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AdvManagement;

import Business.Geolocation.LatLong;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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
    private ArrayList<ArrayList<Object>> clickStream;
    
    public Advertisement() {
        this.advDateTime = LocalDateTime.now();
        this.advClickCount = 0;
        this.clickStream = new ArrayList<ArrayList<Object>>();
    }
    
    public Advertisement(int id, String name, LocalDateTime expDatetime, ImageIcon advImg, double lat, double longi) {
        this.advID = id;
        this.advName = name;
        this.advDateTime = LocalDateTime.now();
        this.advExpiryDateTime = expDatetime;
        this.advClickCount = 0;
        this.advImage = advImg;
        this.advLatLong = new LatLong(lat, longi);
        this.clickStream = new ArrayList<ArrayList<Object>>();
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
    
    public ArrayList<ArrayList<Object>> getClickStream() {
        return clickStream;
    }
    
    public void addClickStream(String username) {
        ArrayList<Object> tmpObj = new ArrayList<Object>();
        tmpObj.add(username); // add username
        tmpObj.add(LocalDateTime.now()); // add current time
        this.clickStream.add(tmpObj);
    }
    
    public String getClickStreamAnalysis() {
        String analysis = "";
        for (ArrayList<Object> obj : this.clickStream) {
            analysis = analysis + obj.get(0) + " | " + obj.get(1) + System.lineSeparator();
        }
        return analysis;
    }

    public void setClickStream(ArrayList<ArrayList<Object>> clickStream) {
        this.clickStream = clickStream;
    }
    
    public List<Map.Entry<String, Integer>> getTop5Customers() {
        Map<String, Integer> customerClickMap = new HashMap<>();

        for (ArrayList<Object> click : this.clickStream) {
            String username = (String) click.get(0);
            customerClickMap.put(username, customerClickMap.getOrDefault(username, 0) + 1);
        }

        // Sort the map entries by click count in descending order and limit to top 5
        return customerClickMap.entrySet()
                               .stream()
                               .sorted((a, b) -> b.getValue() - a.getValue())
                               .limit(5)
                               .collect(Collectors.toList());
    }
    
    public Map<String, Integer> getClicksInTimeFrame(LocalDateTime inTime) {
        LocalDateTime nowTime = inTime;
        int count1Min = 0, count5Min = 0, count10Min = 0;

        for (ArrayList<Object> click : this.clickStream) {
            LocalDateTime clickTime = (LocalDateTime) click.get(1);
            Duration duration = Duration.between(clickTime, nowTime);

            if (duration.toMinutes() <= 1) count1Min++;
            if (duration.toMinutes() <= 5) count5Min++;
            if (duration.toMinutes() <= 10) count10Min++;
        }

        Map<String, Integer> result = new HashMap<>();
        result.put("1 Minute", count1Min);
        result.put("5 Minutes", count5Min);
        result.put("10 Minutes", count10Min);

        return result;
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
