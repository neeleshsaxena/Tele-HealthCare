/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.DrugCatalog.Drug;

/**
 *
 * @author Neelu
 */
public class MedicineWorkRequest extends WorkRequest {
    
    private String medicineName;
    private int quantityOrdered;
    private String result;
    private Drug product;
    
    
    public String getMedicineName() {
        return medicineName;
    }

    public Drug getProduct() {
        return product;
    }

    public void setProduct(Drug product) {
        this.product = product;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    
    
    
}
