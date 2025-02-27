package edu.ucalgary.oop;

public class ReliefService {
    private Inquirer inquirer;
    private DisaterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    public ReliefService(Inquirer inquirer, DisaterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    public Inquirer getInquirer() {
        return inquirer;
    }

    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }

    public DisaterVictim getMissingPerson() {
        return missingPerson;
    }

    public void setMissingPerson(DisaterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }

    public String getDateOfInquiry() {
        return dateOfInquiry;
    }

    public void setDateOfInquiry(String dateOfInquiry) {
        isValidDateFormat(dateOfInquiry);
        this.dateOfInquiry = dateOfInquiry;
    }

    public String getInfoProvided() {
        return infoProvided;
    }

    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }

    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }

    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
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

    public String getLogDetails() {
        return "Inquirer: " + inquirer.getFirstName() + ", Missing Person: " + missingPerson.getFirstName() + " " + missingPerson.getLastName() + ", Date of Inquiry: " + dateOfInquiry + ", Info Provided: " + infoProvided + ", Last Known Location: " + lastKnownLocation.getAddress();
    }
}
