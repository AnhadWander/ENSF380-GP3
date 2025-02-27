package edu.ucalgary.oop;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth; // in format "yyyy-mm-dd"
    private final int ASSIGNED_SOCIAL_ID;
    private FamilyRelation[] familyConnections;
    private MedicalRecord[] medicalRecords;
    private Supply[] personalBelongings;
    private String entryDate;  // in format "yyyy-mm-dd"
    private String gender;
    private String comments;
    private static int counter = 1;


    private boolean isValidDateFormat(String date) {
        if (date == null || date.length() != 10) {
            return false;
        }
        if (date.charAt(4) != '-' || date.charAt(7) != '-') {
            return false;
        }
        for (int i = 0; i < date.length(); i++) {
            if (i == 4 || i == 7) {
                continue;
            }
            if (!Character.isDigit(date.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public DisasterVictim(String firstName, String entryDate) {
        if (!isValidDateFormat(entryDate)) {
            throw new IllegalArgumentException("Invalid date format: " + entryDate);
        }
        this.firstName = firstName;
        this.entryDate = entryDate;
        this.ASSIGNED_SOCIAL_ID = counter++;
        // Initialize empty arrays.
        this.familyConnections = new FamilyRelation[0];
        this.medicalRecords = new MedicalRecord[0];
        this.personalBelongings = new Supply[0];
    }


    public DisasterVictim(String firstName, String entryDate, String dateOfBirth) {
        if (!isValidDateFormat(entryDate)) {
            throw new IllegalArgumentException("Invalid date format: " + entryDate);
        }
        if (!isValidDateFormat(dateOfBirth)) {
            throw new IllegalArgumentException("Invalid date format: " + dateOfBirth);
        }
        if (dateOfBirth.compareTo(entryDate) > 0) {
            throw new IllegalArgumentException("Birthdate cannot be after entry date.");
        }
        this.firstName = firstName;
        this.entryDate = entryDate;
        this.dateOfBirth = dateOfBirth;
        this.ASSIGNED_SOCIAL_ID = counter++;
        this.familyConnections = new FamilyRelation[0];
        this.medicalRecords = new MedicalRecord[0];
        this.personalBelongings = new Supply[0];
    }


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        if (!isValidDateFormat(dateOfBirth)) {
            throw new IllegalArgumentException("Invalid date format: " + dateOfBirth);
        }
        if (this.entryDate != null && dateOfBirth.compareTo(this.entryDate) > 0) {
            throw new IllegalArgumentException("Birthdate cannot be after entry date.");
        }
        this.dateOfBirth = dateOfBirth;
    }
    public int getAssignedSocialID() {
        return ASSIGNED_SOCIAL_ID;
    }
    public String getEntryDate() {
        return entryDate;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        if (gender != null) {
            this.gender = gender.toLowerCase();
        } else {
            this.gender = null;
        }
    }


    public FamilyRelation[] getFamilyConnections() {
        return familyConnections;
    }
    public void setFamilyConnections(FamilyRelation[] connections) {
        if (connections == null) {
            this.familyConnections = new FamilyRelation[0];
        } else {
            this.familyConnections = connections;
        }
    }
    public void addFamilyConnection(FamilyRelation relation) {
        int len = familyConnections.length;
        FamilyRelation[] newArray = new FamilyRelation[len + 1];
        for (int i = 0; i < len; i++) {
            newArray[i] = familyConnections[i];
        }
        newArray[len] = relation;
        familyConnections = newArray;
    }
    public void removeFamilyConnection(FamilyRelation relation) {
        int len = familyConnections.length;
        int index = -1;
        for (int i = 0; i < len; i++) {
            if (familyConnections[i] == relation) { // using reference equality
                index = i;
                break;
            }
        }
        if (index == -1) {
            return;
        }
        FamilyRelation[] newArray = new FamilyRelation[len - 1];
        for (int i = 0, j = 0; i < len; i++) {
            if (i == index) {
                continue;
            }
            newArray[j++] = familyConnections[i];
        }
        familyConnections = newArray;
    }


    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }
    public void setMedicalRecords(MedicalRecord[] records) {
        if (records == null) {
            this.medicalRecords = new MedicalRecord[0];
        } else {
            this.medicalRecords = records;
        }
    }
    public void addMedicalRecord(MedicalRecord record) {
        int len = medicalRecords.length;
        MedicalRecord[] newArray = new MedicalRecord[len + 1];
        for (int i = 0; i < len; i++) {
            newArray[i] = medicalRecords[i];
        }
        newArray[len] = record;
        medicalRecords = newArray;
    }


    public Supply[] getPersonalBelongings() {
        return personalBelongings;
    }
    public void setPersonalBelongings(Supply[] belongings) {
        if (belongings == null) {
            this.personalBelongings = new Supply[0];
        } else {
            this.personalBelongings = belongings;
        }
    }
    public void addPersonalBelonging(Supply supply) {
        int len = personalBelongings.length;
        Supply[] newArray = new Supply[len + 1];
        for (int i = 0; i < len; i++) {
            newArray[i] = personalBelongings[i];
        }
        newArray[len] = supply;
        personalBelongings = newArray;
    }
    public void removePersonalBelonging(Supply supply) {
        int len = personalBelongings.length;
        int index = -1;
        for (int i = 0; i < len; i++) {
            if (personalBelongings[i] == supply) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return;
        }
        Supply[] newArray = new Supply[len - 1];
        for (int i = 0, j = 0; i < len; i++) {
            if (i == index) {
                continue;
            }
            newArray[j++] = personalBelongings[i];
        }
        personalBelongings = newArray;
    }
}
