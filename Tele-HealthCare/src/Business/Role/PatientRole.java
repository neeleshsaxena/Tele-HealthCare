/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

import userinterface.PatientWorkArea.PatientWorkAreaJPanel;

/**
 *
 * @author Neelu
 */
public class PatientRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel container, JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new PatientWorkAreaJPanel(container, userProcessContainer, account, (PatientOrganization)organization, enterprise);
    }
    
    @Override 
public String toString(){
    return Role.RoleType.PATIENT.getValue();
}
    
}
