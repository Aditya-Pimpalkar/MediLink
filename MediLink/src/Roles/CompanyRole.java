package Roles;

import ApplicationSystem.ApplicationSystem;
import UI.PhramacyCompany.Pharmacy;
import User.UserAccount;
import javax.swing.JFrame;

public class CompanyRole extends Role {
    @Override
    public JFrame createWorkArea(ApplicationSystem applicationSystem, UserAccount useraccount) {
        return new Pharmacy(applicationSystem, useraccount);
    }
}
