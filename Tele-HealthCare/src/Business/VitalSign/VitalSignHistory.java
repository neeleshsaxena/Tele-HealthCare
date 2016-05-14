/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSign;

import java.util.ArrayList;

/**
 *
 * @author Neelu
 */
public class VitalSignHistory {
     private ArrayList<VitalSign> vitalSignList;
     
     public VitalSignHistory(){
            this.vitalSignList = new ArrayList<>();
            
        }
     
     public VitalSign addVitalSign(){   
            VitalSign vitalSign = new VitalSign();
            vitalSignList.add(vitalSign);
               return vitalSign;
        }
    
    public void deleteVitalSign(VitalSign vitalSign){
        vitalSignList.remove(vitalSign);
        
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }
    
    
    @Override
    public String toString(){
        return "VitalSignHistory";
    }
    
    
    
    
    
    
}
