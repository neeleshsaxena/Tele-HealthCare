/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DietitianOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DietitianWorkArea.DietitianWorkAreaJPanel;

/**
 *
 * @author Neelu
 */
public class DietitianRole extends Role{

   

    @Override
    public JPanel createWorkArea(JPanel container, JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new DietitianWorkAreaJPanel(userProcessContainer, account, (DietitianOrganization)organization, enterprise);
    }
    
    
    @Override 
public String toString(){
    return Role.RoleType.DIETITIEAN.getValue();
}
    
    
}
