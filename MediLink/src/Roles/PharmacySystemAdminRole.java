/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import ApplicationSystem.ApplicationSystem;
import UI.HospitalSystemAdmin.HospitalSystemAdmin;
import UI.PharmacySystemAdmin.PharmacySystemAdmin;
import User.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author saketh
 */
public class PharmacySystemAdminRole extends Role {
    
    @Override
    public JFrame createWorkArea(ApplicationSystem applicationSystem, UserAccount useraccount) {
        System.out.println(applicationSystem);
        return new PharmacySystemAdmin(applicationSystem, useraccount);
    }
    
}
