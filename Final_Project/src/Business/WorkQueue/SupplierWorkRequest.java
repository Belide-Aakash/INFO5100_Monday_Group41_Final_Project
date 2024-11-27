/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author aakashbelide
 */
public class SupplierWorkRequest extends WorkRequest {
    // Initializing the user supplier work request variables
    private String supplyRequest;
    
    // Getter to get supplyRequest
    public String getSupplyRequest() {
        return this.supplyRequest;
    }
    
    // Setter to set supplyRequest
    public void setSupplyRequest(String supplyRequest) {
        this.supplyRequest = supplyRequest;
    }
}
