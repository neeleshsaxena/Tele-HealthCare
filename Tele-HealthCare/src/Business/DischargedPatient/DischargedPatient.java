/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DischargedPatient;

import Business.MedicalRecords.MedicalRecord;
import Business.VitalSign.VitalSignHistory;

/**
 *
 * @author Neelu
 */
public class DischargedPatient {
    
    private String patientId;
    private String patientName;
    private int age;
    private String primaryDoctor;
    private String preferredPharmacy;
    public VitalSignHistory vitalSignHistory;
    private MedicalRecord medicalRecord;
    
    public DischargedPatient(){
        this.vitalSignHistory = new VitalSignHistory();
        medicalRecord = new MedicalRecord();
                
        
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }
    

   

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPrimaryDoctor() {
        return primaryDoctor;
    }

    public void setPrimaryDoctor(String primaryDoctor) {
        this.primaryDoctor = primaryDoctor;
    }

    public String getPreferredPharmacy() {
        return preferredPharmacy;
    }

    public void setPreferredPharmacy(String preferredPharmacy) {
        this.preferredPharmacy = preferredPharmacy;
    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    @Override
    public String toString(){
        return patientName;
    }
    
    
}
