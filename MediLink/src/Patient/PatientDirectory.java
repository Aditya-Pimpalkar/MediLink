/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Aditya
 */
public class PatientDirectory {
    private ArrayList<Patient> patientlist;
    
    public PatientDirectory(){
        this.patientlist = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientlist() {
        return patientlist;
    }

    public void setPatientlist(ArrayList<Patient> patientlist) {
        this.patientlist = patientlist;
    }
    
    
    public Patient createUserAccount(String name, String password, Role role, String bp, double age, int weight) {
        Patient user = new Patient(name, password, role, age, weight);
        user.setBp(bp);
        this.patientlist.add(user);
        return user;
    }
    
    public Patient authenticateUser(String name, String password) {
        for(Patient ua: this.patientlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (Patient user: this.patientlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
}
