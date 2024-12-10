/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Roles.Role;
import User.UserAccount;

/**
 *
 * @author Aditya
 */
public class Patient extends UserAccount{
    private String accountId;
    
    private static int counter = 0;
    private String bp;
    double age;
    int weight;
      
    
    public Patient(String username, String password, Role role, double age, int weight) {
        super(username, password, role);
        this.age = age;
        this.weight = weight;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Patient.counter = counter;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }
    
    
    
    
}
