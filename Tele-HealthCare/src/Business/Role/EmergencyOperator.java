/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.EmergencyWorkArea.EmergencyWorkAreaJPanel;
import Business.Enterprise.Enterprise;
import Business.Organization.EmergencyOrganization;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Neelu
 */
public class EmergencyOperator extends Role{

    

    @Override
    public JPanel createWorkArea(JPanel container, JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new EmergencyWorkAreaJPanel(userProcessContainer, account, (EmergencyOrganization)organization, enterprise);
    }
    
    @Override 
public String toString(){
    return Role.RoleType.EMERGENCYOPERATOR.getValue();
}
    
    
}
