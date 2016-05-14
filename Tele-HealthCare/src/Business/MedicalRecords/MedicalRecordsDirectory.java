/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalRecords;

import java.util.ArrayList;

/**
 *
 * @author Neelu
 */
public class MedicalRecordsDirectory {
    private ArrayList<MedicalRecord> recordList;
    
    public MedicalRecordsDirectory(){
        recordList = new ArrayList<>();
    }

    public ArrayList<MedicalRecord> getRecordList() {
        return recordList;
    }

    public void setRecordList(ArrayList<MedicalRecord> recordList) {
        this.recordList = recordList;
    }
    
    
    
    
    
}
