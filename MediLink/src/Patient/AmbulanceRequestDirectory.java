/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Ambulance.AssignedVehicles;
import Ambulance.Driver;
import Ambulance.Vehicle;
import Hospital.Receptionist;
import java.util.ArrayList;

/**
 *
 * @author Aditya
 */
public class AmbulanceRequestDirectory {
    
    private ArrayList<AmbulanceRequest> ambulanceRequestList;
    
    public AmbulanceRequestDirectory(){
        this.ambulanceRequestList = new ArrayList<AmbulanceRequest>();
    }

    public ArrayList<AmbulanceRequest> getAmbulanceRequestList() {
        return ambulanceRequestList;
    }

    public void setAmbulanceRequestList(ArrayList<AmbulanceRequest> ambulanceRequestList) {
        this.ambulanceRequestList = ambulanceRequestList;
    }
    
    public AmbulanceRequest requestAmbulance(Receptionist receptionist, Patient patient, AssignedVehicles assignedVehicles, String address){
      AmbulanceRequest requestedAmbulance = new AmbulanceRequest(receptionist,patient,assignedVehicles);
      requestedAmbulance.setAddress(address);
      this.ambulanceRequestList.add(requestedAmbulance);
      return requestedAmbulance;
    }
    
}
