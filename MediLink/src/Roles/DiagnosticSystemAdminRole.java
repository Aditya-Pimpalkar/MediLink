/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import ApplicationSystem.ApplicationSystem;
import UI.DiagnosticsSystemAdmin.DiagnosticSystemAdmin;
import User.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author Diksha
 */
public class DiagnosticSystemAdminRole extends Role {
    
    @Override
    public JFrame createWorkArea(ApplicationSystem applicationSystem, UserAccount useraccount) {
        System.out.println(applicationSystem);
        return new DiagnosticSystemAdmin (applicationSystem, useraccount);
    }
    
}
