/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalRecords;

import Business.Employee.Employee;
import Business.DischargedPatient.DischargedPatient;
import Business.VitalSign.VitalSignHistory;
import java.util.Date;

/**
 *
 * @author Neelu
 */
public class MedicalRecord {
    
   private Date admissionDate;
   private Date dischargeDate;
   private String diagnosisBasedUpon;
   private String abuseFactor;
   private String resumeWork;
   private String doctorName;
   private String isOperationPerformed;
   private String allergies;
   private String medicinePrescribed;
   private String feedingStatus;
   private String foodIntake;
   private String specialNeeds;
   private String calorieIntake;
   private String protienIntake;
   private String aminoAcid;
   private String dextrose;
   private String fatEmulsion;
   private String[] data;
   private String treatedFor;
   private String discharge;

    public String[] getData() {
        return data;
    }

    public String getTreatedFor() {
        return treatedFor;
    }

    public String getDischarge() {
        return discharge;
    }

    public void setDischarge(String discharge) {
        this.discharge = discharge;
    }

    public void setTreatedFor(String treatedFor) {
        this.treatedFor = treatedFor;
    }

    public void setData(String[] data) {
        this.data = data;
    }
   
   private VitalSignHistory vitalSignHistory;

    public String getMedicinePrescribed() {
        return medicinePrescribed;
    }

    public void setMedicinePrescribed(String medicinePrescribed) {
        this.medicinePrescribed = medicinePrescribed;
    }

    public String getFeedingStatus() {
        return feedingStatus;
    }

    public void setFeedingStatus(String feedingStatus) {
        this.feedingStatus = feedingStatus;
    }

    public String getFoodIntake() {
        return foodIntake;
    }

    public void setFoodIntake(String foodIntake) {
        this.foodIntake = foodIntake;
    }

    public String getSpecialNeeds() {
        return specialNeeds;
    }

    public void setSpecialNeeds(String specialNeeds) {
        this.specialNeeds = specialNeeds;
    }

    public String getCalorieIntake() {
        return calorieIntake;
    }

    public void setCalorieIntake(String calorieIntake) {
        this.calorieIntake = calorieIntake;
    }

    public String getProtienIntake() {
        return protienIntake;
    }

    public void setProtienIntake(String protienIntake) {
        this.protienIntake = protienIntake;
    }

    public String getAminoAcid() {
        return aminoAcid;
    }

    public void setAminoAcid(String aminoAcid) {
        this.aminoAcid = aminoAcid;
    }

    public String getDextrose() {
        return dextrose;
    }

    public void setDextrose(String dextrose) {
        this.dextrose = dextrose;
    }

    public String getFatEmulsion() {
        return fatEmulsion;
    }

    public void setFatEmulsion(String fatEmulsion) {
        this.fatEmulsion = fatEmulsion;
    }
   
   
   public MedicalRecord(){
       vitalSignHistory = new VitalSignHistory();
   }

    public Date getAdmissionDate() {
        return admissionDate;
    }

   

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

   

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getDiagnosisBasedUpon() {
        return diagnosisBasedUpon;
    }

    public void setDiagnosisBasedUpon(String diagnosisBasedUpon) {
        this.diagnosisBasedUpon = diagnosisBasedUpon;
    }

    public String getAbuseFactor() {
        return abuseFactor;
    }

    public void setAbuseFactor(String abuseFactor) {
        this.abuseFactor = abuseFactor;
    }

    public String getResumeWork() {
        return resumeWork;
    }

    public void setResumeWork(String resumeWork) {
        this.resumeWork = resumeWork;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getIsOperationPerformed() {
        return isOperationPerformed;
    }

    public void setIsOperationPerformed(String isOperationPerformed) {
        this.isOperationPerformed = isOperationPerformed;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
    
    
    
}
