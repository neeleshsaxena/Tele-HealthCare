/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DietitianWorkArea;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.DietitianOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import Business.VitalSign.VitalSign;
import Business.WorkQueue.DietitianWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neelu
 */
public class PrepareDietJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    DietitianOrganization dietitianOrganization;
    UserAccount userAccount;
    Enterprise enterprise;
    /**
     * Creates new form PrepareDietJPanel
     */
    public PrepareDietJPanel(JPanel upc, DietitianOrganization d, UserAccount ua, Enterprise e) {
        initComponents();
        userProcessContainer = upc;
        userAccount = ua;
        dietitianOrganization =d;
        enterprise =e;
        
        populatePatientCombo();
        populateRequestTable();
    }
    
    public void populatePatientCombo(){
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof PatientOrganization){
                org = organization;
                break;
            }
    }
       if (org!=null){
            for(Employee emp: org.getEmployeeDirectory().getEmployeeList()){
                patientCombo1.addItem(emp);
                
            }
        }
        
        
    }
    public void populateRequestTable(){
       DefaultTableModel model = (DefaultTableModel)requestTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : dietitianOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[3];
            row[0] = request;
            row[1] = request.getMessage();
            row[2] = request.getStatus();
            
            model.addRow(row);
        }
    }
    

    public void calculateStatus(){
        Employee patient = (Employee)patientCombo1.getSelectedItem();
        
        for(VitalSign vs: patient.getMedicalRecord().getVitalSignHistory().getVitalSignList() ){
            
            int resp = vs.getRespiratoryRate();
            int heart =vs.getHeartRate();
            int bp =vs.getBloodPressure();
            int w =vs.getWeight();
            
            if((patient.getAge()>=1 && patient.getAge()<=3)&&(resp>=20 && resp<=30) && (heart>=80 && heart<=130) && (bp>=80 && bp<=110) && (w>=22 && w<=31)){
            vs.setStatusReport("Normal");
        }
        else if((patient.getAge()>=4 && patient.getAge()<=5)&&(resp>=20 && resp<=30) && (heart>=80 && heart<=120) && (bp>=80 && bp<=110) && (w>=31 && w<=40)){
            vs.setStatusReport("Normal");
        } 
        else if((patient.getAge()>=6 && patient.getAge()<=12)&&(resp>=20 && resp<=30) && (heart>=70 && heart<=110) && (bp>=80 && bp<=120) && (w>=41 && w<=92)){
            vs.setStatusReport("Normal");
        } 
           else if((patient.getAge()>13)&&(resp>=12 && resp<=20) && (heart>=55 && heart<=105) && (bp>=110 && bp<=120) && (w>110)){
            vs.setStatusReport("Normal");
        } 
           else{
               vs.setStatusReport("Abnormal");
           }
            
        }
       
        
    }
    public void populateVitalSignTable(){
        
         DefaultTableModel dtm = (DefaultTableModel)vitalSignTable.getModel();
        
        int rowcount = vitalSignTable.getRowCount();
       
        
        for(int i =rowcount-1;i>=0;i--){
        dtm.removeRow(i);
    }
         Employee patient = (Employee)patientCombo1.getSelectedItem();
         
        for(VitalSign vs : patient.getMedicalRecord().getVitalSignHistory().getVitalSignList()){
            Object row[] = new Object[2];
            row[0]= vs;
            row[1]= vs.getStatusReport();
            dtm.addRow(row);
        }
        
        
    }
    public void populateAllergyTable(){
        DefaultTableModel dtm = (DefaultTableModel)allergyTable.getModel();
        
        int rowcount = allergyTable.getRowCount();
       
        
        for(int i =rowcount-1;i>=0;i--){
        dtm.removeRow(i);
    }
        
        
        Employee patient = (Employee)patientCombo1.getSelectedItem();
        Object row[] = new Object[3];
        row[0] = patient.getName();
        row[1] = patient.getMedicalRecord().getMedicinePrescribed();
        row[2] = patient.getMedicalRecord().getAllergies();
        
        dtm.addRow(row);
        
    }
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        vitalSignTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        patientNameTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        respiratoryTextField = new javax.swing.JTextField();
        heartRateTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        patientIdTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        bloodPressureTextField = new javax.swing.JTextField();
        weightTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        doctorTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        timestampTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        priRadio = new javax.swing.JRadioButton();
        facilityRadio = new javax.swing.JRadioButton();
        mdsRadio = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        regularRadio = new javax.swing.JRadioButton();
        fluidRadio = new javax.swing.JRadioButton();
        tubeRadio = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        specialNeedsCombo = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        allergyTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        activitySpinner = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        injurySpinner = new javax.swing.JSpinner();
        calorieTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        totalCalorieTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        protienCombo = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        aminoTxt = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        dextroseTxt = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        fatEmulsionTxt = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        patientCombo1 = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Prepare Diet Assesment");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 16, -1, -1));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Check Vital Signs");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        vitalSignTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vitalSignTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TimeStamp", "Vital Sign Status"
            }
        ));
        jScrollPane3.setViewportView(vitalSignTable);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 730, 160));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Patient Name");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        patientNameTextField.setEditable(false);
        patientNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        patientNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNameTextFieldActionPerformed(evt);
            }
        });
        jPanel5.add(patientNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 150, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Respiratory Rate");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        respiratoryTextField.setEditable(false);
        respiratoryTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(respiratoryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 150, -1));

        heartRateTextField.setEditable(false);
        heartRateTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(heartRateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 150, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Heart Rate");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        patientIdTextField.setEditable(false);
        patientIdTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(patientIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 150, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Patient ID");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Age");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        ageTextField.setEditable(false);
        ageTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });
        jPanel5.add(ageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 150, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Blood Pressure");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        bloodPressureTextField.setEditable(false);
        bloodPressureTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(bloodPressureTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 150, -1));

        weightTextField.setEditable(false);
        weightTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(weightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 150, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Weight");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        doctorTextField.setEditable(false);
        doctorTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        doctorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorTextFieldActionPerformed(evt);
            }
        });
        jPanel5.add(doctorTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 150, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Primary Doctor");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Timestamp");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        timestampTextField.setEditable(false);
        timestampTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(timestampTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 150, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("View Records");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 170, 190, -1));

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel5.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1451, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 119, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("View Vital Signs", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Feeding Status");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 49, -1, -1));

        buttonGroup1.add(priRadio);
        priRadio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priRadio.setText("PRI");
        jPanel2.add(priRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 45, -1, -1));

        buttonGroup1.add(facilityRadio);
        facilityRadio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        facilityRadio.setText("Facility");
        jPanel2.add(facilityRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 45, -1, -1));

        buttonGroup1.add(mdsRadio);
        mdsRadio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mdsRadio.setText("MDS");
        jPanel2.add(mdsRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 45, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Food Intake");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 117, -1, -1));

        buttonGroup2.add(regularRadio);
        regularRadio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        regularRadio.setText("Regular");
        jPanel2.add(regularRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 113, -1, -1));

        buttonGroup2.add(fluidRadio);
        fluidRadio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fluidRadio.setText("Fluid");
        jPanel2.add(fluidRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 113, -1, -1));

        buttonGroup2.add(tubeRadio);
        tubeRadio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tubeRadio.setText("Tube");
        jPanel2.add(tubeRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 113, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Special Needs");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 181, -1, -1));

        specialNeedsCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        specialNeedsCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hydration Problem", "Nutritional Program", "Renal", "Isolation", "Sugar Free" }));
        jPanel2.add(specialNeedsCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 178, -1, -1));

        allergyTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        allergyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient Name", "Medicine Prescribed", "Allergies"
            }
        ));
        jScrollPane2.setViewportView(allergyTable);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 0, -1, 101));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Calorie Intake");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Activity Factor");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 314, -1, -1));

        activitySpinner.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(activitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 311, 70, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Injury Factor");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 358, -1, -1));

        injurySpinner.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(injurySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 355, 70, -1));

        calorieTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(calorieTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 247, 44, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("mg/day");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 250, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Evaluate Total Calories");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 399, -1, -1));

        totalCalorieTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(totalCalorieTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 64, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("mg/day");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Protien Intake");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 473, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Condition");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 514, -1, -1));

        protienCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        protienCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal Nutrition", "Mild Depletion", "Moderate Depletion", "Severe Depletion", "Renal Failure", "Hepatic Failure", "Non- Dialyzed", "Hemo-Dialyzed" }));
        jPanel2.add(protienCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 511, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Macronutrients");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 181, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Amino Acids");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 220, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Dextrose");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("Fat Emulsion");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, -1));

        aminoTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(aminoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 44, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("mg/day");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, -1, -1));

        dextroseTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(dextroseTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 44, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("mg/day");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, -1, -1));

        fatEmulsionTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(fatEmulsionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 44, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("mg/day");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 300, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Create");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 120, -1));

        jTabbedPane1.addTab("Prepare Diet Plan", jPanel2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 106, -1, 680));

        requestTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "From", "Test Request For", "Status"
            }
        ));
        jScrollPane1.setViewportView(requestTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 450, 100));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("Select Patient");
        add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        patientCombo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        patientCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientCombo1ActionPerformed(evt);
            }
        });
        add(patientCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void patientNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientNameTextFieldActionPerformed

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextFieldActionPerformed

    private void doctorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorTextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Employee patient = (Employee)patientCombo1.getSelectedItem();
        int selectedRow = vitalSignTable.getSelectedRow();
        if(selectedRow>=0){
            VitalSign vs = (VitalSign)vitalSignTable.getValueAt(selectedRow, 0);
            respiratoryTextField.setText(String.valueOf(vs.getRespiratoryRate()));
            heartRateTextField.setText(String.valueOf(vs.getHeartRate()));
            bloodPressureTextField.setText(String.valueOf(vs.getBloodPressure()));
            weightTextField.setText(String.valueOf(vs.getWeight()));
            timestampTextField.setText(vs.getTimestamp());
            patientNameTextField.setText(patient.getName());
            patientIdTextField.setText(Integer.toString(patient.getId()));
            ageTextField.setText(Integer.toString(patient.getAge()));
            doctorTextField.setText(patient.getPrimaryDoctor());

        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a row from the first table","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int cal;
        int amino;
        int dex;
        int fat;
        

        try{
            cal = Integer.parseInt(calorieTxt.getText());
            amino = Integer.parseInt(aminoTxt.getText());
            dex = Integer.parseInt(dextroseTxt.getText());
            fat = Integer.parseInt(fatEmulsionTxt.getText());
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Number Format Exception. Please Enter a Valid Number!", "Warning!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int selectedRow = requestTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a Patient request to attach!");
            return;
        }else{
        Employee patient = (Employee)patientCombo1.getSelectedItem();
        
        if(priRadio.isSelected()){
            patient.getMedicalRecord().setFeedingStatus("PRI");
        }else if(facilityRadio.isSelected()){
            patient.getMedicalRecord().setFeedingStatus("FACILITY");
        }else patient.getMedicalRecord().setFeedingStatus("MDS");
        
        if(regularRadio.isSelected()){
            patient.getMedicalRecord().setFoodIntake("Regular");
        }else if(fluidRadio.isSelected()){
           patient.getMedicalRecord().setFoodIntake("Fluids");
        }else patient.getMedicalRecord().setFoodIntake("Tube");
        
        String splNeed = (String)specialNeedsCombo.getSelectedItem();
        patient.getMedicalRecord().setSpecialNeeds(splNeed);
        
        patient.getMedicalRecord().setCalorieIntake(totalCalorieTxt.getText());
        
        String condition = (String)protienCombo.getSelectedItem();
        patient.getMedicalRecord().setProtienIntake(condition);
        
        patient.getMedicalRecord().setAminoAcid(aminoTxt.getText());
        patient.getMedicalRecord().setDextrose(dextroseTxt.getText());
        patient.getMedicalRecord().setFatEmulsion(fatEmulsionTxt.getText());
        
        Date date = new Date();
        
        DietitianWorkRequest request = (DietitianWorkRequest)requestTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setResolveDate(date);
        request.setStatus("Diet Plan Created");
        request.setResult("Diet Chart Available");
        
        populateRequestTable();
        
        

        JOptionPane.showMessageDialog(null, "Medical Records have been updated with the Diet Plab for the Patient: "+request.getMessage(), "information", JOptionPane.INFORMATION_MESSAGE);

        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int activity; 
        int injury; 
        int calorie; 
        try{
            activity = (Integer) activitySpinner.getValue();
            injury = (Integer) injurySpinner.getValue();
            calorie = Integer.parseInt(calorieTxt.getText());
            
            totalCalorieTxt.setText(Integer.toString(injury*activity*calorie));
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Number Format Exception. Please Enter a Valid Number to generate Total Calories!", "Warning!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void patientCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientCombo1ActionPerformed
        // TODO add your handling code here:
        populateVitalSignTable();
        populateAllergyTable();
    }//GEN-LAST:event_patientCombo1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner activitySpinner;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JTable allergyTable;
    private javax.swing.JTextField aminoTxt;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bloodPressureTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField calorieTxt;
    private javax.swing.JTextField dextroseTxt;
    private javax.swing.JTextField doctorTextField;
    private javax.swing.JRadioButton facilityRadio;
    private javax.swing.JTextField fatEmulsionTxt;
    private javax.swing.JRadioButton fluidRadio;
    private javax.swing.JTextField heartRateTextField;
    private javax.swing.JSpinner injurySpinner;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton mdsRadio;
    private javax.swing.JComboBox patientCombo1;
    private javax.swing.JTextField patientIdTextField;
    private javax.swing.JTextField patientNameTextField;
    private javax.swing.JRadioButton priRadio;
    private javax.swing.JComboBox protienCombo;
    private javax.swing.JRadioButton regularRadio;
    private javax.swing.JTable requestTable;
    private javax.swing.JTextField respiratoryTextField;
    private javax.swing.JComboBox specialNeedsCombo;
    private javax.swing.JTextField timestampTextField;
    private javax.swing.JTextField totalCalorieTxt;
    private javax.swing.JRadioButton tubeRadio;
    private javax.swing.JTable vitalSignTable;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables
}
