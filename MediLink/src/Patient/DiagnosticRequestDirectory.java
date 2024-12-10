/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Diagnostic.LabTechnicians;
import Hospital.Doctor;
import java.util.ArrayList;

/**
 *
 * @author Diksha
 */
public class DiagnosticRequestDirectory {
    private ArrayList<DiagnosticRequest> diagnosticrequestlist;
    
    public DiagnosticRequestDirectory(){
        this.diagnosticrequestlist = new ArrayList<DiagnosticRequest>();
    }

    public ArrayList<DiagnosticRequest> getDiagnosticrequestlist() {
        return diagnosticrequestlist;
    }

    public void setDiagnosticrequestlist(ArrayList<DiagnosticRequest> diagnosticrequestlist) {
        this.diagnosticrequestlist = diagnosticrequestlist;
    }
    
    public DiagnosticRequest requestDiagnostic(Doctor doctor, Patient patient, LabTechnicians diag, String testName){
        DiagnosticRequest dr = new DiagnosticRequest(doctor,patient,diag,testName);
        this.diagnosticrequestlist.add(dr);
        return dr;
                
    }
    
}
