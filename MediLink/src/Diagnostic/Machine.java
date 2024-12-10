/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostic;

/**
 *
 * @author Diksha
 */
public class Machine {
    String name;
    int id;
    boolean available;
    LabTechnicians LabTechnicians;
    
    public Machine(){
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LabTechnicians getLabTechnicians() {
        return LabTechnicians;
    }

    public void setLabTechnicians(LabTechnicians LabTechnicians) {
        this.LabTechnicians = LabTechnicians;
    }
    
}
