/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ProductManagement;

import Business.OrderManagement.OrderItem;
import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class Product {
    private int prodID;
    private String prodName;
    private int prodQuant;
    private float prodPrice;
    ArrayList<OrderItem> orderItems;
    
    public Product(int id, String name, int quantity, float price) {
        this.prodID = id;
        this.prodName = name;
        this.prodQuant = quantity;
        this.prodPrice = price;
        this.orderItems = new ArrayList<OrderItem>();
    }
    
    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }
    
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdQuant() {
        return prodQuant;
    }

    public void setProdQuant(int prodQuant) {
        this.prodQuant = prodQuant;
    }
    
    public void incProdQuant(int incProdQuant) {
        this.prodQuant = this.prodQuant + incProdQuant;
    }
    
    public void decProdQuant(int decProdQuant) {
        this.prodQuant = this.prodQuant - decProdQuant;
    }

    public float getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(float prodPrice) {
        this.prodPrice = prodPrice;
    }
    
    public void addOrderItem(OrderItem oi){     
        this.orderItems.add(oi);
    }
    
    public float getAvgProdRating() {
        int avgRating = 0;
        int ratingCount = 0;
        for(OrderItem oi : this.orderItems) {
            if (oi.getItemFeedback() != null) {
                avgRating = avgRating + oi.getItemRating();
                ratingCount = ratingCount + 1;
            }
        }
        return (avgRating/ratingCount);
    }
    
    public int getNoProdRating() {
        int ratingCount = 0;
        for(OrderItem oi : this.orderItems) {
            if (oi.getItemFeedback() != null) {
                ratingCount = ratingCount + 1;
            }
        }
        return ratingCount;
    }
    
    @Override
    public String toString() {
        return this.prodName;
    }
}
