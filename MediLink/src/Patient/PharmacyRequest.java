/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Hospital.Doctor;
import Pharmacy.Medicine;
import Pharmacy.Store;

/**
 *
 * @author saketh
 */
public class PharmacyRequest {
    
    Doctor doctor;
    Store store;
    Patient patient;
    int quantity;
    Medicine medicine;
    
    public PharmacyRequest(){
        
    }
    
    public PharmacyRequest(Doctor doctor, Store store, Patient patient, Medicine medicine, int quantity){
        this.doctor = doctor;
        this.store = store;
        this.patient = patient;
        this.medicine = medicine;
        this.quantity = quantity;
        
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
    
    
    
}
