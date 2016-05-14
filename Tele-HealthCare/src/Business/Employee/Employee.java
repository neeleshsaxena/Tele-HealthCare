/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.MedicalRecords.MedicalRecord;

/**
 *
 * @author Neelu
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;
    private int age;
    private String primaryDoctor;
    private int patientCount;
    private MedicalRecord medicalRecord;
    private String email;
    private String skypeId;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkypeId() {
        return skypeId;
    }

    public void setSkypeId(String skypeId) {
        this.skypeId = skypeId;
    }
    
    
    
    public int getAge() {
        return age;
    }

    public int getPatientCount() {
        return patientCount;
    }

    public void setPatientCount(int patientCount) {
        this.patientCount = patientCount;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public String getPrimaryDoctor() {
        return primaryDoctor;
    }

    public void setPrimaryDoctor(String primaryDoctor) {
        this.primaryDoctor = primaryDoctor;
    }
    

    public Employee() {
        id = count;
        count++;
        medicalRecord = new MedicalRecord();
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
