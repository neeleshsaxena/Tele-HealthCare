/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.AllergyList.Allergy;
import Business.AllergyList.AllergyList;
import Business.DrugCatalog.Drug;
import Business.DrugSupplier.Supplier;
import Business.DrugSupplier.SupplierDirectory;
import Business.OrderCatalog.OrderCatalog;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.DischargedPatient.DischargedPatientDirectory;
import Business.ProductCatalog.Product;
import Business.ProductCatalog.ProductCatalog;
import Business.TreatmentCatalog.TreatedFor;
import Business.TreatmentCatalog.TreatmentCatalog;

/**
 *
 * @author Neelu
 */
public abstract class Enterprise extends Organization{

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private DischargedPatientDirectory patientDirectory;
    private OrderCatalog orderCatalog;
    private SupplierDirectory supplierDirectory;
    private ProductCatalog productCatalog;
    private AllergyList allergyList;
    private Allergy allergy;
    private TreatmentCatalog treatmentCatalog;
    private TreatedFor treatedFor;
    private DischargedPatientDirectory dischargedPatientDirectory;
    
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        patientDirectory = new DischargedPatientDirectory();
        orderCatalog = new OrderCatalog();
        productCatalog = new ProductCatalog();
        this.supplierDirectory = new SupplierDirectory();
        allergyList = new AllergyList();
        treatmentCatalog = new TreatmentCatalog();
        dischargedPatientDirectory = new DischargedPatientDirectory();
        //setSupplierDirectory();
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public DischargedPatientDirectory getDischargedPatientDirectory() {
        return dischargedPatientDirectory;
    }

    public void setDischargedPatientDirectory(DischargedPatientDirectory dischargedPatientDirectory) {
        this.dischargedPatientDirectory = dischargedPatientDirectory;
    }

    public AllergyList getAllergyList() {
        return allergyList;
    }

    public void setAllergyList(AllergyList allergyList) {
        this.allergyList = allergyList;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public TreatmentCatalog getTreatmentCatalog() {
        return treatmentCatalog;
    }

    public void setTreatmentCatalog(TreatmentCatalog treatmentCatalog) {
        this.treatmentCatalog = treatmentCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
    
    public Allergy findMaxValue(){
        int max=0;
        
        for(Allergy a:getAllergyList().getAllergyList()){
          
            if(a.getCount()>max){
                max=a.getCount();
                allergy = a;
            }
        }
       
        return allergy;   
    }
     public TreatedFor findMaxVal(){
        int max=0;
        
        for(TreatedFor t:getTreatmentCatalog().getTreatmentList()){
          
            if(t.getCount()>max){
                max=t.getCount();
                treatedFor = t;
            }
        }
       
        return treatedFor;   
    }
    
    public enum EnterpriseType{
        Hospital("Hospital");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    

    public void setSupplierDirectory(){
        
        
        Supplier supplier =  supplierDirectory.createSupplier();
       
       supplier.setName("Ranbaxy");
     
        Drug p = supplier.getProductCatalog().createProduct();
        
        p.setProductName("Azithromycin");
        p.setAvailableQuantity(5000);
        p.setPrice(100);
        
     ////////////////////////////////////////////////////////////////////   
        
      Supplier supplier1 = supplierDirectory.createSupplier();
        
        Drug p1 = supplier1.getProductCatalog().createProduct();
        
        supplier1.setName("Cipla");
        
      p1.setProductName("Azithral");
        
        p1.setAvailableQuantity(2000);
        p1.setPrice(200);
 /////////////////////////////////////////////////////////////////////////       
        
        Supplier supplier2 = supplierDirectory.createSupplier();
        
        Drug p2 = supplier2.getProductCatalog().createProduct();
        
        supplier2.setName("Wockhardt");
        
        
        p2.setProductName("Azi");
       
        p2.setAvailableQuantity(2000);
        p2.setPrice(200);
  ///////////////////////////////////////////////////////////////////////      
        
        
       Supplier supplier3 =  supplierDirectory.createSupplier();
       
       supplier3.setName("RAM");
       
        Drug p3 = supplier3.getProductCatalog().createProduct();
       
        p3.setProductName("Azithro");
        p3.setAvailableQuantity(5000);
        p3.setPrice(100);
  
    ///////////////////////////////////////////////////////////////////////      
        
        
       Supplier supplier4 =  supplierDirectory.createSupplier();
       
       supplier4.setName("Adoxa");
       
        Drug p4 = supplier4.getProductCatalog().createProduct();
       
        p4.setProductName("Doxycyline");
        p4.setAvailableQuantity(5000);
        p4.setPrice(100);
    ///////////////////////////////////////////////////////////////////////
         Supplier supplier5 =  supplierDirectory.createSupplier();
       
         supplier5.setName("Rebetol");
       
        Drug p5 = supplier5.getProductCatalog().createProduct();
       
        p5.setProductName("Ribavirin");
        p5.setAvailableQuantity(5000);
        p5.setPrice(100);
        
        
        
    }
    
    public void setProductCatalog(){
        
        
        Product product =  productCatalog.addProduct();
       
       product.setProdName("Azithromycin");
       product.setAvailableAmount(5000);
       product.setPrice(100);
       
     
        
     ////////////////////////////////////////////////////////////////////   
        
     
       Product product1 =  productCatalog.addProduct();
       product1.setProdName("Azithral");
       product1.setAvailableAmount(5000);
       product1.setPrice(200);
 /////////////////////////////////////////////////////////////////////////       
       
       Product product2 =  productCatalog.addProduct();
       product2.setProdName("Azi");
       product2.setAvailableAmount(2000);
       product2.setPrice(200);
  ///////////////////////////////////////////////////////////////////////      
      
       Product product3 =  productCatalog.addProduct();
       product3.setProdName("Azithro");
       product3.setAvailableAmount(5000);
       product3.setPrice(100);
  
    ///////////////////////////////////////////////////////////////////////      
       Product product4 =  productCatalog.addProduct();
       product4.setProdName("Doxycyline");
       product4.setAvailableAmount(5000);
       product4.setPrice(100);
      
        
    ///////////////////////////////////////////////////////////////////////
       Product product5 =  productCatalog.addProduct();
       product5.setProdName("Ribavirin");
       product5.setAvailableAmount(5000);
       product5.setPrice(100);
         
       
        
        
    }
    
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public DischargedPatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public OrderCatalog getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(OrderCatalog orderCatalog) {
        this.orderCatalog = orderCatalog;
    }

    public void setPatientDirectory(DischargedPatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    

   

    
    

}
