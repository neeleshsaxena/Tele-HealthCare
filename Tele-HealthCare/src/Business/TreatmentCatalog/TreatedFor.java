/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TreatmentCatalog;

import Business.AllergyList.*;

/**
 *
 * @author Neelu
 */
public class TreatedFor {
    private String treatment;
    private int count =0;

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    @Override
    public String toString(){
        return treatment;
    }
    
}
