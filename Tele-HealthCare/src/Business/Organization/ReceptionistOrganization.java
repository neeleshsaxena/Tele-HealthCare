/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ReceptionistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Neelu
 */
public class ReceptionistOrganization extends Organization{
    
    public ReceptionistOrganization(){
        super(Organization.Type.Receptionist.getValue());
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ReceptionistRole());
        return roles;
        
        
    }
    
    
    
    
}
