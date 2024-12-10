/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author komal
 */
public class MedicineRequestDirectory {
    private ArrayList<MedicineRequests> medicineRequets;
    
    public MedicineRequestDirectory(){
        this.medicineRequets = new ArrayList<MedicineRequests>();
    }

    public ArrayList<MedicineRequests> getMedicineRequets() {
        return medicineRequets;
    }

    public void setMedicineRequets(ArrayList<MedicineRequests> medicineRequets) {
        this.medicineRequets = medicineRequets;
    }
    
    public MedicineRequests requestMedicine(Store store, Companies companies, Medicine medicine, int quantity){
        MedicineRequests requestMedicne = new MedicineRequests(store,companies,medicine);
        requestMedicne.setQuantity(quantity);
        this.medicineRequets.add(requestMedicne);
        return requestMedicne;
    } 
    
}
