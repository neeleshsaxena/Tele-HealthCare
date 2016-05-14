/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ReceptionistWorkArea.ReceptionistWorkAreaJPanel;

/**
 *
 * @author Neelu
 */
public class ReceptionistRole extends Role{

  

    @Override
    public JPanel createWorkArea(JPanel container, JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new ReceptionistWorkAreaJPanel(userProcessContainer, account, (ReceptionistOrganization)organization, enterprise);
    }
    
    @Override 
public String toString(){
    return Role.RoleType.RECEPTIONIST.getValue();
}
    
}
