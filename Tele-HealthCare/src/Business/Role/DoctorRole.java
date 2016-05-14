/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.DoctorWorkArea.DoctorWorkAreaJPanel;

/**
 *
 * @author Neelu
 */
public class DoctorRole extends Role{

    

    @Override
    public JPanel createWorkArea(JPanel container, JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise);
    }
    
    @Override 
public String toString(){
    return Role.RoleType.DOCTOR.getValue();
}
    
    
}
