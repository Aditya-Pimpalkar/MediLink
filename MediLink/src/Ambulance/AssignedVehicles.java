/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ambulance;

/**
 *
 * @author Aditya
 */
public class AssignedVehicles {
    Driver driver;
    Vehicle vehicle;
    String Status;
    
    public AssignedVehicles(){
        
    }
    
    public AssignedVehicles(Driver driver, Vehicle vehicle){
        this.driver = driver;
        this.vehicle = vehicle;
        this.Status = "Avaialable";
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    
    
    
}
