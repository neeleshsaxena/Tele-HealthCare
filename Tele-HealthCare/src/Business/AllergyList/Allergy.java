/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AllergyList;

/**
 *
 * @author Neelu
 */
public class Allergy {
    private String allergyName;
    private int count =0;

    public String getAllergyName() {
        return allergyName;
    }

    public void setAllergyName(String allergyName) {
        this.allergyName = allergyName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    @Override
    public String toString(){
        return allergyName;
    }
    
}
