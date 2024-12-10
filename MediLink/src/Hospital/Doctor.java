/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Patient.DiagnosticRequestDirectory;
import Patient.PatientDirectory;
import Roles.Role;
import User.UserAccount;

/**
 *
 * @author Diksha
 */
public class Doctor extends UserAccount {
    
    private String accountId;
    
    private static int counter = 0;
    
    private PatientDirectory patientDirectory;
    private DiagnosticRequestDirectory diagrequestDirectory;
    
    public Doctor(String username, String password, Role role) {
        super(username, password, role);
        this.accountId = "user" + this.counter++;
        this.patientDirectory = new PatientDirectory();
        this.diagrequestDirectory = new DiagnosticRequestDirectory();
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
        Doctor.counter = counter;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public DiagnosticRequestDirectory getDiagrequestDirectory() {
        return diagrequestDirectory;
    }

    public void setDiagrequestDirectory(DiagnosticRequestDirectory diagrequestDirectory) {
        this.diagrequestDirectory = diagrequestDirectory;
    }
    
    
    
    
}
