/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ambulance;

import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Aditya
 */
public class AmbulanceCoordinatorUserDirectory {
    private ArrayList<AmbulanceCoordinator> useraccountlist;
    
    public AmbulanceCoordinatorUserDirectory() {
        this.useraccountlist = new ArrayList<AmbulanceCoordinator>();
    }

    public ArrayList<AmbulanceCoordinator> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<AmbulanceCoordinator> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public AmbulanceCoordinator createUserAccount(String name, String password, Role role) {
        AmbulanceCoordinator user = new AmbulanceCoordinator(name, password, role);
        this.useraccountlist.add(user);
        return user;
    }
    
    public AmbulanceCoordinator authenticateUser(String name, String password) {
        for(AmbulanceCoordinator ua: this.useraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (AmbulanceCoordinator user: this.useraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
}
