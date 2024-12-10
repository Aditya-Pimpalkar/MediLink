/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

import Patient.PharmacyRequestDirectory;
import Roles.Role;
import User.UserAccount;

/**
 *
 * @author komal
 */
public class Store extends UserAccount {
    
    private String accountId;
    
    private static int counter = 0;
    
    private MedicineRequestDirectory medicineRequestDirectory;
    private MedicineDirectory medicineDirectory;
    private PharmacyRequestDirectory pharmacyrequestDirectory;
    
    private int revenue = 0;
    
    public Store(String username, String password, Role role) {
        super(username, password, role);
        this.medicineRequestDirectory = new MedicineRequestDirectory();
        this.accountId = "user" + this.counter++;
        this.medicineDirectory = new MedicineDirectory();
        this.pharmacyrequestDirectory = new PharmacyRequestDirectory();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Store.counter = counter;
    }


    public MedicineRequestDirectory getMedicineRequestDirectory() {
        return medicineRequestDirectory;
    }

    public void setMedicineRequestDirectory(MedicineRequestDirectory medicineRequestDirectory) {
        this.medicineRequestDirectory = medicineRequestDirectory;
    }

    public MedicineDirectory getMedicineDirectory() {
        return medicineDirectory;
    }

    public void setMedicineDirectory(MedicineDirectory medicineDirectory) {
        this.medicineDirectory = medicineDirectory;
    }

    public PharmacyRequestDirectory getPharmacyrequestDirectory() {
        return pharmacyrequestDirectory;
    }

    public void setPharmacyrequestDirectory(PharmacyRequestDirectory pharmacyrequestDirectory) {
        this.pharmacyrequestDirectory = pharmacyrequestDirectory;
    }
    
    public void updateMedicine(String medicineName, int quantity)
    {
        
        
        for(Medicine medicine:  medicineDirectory.getMedicinelist())
        {
            if(medicine.getName().equalsIgnoreCase(medicineName))
            {
                int updatedValue = medicine.getQuantity() + quantity;
                medicine.setQuantity(updatedValue);
                return;
            }
        }
        
        int number = medicineDirectory.getMedicinelist().size() + 1;
        medicineDirectory.createMedicine(number, medicineName, quantity);
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int sales) {
        this.revenue = sales;
    }
    
    
    
}
