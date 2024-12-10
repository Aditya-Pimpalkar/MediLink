/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostic;

import Roles.Role;
import User.UserAccount;

/**
 *
 * @author Diksha
 */
public class DiagnosticEquipmentVendors extends UserAccount {
    
    private String accountId;
    
    private static int counter = 0;
    private String company;
    
    private int lends = 0;
    
    private MachineDirectory machineDirectory;

    public DiagnosticEquipmentVendors(String username, String password, Role role) {
        super(username, password, role);
        this.accountId = "user" + this.counter++;
        this.machineDirectory = new MachineDirectory();
        
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
        DiagnosticEquipmentVendors.counter = counter;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public MachineDirectory getMachineDirectory() {
        return machineDirectory;
    }

    public void setMachineDirectory(MachineDirectory machineDirectory) {
        this.machineDirectory = machineDirectory;
    }
    
    
    
    public void increaselends()
    {
        lends++;
    }
    
    
    
}
