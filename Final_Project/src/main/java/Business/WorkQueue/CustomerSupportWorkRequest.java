/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.OrderManagement.OrderItem;

/**
 *
 * @author aakashbelide
 */
public class CustomerSupportWorkRequest extends WorkRequest {
    // Initializing the user advertisement work request variables
    private OrderItem reqOrderItem;
    
    // Getter to get reqOrderItem
    public OrderItem getReqOrderItem() {
        return reqOrderItem;
    }
    
    // Setter to set reqOrderItem
    public void setReqOrderItem(OrderItem reqOrderItem) {
        this.reqOrderItem = reqOrderItem;
    }
}
