/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugCatalog;

/**
 *
 * @author Neelu
 */
public class Drug {
     private String productName;
    private int price;
    private int modelNumber;
    private int quantity;
    private String expirationDate;
    private String serialNumber;
    private int thresholdValue;
    private int availableQuantity;
  
        
    private static int count=0;
    
    public Drug(){
        count++;
        modelNumber=count;
 
    }

    public String getProductName() {
        return productName;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public int getThresholdValue() {
        return thresholdValue;
    }

    public void setThresholdValue(int thresholdValue) {
        this.thresholdValue = thresholdValue;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public static int getCount() {
        return count;
    }

   
    @Override
    public String toString(){
        return productName;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
