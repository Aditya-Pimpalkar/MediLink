/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

import Roles.Role;
import User.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author komal
 */
public class PharmacyUserDirectory {
    private ArrayList<UserAccount> pharmacyuseraccountlist;
    private CompaniesDirectory companiesDirectory;
    private StoreDirectrory storeDirectory;
    private MedicineDirectory medicineDirectory;
    
    public PharmacyUserDirectory(){
        this.pharmacyuseraccountlist = new ArrayList<UserAccount>();
        this.companiesDirectory = new CompaniesDirectory();
        this.storeDirectory = new StoreDirectrory();
        this.medicineDirectory = new MedicineDirectory();
    }

    public ArrayList<UserAccount> getPharmacyuseraccountlist() {
        return pharmacyuseraccountlist;
    }

    public void setPharmacyuseraccountlist(ArrayList<UserAccount> pharmacyuseraccountlist) {
        this.pharmacyuseraccountlist = pharmacyuseraccountlist;
    }

    public CompaniesDirectory getCompaniesDirectory() {
        return companiesDirectory;
    }

    public void setCompaniesDirectory(CompaniesDirectory companiesDirectory) {
        this.companiesDirectory = companiesDirectory;
    }

    public StoreDirectrory getStoreDirectory() {
        return storeDirectory;
    }

    public void setStoreDirectory(StoreDirectrory storeDirectory) {
        this.storeDirectory = storeDirectory;
    }

    public MedicineDirectory getMedicineDirectory() {
        return medicineDirectory;
    }

    public void setMedicineDirectory(MedicineDirectory medicineDirectory) {
        this.medicineDirectory = medicineDirectory;
    }
    
    
    
    public UserAccount createUserAccount(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.pharmacyuseraccountlist.add(user);
        return user;
    }
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.pharmacyuseraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (UserAccount user: this.pharmacyuseraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
}
