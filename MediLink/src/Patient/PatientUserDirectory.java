/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

/**
 *
 * @author Aditya
 */
public class PatientUserDirectory {
    private PatientDirectory patientDirectory;
    private AmbulanceRequestDirectory ambulanceRequestDirectory;
    private DiagnosticRequestDirectory diagRequestDirectory;
    private PharmacyRequestDirectory pharmaRequestDirectory; 
    
    public PatientUserDirectory(){
        this.patientDirectory = new PatientDirectory();
        this.ambulanceRequestDirectory = new AmbulanceRequestDirectory();
        this.diagRequestDirectory = new DiagnosticRequestDirectory();
        this.pharmaRequestDirectory = new PharmacyRequestDirectory();
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public AmbulanceRequestDirectory getAmbulanceRequestDirectory() {
        return ambulanceRequestDirectory;
    }

    public void setAmbulanceRequestDirectory(AmbulanceRequestDirectory ambulanceRequestDirectory) {
        this.ambulanceRequestDirectory = ambulanceRequestDirectory;
    }

    public DiagnosticRequestDirectory getDiagRequestDirectory() {
        return diagRequestDirectory;
    }

    public void setDiagRequestDirectory(DiagnosticRequestDirectory diagRequestDirectory) {
        this.diagRequestDirectory = diagRequestDirectory;
    }

    public PharmacyRequestDirectory getPharmaRequestDirectory() {
        return pharmaRequestDirectory;
    }

    public void setPharmaRequestDirectory(PharmacyRequestDirectory pharmaRequestDirectory) {
        this.pharmaRequestDirectory = pharmaRequestDirectory;
    }
    
    
    
    

    
}
