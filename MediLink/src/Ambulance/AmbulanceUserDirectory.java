/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ambulance;

import Roles.AmbulanceDriverRole;
import Roles.AmbulancePOCRole;
import Roles.Role;
import User.UserAccount;
import User.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Aditya
 */
public class AmbulanceUserDirectory {
    private ArrayList<UserAccount> ambulanceuseraccountlist;
    private DriverUserDirectory driverUserDirectory;
    private AmbulanceCoordinatorUserDirectory ambulanceCoordinatorUserDirectory;
    private VehicleDirectory vehicleDirectory;
    private AssignedVehiclesDirectory assignedVehiclesDirectory;
    
    public AmbulanceUserDirectory(){
        this.ambulanceuseraccountlist = new ArrayList<UserAccount>();
        
        this.driverUserDirectory = new DriverUserDirectory();
        this.ambulanceCoordinatorUserDirectory = new AmbulanceCoordinatorUserDirectory();
        this.vehicleDirectory = new VehicleDirectory();
        this.assignedVehiclesDirectory = new AssignedVehiclesDirectory();
        
        
    }

    public ArrayList<UserAccount> getAmbulanceuseraccountlist() {
        return ambulanceuseraccountlist;
    }

    public void setAmbulanceuseraccountlist(ArrayList<UserAccount> ambulanceuseraccountlist) {
        this.ambulanceuseraccountlist = ambulanceuseraccountlist;
    }

    public DriverUserDirectory getDriverUserDirectory() {
        return driverUserDirectory;
    }

    public void setDriverUserDirectory(DriverUserDirectory driverUserDirectory) {
        this.driverUserDirectory = driverUserDirectory;
    }

    public AmbulanceCoordinatorUserDirectory getAmbulanceCoordinatorUserDirectory() {
        return ambulanceCoordinatorUserDirectory;
    }

    public void setAmbulanceCoordinatorUserDirectory(AmbulanceCoordinatorUserDirectory ambulanceCoordinatorUserDirectory) {
        this.ambulanceCoordinatorUserDirectory = ambulanceCoordinatorUserDirectory;
    }

    public VehicleDirectory getVehicleDirectory() {
        return vehicleDirectory;
    }

    public void setVehicleDirectory(VehicleDirectory vehicleDirectory) {
        this.vehicleDirectory = vehicleDirectory;
    }

    public AssignedVehiclesDirectory getAssignedVehiclesDirectory() {
        return assignedVehiclesDirectory;
    }

    public void setAssignedVehiclesDirectory(AssignedVehiclesDirectory assignedVehiclesDirectory) {
        this.assignedVehiclesDirectory = assignedVehiclesDirectory;
    }

    
    
    
    public UserAccount createUserAccount(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.ambulanceuseraccountlist.add(user);
        return user;
    }
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.ambulanceuseraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (UserAccount user: this.ambulanceuseraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
    
    public Vehicle getAssignedAmbulance(Driver driver){
        for(AssignedVehicles av: this.assignedVehiclesDirectory.assignedVehicles){
            if(av.getDriver().getUsername().equals(driver.getUsername())){
                return av.getVehicle();
            }
        }
        return null;
    
    }
    
}
