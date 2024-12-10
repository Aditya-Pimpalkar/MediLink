/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ambulance;

import java.util.ArrayList;

/**
 *
 * @author Aditya
 */
public class AssignedVehiclesDirectory {
    ArrayList<AssignedVehicles> assignedVehicles;
    
    
    public AssignedVehiclesDirectory(){
        this.assignedVehicles = new ArrayList<AssignedVehicles>();
        
    }

    public ArrayList<AssignedVehicles> getAssignedVehicles() {
        return assignedVehicles;
    }

    public void setAssignedVehicles(ArrayList<AssignedVehicles> assignedVehicles) {
        this.assignedVehicles = assignedVehicles;
    }
    
    public AssignedVehicles assignedVehicle(Vehicle vehicle, Driver driver){
      AssignedVehicles assignedVehicle = new AssignedVehicles(driver,vehicle);
      this.assignedVehicles.add(assignedVehicle);
      return assignedVehicle;
    }
    
}
