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
public class StockCatalog {
    private ArrayList<Stock> stocks;
    private int stockCount = 0;
    
    public StockCatalog() {
        this.stocks = new ArrayList<Stock>();
        this.stockCount = this.stockCount + 1;
    }
    
    public void addStock(String name, float price) {
        Stock stock = new Stock(this.stockCount, name, price);
        this.stocks.add(stock);
        this.stockCount = this.stockCount + 1;
    }
    
    public void removeStock(Stock stock) {
        this.stocks.remove(stock);
    }
    
    public void subStock(String name, int quantity) {
        Stock getStock = checkStockInList(name);
        if (getStock!=null) {
            getStock.decStockQuant(quantity);
        }
    }
    
    public ArrayList<Stock> getStockList(){
        return this.stocks;
    }
    
    public Stock checkStockInList(String name) {
        for (Stock stock : this.stocks) {
            if (stock.getStockName().equalsIgnoreCase(name)) {
                return stock;
            }
        }
        return null;
    }
}
