package Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author komal
 */
public class MedicineDirectory {
    private ArrayList<Medicine> medicinelist;
    
    public MedicineDirectory() {
        this.medicinelist = new ArrayList<>();
        populateMedicineList(); // Automatically populate the list with sample data
    }

    public ArrayList<Medicine> getMedicinelist() {
        return medicinelist;
    }

    public void setMedicinelist(ArrayList<Medicine> medicinelist) {
        this.medicinelist = medicinelist;
    }
    
    public Medicine createMedicine(int number, String name, int quantity) {
        Medicine medicine = new Medicine();
        medicine.setNumber(number);
        medicine.setName(name);
        medicine.setQuantity(quantity);
        this.medicinelist.add(medicine);
        return medicine;
    }
    
    public Boolean checkUniqueMedicineNumber(int num) {
        for (Medicine medicine : this.medicinelist) {
            if (medicine.getNumber() == num) {
                return false;
            }
        }
        return true;
    }
    
    public void deleteMedicine(Medicine medicine) {
        this.medicinelist.remove(medicine);
    }
    
    public Medicine getMedicineById(int num) {
        for (Medicine medicine : this.getMedicinelist()) {
            if (medicine.getNumber() == num) {
                return medicine;
            }
        }
        return null;
    }

    // Populate the list with sample medicines
    private void populateMedicineList() {
        createMedicine(101, "Paracetamol", 50);
        createMedicine(102, "Ibuprofen", 100);
        createMedicine(103, "Amoxicillin", 75);
        createMedicine(104, "Ciprofloxacin", 60);
        createMedicine(105, "Vitamin C", 200);
    }
}
