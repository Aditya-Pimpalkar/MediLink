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
public class DriverUserDirectory {
    private ArrayList<Driver> useraccountlist;
    
    public DriverUserDirectory() {
        this.useraccountlist = new ArrayList<Driver>();
    }

    public ArrayList<Driver> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<Driver> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public Driver createUserAccount(String name, String password, Role role, double age, String experience) {
        Driver user = new Driver(name, password, role, age, experience);
        this.useraccountlist.add(user);
        return user;
    }
    
    public Driver authenticateUser(String name, String password) {
        for(Driver ua: this.useraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (Driver user: this.useraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
    
}
