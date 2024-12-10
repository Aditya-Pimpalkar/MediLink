/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostic;

import java.util.ArrayList;

/**
 *
 * @author Diksha
 */
public class AssignedMachineDirectory {
    ArrayList<AssignedMachine> assignedMachine;
    
    public AssignedMachineDirectory(){
        this.assignedMachine = new  ArrayList<AssignedMachine>();
    }

    public ArrayList<AssignedMachine> getAssignedMachine() {
        return assignedMachine;
    }

    public void setAssignedMachine(ArrayList<AssignedMachine> assignedMachine) {
        this.assignedMachine = assignedMachine;
    }
    
    public AssignedMachine assignedMachine(Machine machine, LabTechnicians diag){
      AssignedMachine assignedMachine = new AssignedMachine(machine,diag);
      this.assignedMachine.add(assignedMachine);
      return assignedMachine;
    }
    
}
