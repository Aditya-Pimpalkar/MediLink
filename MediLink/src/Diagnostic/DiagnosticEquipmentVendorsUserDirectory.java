/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostic;

import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Diksha
 */
public class DiagnosticEquipmentVendorsUserDirectory {
    private ArrayList<DiagnosticEquipmentVendors> useraccountlist;
    
    public DiagnosticEquipmentVendorsUserDirectory() {
        this.useraccountlist = new ArrayList<DiagnosticEquipmentVendors>();
    }

    public ArrayList<DiagnosticEquipmentVendors> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<DiagnosticEquipmentVendors> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public DiagnosticEquipmentVendors createUserAccount(String name, String password, Role role, String companyname) {
        DiagnosticEquipmentVendors user = new DiagnosticEquipmentVendors(name, password, role);
        user.setCompany(companyname);
        this.useraccountlist.add(user);
        return user;
    }
    
    public DiagnosticEquipmentVendors authenticateUser(String name, String password) {
        for(DiagnosticEquipmentVendors ua: this.useraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (DiagnosticEquipmentVendors user: this.useraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
    
}
