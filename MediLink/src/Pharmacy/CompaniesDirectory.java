package Pharmacy;

import Roles.CompanyRole;
import Roles.Role;
import User.UserAccount;
import java.util.ArrayList;

public class CompaniesDirectory {
    private ArrayList<UserAccount> useraccountlist;  // Change the type to UserAccount

    public CompaniesDirectory() {
        this.useraccountlist = new ArrayList<>();
        populateData(); // Call to pre-populate data during initialization
    }

    public ArrayList<UserAccount> getUseraccountlist() {
        return useraccountlist;
    }

    public UserAccount createUserAccount(String name, String password, Role role) {
        UserAccount user = new Companies(name, password, role);  // Create a Companies instance
        this.useraccountlist.add(user);
        return user;
    }

    private void populateData() {
        // Create an instance of CompanyRole
        Role companyRole = new CompanyRole();

        // Create and add companies to the list
        Companies astra = new Companies("astra", "astra", companyRole);
        Companies moderna = new Companies("moderna", "moderna", companyRole);

        this.useraccountlist.add(astra);
        this.useraccountlist.add(moderna);
    }

    public UserAccount authenticateUser(String name, String password) {
        for (UserAccount ua : this.useraccountlist) {
            if (ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public Boolean checkUniqueUsername(String userName) {
        for (UserAccount user : this.useraccountlist) {
            if (user.getUsername().equals(userName)) {
                return false;
            }
        }
        return true;
    }
}
