/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author aakashbelide
 */
public class AdvertisementWorkRequest extends WorkRequest {
    // Initializing the user advertisement work request variables
    private String advertisementRequest;
    
    // Getter to get advertisementRequest
    public String getAdvertisementRequest() {
        return this.advertisementRequest;
    }
    
    // Setter to set supplyRequest
    public void setAdvertisementRequest(String advertisementRequest) {
        this.advertisementRequest = advertisementRequest;
    }
}
