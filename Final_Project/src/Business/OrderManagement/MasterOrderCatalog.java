/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.OrderManagement;

import Business.ProductManagement.Product;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class MasterOrderCatalog {
    ArrayList<Order> orders;
    int orderCount = 0;
    
    public MasterOrderCatalog() {
        this.orders = new ArrayList<Order>();
    }
    
    public Order newOrder() {
        Order newCustOrder = new Order();
        return newCustOrder;
    }
    
    public void addSmartOrder(Order order) {
        order.setOrderID(orderCount);
        this.orderCount = this.orderCount + 1;
        for(OrderItem oi : order.getOrderItems()) {
            Product getProduct = oi.getItemProduct();
            getProduct.addOrderItem(oi);
            getProduct.decProdQuant(oi.getItemQuantity());
        }
        this.orders.add(order);
    }
    
    public void addOrder(Order order) {
        order.setOrderID(orderCount);
        this.orderCount = this.orderCount + 1;
        for(OrderItem oi : order.getOrderItems()) {
            Product getProduct = oi.getItemProduct();
            getProduct.addOrderItem(oi);
        }
        this.orders.add(order);
    }
}
