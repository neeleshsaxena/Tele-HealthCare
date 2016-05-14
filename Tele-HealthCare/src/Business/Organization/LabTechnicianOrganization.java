/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabTechRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Neelu
 */
public class LabTechnicianOrganization extends Organization{

    public LabTechnicianOrganization() {
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LabTechRole());
        return roles;
    }
     
   
    
    
}
