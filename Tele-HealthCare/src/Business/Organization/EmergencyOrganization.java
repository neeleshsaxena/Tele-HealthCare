/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.EmergencyOperator;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Neelu
 */
public class EmergencyOrganization extends Organization{

     public EmergencyOrganization() {
        super(Organization.Type.EmergencyServices.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EmergencyOperator());
        return roles;
    }
    
}
