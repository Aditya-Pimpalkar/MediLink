/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Roles.HospitalSystemAdminRole;
import Roles.Role;
import User.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Aditya
 */
public class HospitalUserDirectory {
    private ArrayList<UserAccount> hospitaluseraccountlist;
    private DoctorUserDirectory doctorUserDirectory;
    private NurseDirectory nurseDirectory;
    private ReceptionistDirectory receptionistDirectory;

    public HospitalUserDirectory() {
        this.hospitaluseraccountlist = new ArrayList<UserAccount>(); 
        
        this.doctorUserDirectory = new DoctorUserDirectory();
        this.nurseDirectory = new NurseDirectory();
        this.receptionistDirectory = new ReceptionistDirectory(); 
        this.createUserAccount("admin","admin", new HospitalSystemAdminRole());
    }

    public ArrayList<UserAccount> getHospitaluseraccountlist() {
        return hospitaluseraccountlist;
    }

    public void setHospitaluseraccountlist(ArrayList<UserAccount> hospitaluseraccountlist) {
        this.hospitaluseraccountlist = hospitaluseraccountlist;
    }

    public DoctorUserDirectory getDoctorUserDirectory() {
        return doctorUserDirectory;
    }

    public void setDoctorUserDirectory(DoctorUserDirectory doctorUserDirectory) {
        this.doctorUserDirectory = doctorUserDirectory;
    }

    public NurseDirectory getNurseDirectory() {
        return nurseDirectory;
    }

    public void setNurseDirectory(NurseDirectory nurseDirectory) {
        this.nurseDirectory = nurseDirectory;
    }

    public ReceptionistDirectory getReceptionistDirectory() {
        return receptionistDirectory;
    }

    public void setReceptionistDirectory(ReceptionistDirectory receptionistDirectory) {
        this.receptionistDirectory = receptionistDirectory;
    }
    
    
    
    public UserAccount createUserAccount(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.hospitaluseraccountlist.add(user);
        return user;
    }
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.hospitaluseraccountlist) {
            System.out.println(ua.getUsername());
            
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean checkUniqueUsername(String userName){
        for (UserAccount user: this.hospitaluseraccountlist){
            if(user.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
    
}
