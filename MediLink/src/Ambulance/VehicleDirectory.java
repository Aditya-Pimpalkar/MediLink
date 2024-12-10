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
public class VehicleDirectory {
    
    ArrayList<Vehicle> vehicle;
    
    public VehicleDirectory(){
        this.vehicle =  new ArrayList <Vehicle>();
    }

    public ArrayList<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(ArrayList<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }
    
    public Vehicle createVehicle(int number,String name){
        Vehicle vehicle = new Vehicle();
        
        vehicle.setNumber(number);
        vehicle.setName(name);
        
        this.vehicle.add(vehicle);
        
        return vehicle;
        
    }
    
    public Boolean checkUniqueVehicleNumber(int num){
        for(Vehicle vehicle: this.vehicle){
            if(vehicle.getNumber()==num){
                return false;
            }
        }return true;
    }
    
    public void deleteVehicle(Vehicle vehicle){
        this.vehicle.remove(vehicle);
    }
    
    public Vehicle getVehicleByJobId(int num){
        for(Vehicle vehicle: this.getVehicle()){
            if(vehicle.getNumber()==num){
                return vehicle;
            }
        }return null;
    }
}
