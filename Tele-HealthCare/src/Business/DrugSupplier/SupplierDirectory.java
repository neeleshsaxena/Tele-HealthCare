/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DrugSupplier;

import java.util.ArrayList;

/**
 *
 * @author Neelu
 */
public class SupplierDirectory {
    private ArrayList<Supplier> supplierList;
    
    public SupplierDirectory(){
        supplierList= new ArrayList<Supplier>();
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
    
    
    public void removeSupplier(Supplier supplier){
        supplierList.remove(supplier);
                
    }
    public Supplier createSupplier(){
        Supplier supplier = new Supplier();
        supplierList.add(supplier);
        return supplier;
    }
    
    public Supplier searchSupplier(String keyWord){
        for(Supplier supplier:supplierList){
            if(supplier.getName().equals(keyWord)){
                return supplier;
            }
        }
        return null;
    }
    
    
      @Override
    public String toString(){
        return "Supplier Directory";
    }
    
    
}
