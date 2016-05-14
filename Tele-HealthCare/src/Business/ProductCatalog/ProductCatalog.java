/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ProductCatalog;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neelu
 */
public class ProductCatalog {
    
     private List<Product> productCatalog;

    public ProductCatalog() {
    productCatalog = new ArrayList<Product>();
    }
    
    public List<Product> getProductcatalog(){
        return productCatalog;
    }
    
    
    public Product addProduct(){
        Product p = new Product();
        productCatalog.add(p);
        return p;
    }
    
    public void removeProduct(Product p){
        productCatalog.remove(p);
    }
    
   public Product searchProduct(String product){
        
        for(Product p: productCatalog)
        {
            if(p.getProdName().equals(product)){
                return  p;
            }
        }        
        return null;
    }
    
}
