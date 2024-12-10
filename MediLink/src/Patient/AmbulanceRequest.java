/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Ambulance.AssignedVehicles;
import Hospital.Receptionist;



/**
 *
 * @author Aditya
 */
public class AmbulanceRequest {
    Receptionist receptionist;
    Patient patient;
    AssignedVehicles assignedVehicles;
    String address;
    
    public AmbulanceRequest(){
        
    }
    
    public AmbulanceRequest(Receptionist receptionist, Patient patient, AssignedVehicles assignedVehicles){
        this.receptionist = receptionist;
        this.patient = patient;
        this.assignedVehicles = assignedVehicles;
    }

    public Receptionist getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Receptionist receptionist) {
        this.receptionist = receptionist;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public AssignedVehicles getAssignedVehicles() {
        return assignedVehicles;
    }

    public void setAssignedVehicles(AssignedVehicles assignedVehicles) {
        this.assignedVehicles = assignedVehicles;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
