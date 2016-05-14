/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AllergyList;

import java.util.ArrayList;

/**
 *
 * @author Neelu
 */
public class AllergyList {
    
      private ArrayList<Allergy> allergyList;
    
      
      public AllergyList(){
          allergyList = new ArrayList<>();
      }

    public ArrayList<Allergy> getAllergyList() {
        return allergyList;
    }

    public void setAllergyList(ArrayList<Allergy> allergyList) {
        this.allergyList = allergyList;
    }
 
      public Allergy addAllergy(){   
            Allergy allergy = new Allergy();
            allergyList.add(allergy);
               return allergy;
        }
      
      
    public Allergy searchAllergy(String allergy){
        
        for(Allergy a: allergyList)
        {
            if(a.getAllergyName().equals(allergy)){
                return  a;
            }
        }        
        return null;
    }  
      
      
      
      
      @Override
    public String toString(){
        return "AllergyList";
    }
      
      
}
