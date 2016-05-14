/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.AdministratorWorkArea.AdminWorkAreaJPanel;

/**
 *
 * @author Neelu
 */
public class AdminRole extends Role{

   

    @Override
    public JPanel createWorkArea(JPanel container, JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new AdminWorkAreaJPanel(container, userProcessContainer, enterprise, account, business);
    }
@Override 
public String toString(){
    return Role.RoleType.ADMIN.getValue();
}
    
    
}
