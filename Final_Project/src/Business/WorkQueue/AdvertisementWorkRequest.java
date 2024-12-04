/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.AdvManagement.Advertisement;

/**
 *
 * @author aakashbelide
 */
public class AdvertisementWorkRequest extends WorkRequest {
    // Initializing the user advertisement work request variables
    private Advertisement reqAdv;
    
    // Getter to get advertisementRequest
    public Advertisement getRequestAdver() {
        return this.reqAdv;
    }
    
    // Setter to set supplyRequest
    public void setRequestAdver(Advertisement advertisementRequest) {
        this.reqAdv = advertisementRequest;
    }
}
