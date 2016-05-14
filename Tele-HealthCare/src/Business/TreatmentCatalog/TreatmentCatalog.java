/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TreatmentCatalog;

import java.util.ArrayList;

/**
 *
 * @author Neelu
 */
public class TreatmentCatalog {
    
      private ArrayList<TreatedFor> treatmentList;
    
      
      public TreatmentCatalog(){
          treatmentList = new ArrayList<>();
      }

    public ArrayList<TreatedFor> getTreatmentList() {
        return treatmentList;
    }

    public void setTreatmentList(ArrayList<TreatedFor> treatmentList) {
        this.treatmentList = treatmentList;
    }

    
 
      public TreatedFor addtreatedFor(){   
            TreatedFor treat = new TreatedFor();
            treatmentList.add(treat);
               return treat;
        }
      
      
    public TreatedFor searchTreatment(String t){
        
        for(TreatedFor a: treatmentList)
        {
            if(a.getTreatment().equals(t)){
                return  a;
            }
        }        
        return null;
    }  
      
      
      
      
      @Override
    public String toString(){
        return "TreatmentList";
    }
      
      
}
