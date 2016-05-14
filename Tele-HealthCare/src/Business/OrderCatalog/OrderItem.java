/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderCatalog;

import Business.DrugCatalog.Drug;

/**
 *
 * @author Neelu
 */
public class OrderItem {
    
     private Drug drug;
    private int quantity;
    private int salesPrice;

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    @Override
    public String toString(){
        return drug.getProductName();
    }
    
    
}
