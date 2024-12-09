/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.OrderManagement;

import Business.Enterprise.SuperMarketEnterprise;
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
    
    public OrderItem addOrderItem(Product iProd, int iQuant, SuperMarketEnterprise iMarket) {
        OrderItem oi = new OrderItem(iProd, iQuant, iMarket);
        this.orderitems.add(oi);
        return oi;
    }
    
    public void removeOrderItemProdQuant(OrderItem removeOrderItem) {
        removeOrderItem.getItemProduct().incProdQuant(removeOrderItem.getItemQuant());
    }
    
    public void removeOrderItem(OrderItem removeOrderItem) {
        removeOrderItem.getItemProduct().incProdQuant(removeOrderItem.getItemQuant());
        this.orderitems.remove(removeOrderItem);
    }
    
    public void setOrderID(int id) {
        this.orderID = id;
    }
    
    public int getOrderID() {
        return orderID;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }
    
    public ArrayList<OrderItem> getOrderItems() {
        return this.orderitems;
    }
    
    public int getOrderSize() {
        return this.orderitems.size();
    }
    
    public OrderItem findOrderItem(Product iProd) {
        for (OrderItem oi : this.orderitems) {
            if (oi.getItemProduct().equals(iProd)) {
                return oi;
            }
        }
        return null;
    }
    
    public float getTransactionAmount() {
        float totalAmount = 0;
        for (OrderItem oi : this.orderitems) {
            totalAmount = totalAmount + oi.getOrderItemTotal();
        }
        return totalAmount;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.orderID);
    }
}
