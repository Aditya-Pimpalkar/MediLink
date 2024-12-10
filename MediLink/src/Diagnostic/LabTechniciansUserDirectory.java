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
public class LabTechniciansUserDirectory {
    private ArrayList<LabTechnicians> useraccountlist;
    
    public LabTechniciansUserDirectory() {
        this.useraccountlist = new ArrayList<LabTechnicians>();
    }

    public ArrayList<LabTechnicians> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<LabTechnicians> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public LabTechnicians createUserAccount(String name, String password, Role role) {
        LabTechnicians user = new LabTechnicians(name, password, role);
        this.useraccountlist.add(user);
        return user;
    }
    
    public LabTechnicians authenticateUser(String name, String password) {
        for(LabTechnicians ua: this.useraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (LabTechnicians user: this.useraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
}
