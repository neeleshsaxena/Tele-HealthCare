/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugCatalog;

import java.util.ArrayList;

/**
 *
 * @author Neelu
 */
public class DrugCatalog {
     private ArrayList<Drug>productList;
    
    public DrugCatalog(){
        productList= new ArrayList<Drug>();
    }

    public ArrayList<Drug> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Drug> productList) {
        this.productList = productList;
    }
    
    public void removeProduct(Drug product){
        productList.remove(product);
        
    }
    
    public Drug createProduct(){
        Drug product = new Drug();
        productList.add(product);
        return product;
        
        
    }
    
    public Drug searchProduct(int id){
        for(Drug product: productList){
            if(product.getModelNumber()==id){
                return product;
            }
                
        }
        return null;
        
    }
    
    
     @Override
    public String toString(){
        return "Product Catalog";
    }
    
    
    
    
    
    
    
    
    
    
}
