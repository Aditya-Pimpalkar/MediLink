/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Diksha
 */
public class DoctorUserDirectory {
    private ArrayList<Doctor> useraccountlist;
    
    public DoctorUserDirectory() {
        this.useraccountlist = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<Doctor> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public Doctor createUserAccount(String name, String password, Role role) {
        Doctor user = new Doctor(name, password, role);
       
        this.useraccountlist.add(user);
        return user;
    }
    
    public Doctor authenticateUser(String name, String password) {
        for(Doctor ua: this.useraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (Doctor user: this.useraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
}
