/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugSupplier;

import Business.DrugCatalog.DrugCatalog;

/**
 *
 * @author Neelu
 */
public class Supplier {
    private String name;
    
    private DrugCatalog productCatalog;
    
    
    public Supplier(){
        productCatalog= new DrugCatalog();
        
    }

    public String getName() {
        return name;
    }

    

    public void setName(String name) {
        this.name = name;
    }

    public DrugCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(DrugCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
    
    
    @Override
    public String toString(){
        return this.name;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
