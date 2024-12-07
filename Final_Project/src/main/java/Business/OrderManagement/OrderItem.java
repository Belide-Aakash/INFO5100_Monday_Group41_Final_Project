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
    private float buyPrice;
    
    private SuperMarketEnterprise market;
    
    public OrderItem(Product iProd, int iQuant, SuperMarketEnterprise iMarket) {
        this.itemProduct = iProd;
        this.itemQuant = iQuant;
        this.market = iMarket;
        this.buyPrice = iProd.getProdPrice();
    }
    
    public float getOrderItemTotal() {
        return this.buyPrice * this.itemQuant;
    }
    
    public Product getItemProduct() {
        return this.itemProduct;
    }
    
     public float getBuyPrice() {
        return buyPrice;
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
        return this.itemQuant;
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
    
    @Override
    public String toString() {
        return this.itemProduct.getProdName();
    }
}
