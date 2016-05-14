/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ProductCatalog;

/**
 *
 * @author Neelu
 */
public class Product {
    
    private String prodName;
    private int price;
    private int modelNumber;
    private int availableAmount;
    
    
    private static int count =0;

     public Product() {
    count++;
    modelNumber = count;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(int availableAmount) {
        this.availableAmount = availableAmount;
    }
     
     
     
    @Override
    public String toString(){
        return prodName;
    }
    
    
    
    
    
}
