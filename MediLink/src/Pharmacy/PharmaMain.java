package Pharmacy;

import Roles.Role;
import Roles.StoreRole;
import User.UserAccount;

public class PharmaMain {
    public static void main(String[] args) {
        // Initialize MedicineDirectory
        MedicineDirectory medicineDirectory = new MedicineDirectory();

        // Initialize CompaniesDirectory
        CompaniesDirectory companiesDirectory = new CompaniesDirectory();

        // Initialize Store
        Role storeRole = new StoreRole(); // Or another role that makes sense for your logic
        Store store = new Store("CVS1", "CVS", storeRole); // Now it accepts a role as well

        store.setMedicineDirectory(medicineDirectory);  // Associate the store with the medicine directory

        // Add Store to CompaniesDirectory
        companiesDirectory.createUserAccount(store.getUsername(), store.getPassword(), store.getRole()); // Add Store as a user

        // Add a new medicine dynamically
        Medicine newMedicine = medicineDirectory.createMedicine(104, "Aspirin", 120);
        System.out.println("\nAdded Medicine: " + newMedicine.getName() + 
                           " with Quantity: " + newMedicine.getQuantity());

        // Delete an existing medicine
        Medicine medicineToDelete = medicineDirectory.getMedicineById(102);
        if (medicineToDelete != null) {
            medicineDirectory.deleteMedicine(medicineToDelete);
            System.out.println("\nDeleted Medicine: " + medicineToDelete.getName());
        } else {
            System.out.println("\nMedicine not found.");
        }

        // Print updated medicines
        System.out.println("\nUpdated Medicines:");
        for (Medicine medicine : medicineDirectory.getMedicinelist()) {
            System.out.println("Medicine Number: " + medicine.getNumber() +
                               ", Name: " + medicine.getName() +
                               ", Quantity: " + medicine.getQuantity());
        }

        // Print pre-populated companies
        System.out.println("\nCompanies Directory:");
        for (UserAccount company : companiesDirectory.getUseraccountlist()) {
            System.out.println("Company: " + company.getUsername() +
                               ", Role: " + company.getRole().getClass().getSimpleName());
        }

        // Example authentication for companies
        System.out.println("\nAuthenticating user 'astra':");
        Companies authenticatedCompany = (Companies) companiesDirectory.authenticateUser("astra", "astra");
        if (authenticatedCompany != null) {
            System.out.println("Authenticated Company: " + authenticatedCompany.getUsername());
        } else {
            System.out.println("Authentication failed for 'astra'.");
        }
    }
}
