/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.StockManagement;

import Business.ProductManagement.Product;
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
    
    private Stock stockProd;
    private String stockSupplier;
    
    public Stock(Stock stockProd, String name, int quantity, float price, String supplierName) {
        this.stockProd = stockProd;
        this.stockName = name;
        this.stockQuant = quantity;
        this.stockPrice = price;
        this.stockSupplier = supplierName;
    }
    
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
    
    public int getStockID() {
        return stockID;
    }

    public void setStockID(int stockID) {
        this.stockID = stockID;
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
    
    public Stock getStockProd() {
        return stockProd;
    }

    public void setStockProd(Stock stockProd) {
        this.stockProd = stockProd;
    }
    
    public String getStockSupplier() {
        return stockSupplier;
    }

    public void setStockSupplier(String stockSupplier) {
        this.stockSupplier = stockSupplier;
    }
    
    @Override
    public String toString() {
        return this.stockName;
    }
}
