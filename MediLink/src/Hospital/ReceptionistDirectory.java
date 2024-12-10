/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author saketh
 */
public class ReceptionistDirectory {
    private ArrayList<Receptionist> useraccountlist;
    
    public ReceptionistDirectory() {
        this.useraccountlist = new ArrayList<Receptionist>();
    }

    public ArrayList<Receptionist> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<Receptionist> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public Receptionist createUserAccount(String name, String password, Role role) {
        Receptionist user = new Receptionist(name, password, role);
       
        this.useraccountlist.add(user);
        return user;
    }
    
    public Receptionist authenticateUser(String name, String password) {
        for(Receptionist ua: this.useraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (Receptionist user: this.useraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
    
}
