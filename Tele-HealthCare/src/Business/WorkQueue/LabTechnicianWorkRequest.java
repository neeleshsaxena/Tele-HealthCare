/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.MedicalRecords.MedicalRecord;

/**
 *
 * @author Neelu
 */
public class LabTechnicianWorkRequest extends WorkRequest{
    
    
    private String testResult;
    private String patientName;
    

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    
    
    
}
