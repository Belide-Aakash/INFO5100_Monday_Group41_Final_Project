/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.StockManagement;

import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class Stock {
    private int stockID;
    private String stockName;
    private int stockQuant;
    private float stockPrice;
    
    public Stock(int id, String name, float price) {
        this.stockID = id;
        this.stockName = name;
        this.stockQuant = 0;
        this.stockPrice = price;
    }
    
    public Stock(int id, String name, int quantity, float price) {
        this.stockID = id;
        this.stockName = name;
        this.stockQuant = quantity;
        this.stockPrice = price;
    }
    
    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getStockQuant() {
        return stockQuant;
    }

    public void setStockQuant(int stockQuant) {
        this.stockQuant = stockQuant;
    }
    
    public void incStockQuant(int incStockQuant) {
        this.stockQuant = this.stockQuant + incStockQuant;
    }
    
    public void decStockQuant(int decStockQuant) {
        this.stockQuant = this.stockQuant - decStockQuant;
    }

    public float getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(float stockPrice) {
        this.stockPrice = stockPrice;
    }
    
    @Override
    public String toString() {
        return this.stockName;
    }
}
