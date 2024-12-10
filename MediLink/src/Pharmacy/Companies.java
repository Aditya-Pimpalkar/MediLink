package Pharmacy;

import Roles.Role;
import User.UserAccount;

public class Companies extends UserAccount {
    private String accountId;
    private static int counter = 1; // Start counter from 1
    private MedicineRequestDirectory medicineRequestDirectory;
    private MedicineDirectory medicineDirectory;

    // Constructor
    public Companies(String username, String password, Role role) {
        super(username, password, role);
        this.accountId = "COMP" + counter++; // Unique ID for each company
        this.medicineDirectory = new MedicineDirectory();
        this.medicineRequestDirectory = new MedicineRequestDirectory();
    }

    // Getters and Setters
    public String getAccountId() {
        return accountId;
    }

    public MedicineDirectory getMedicineDirectory() {
        return medicineDirectory;
    }

    public MedicineRequestDirectory getMedicineRequestDirectory() {
        return medicineRequestDirectory;
    }
}
