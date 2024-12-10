package Pharmacy;

import Roles.Role;
import Roles.StoreRole;
import java.util.ArrayList;

public class StoreDirectrory {
    private ArrayList<Store> useraccountlist;
    
    public StoreDirectrory() {
        this.useraccountlist = new ArrayList<>();
        populateData(); // Pre-populate data during initialization
    }

    public ArrayList<Store> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<Store> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }

    public Store createUserAccount(String name, String password, Role role) {
        Store user = new Store(name, password, role);
        this.useraccountlist.add(user);
        return user;
    }

    public Store authenticateUser(String name, String password) {
        for (Store ua : this.useraccountlist) {
            if (ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public Boolean checkUniqueUsername(String userName) {
        for (Store user : this.useraccountlist) {
            if (user.getUsername().equals(userName)) {
                return false;
            }
        }
        return true;
    }

    // Method to pre-populate stores
    private void populateData() {
        Role storeRole = new StoreRole();

        Store cvs = new Store("CVS", "CVS", storeRole);
        Store walgreens = new Store("walgreens", "walgreens", storeRole);

        this.useraccountlist.add(cvs);
        this.useraccountlist.add(walgreens);
    }
}
