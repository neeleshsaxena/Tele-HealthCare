/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LabTechnicianOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.LabTechWorkArea.LabTechWorkAreaJPanel;

/**
 *
 * @author Neelu
 */
public class LabTechRole extends Role {

   

    @Override
    public JPanel createWorkArea(JPanel container, JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new LabTechWorkAreaJPanel(userProcessContainer, account, (LabTechnicianOrganization)organization, enterprise);
    }
    
    
    @Override 
public String toString(){
    return Role.RoleType.LABTECHNICIAN.getValue();
}
    
}
