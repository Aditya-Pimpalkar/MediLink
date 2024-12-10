/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostic;

/**
 *
 * @author Diksha
 */
public class AssignedMachine {
    Machine machine;
    LabTechnicians diag;
    
    
    public AssignedMachine(){
        
    }
    
    public AssignedMachine(Machine machine, LabTechnicians diag){
        this.diag = diag;
        this.machine = machine;
        
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public LabTechnicians getDiag() {
        return diag;
    }

    public void setDiag(LabTechnicians diag) {
        this.diag = diag;
    }

    
    
    
    
}
