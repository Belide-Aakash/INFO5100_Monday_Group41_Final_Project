/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.OrderManagement;

import Business.ProductManagement.Product;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class Order {
    private int orderID;
    private ArrayList<OrderItem> orderitems;
    private LocalDateTime orderDateTime;
    
    public Order() {
        this.orderitems = new ArrayList<OrderItem>();
        this.orderDateTime = LocalDateTime.now();
    }
    
    public void addOrderItem(Product iProd, int iQuant) {
        OrderItem oi = new OrderItem(iProd, iQuant);
        this.orderitems.add(oi);
    }
    
    public void setOrderID(int id) {
        this.orderID = id;
    }
    
    public ArrayList<OrderItem> getOrderItems() {
        return this.orderitems;
    }
    
    public float getTransactionAmount() {
        float totalAmount = 0;
        for (OrderItem oi : this.orderitems) {
            totalAmount = totalAmount + oi.getOrderItemTotal();
        }
        return totalAmount;
    }
}
