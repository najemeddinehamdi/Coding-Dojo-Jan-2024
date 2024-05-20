

import java.util.ArrayList;
import java.util.Date;

public class Phisician extends User implements HIPAACompliantUser {
    private ArrayList<String> patientNotes;

    private Integer IDcopy;
    // TO DO: Constructor that takes an IDcopy

    public Phisician(Integer IDcopy) {
        this.IDcopy = IDcopy;
    }

    // TO DO: Implement HIPAACompliantUser!
    public boolean assignPin(int pin){
        String pinString = String.valueOf(pin);
        if (pinString.length()==4){
            return true;
        }else {
            return false;
        }
    }

    public boolean accessAuthorized(Integer confirmedAuthID){
        if (confirmedAuthID==IDcopy){
            return true;
        }
        return false;
    }
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
                "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    // TO DO: Setters & Getters
    public ArrayList<String> getPatientNotes() {
        return patientNotes;
    }

    public void setPatientNotes(ArrayList<String> patientNotes) {
        this.patientNotes = patientNotes;
    }

    public Integer getIDcopy() {
        return IDcopy;
    }

    public void setIDcopy(Integer IDcopy) {
        this.IDcopy = IDcopy;
    }
}
