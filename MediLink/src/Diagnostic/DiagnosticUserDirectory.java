/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostic;

import Roles.Role;
import User.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Diksha
 */
public class DiagnosticUserDirectory {
    private ArrayList<UserAccount> diagnosticuseraccountlist;
    private LabTechniciansUserDirectory  labTechniciansUserDirectory;
    private DiagnosticEquipmentVendorsUserDirectory diagnosticEquipmentVendorsUserDirectory;
    private MachineDirectory machineDirectory;
    private AssignedMachineDirectory assMachineDirectory;
    
    
    public DiagnosticUserDirectory() {
        this.diagnosticuseraccountlist = new ArrayList<UserAccount>(); 
        this.labTechniciansUserDirectory= new LabTechniciansUserDirectory();
        this.diagnosticEquipmentVendorsUserDirectory = new DiagnosticEquipmentVendorsUserDirectory();
        this.machineDirectory = new MachineDirectory();
        this.assMachineDirectory = new AssignedMachineDirectory();
    }

    public ArrayList<UserAccount> getDiagnosticuseraccountlist() {
        return diagnosticuseraccountlist;
    }

    public void setDiagnosticuseraccountlist(ArrayList<UserAccount> diagnosticuseraccountlist) {
        this.diagnosticuseraccountlist = diagnosticuseraccountlist;
    }

    public LabTechniciansUserDirectory getLabTechniciansUserDirectory() {
        return labTechniciansUserDirectory;
    }

    public void setLabTechniciansUserDirectory(LabTechniciansUserDirectory LabTechniciansUserDirectory) {
        this.labTechniciansUserDirectory = labTechniciansUserDirectory;
    }

    public DiagnosticEquipmentVendorsUserDirectory getDiagnosticEquipmentVendorsUserDirectory() {
        return diagnosticEquipmentVendorsUserDirectory;
    }

    public void setDiagnosticEquipmentVendorsUserDirectory(DiagnosticEquipmentVendorsUserDirectory diagnosticEquipmentVendorsUserDirectory) {
        this.diagnosticEquipmentVendorsUserDirectory = diagnosticEquipmentVendorsUserDirectory;
    }

    public MachineDirectory getMachineDirectory() {
        return machineDirectory;
    }

    public void setMachineDirectory(MachineDirectory machineDirectory) {
        this.machineDirectory = machineDirectory;
    }

    public AssignedMachineDirectory getAssMachineDirectory() {
        return assMachineDirectory;
    }

    public void setAssMachineDirectory(AssignedMachineDirectory assMachineDirectory) {
        this.assMachineDirectory = assMachineDirectory;
    }
    
    public UserAccount createUserAccount(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.diagnosticuseraccountlist.add(user);
        return user;
    }
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.diagnosticuseraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (UserAccount user: this.diagnosticuseraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
}
