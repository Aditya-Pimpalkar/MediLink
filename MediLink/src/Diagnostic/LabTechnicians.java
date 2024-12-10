/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostic;

import Patient.DiagnosticRequestDirectory;
import Roles.Role;
import User.UserAccount;

/**
 *
 * @author Diksha
 */
public class LabTechnicians extends UserAccount {
    
    private String accountId;
    
    private static int counter = 0;
    
    private int tests = 0;
    
    private DiagnosticRequestDirectory diagRequestDirectory;
    private AssignedMachineDirectory assignedMachineDirectory;
    
    public LabTechnicians(String username, String password, Role role) {
        super(username, password, role);
        this.accountId = "user" + this.counter++;
        this.diagRequestDirectory = new DiagnosticRequestDirectory();
        this.assignedMachineDirectory = new AssignedMachineDirectory();
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
        LabTechnicians.counter = counter;
    }

    public DiagnosticRequestDirectory getDiagRequestDirectory() {
        return diagRequestDirectory;
    }

    public void setDiagRequestDirectory(DiagnosticRequestDirectory diagRequestDirectory) {
        this.diagRequestDirectory = diagRequestDirectory;
    }

    public AssignedMachineDirectory getAssignedMachineDirectory() {
        return assignedMachineDirectory;
    }

    public void setAssignedMachineDirectory(AssignedMachineDirectory assignedMachineDirectory) {
        this.assignedMachineDirectory = assignedMachineDirectory;
    }
    
    public void increasetests()
    {
        tests++;
    }

    public int getTests() {
        return tests;
    }

    public void setTests(int tests) {
        this.tests = tests;
    }
    
    
}
