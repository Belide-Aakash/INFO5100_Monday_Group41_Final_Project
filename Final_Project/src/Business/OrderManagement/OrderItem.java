/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.OrderManagement;

import Business.Enterprise.SuperMarketEnterprise;
import Business.ProductManagement.Product;

/**
 *
 * @author aakashbelide
 */
public class OrderItem {
    private Product itemProduct;
    private int itemQuant;
    private String itemFeedback;
    private int itemRating;
    private SuperMarketEnterprise market;
    
    public OrderItem(Product iProd, int iQuant) {
        this.itemProduct = iProd;
        this.itemQuant = iQuant;
    }
    
    public OrderItem(Product iProd, int iQuant, SuperMarketEnterprise iMarket) {
        this.itemProduct = iProd;
        this.itemQuant = iQuant;
        this.market = iMarket;
    }
    
    public float getOrderItemTotal() {
        return itemProduct.getProdPrice() * this.itemQuant;
    }
    
    public Product getItemProduct() {
        return this.itemProduct;
    }
    
    public int getItemQuantity() {
        return this.itemQuant;
    }
    
    public void setItemFeedback(String feedback) {
        this.itemFeedback = feedback;
    }
    
    public String getItemFeedback() {
        return this.itemFeedback;
    }
    
    public void setItemRating(int rating) {
        this.itemRating = rating;
    }
    
    public int getItemRating() {
        return this.itemRating;
    }
    
    public int getItemQuant() {
        return itemQuant;
    }

    public void setItemQuant(int itemQuant) {
        this.itemQuant = itemQuant;
    }
    
    public SuperMarketEnterprise getMarket() {
        return market;
    }

    public void setMarket(SuperMarketEnterprise market) {
        this.market = market;
    }
}
