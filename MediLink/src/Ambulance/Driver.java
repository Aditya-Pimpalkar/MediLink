/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ambulance;

import Patient.AmbulanceRequestDirectory;
import Roles.Role;

import User.UserAccount;

/**
 *
 * @author Aditya
 */
public class Driver extends UserAccount{
    private String accountId;
    
    private static int counter = 0;
    private int trips = 0;
    private AmbulanceRequestDirectory ambulanceRequestDirectory;
    double age;
    String experience;
    
    
    public Driver(String username, String password, Role role, double age, String experience) {
        super(username,password,role);
        this.accountId = "user" + this.counter++;
        this.ambulanceRequestDirectory = new AmbulanceRequestDirectory();
        this.age = age;
        this.experience = experience;
        
        
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Driver.counter = counter;
    }

    public AmbulanceRequestDirectory getAmbulanceRequestDirectory() {
        return ambulanceRequestDirectory;
    }

    public void setAmbulanceRequestDirectory(AmbulanceRequestDirectory ambulanceRequestDirectory) {
        this.ambulanceRequestDirectory = ambulanceRequestDirectory;
    }

    public int getTrips() {
        return trips;
    }

    public void setTrips(int trips) {
        this.trips = trips;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
    
    public void increaseTrip()
    {
        trips++;
    }
    
    
}
