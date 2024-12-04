/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ProductManagement;

import java.util.ArrayList;

/**
 *
 * @author aakashbelide
 */
public class ProductCatalog {
    private ArrayList<Product> products;
    private int prodCount = 0;
    
    public ProductCatalog() {
        this.products = new ArrayList<Product>();
        this.prodCount = this.prodCount + 1;
    }
    
    public void addProduct(String name, int quantity, float price) {
        Product getProd = checkProdInList(name);
        if (getProd!=null) {
            getProd.incProdQuant(quantity);
            if (price != 0) {
                getProd.setProdPrice(price);
            }
        } else {
            Product prod = new Product(this.prodCount, name, quantity, price);
            this.products.add(prod);
            this.prodCount = this.prodCount + 1;
        }
    }
    
    public void subProduct(String name, int quantity) {
        Product getProd = checkProdInList(name);
        if (getProd!=null) {
            getProd.decProdQuant(quantity);
        }
    }
    
    public ArrayList<Product> getProductList(){
        return this.products;
    }
    
    public Product checkProdInList(String name) {
        for (Product prod : this.products) {
            if (prod.getProdName().equals(name)) {
                return prod;
            }
        }
        return null;
    }
}
