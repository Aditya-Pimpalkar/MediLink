/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Roles.Role;

/**
 *
 * @author Diksha
 */
public class UserAccount{
    private String accountId;
    private String username;
    private String password;
    private Role role;
    private String experience;
    private String designation;
    private static int counter = 0;
    
    public UserAccount(String username, String password, Role role) {
        this.accountId = "user" + this.counter++;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        UserAccount.counter = counter;
    }

    @Override
    public String toString() {
        return  username;
    }
    
    
    
}
