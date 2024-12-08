/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author aakashbelide
 */
public class MarketWorkRequest extends WorkRequest {
    // Initializing the user market work request variables
    private String marketRequest;
    
    // Getter to get marketRequest
    public String getMarketRequest() {
        return this.marketRequest;
    }
    
    // Setter to set marketRequest
    public void setMarketRequest(String marketRequest) {
        this.marketRequest = marketRequest;
    }
}
