/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Diksha
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> useraccountlist;
    
    public UserAccountDirectory() {
        this.useraccountlist = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<UserAccount> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    
    public UserAccount createUserAccount(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.useraccountlist.add(user);
        return user;
    }
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.useraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (UserAccount user: this.useraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
}
