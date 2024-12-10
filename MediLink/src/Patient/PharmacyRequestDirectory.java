/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Hospital.Doctor;
import Pharmacy.Medicine;
import Pharmacy.Store;
import java.util.ArrayList;

/**
 *
 * @author saketh
 */
public class PharmacyRequestDirectory {
    private ArrayList<PharmacyRequest> pharmacylist;
    
    public PharmacyRequestDirectory(){
        this.pharmacylist = new ArrayList<PharmacyRequest>();
    }

    public ArrayList<PharmacyRequest> getPharmacylist() {
        return pharmacylist;
    }

    public void setPharmacylist(ArrayList<PharmacyRequest> pharmacylist) {
        this.pharmacylist = pharmacylist;
    }
    
    public PharmacyRequest requestpharmacy(Doctor doctor, Store store, Patient patient,Medicine medicine, int quantity){
      PharmacyRequest requestedPharmacy = new PharmacyRequest(doctor, store, patient, medicine, quantity);
      this.pharmacylist.add(requestedPharmacy);
      return requestedPharmacy;
    }
}
