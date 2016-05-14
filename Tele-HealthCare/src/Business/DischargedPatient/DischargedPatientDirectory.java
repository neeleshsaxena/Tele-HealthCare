/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DischargedPatient;

import java.util.ArrayList;

/**
 *
 * @author Neelu
 */
public class DischargedPatientDirectory {
    
    private ArrayList<DischargedPatient> dischargedPatientList;

    public DischargedPatientDirectory() {
        dischargedPatientList = new ArrayList<>();
    }


    public ArrayList<DischargedPatient> getDischargedPatientList() {
        return dischargedPatientList;
    }

    public void setPatientList(ArrayList<DischargedPatient> dischargedPatientList) {
        this.dischargedPatientList = dischargedPatientList;
    }
    
     public DischargedPatient createPatient(){
        DischargedPatient pat = new DischargedPatient();
        dischargedPatientList.add(pat);
        return pat;
    }
    
    public void deleteAccount(DischargedPatient pat){
        dischargedPatientList.remove(pat);
        
    }
    
    
    
    public DischargedPatient searchAccount(String patId){
        for(DischargedPatient pat:dischargedPatientList){
            if(pat.getPatientId().equals(patId)){
                return pat;
            }
        }
        return null;
    }
    
}
