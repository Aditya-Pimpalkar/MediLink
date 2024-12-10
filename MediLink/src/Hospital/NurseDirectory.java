/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Aditya
 */
public class NurseDirectory {
    private ArrayList<Nurse> useraccountlist;
    
    public NurseDirectory() {
        this.useraccountlist = new ArrayList<Nurse>();
    }

    public ArrayList<Nurse> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<Nurse> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public Nurse createUserAccount(String name, String password, Role role) {
        Nurse user = new Nurse(name, password, role);
       
        this.useraccountlist.add(user);
        return user;
    }
    
    public Nurse authenticateUser(String name, String password) {
        for(Nurse ua: this.useraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (Nurse user: this.useraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
    
}
