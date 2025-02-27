package edu.ucalgary.oop;

public class MedicalRecord {

    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getTreatmentDetails() {
        return treatmentDetails;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public String getDateOfTreatment() {
        return dateOfTreatment;
    }

    public void setDateOfTreatment(String dateOfTreatment) {
        isValidDateFormat(dateOfTreatment);
        this.dateOfTreatment = dateOfTreatment;
    }

    private String isValidDateFormat(String Date) {
        String[] date = Date.split("-");
        if (date.length != 3) {
            throw new IllegalArgumentException("Invalid date format");
        }
        if (date[0].length() != 4 || date[1].length() != 2 || date[2].length() != 2) {
            throw new IllegalArgumentException("Invalid date format");
        }
        return "Valid date format";
    }
}
