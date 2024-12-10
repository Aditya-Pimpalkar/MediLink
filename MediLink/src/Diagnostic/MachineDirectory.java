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
public class MachineDirectory {
    
   private ArrayList<Machine> machinelist;
   
   public MachineDirectory(){
       this.machinelist = new ArrayList<Machine>();
   }

    public ArrayList<Machine> getMachinelist() {
        return machinelist;
    }

    public void setMachinelist(ArrayList<Machine> machinelist) {
        this.machinelist = machinelist;
    }
   
   public Machine createMachine(String name, int id) {
        Machine machine = new Machine();
        
        machine.setId(id);
        machine.setName(name);
        
        this.machinelist.add(machine);
        return machine;
    }
   
   public Boolean checkUniqueMachineNumber(int num){
        for(Machine machine: this.machinelist){
            if(machine.getId()==num){
                return false;
            }
        }return true;
    }
    
    public void deleteMachine(Machine machine){
        this.machinelist.remove(machine);
    }
    
    public Machine getMachineByJobId(int num){
        for(Machine machine: this.getMachinelist()){
            if(machine.getId()==num){
                return machine;
            }
        }return null;
    }
    
}
